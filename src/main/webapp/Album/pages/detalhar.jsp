<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Altera��o de �lbum</h2>
<br />
<br />
<s:textfield label="C�digo do �lbum" name="modelo.id" disabled="true" />
<s:textfield label="T�tulo do album" name="modelo.nome" disabled="true" />
<s:textfield label="Ano de lan�amento" name="modelo.ano" disabled="true" />
<br />
<a href="/TreinaWebStruts2Teste/Album/ListarAlbuns">Voltar � lista
	de �lbuns...</a>