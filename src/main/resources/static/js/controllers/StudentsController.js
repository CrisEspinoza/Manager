app.controller('StudentsController', ['$scope','$http', function($scope,$http) {

    $scope.students = [];
    $scope.careers = [];

    $scope.loadStudents = function()
    {
        $http.get('/students').then(function(response)
        {
            $scope.students = response.data._embedded.students;
        });
    }

    $scope.loadCareers = function()
    {
        $http.get('/careers').then(function(response)
        {
            $scope.careers = response.data._embedded.careers;
        });
    }

    $scope.loadStudents();
    $scope.loadCareers();

}]);