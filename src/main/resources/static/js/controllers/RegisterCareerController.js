app.controller('RegisterCareerController', ['$scope','$location','$http', function($scope,$location,$http) {

    $scope.careers = [];

    $scope.resetNewCareer = function(){
                $scope.newCareer = {
                "name":"",
                }
    }

    $scope.loadCareers = function()
    {
        $http.get('/careers').then(function(response)
        {
           $scope.careers = response.data._embedded.careers;
        });
         $scope.resetNewCareer();
    }

    $scope.send = function(){
                console.log($scope.newCareer);

                var career = {
                    "name":$scope.newCareer.name,
                };

                $http.post('/careers',career)
                .then(function(response){
                    console.log(response);
                    $scope.loadCareers();

                $scope.loadCareers();
                });
    }

    $scope.deletedCareers = function(){
                console.log($scope.deletedCareers);
                $http.delete($scope.deletedCareers).then(function(response){
                    console.log(response);
                });
                $scope.loadCareers();
    }

}]);
