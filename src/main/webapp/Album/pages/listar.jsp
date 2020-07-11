<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Lista de �lbuns</h2>
<br />
<div class="row">
	<a href="/TreinaWebStruts2Teste/Album/Inserir" class="btn btn-primary">Inserir
		�lbum...</a>
</div>
<br />
<s:if test="modelos.size() > 0">
	<table class="table">
		<thead>
			<th>Id do �lbum</th>
			<th>Nome do �lbum</th>
			<th>Ano do �lbum</th>
			<th>A��es</th>
		</thead>
		<tbody>
			<s:iterator value="modelos">
				<tr>
					<s:url action="Alterar" var="urlAtualizar">
						<s:param name="id" value="id" />
					</s:url>
					<s:url action="Excluir" var="urlExcluir">
						<s:param name="id" value="id" />
					</s:url>
					<s:url action="Detalhar" var="urlDetalhar">
						<s:param name="id" value="id" />
					</s:url>
					<td><s:property value="id" /></td>
					<td><s:property value="nome" /></td>
					<td><s:property value="ano" /></td>
					<td><s:a href="%{urlAtualizar}">Atualizar</s:a> | <s:a
							href="%{urlExcluir}">Excluir</s:a> | <s:a href="%{urlDetalhar}">Detalhar</s:a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</s:if>
<s:else>
	<i>N�o existem �lbuns cadastrados...</i>
</s:else>