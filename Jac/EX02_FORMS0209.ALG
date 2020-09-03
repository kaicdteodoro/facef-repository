Algoritmo "ex02_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Seção de Declarações das variáveis
   num : inteiro
   resp : caractere
funcao divseis (x: inteiro) : caractere
inicio
   se ((x mod 6) = 0) entao
      retorne "é divisivel por 6"
   senao
      retorne "não é divisivel por 6"
   fimse

fimfuncao

Inicio
   Escreval("Digite um número:")
   leia(num)
   resp <-divseis(num)
   Escreval("O número ",num," ",resp,";")
   // Seção de Comandos, procedimento, funções, operadores, etc...
Fimalgoritmo