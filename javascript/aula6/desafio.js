/*Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir  para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento

1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/

let precoProduto = parseFloat(prompt("Qual o preço do produto?"))

while (isNaN(precoProduto) || precoProduto <= 0){
    alert("O preço digitado é inválido. Por favor, informe o preço apenas com números, sem caracteres especiais, acima de 0.")
    precoProduto = parseFloat(prompt("Qual o preço do produto?"))
}

const mensagem = `
Informe o método de pagamento:
Digite 1 para pagamento em dinheiro
Digite 2 para pagamento em cheque
Digite 3 para pagamento com cartão
`
let metodoDePagamento = prompt(mensagem)

while(metodoDePagamento != 1 && metodoDePagamento !=2 && metodoDePagamento != 3){
    alert("Opção inválida, digite novamente.")
    metodoDePagamento = prompt(mensagem)
}

if (metodoDePagamento == 1 || metodoDePagamento == 2) {
    const precoFinal = precoProduto * 0.9
    alert(`O preço final do pagamento é ${precoFinal.toFixed(2)} reais`)
} else if (metodoDePagamento == 3) {
    const parcelas = parseInt(prompt("Informe a quantidade de parcelas"))
    if (parcelas == 1) {
        const precoFinal = precoProduto * 0.85
        alert(`O preço final do pagamento é ${precoFinal} reais`)
    } else if (parcelas == 2) {
        alert(`O preço final do pagamento é ${precoProduto}`)
    } else{
        const precoFinal = precoProduto + (precoProduto * 0.10)
        alert(`O preço final do pagamento é ${precoFinal} reais`) // ou precoProduto * 1.1
    }
}