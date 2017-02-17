(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider', function($routeProvider, $urlRouterProvider) {
    $routeProvider
    
    
    .when('/login', {
        templateUrl: 'views/login.html',
        controller: 'LoginCtrl',
        controllerAs: 'LoginController'
      })
      .when('/formation', {
        templateUrl: 'views/formationIndex.html',
        controller: 'FormationCtrl',
        controllerAs: 'FormationController'
      })
      .when('/ajouterformation', {
        templateUrl: 'views/ajouterFormation.html',
        controller: 'FormationAjouterCtrl',
        controllerAs: 'FormationController'
      })
      .when('/modifierformation/:codeformation', {
        templateUrl: 'views/updateformation.html',
        controller: 'ModifierFormationCtrl',
        
      })
      .when('/deleteformation/:codeformation', {
        templateUrl: 'views/delete.html',
        controller: 'SupprimerFormationCtrl',
       
      })
      .when('/dashboard', {
        templateUrl: 'views/dashboard.html',
        controller: 'dashboardCtrl',
       
      })
      .when('/details/:codeformation', {
        templateUrl: 'views/details.html',
        controller: 'DetailsCtrl',
        controllerAs: 'DetailsController'
      }).otherwise
      ({redirectTo: '/login'});
  } ]);
  
}).call(this);

