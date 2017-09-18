var EmpLogin = angular.module('EmpLogin',['ngResource']);

EmpLogin.factory('emp_search', function($resource){
	return{
		srch_prof: $resource('/abcc/login/chq/'),
					
		
	
});






cric_search_App.controller('cricsrchController', function ($scope , $http , $window, cric_p_search) {
	
	$scope.updatedata = true;
	$scope.disable = true;
	
	$scope.updateuser = function(){
		
		$scope.disable = false;		
	};
	
	
	$scope.searchmyprof = function() {
				
		cric_p_search.srch_prof.save({emailid:$scope.player.email}, $scope.player).$promise.then(function(user) {
		      $scope.user = user;
		        
		  	$scope.user.password_c = $scope.user.password;
		      $scope.data = true;
		      
		      var collectionDate = $scope.user.dob; 
		      $scope.user.dob =new Date(collectionDate);
		      

		        $scope.updatedata = false;
		        
		     
		      
		      
	    },function( error ){
	    	
	    	 $scope.data = false;
	    	 $scope.updatedata = true;
	    	 alert("Please check the entered Email Id or Password.....!");
	    }
		); 
	}



	
    $scope.countryList = [
    { CountryId: 1, Name: 'Maharashtra' },
    { CountryId: 2, Name: 'Gujrat' }
    ];

    $scope.cityList = [];

    $scope.$watch('user.country', function (newVal, oldVal) {

        if (newVal == 'Maharashtra')
            $scope.cityList = [
                                { CountryId: 1, CityId: 1, Name: 'Nagpur' },
                                { CountryId: 1, CityId: 2, Name: 'Mumbai' },
								{ CountryId: 1, CityId: 3, Name: 'Pune' },
                                { CountryId: 1, CityId: 4, Name: 'Nashik' },
								{ CountryId: 1, CityId: 5, Name: 'Thane' },
                                { CountryId: 1, CityId: 6, Name: 'Wardha' }];
        else if (newVal == 'Gujrat')
            $scope.cityList = [
                               { CountryId: 2, CityId: 1, Name: 'Ahmdabad' },
                               { CountryId: 2, CityId: 2, Name: 'Surat' }];
        else
            $scope.cityList = [];
    });
    $scope.url = function(){		
		$scope.user.url= 'localhost:8080/profile.html?id='+angular.element(email12).val();
	};	
	
	var maleImage = "https://cdn4.iconfinder.com/data/icons/flatfaces-everyday-people-circular/125/flatfaces10-512.png";  
	var femaleImage = "https://cdn4.iconfinder.com/data/icons/flatfaces-everyday-people-circular/125/flatfaces2-512.png";
	
	$scope.changeGender= function(){
		if($scope.user.GENDER=='Male')
			$scope.user.imageurl= maleImage;
	else
		$scope.user.imageurl =  femaleImage; 
		 
		
	};
	
	

	
	$scope.imgUrl = function(){		
		$scope.user.imageurl = 'c:/temp/'+angular.element(email12).val()+'.jpg';
	};		

    $scope.checkboxModel = {
           Test : 'Test',
           ODI : 'ODI',
    	   T20 : 'T20',
    	  /* Other : 'Other'*/
         };


    $scope.$watch('user.test', function (newVal, oldVal) {

        if (newVal == ""){
        	$scope.user.test=null;
        }
           
    });
	
	$scope.$watch('user.odi', function (newVal, oldVal) {

        if (newVal == ""){
        	$scope.user.odi=null;
        }
           
    });
	
	$scope.$watch('user.t20', function (newVal, oldVal) {

        if (newVal == ""){
        	$scope.user.t20=null;
        }
           
    });
	
	$scope.$watch('user.other', function (newVal, oldVal) {

        if (newVal == ""){
        	$scope.user.other=null;
        }
           
    });
    $scope.deleteuser = function(){
    		
    	$scope.data = true;

    	swal({
    	    title: "Are you sure to delete profile?",
    	    text: "You will not be able to recover this profile after performing this option!",
    	    type: "warning",
    	    showCancelButton: true,
    	    confirmButtonColor: '#DD6B55',
    	    confirmButtonText: 'Yes, I am sure!',
    	    cancelButtonText: "No, cancel it!",
    	    closeOnConfirm: false,
    	    closeOnCancel: false
    	 },
    	 function(isConfirm){

    	   if (isConfirm){
    	     //swal("Shortlisted!", "Candidates are successfully shortlisted!", "success");
    		   var urll = 'http://localhost:8080/xplor/player/delete/'+$scope.user.PlayeremailId;
    	    	//var p_emailid = $scope.user.PlayeremailId;
    	    	
    	    	 $http({
    	    	        method : "GET",
    	    	        url : urll
    	    	    }).then(function mySucces(response) {
    	    	        if(response.status == 200){
    	    	        	$window.location.href = '/ThankYou.html';
    	    	        }
    	    	    }, function myError(response) {
    	    	       /* $scope.myWelcome = response.statusText;*/
    	    	    	//swal("Oops, Some error occoured!", "Profile cannot be deleted at tis time....!")
    	    	    	$window.location.href = '/Delete Successful.html';
    	    	    });

    	    } else {
    	      swal("Cancelled", "Your Profile is safe :)", "error");
    	         //e.preventDefault();
    	    }
    	 });
    	

           
       };
       



	


    
    
    	
    
    
    // function to submit the form after all validation has occurred			
    $scope.submitForm = function () {
		
    	$scope.submitted = true;
		 
		 if ($scope.userForm.$valid) {
		
			 swal({
		    	    title: "Are you sure to update profile?",
		    	    text: "Please confirm...",
		    	    type: "warning",
		    	    showCancelButton: true,
		    	    confirmButtonColor: '#DD6B55',
		    	    confirmButtonText: 'Yes, I am sure!',
		    	    cancelButtonText: "No, cancel it!",
		    	    closeOnConfirm: false,
		    	    closeOnCancel: false
		    	 },
		    	 function(isConfirm){

		    	   if (isConfirm){
		    	       
		    		   cric_p_search.update_data.save({PlayeremailId:$scope.user.PlayeremailId}, $scope.user).$promise.then(function(user) {
		    			   $window.location.href = '/update Successful.html';
		       	    });

		    	    } else {
		    	      swal("Cancelled", "Your Profile is safe :)", "error");
		    	         //e.preventDefault();
		    	    }
		    	 });
	
           // alert("Form is valid!");
        	
        	
        
        }
        
        else {
            alert("Please correct errors...!");
        }
    };



	


});

	
	
	
	
	
	



        
    
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