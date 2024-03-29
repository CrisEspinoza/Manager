app.controller('RegisterStudentController', ['$scope','$location', '$http' ,function($scope,$location,$http) {

    $scope.students = [];
    $scope.careers = [];
    $scope.years = [];

    $scope.resetNewStudent = function(){
            $scope.newStudent = {
            "name":"",
            "mail":"",
            "ingress":0,
            "rut":0,
            }
    }

    $scope.loadStudents = function(){
            $http.get('/students').then(function(response){
                $scope.students = response.data._embedded.students;
            });
            $scope.resetNewStudent();
    }

    $scope.loadCareers = function()
    {
            $http.get('/careers').then(function(response)
            {
                $scope.careers = response.data._embedded.careers;
            });
    }

    $scope.send = function(){
            console.log($scope.newStudent);
            var student = {
                "name":$scope.newStudent.name,
                "mail":$scope.newStudent.mail,
                "ingress":$scope.newStudent.ingress,
                "rut":$scope.newStudent.rut1 + "-" + $scope.newStudent.rut2,
                "career":$scope.newStudent.career,
            };

            $http.post('/students',student)
            .then(function(response){
                console.log(response);
                $scope.loadStudents();

            $scope.loadStudents();
            });
    }

    $scope.deletedStudents = function(){
            console.log($scope.deletedStudents);
            $http.delete($scope.deletedStudents).then(function(response){
                console.log(response);
            });
            $scope.loadStudents();
    }

    $scope.getYears = function()
    {
         for (var i = 1990; i <= 2017; i++)
         {
            $scope.years.push(i);
         }
    }


    $scope.loadStudents();
    $scope.loadCareers();
    $scope.getYears();
}]);