/*
Será desenvolvido um algoritmo para auxiliar a polícia de trânsito a averiguar as possíveis infrações, para isso peça os seguintes dados: Velocidade da pista e velocidade do veículo.
Se a velocidade do veículo for menor ou igual a velocidade da pista, retorno bom motorista.
Se a velocidade ultrapassar 10km/h haverá uma multa de R$50,00
Se a velocidade estiver entre 10.1km/h até 20km/h haverá uma multa de R$100,00
Se a velocidade for superior a 20km/h a multa será de R$200,00
*/

function atividade09 () {
    alert("Sistema indicador de multas. Vamos começar!")
    var velMotorista = prompt("Informe a velocidade do condutor:")
    var velPista = prompt("Agora, informe a velocidade da via:")

    if (velMotorista <= velPista  ) {
        document.getElementById("paragrafo09").innerText = "Motorista dentro do limite de velocidade."
        
    }else if (velMotorista >= (parseInt(velMotorista) + 10) ) {
        document.getElementById("paragrafo09").innerText = "Velocidade excedida, deve ser aplicada multa de R$50,00"
        
    }

        
    }
    

