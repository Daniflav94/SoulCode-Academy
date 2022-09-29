function mostrarAlerta(){
    const divAlerta = document.getElementById('alerta').classList.add('mostrar') //classlist retorna todas as classesCSS que um elemento possui
    
        contador++      
        texto.innerHTML = `Você clicou ${contador} vezes`              
       
}

function fecharAlerta(){
    const divAlerta = document.getElementById('alerta')
    divAlerta.classList.remove('mostrar')
}

const btnMostrar = document.getElementById('mostrar')
const btnFechar = document.getElementById('fechar')
const texto = document.querySelector('.texto')

let contador = 0
   

btnMostrar.addEventListener('click', mostrarAlerta) // método que permite ouvir eventos do html pelo js = onclick
btnFechar.addEventListener('click', fecharAlerta) // função como parâmetro não precisa de ()