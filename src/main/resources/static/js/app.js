var app = angular.module('Myapp',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
        .when('/registerUsername',{
            templateUrl: 'js/views/registerUser.html',
            controller: 'RegisterUserController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});