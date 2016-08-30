angular.module('myApp', [])

        .controller('MyController', ['$http', '$scope', function($http, $scope) {
                
                $scope.order = 'age';
        
                $scope.changeOrder = function() {
                    if ($scope.order === 'age') {
                        $scope.order = '-age';
                    } else {
                        $scope.order = 'age';
                    }
                }
                
                $http.get('api/test/all').then(function(response) {
                   $scope.persons = response.data; 
                });
                $http.get('api/test/hello/name=Danny,lastname=Dynamit').then(function(response) {
                   $scope.welcome = response.data; 
                });
                
        }]);

