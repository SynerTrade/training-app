/**
 * Created by adelinaz on 10/18/2016.
 */

'use strict';
(function () {

  angular.module('traingApp')
    .controller('studentsCtrl',['$scope', '$http', studentsCtrl]);

  function studentsCtrl ($scope, $http) {

    $http({
      method: 'GET',
      url: 'http://localhost:1234/trainingapp/student/listall'
    }).then(function successCallback(response) {
      getStudentsData(response);
    }, function errorCallback(response) {
      showError(response);
    });

    var getStudentsData = function (options) {
      debugger;
      $scope.students = options.data;
    };

    var showError = function (error) {
      alert('error')
    };






  }

})();

