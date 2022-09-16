alert("Código funcionando")
const nomeUsuario = prompt("Olá usuário, qual é o seu nome?")

let numero = Number(prompt("Olá, " + nomeUsuario + ". Digite algum número: "))

const sucessor = numero + 1
const antecessor = numero - 1

alert("O sucessor de " + numero + " é " + sucessor)
alert("O antecessor de " + numero + " é " + antecessor)


// se numero for 5:
console.log(num++) // 5, operador de pós incremento, usa o numero e depois atualiza
console.log(num) // 6
console.log(++num) // 7, operador de pré incremento, atualiza primeiro depois usa