package <%= package %>.pages

import geb.Page

/**
 * PageObject for example page
 */
class ExamplePage extends Page {

    static url = '/'

    static at = { title == 'Example Domain' }

    /**
     * page content
     */
    static content = {
        headline(wait: true) { $('h1', 0) }
    }
}
