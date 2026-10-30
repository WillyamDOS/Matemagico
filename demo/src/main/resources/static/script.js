const form = document.getElementById('cadastroEstudante');

novoEstudante = {
    tipo_usuario: "ESTUDANTE",
    username: document.getElementById("username").value,
    nome_completo: document.getElementById("nome_completo").value,
    email: document.getElementById("email").value,
    senha: document.getElementById("senha").value
};

novoEstudante2 = {
    tipo_usuario: "ESTUDANTE",
    username: "2",
    nome_completo: "2",
    email: "2",
    senha: "2"
};

form.addEventListener('submit', function(e) {
    e.preventDefault();

    salvarUsuario(novoEstudante);
    salvarUsuario(novoEstudante2);
    document.getElementById('greeting').textContent = document.getElementById('Cadastrado').value;
});


function salvarUsuario(novoUsuario) {
    fetch('http://localhost:8080/usuarios', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(novoUsuario)
    })
}

