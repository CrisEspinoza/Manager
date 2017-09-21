app.controller('RegisterCareerController', ['$scope','$location', function($scope,$location) {

    $scope.send = function(){
                console.log($scope.newCareer);
                var career = {
                    "name":$scope.newCareer.name,
                }
                $http.post('/careers',career)
                .then(function(response){
                    console.log(response);
                });
        }
}]);