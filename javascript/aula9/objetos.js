let end = {
    rua: 'Rua',
    numero: 123,
    estado: 'SP',
    complemento: 'Sem comp',
    cep: '00000-000'
}


let pessoa = {
    nome: 'Joana',
    idade: 23,
    cpf: '000.000.000-00',
    altura: 156,
    endereco: {...end}, //desestrutura/Destructuring, podendo mudar o valor de endereco sem alterar o valor de end, cria uma cópia
    solteiro: false,
    habilidades: ['React', 'Java', 'Javascript', 'Golang', 'Rust'],

    cumprimentar() {
        console.log(`Olá, meu nome é ${this.nome}`) //como está dentro do objeto, referenciamos o objeto pessoa como this
    }
}

/*console.log(endereco)
console.log(pessoa.habilidades[2])
console.log(pessoa.endereco.estado)
pessoa.cumprimentar()

pessoa.nome = 'Pablo'
pessoa.cumprimentar()
pessoa.habilidades.push('Angular')
console.log(pessoa.habilidades)
console.log(pessoa['cpf']) //exibe o valor da chave, precisa estar entre ''
*/
pessoa.endereco.rua = 'Rua secundaria'
console.log(pessoa.endereco.rua)
console.log(end.rua)

