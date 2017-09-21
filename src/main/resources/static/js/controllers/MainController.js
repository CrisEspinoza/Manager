app.controller('MainController', ['$scope','$location', function($scope,$location) {

	$scope.title = "Lista de estudiantes";

    $scope.registerUsername = $location.path() === '/registerUsername';
    $scope.registerCareer = $location.path() === '/registerCareer';

    $scope.navigation = [
    {"text":"Agregar Estudiante",   "link":"#!/registerUsername", "condition":$scope.registerUsername},
    {"text":"Agregar Carrera",   "link":"#!/registerCareer", "condition":$scope.registerCareer},
    ]
}]);