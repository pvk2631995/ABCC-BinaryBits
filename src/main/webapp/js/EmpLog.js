var EmpLogin = angular.module('EmpLogin',['ngResource']);

EmpLogin.factory('emp_search', function($resource){
	return{
		srch_prof: $resource('/abcc/login/chq/'),
					
		};
	
});






EmpLogin.controller('empsrchController', function ($scope , $http , $window, emp_search) {
	
	$scope.updatedata = true;
	$scope.disable = true;
	
	$scope.updateuser = function(){
		
		$scope.disable = false;		
	};
	
	
	$scope.searchmyprof = function() {
				
		$scope.myData = $scope.user.username;

		emp_search.srch_prof.save({empntid:$scope.user.username}, $scope.user).$promise.then(function(user) {
		      $scope.user = user;
		        
		  	$scope.user.password_c = $scope.user.password;
		      $scope.data = true;
		      
		     
		      

		        $scope.updatedata = false;
		        
		     
		      
		      
	    },function( error ){
	    	
	    	 $scope.data = false;
	    	 $scope.updatedata = true;
	    	 alert("Please check the entered Email Id or Password.....!");
	    }
		); 
	



	
       



	


    
    
	
	
	
	
	
	



        
    
/*
 * 
 * Add this code to bring json data to the object
 * 
 * 
 
	function(res) {
	   $scope.careers = res.careers.data;
	}
	
	angular.module('myApp.services', ['ngResource']).
  factory("geoProvider", function($resource) {
    return {
      states: $resource('../data/states.json', {}, {
      }),
      countries: $resource('../data/countries.json', {}, {
       
      })
    };
  });
	*/