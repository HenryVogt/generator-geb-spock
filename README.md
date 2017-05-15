This generator creates a sample project structure for automated frontend testing with [Geb](http://www.gebish.org/) and [Spock](http://spockframework.org/).
The project structure is generated through the [Yeoman](http://yeoman.io/) Tool.

##### Requirements

- [node.js](https://nodejs.org/en/) and [npm](https://www.npmjs.com/) need to be installed
- install Yeoman with `npm install -g yo`

##### How to

- `git clone` this repo
- `cd` into repo folder
- link generator as npm module with `npm link`
- create a project folder at the prefered location and `cd` into it
- start the generator with `yo geb-spock`
- just hit enter on the shown prompts to create the project with an example test
- when the generator is finished you can start the example test
  - UNIX: `./gradlew test -D geb.env=local.chrome`
  - Windows: `gradlew test -D geb.env=local.chrome`
