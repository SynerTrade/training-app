'use strict';

/**
 * @ngdoc overview
 * @name traingApp
 * @description
 * # traingApp
 *
 * Main module of the application.
 */
angular
  .module('traingApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/students.html',
        controller: 'studentsCtrl'
      })
      .when('/studentsList', {
        templateUrl: 'views/students.html',
        controller: 'studentsCtrl'
      });
  });
