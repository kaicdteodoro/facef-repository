Algoritmo "ex04_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Seção de Declarações das variáveis
   num : inteiro
   resp : real
funcao fatorial (x: inteiro) : real
var
i : inteiro
resp: real
inicio
resp <- x
      para i de (x-1) ate 1 passo -1 faca
             resp <- resp*i
      fimpara
      retorne resp
fimfuncao

Inicio
   Escreval("Digite um número:")
   leia(num)
   resp <-fatorial(num)
   Escreval("O fatorial de ",num," é ",resp,";")
   // Seção de Comandos, procedimento, funções, operadores, etc...
Fimalgoritmo