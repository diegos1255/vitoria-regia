app.controller("HomeController", function($scope, $http) {

	$scope.container = {};
	$scope.nome = '';
	$scope.msgErro = '';
	$scope.container.titulo = "Nomes cadastrados";
	$scope.path = 'teste/';

	$scope.init = function() {

		$http.get($scope.path + 'init').then(
				function(response) {
					
					if (response.status == 200) {
						$scope.container.nomes = response.data.nomes;
					}
					
				}
		);

	}

	$scope.atualizar = function () {

		var param = $scope.nome;
		
		$scope.nome = '';
		
		$http.post($scope.path + 'atualizar', param).then(
				function success (response) {
					if (response.status == 200) {
						$scope.container.nomes = response.data.nomes;
					}
				},
				function error (response) {
					
					if (response.status == 500) {
						
						$scope.msgErro = response.data.erro;
						
					}
					
				}
		);

	}

});