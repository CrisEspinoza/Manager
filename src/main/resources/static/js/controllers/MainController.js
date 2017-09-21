app.controller('MainController', ['$scope','$location', function($scope,$location) {

	$scope.title = "Lista de estudiantes";

    $scope.registerStudent = $location.path() === '/registerStudent';
    $scope.registerCareer = $location.path() === '/registerCareer';

    $scope.navigation = [
    {"text":"Agregar Estudiante",   "link":"#!/registerStudent", "condition":$scope.registerStudent},
    {"text":"Agregar Carrera",   "link":"#!/registerCareer", "condition":$scope.registerCareer},
    ]
}]);