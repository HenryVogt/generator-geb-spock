import <%= package %>.helper.WebEventListener
import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.events.EventFiringWebDriver

def desiredCapabilities = new DesiredCapabilities()

baseUrl = '<%= baseUrl %>'

baseNavigatorWaiting = true
atCheckWaiting = true
reportOnTestFailureOnly = false
reportsDir = 'build/reports/spock-report'

waiting {
    timeout = 10
    retryInterval = 0.5
    shorter { timeout = 5 }
    medium { timeout = 10 }
    longer { timeout = 20 }
}

environments {

    'local.chrome' {
        ChromeDriverManager.instance.setup()
        driver = {
            def chromeDriver = new EventFiringWebDriver(new ChromeDriver())
            chromeDriver.register(new WebEventListener())
            chromeDriver.manage().window().maximize()
            chromeDriver
        }
    }
}
