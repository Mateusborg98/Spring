<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h1>Formulário de Contato</h1></center>
	<center><form action="enviar" method="post">
		<div>	
			<label id="lbNome" for="idNome">Nome</label>
			<input type="text" id="idNome" name="nome"><br><br>
		</div>
		<div>	
			<label id="lbEmail" for="idEmail">E-mail</label>
			<input type="text" id="idEmail" name="email"><br><br>
		</div>
		<div>	
			<label id="lbTel" for="idTelefone">Telefone</label>
			<input type="text" id="idTelefone" name="telefone"><br><br>
		</div>	
		<input type="submit" value="Enviar">
	</form></center>
</body>
</html>