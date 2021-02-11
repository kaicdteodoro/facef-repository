boss()
function boss() {
    let times = []
    let pontos = []

    
    cadastraTime(times,pontos)
    consultaMedia(times,pontos)
    maiorPontR(times,pontos)
}
function cadastraTime(vet,mat){
for (let x = 0; x < 4; x++) {
obj = new Object();
obj.time = prompt(`Digite o nome do ${x+1}º Time:`)
obj.cid = prompt(`Digite a cidade da equipe ${obj.time}:`)
obj.med = 0
  vet.push(obj) 
  mat[x] = []
  for (let y = 0; y < 3; y++) {
  mat[x][y] = Number(prompt(`Digite a pontuação do ${obj.time} da ${y+1}ª temporada:`))
  }
  console.log(`Cadastro do time ${obj.time} concluído!!`)
}
console.log(vet)
console.log(mat)
}

function consultaMedia(vet, mat) {
  
   for (let x = 0; x < mat.length; x++) {
    for (let y = 0; y < mat[x].length; y++) {
    vet[x].med += mat[x][y]/mat[x].length   
    }  
   }
   let nom = prompt(`Qual o nome do Time que deseja ver a média:`)
   for (let x = 0; x < vet.length; x++) {
       if (nom == vet[x].time){
console.log(`Média do ${vet[x].time}: ${vet[x].med};`)

       }
       
   }
}

function maiorPontR(vet,mat) {
  let aux = 0
    for (let y = 0; y < mat[y].length; y++) {
        
        let maipont = mat[aux][y]
        let i = 0
        for (let x = 0; x < mat.length; x++) {
           if (mat[x][y] > maipont) {
               maipont = mat[x][y]
               i = x
           }     
        }
       console.log(`${vet[i].time} foi o time com a maior pontuação na ${y+1}ª fase, com ${maipont};`)
aux++
    }
}