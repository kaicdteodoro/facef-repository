chefe()
function chefe() {
    let vendedores = []
    let vendas = []
    let option
    do {
option = Number(prompt(`Escolha [1]. Cadastrar Vendedor [2]. Cadastrar Venda [3]. Sair`))
switch (option) {
    case 1:
        cadastraVendedor(vendedores)
        break;
case 2:
        cadastraVendas(vendedores, vendas)
        break;
case 3:
        
        break;
    default:
        break;
}



    }while (option != 3)
        
    
}
function cadastraVendedor (vended){
    let obj = new Object()
    obj.cod = Number(prompt(`Digite o código do vendedor:`))
    for (let x = 0; x < vended.length; x++) {
        if (obj.cod == vended[x].cod) {
            console.log(`Erro! Código do vendedor já cadastrado!`);
            return 
        }
    }
 obj.nom = prompt(`Digite o nome do vendedor ${obj.cod}:`)
 vended.push(obj)
 console.log(`Cadastro do vendedor concluído!!`);
}

function cadastraVendas(vdes, vdas) {
let obj = new Object()

obj.vendcod = Number(prompt(`Digite o código do vendedor:`))  
 for (let x = 0; x < vdes.length; x++) {
        if (obj.vendcod == vdes[x].cod) {
            obj.mes = Number(prompt(`Digite o mês da venda:`))
            for (let i = 0; i < vdas.length; i++) {    
         if ((obj.mes == vdas[i].mes) && (obj.vendcod == vdas[i].vendcod)) {
           console.log(`Erro!! Não é permitido duas vendas no mesmo mês pelo mesmo vendedor!`); 
           return 
         }   
            }
       obj.cod = Number(prompt(`Digite o código da venda:`))
       obj.valor = Number(prompt(`Digite o valor da venda:`))
console.log(`Cadastro de venda completo!!!`); 
vdas.push(obj)

        }
    }
}