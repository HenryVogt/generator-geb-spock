'use strict'
var yeoman = require('yeoman-generator');
var yosay = require('yosay');
var chalk = require('chalk');

module.exports = yeoman.Base.extend({

	prompting: function() {
		this.log(yosay('\'Allo \'Allo!\nThis is the marvelous ' + chalk.red('Geb/Spock') + ' skeleton generator.'));
	
		var prompt = [
			{
				type: 'input',
				name: 'package',
				message: 'What\'s the package name?',
				default: 'com.example'
			},
            {
                type: 'input',
                name: 'baseUrl',
                message: 'What\'s the base URL?',
                default: 'http://www.example.com'
            }
		];

		return this.prompt(prompt).then(function(answers) {
		    this.answers = answers;
            this.answers.package = answers.package;
            this.answers.baseUrl = answers.baseUrl;
		}.bind(this));
	},

	writing: function() {
		var self = this;
        function copy_file(origin, destination) {
            if (typeof destination === 'undefined') {
                destination = origin
            }
            self.fs.copy(
                self.templatePath(origin),
                self.destinationPath(destination)
            );
        }

		copy_file('gitignore', '.gitignore');
		copy_file('build.gradle');
		copy_file('src/test/resources/META-INF/services/com.athaydes.spockframework.report.IReportCreator.properties');
		copy_file('src/test/resources/spock-reports-template/spec-template.html');
        copy_file('src/test/resources/spock-reports-template/summary-template.html');
        copy_file('src/test/resources/CodeNarcRules.groovy');
        copy_file('gradle/wrapper/gradle-wrapper.jar');
		copy_file('gradle/wrapper/gradle-wrapper.properties');
		copy_file('gradlew');
		copy_file('gradlew.bat');

		this.fs.copyTpl(
		    this.templatePath('src/test/resources/GebConfig.groovy'),
            this.destinationPath('src/test/resources/GebConfig.groovy'),
            this.answers
        );

		this.fs.copyTpl(
		    this.templatePath('src/test/groovy/company/helper/WebEventListener.groovy'),
            this.destinationPath('src/test/groovy/{packagePath}/helper/WebEventListener.groovy'
                .replace('{packagePath}', this.answers.package.replace(/\./g, '/'))),
            this.answers
        );

        this.fs.copyTpl(
            this.templatePath('src/test/groovy/company/pages/ExamplePage.groovy'),
            this.destinationPath('src/test/groovy/{packagePath}/pages/ExamplePage.groovy'
                .replace('{packagePath}', this.answers.package.replace(/\./g, '/'))),
            this.answers
        );

        this.fs.copyTpl(
            this.templatePath('src/test/groovy/company/specs/ExamplePageTest.groovy'),
            this.destinationPath('src/test/groovy/{packagePath}/specs/ExamplePageTest.groovy'
                .replace('{packagePath}', this.answers.package.replace(/\./g, '/'))),
            this.answers
        );
	}
});