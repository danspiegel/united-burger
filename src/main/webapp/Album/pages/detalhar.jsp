<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Alteração de álbum</h2>
<br />
<br />
<s:textfield label="Código do álbum" name="modelo.id" disabled="true" />
<s:textfield label="Tìtulo do album" name="modelo.nome" disabled="true" />
<s:textfield label="Ano de lançamento" name="modelo.ano" disabled="true" />
<br />
<a href="/TreinaWebStruts2Teste/Album/ListarAlbuns">Voltar à lista
	de álbuns...</a>