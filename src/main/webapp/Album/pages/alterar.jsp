<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Alteração de álbum</h2>
<br />
<br />
<s:form action="AlterarAlbum">
	<s:hidden name="modelo.id" />
	<s:textfield label="Tìtulo do album" name="modelo.nome" />
	<s:textfield label="Ano de lançamento" name="modelo.ano" />
	<s:submit />
</s:form>