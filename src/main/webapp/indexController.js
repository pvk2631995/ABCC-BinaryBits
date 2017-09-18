var app = angular.module('indexApp', []);

app.config('$routeProvider',function($routeProvider) {
  $routeProvider
    .when('/', {
      templateUrl: 'Employee/employeeForm.html',
      controller: 'loginController'
    })
    .when('/login', {
      templateUrl: 'login/login.html',
      controller: 'DetailsController'
    })
      .otherwise({
      redirectTo: 'Employee/employeeForm.html'
    });

});



