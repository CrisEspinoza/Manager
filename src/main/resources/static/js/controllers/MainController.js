app.controller('MainController', ['$scope','$location', function($scope,$location) {

	$scope.title = "student";

    $scope.typePage = $location.path() === '/types';
    $scope.pokemonPage = $location.path() === '/pokemon';
    $scope.movementPage = $location.path() === '/movements';

	$scope.navigation = [
	{"text":"Ver tipos",   "link":"#!/types", "condition":$scope.typePage},
	{"text":"Ver pokemon",   "link":"#!/pokemon", "condition":$scope.pokemonPage},
	{"text":"Ver movimientos", "link":"#!/movements", "condition":$scope.movementPage}
	];

}]);