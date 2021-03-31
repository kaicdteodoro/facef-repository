class Fifo {

constructor(){
this.fila = []   
}
inserir = (x) =>{
    this.fila.push(x);
}

retirar = () =>{
    this.fila.shift();
}

mostra = () =>{
    console.log(this.fila.toString())
}  

primeiro = () => {
    return this.fila[0];
}

ultimo = () => {
    return this.fila[this.fila.length-1];
}

testavazia = () => {
    return this.fila.length === 0
}


tamanho = () => {
    return this.fila.length;
}

limpa = () => {
    this.fila = []
}

}
let obj1 = new Fifo();
obj1.inserir(1);
obj1.inserir(2);
obj1.inserir(3);
obj1.inserir(4);
obj1.mostra();
obj1.retirar();
obj1.inserir(6);
obj1.mostra();
console.log(obj1.testavazia());
console.log(obj1.primeiro());
console.log(obj1.ultimo());