app.controller('StudentsController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.students = [];
    $scope.careers = [];

    $scope.loadStudents = function()
    {
        $http.get('/students').then(function(response)
        {
            $scope.students = response.data._embedded.students;
        });
        for(i = 0; i < $scope.students.length; i++)
        {
            console.log($scope.students[i]);
            $http.get($scope.students[i]._links.career.href).then(function(response)
            {
                $scope.students[i]['career'] = response.data.name;
            })
        }
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