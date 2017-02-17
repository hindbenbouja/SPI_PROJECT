'use strict';


angular.module('app')
	  	.controller('FormationAjouterCtrl', ['$scope','$http','$location','formationSvc',function ($scope,$http,$location,formationSvc) {
	    
	  		$scope.formation = {
	  				codeFormation : "",
	  				nomFormation : "",
	  				diplome : "",
	  				doubleDiplome : "",
	  				n0Annee : "",
	  				debutAccreditation : "",
	  				finAccreditation : ""
	  		}

	  		$scope.ajouterFormation = function(){
	  			$scope.formation["Content-Type"] = "application/json";
	  			var clientUrl = '/formation/ajouter';
	  			var request = $http({
	  				method: "POST",
	  				url: clientUrl,
	  				data: $scope.formation
	  			});
	  			request.success(
	  				function(response) {
	  					$location.path('/formation');
	  				}
	  			);
	  		}
  }]);

angular.module('app').controller('SupprimerFormationCtrl',['$scope','$http','$routeParams',function($scope, $http, $routeParams){
	
	console.log("je suis la ");
			var lien = "http://localhost:8090/formation/supprimer/" + $routeParams.codeformation;
			$http.delete(lien);
			/*request.success(
	  				function(response) {
	  					$location.path('http://localhost:8090/formation');
	  				}
	  			);*/
		}]);


angular.module('app').controller('ModifierFormationCtrl',['$scope','$http','$routeParams','$location',function($scope,$http, $routeParams, $location){
	
	var lien = "http://localhost:8090/formation/" + $routeParams.codeformation;
	
	$http.get(lien).then(function(response) {
		$scope.formation = response.data;
		
	});
	$scope.modifierFormation = function(){
		
		$scope.formation["Content-Type"] = "application/json";
		var clientUrl='/formation/update/'+ $routeParams.codeformation;
		var request = $http({
			method : "PUT",
			url : clientUrl,
			data : $scope.formation
		});
		request.success(
  				function(response) {
  					$location.path('/formation');
  				}
  			);
	}
	
	
	
}]);
  