var app = angular.module('estudiante',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
        .when('/types',{
            templateUrl: 'js/views/index.html',
            controller: 'MainController'
        })
        .when('/movements',{
            templateUrl: 'js/views/index.html',
            controller: 'MainController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});