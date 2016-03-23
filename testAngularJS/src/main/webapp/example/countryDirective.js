angular.module('countryDirective', []).
	directive('country', function() {
	return {
		scope : {
			country : '=' //Bi-directional binding between local scope property and the parent property
		},
		restrict : 'A', //Attribute
		templateUrl : 'country.html',
		controller: function($scope, countries) {			
			countries.find($scope.country.id, function(country) {
				$scope.flagURL = country.flagURL;
			});
		}
	};
});