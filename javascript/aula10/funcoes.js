function cumprimentar(mensagem, repetir = 1){ //valor padrão para o parametro, caso nenhum valor seja passado para ele
    for (let i = 1; i < repetir; i++) {
        alert(mensagem.toUpperCase())        
    }  
}

function soma(num, num2){
    let result = num + num2 
    return result
}

function maiorValor(a, b){
    if (a > b){
        return a
    }else{
        return b
    }
}

console.log(soma(7.5, 7))
let resultado = soma(5,9)
console.log(resultado)

//let resultado = soma(4,7)
//console.log(resultado) //undefined, pois a function não teve retorno, void(vazio)

const num1 = parseInt(prompt('Informe o primeiro numero'))
const num2 = parseInt(prompt('Informe o segundo numero'))

alert(`O maior num é ${maiorValor(num1, num2)}`)


