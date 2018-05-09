angular.module('demo', [])
.controller('demoController', function($scope, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting').
        then(function(response) {
            $scope.greeting = response.data;
        });

    $scope.getEmployee = function(){
		$http.get("../employee/all").then(function(response){
			$scope.employees = response.data;
		})
	};
	
	$scope.getEmployeeById = function(){
		$http.get("../employee/"+$scope.id).then(function(response){
			$scope.employee = response.data;
		})
	};
});