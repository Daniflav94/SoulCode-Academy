const litros = prompt("Digite quantos litros foram vendidos")
const tipoComb = prompt("Qual o tipo de combustível? Digite A para álcool ou G para gasolina")

if (litros <= 25 && tipoComb == "A"){
    const valorComDesconto = 1.90 - (1.90 * 0.02)
    const valorFinal = valorComDesconto * litros
    alert(`O valor total com desconto será de ${valorFinal.toFixed(2)} reais`)
}else if (litros > 25 && tipoComb == "A"){
    const valorComDesconto = 1.90 - (1.90 * 0.04)
    const valorFinal = valorComDesconto * litros
    alert(`O valor total com desconto será de ${valorFinal.toFixed(2)} reais`)
}else if (litros <= 25 && tipoComb == "G"){
    const valorComDesconto = 2.70 - (2.70 * 0.03)
    const valorFinal = valorComDesconto * litros
    alert(`O valor total com desconto será de ${valorFinal.toFixed(2)} reais`)
}else if (litros > 25 && tipoComb == "G") {
    const valorComDesconto = 2.70 - (2.70 * 0.05)
    const valorFinal = valorComDesconto * litros
    alert(`O valor total com desconto será de ${valorFinal.toFixed(2)} reais`)
}
