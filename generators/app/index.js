'use strict'
var yeoman = require('yeoman-generator');
var yosay = require('yosay');

module.exports = yeoman.Base.extend({

	_copy_file: function(origin, destination) {
		if (typeof destination === 'undefined') {
    		destination = origin
  		}
		this.fs.copy(
			this.templatePath(origin),
			this.destinationPath(destination)	
		);
	},

	prompting: function() {
		this.log(yosay('\'Allo \'Allo!\nThis is the marvelous Geb/Spock skeleton generator.'));
	
		return this.prompt([
			{
				type: 'input',
				name: 'project',
				message: 'What\'s the projects name?',
				default: this.appname
			},
			{
				type: 'input',
				name: 'package',
				message: 'What\‘s the projects package?',
				default: 'com.example'
			}
		]).then(function(answers) {
			this.project = answers.project;
			this.package = answers.package.replace(/\./g, '/');
		}.bind(this));
	},

	install: function () {
    	this.spawnCommand('gradle', ['wrapper']);
  	}

});