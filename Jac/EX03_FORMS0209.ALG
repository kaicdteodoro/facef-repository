Algoritmo "ex03_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Se��o de Declara��es das vari�veis
   num : inteiro
   resp : caractere
funcao primooun (x: inteiro) : caractere
var
   r:caractere
   y: inteiro
inicio
   r <- "� primo"
   para y de 2 ate (x-1) faca
      se ((x mod y) = 0) entao
         r <- "n�o � primo")
      fimse
   fimpara
   retorne r
fimfuncao

Inicio
   Escreval("Digite um n�mero:")
   leia(num)
   resp <-primooun(num)
   Escreval("O n�mero ",num," ",resp,";")
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
Fimalgoritmo