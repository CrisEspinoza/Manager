app.controller('MainController', ['$scope','$location', function($scope,$location) {

	$scope.title = "Home";

    $scope.registerStudent = $location.path() === '/registerStudent';
    $scope.registerCareer = $location.path() === '/registerCareer';
    $scope.students = $location.path() === '/students';

    $scope.navigation = [
    {"text":"Agregar Estudiante",   "link":"#!/registerStudent", "condition":$scope.registerStudent},
    {"text":"Agregar Carrera",   "link":"#!/registerCareer", "condition":$scope.registerCareer},
    {"text":"Estudiantes",   "link":"#!/students", "condition":$scope.students},
    ]
}]);