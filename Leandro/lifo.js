class Lifo {

constructor(){
this.pilha = []   
}
inserir = (x) =>{
    this.pilha.push(x);
}

retirar = () =>{
    this.pilha.pop();
}

mostra = () =>{
    console.log(this.pilha.toString())
}  

topo = () => {
    return this.pilha[this.pilha.length-1];
}

testavazia = () => {
    return this.pilha.length == 0
}

tamanho = () => {
    return this.pilha.length;
}

limpa = () => {
    this.pilha = []
}

}
let obj1 = new Lifo();

obj1.inserir(1);
obj1.inserir(2);
obj1.inserir(3);
obj1.inserir(4);
obj1.mostra();
obj1.retirar();
obj1.inserir(6);
obj1.mostra();
console.log(obj1.testavazia());
console.log(obj1.topo());