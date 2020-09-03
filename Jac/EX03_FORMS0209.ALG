Algoritmo "ex03_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Seção de Declarações das variáveis
   num : inteiro
   resp : caractere
funcao primooun (x: inteiro) : caractere
var
   r:caractere
   y: inteiro
inicio
   r <- "é primo"
   para y de 2 ate (x-1) faca
      se ((x mod y) = 0) entao
         r <- "não é primo")
      fimse
   fimpara
   retorne r
fimfuncao

Inicio
   Escreval("Digite um número:")
   leia(num)
   resp <-primooun(num)
   Escreval("O número ",num," ",resp,";")
   // Seção de Comandos, procedimento, funções, operadores, etc...
Fimalgoritmo