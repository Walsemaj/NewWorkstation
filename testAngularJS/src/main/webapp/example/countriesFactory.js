angular.module('countriesFactory', []).
	factory('countries', function($http) {
		return { //Implementation
			list : function(callback) {
				$http({
					method : 'GET',
					url : 'countries1.json',
					cache : true
				}).success(callback);
			},
			find : function(id, callback) {
				$http({
					method : 'GET',
					url : 'country_' + id + '.json',
					cache : true
				}).success(callback);
			}
		}; //return an object with a function called "list"
	});