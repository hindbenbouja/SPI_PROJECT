'use strict';

angular.module('app')
  .service('detailsSvc', ['$http','$routeParams', function ($http,$routeParams) {
   this.fetchPopular = function(callback) {
   		var url = "http://localhost:8090/formation/" + $routeParams.codeformation;
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };
  }]);


angular.module('app')
	  	.controller('DetailsCtrl', ['$scope','$routeParams','detailsSvc',function ($scope,$routeParams,detailsSvc) {
    	detailsSvc.fetchPopular(function(data){
    			$scope.formation=data;
                console.log($scope.formation);
                
    	})
 	  }]);