<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Inserção de álbum</h2>
<br />
<br />
<s:form action="InserirAlbum" class="form-horizontal">
	<div class="row">
		<div class="form-group col-md-6">
			<label class="control-label">Título do album: </label> <input
				type="text" name="modelo.nome" class="form-control" />
		</div>
	</div>
	<div class="row">
		<div class="form-group col-md-6">
			<label class="control-label">Ano de lançamento: </label> <input
				type="text" name="modelo.ano" class="form-control" />
		</div>
	</div>
	<s:submit class="btn btn-primary" />
</s:form>