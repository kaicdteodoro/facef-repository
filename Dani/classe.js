class Veiculo {
constructor (marca, modelo, ano, motor, velocidade){
this.marca = marca
this.modelo = modelo
this.ano = ano
this.motor = motor
this.velocidade = velocidade
}
mostra = () =>{
    let stt = (this.motor) ? "Ligado" : "Desligado"
    console.log(`Marca: ${this.marca};`)
    console.log(`Modelo: ${this.modelo};`)
    console.log(`Ano: ${this.ano};`)
    console.log(`Situação do motor: ${stt};`)
    console.log(`Velocidade atua: ${this.velocidade};`)

}
off = () =>{
    this.motor = true
}
on = () =>{
    this.motor = true
}

veloAum = (aum) =>{
this.velocidade = this.velocidade + aum
}
veloDim = (dim) =>{
    this.velocidade -= dim
    }
} 

let obj1 = new Veiculo("GM", "Onyx", 2020, false,100)
obj1.veloAum(50)
obj1.mostra()
obj1.on()

let obj2 = new Veiculo("Fiat", "Palio", 2020, false,70)
obj2.veloDim(30)
obj2.mostra()
obj2.on()
