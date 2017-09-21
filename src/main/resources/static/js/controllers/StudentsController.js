app.controller('StudentsController', ['$scope','$http', function($scope,$http) {

    $scope.students = [];
    $scope.careers = [];

    $scope.loadCareer = function(student)
    {
        $http.get('/students/'+student.id+'/career').then(function(response)
        {
            student.career = response.data.name;
        });
    }

    $scope.loadStudents = function()
    {
        $http.get('/students').then(function(response)
        {
            var data = response.data._embedded.students;
            for (var i = 0; i < data.length; i++) {
                var student = {
                    'name':'',
                    'rut':'',
                    'mail':'',
                    'ingress':0,
                    'career':'',
                    'id':0
                }
                student.name = data[i].name;
                student.rut = data[i].rut;
                student.mail = data[i].mail;
                student.ingress = data[i].ingress;
                student.id = i+1;
                $scope.loadCareer(student);
                $scope.students.push(student);
            }
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