var app = angular.module('Myapp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
        .when('/registerStudent',{
            templateUrl: 'js/views/registerStudent.html',
            controller: 'RegisterStudentController'
        })
        .when('/registerCareer',{
                    templateUrl: 'js/views/registerCareer.html',
                    controller: 'RegisterCareerController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});