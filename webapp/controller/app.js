var app = angular.module('app', ['ui.router', 'ui.bootstrap']);

app.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider

	.state('init', {
		url: '/',
		templateUrl: 'index.html' 
	})
	.state('home', {
		url: '/home',
		templateUrl: 'pages/home.html'
	})
	.state('home2', {
		url: '/home2',
		templateUrl: 'pages/home2.html'
	});
	
});