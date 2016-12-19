package <%= package %>.specs

import <%= package %>.pages.ExamplePage
import geb.Page
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

/**
 * Test specification for example page
 */
@Stepwise
class ExamplePageTest extends GebReportingSpec {

    def 'navigate to example page'() {
        when: 'i\'m on the example page'
        Page examplePage = to ExamplePage

        then: 'the headline is "Example Domain"'
        examplePage.headline.text() == "Example Domain"
    }

}
