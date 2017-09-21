var app = angular.module('Myapp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
        .when('/registerStudent',{
            templateUrl: 'js/views/registerUser.html',
            controller: 'RegisterUserController'
        })
        .when('/registerCareer',{
                    templateUrl: 'js/views/registerCareer.html',
                    controller: 'RegisterCareerController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});