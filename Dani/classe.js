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

// 27-10-2020 

class Aluno {
constructor(num, nome, idade, p1, p2, pas){
    this.num = num
    this.nome = nome
    this.idade = idade
    this.p1 = p1
    this.p2 = p2
    this.pas = pas
}

notaFinal = () => {
return (this.p1 + this.p2)/2
//console.log(`Nota final do aluno ${this.nome}: ${this.med};`)
}
passou = (not) => {
this.pas = (not>5)? "Aprovado" : "Reprovado"
}

mostra = () => {
    console.log(`Número do Aluno: ${this.num};`)
    console.log(`Nome do Aluno: ${this.nome};`)
    console.log(`Idade do Aluno: ${this.idade};`)
    let media = this.notaFinal()
    this.passou(media)
    console.log(`Média do Aluno: ${media};`)
    console.log(`Situação do Aluno: ${this.pas};`)
}
}
let obj1 = new Aluno(20, "kaic", 18, 8, 10, "Não avaliado")
obj1.mostra()