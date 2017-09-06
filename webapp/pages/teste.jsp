<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="HomeController" ng-init="init()">

	<div class="panel panel-default">
		<div class="panel-heading">{{container.titulo}}</div>

		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="nome in container.nomes">
					<th>{{$index + 1}}</th>
					<td>{{nome}}</td>
				</tr>
			</tbody>
		</table>

	</div>
    
    <br />
    
    <p ng-if="msgErro" style="color: red;">Erro: {{msgErro}}</p>
    
    <br />
    <input type="text" id="nome" class="form-control" ng-model="nome" />
    <br />
    <button type="submit" class="btn btn-danger" ng-click="atualizar()">Atualizar</button>

</div>