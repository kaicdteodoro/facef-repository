Algoritmo "ex02_forms0209"
// Autor(a)    : Kaic Diniz Teodoro
// Data atual  : 02/09/2020
Var
   // Se��o de Declara��es das vari�veis
   num : inteiro
   resp : caractere
funcao divseis (x: inteiro) : caractere
inicio
   se ((x mod 6) = 0) entao
      retorne "� divisivel por 6"
   senao
      retorne "n�o � divisivel por 6"
   fimse

fimfuncao

Inicio
   Escreval("Digite um n�mero:")
   leia(num)
   resp <-divseis(num)
   Escreval("O n�mero ",num," ",resp,";")
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
Fimalgoritmo