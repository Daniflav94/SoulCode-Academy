const msg = 'Eu sou uma mensagem'
const msg2 = 'Eu sou outra mensagem'

console.log(msg == msg2)

let a = 78
let b = '78'
console.log(a == b) // true

console.log(a===b) // false

let c = 500
let d = 500

console.log(a > b) //true
console.log(c >= d) //true
console.log(3 > 6) //false
console.log(3 < 7.5) ///true
console.log(8 <= 8) //true

/* Operador OU ||

* V V -> V
* F V -> V
* V F -> V
* F F -> F

Operador E &&

* V V -> V
* F V -> F
* V F -> F
* F F -> F
*/