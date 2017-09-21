app.controller('RegisterStudentController', ['$scope','$location', function($scope,$location) {

    $scope.students = [];

    $scope.resetNewStudent = function(){
            $scope.newStudent = {
            "name":"",
            "mail":"",
            "ingress":0,
            "rut":0,
            }
    }

    $scope.send = function(){
            console.log($scope.newStudent);
            var student = {
                "name":$scope.newStudent.name,
                "mail":$scope.newStudent.mail,
                "ingress":$scope.newStudent.ingress,
                "rut":$scope.newStudent.rut,
            };

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

    $scope.loadStudents();

}]);