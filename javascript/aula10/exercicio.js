//exercício: criar uma funão que gera o resultado de uma função de segundo grau - ax² + bx + c = 0, delta = b² - 4ac, x = -b +- raiz de delta / 2a


function funcaoSegundoGrau(a, b, c){
    
    let delta = b**2 - (4*a*c)
    let raizDelta = Math.sqrt(delta)
    let x1 = (-b + raizDelta) / (2 * a)
    let x2 = (-b - raizDelta) / (2 * a)

    return [x1, x2]
}

console.log(funcaoSegundoGrau(1, -1, -12)) // -3, 4