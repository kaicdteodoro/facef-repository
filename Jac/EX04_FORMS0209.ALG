Algoritmo "ex04_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Se��o de Declara��es das vari�veis
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
   Escreval("Digite um n�mero:")
   leia(num)
   resp <-fatorial(num)
   Escreval("O fatorial de ",num," � ",resp,";")
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
Fimalgoritmo