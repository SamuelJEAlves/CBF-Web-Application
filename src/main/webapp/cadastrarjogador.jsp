<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar jogador</title>
    <head>
<body>
    <h1>Cadastrar jogador</h1>
    <form name="formulario" method="post" action="salvarjogador.jsp">
        <label>Nome</label>
        <input type="text" name="nome" placeholder="Nome do jogador" />
        <br />
        <label>Idade</label>
        <input type="number" name="idade" placeholder="Idade do jogador" />
        <br />
        <label>Salario</label>
        <input type="number" name="salario" placeholder="Salario do jogador" />
        <br />
        <input type="submit" name="enviar" value="Salvar" />
    </form>
</body>
</html>