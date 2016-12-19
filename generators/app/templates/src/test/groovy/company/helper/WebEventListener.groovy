package <%= package %>.helper

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.events.WebDriverEventListener

/**
 * Listener for WebDriver events
 */
class WebEventListener implements WebDriverEventListener {

    @Override
    void beforeNavigateTo(String url, WebDriver driver) {

    }

    @Override
    void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    void afterNavigateBack(WebDriver driver) {

    }

    @Override
    void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    void afterNavigateForward(WebDriver driver) {

    }

    @Override
    void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    void beforeFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    void afterFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    void beforeClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    void afterClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    void beforeScript(String script, WebDriver driver) {

    }

    @Override
    void afterScript(String script, WebDriver driver) {

    }

    @Override
    void onException(Throwable throwable, WebDriver driver) {

    }
}
