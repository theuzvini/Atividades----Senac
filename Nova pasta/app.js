function cal() {
    let calculo = require('./calculo.js');
    let dividir = calculo.dividir;
    let somar = calculo.somar;

    return 'A soma entre 10 e 5é: '+ somar(10, 5) +' e a divisão entre 10 e 5 é: '+ dividir(10, 5);
}

module.exports = cal;