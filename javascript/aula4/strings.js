const aspasSimples = 'Olá, mundo'
const aspasDuplas = "Olá, eu sou a \nDaniele"

console.log(aspasDuplas)

const textoComCrase = `Olá, meu nome é
Daniele`
console.log(textoComCrase)

const texto = "Hello World, Hello people"

console.log(texto.toUpperCase())
console.log(texto.toLowerCase())
console.log(texto.concat(" = Olá Mundo"))
console.log(texto[2])
console.log(texto.substring(0,5)) // pega um pedaço do texto, (inicio,fim)
console.log(texto.substring(5))
console.log(texto.replace('World', 'everybody')) //procura por algo no texto e substitui por outra (palavra, substituição), substitui somente a primeira ocorrencia da palavra
console.log(texto.replaceAll('Hello', 'olá')) //troca todas as ocorrências
console.log(texto.replace(/Hello/g, 'PHP')) // regex

const html = '<!DOCTYPE html>\n<html></html>'
console.log(html.startsWith('<!DOCTYPE')) //procurar por arquivos

const mensagem = "       Olá, mundo"
console.log(mensagem.trim()) //remove os espaços excessivos antes do texto e no final

const senha = "lalalala"
console.log(senha.length)
