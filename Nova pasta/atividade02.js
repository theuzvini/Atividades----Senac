module.exports = {
    salario(a){
        const salmes = Math.round(a*30);
        const descontofgts = salmes * 0.09;
        const descontoalm = salmes * 0.2;
        const salliquido = salmes - descontofgts - descontoalm;
        console.log("Salario Total = " + salliquido + "R$")
    }
}