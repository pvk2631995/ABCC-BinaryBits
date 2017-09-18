

var app = angular.module('formApp', ['ngRoute']);



   app.controller('FormController', ['$scope', '$http', function ($scope, $http) {
   // default post header

$scope.showlogin = true;
$scope.EmpForm = false;
$scope.MgrForm = false;



       $scope.master = {};

       $scope.save= function(employee) {
           $scope.master = angular.copy(employee);
       };

       $scope.reset = function() {
           $scope.employee = angular.copy($scope.master);
       };

       $scope.reset();


      



   $http.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
   // send login data

   $scope.SendData1 = function(){


            var postData = JSON.stringify($scope.emp);

        
    $http({
       url: 'http://localhost:8080/abcc/login/id',
       dataType: 'json',
       method: 'POST',
       data: postData ,
       headers: {
           "Content-Type": "application/json"
       }
   }).then(function successCallback(response) {
   // this callback will be called asynchronously
   console.log(response);


 
   // when the response is available
 }, function errorCallback(response) {
   // called asynchronously if an error occurs
   // or server returns response with an error status.

   console.log("Username or password is wrong : "+response);
 });


   };

    $scope.SendData2 = function(){
    $scope.showlogin = false;
       $scope.EmpForm = false;
       $scope.MgrForm = false;

   };

   $scope.SendData = function(){

       var postData = JSON.stringify($scope.user);

        
    $http({
       url: 'http://localhost:8080/abcc/login/id',
       dataType: 'json',
       method: 'POST',
       data: postData ,
       headers: {
           "Content-Type": "application/json"
       }
   }).then(function successCallback(response) {
   // this callback will be called asynchronously
   console.log(response);
       $scope.showlogin = false;
       $scope.EmpForm = true;
       $scope.MgrForm = false;
 
 
   // when the response is available
 }, function errorCallback(response) {
   // called asynchronously if an error occurs
   // or server returns response with an error status.

   console.log("Username or password is wrong : "+response);
 });


};
   }]);


