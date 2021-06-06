1. É o símbolo de seleção σ; 

2. Tal operação é conhecida como projeção, caracterizada pelo símbolo π; 

3. O operador de união tem como objetivo a unir duas relações, as relações devem ter a mesma quantidade de atributos, e os atributos relacionados devem ter o mesmo datatype; 

4. A operação de produto cartesiano proposta apresentará 20.000 tuplas resultantes, isso se deve ao fato de, em uma operação de produtos, todas as tuplas da primeira relação se relacionaram com as da segunda relação; 

5. σ orgao_emissor = 'SSP' (tb_pessoa_fisica);

6. π CPF (σ nome = 'Luis Inácio Lula da Silva' (tb_pessoa_fisica));

7. π nome, sexo (σ nome = ' Delcídio do Amaral' (tb_pessoa_fisica));

8. π nome, CPF, sexo (σ nome = 'Sérgio Moro' OR nome = 'Antônio Palocci Filho' (tb_pessoa_fisica));

9. π nome, sexo, dt_nascimento (σ dt_nascimento < ' 01/01/1970' (tb_pessoa_fisica));

10. π nome, sexo, nr_estado_civil (σ sexo = 'F' OR nr_estado_civil = 4 (tb_pessoa_fisica));

11. π nome, rg, orgao_emissor, dt_nascimento (σ dt_nascimento = '18/07/1970' OR dt_nascimento = '07/08/1970' (σ sexo = 'F' AND orgao_emissor = 'SSP' (tb_pessoa_fisica)));

12. ( (π nr_estado_civil (tb_estado_civil)) - (π nr_estado_civil (tb_pessoa_fisica)) );

13.  (π nr_estado_civil (tb_estado_civil)) U (π nr_estado_civil (tb_pessoa_fisica));

14. π nome, sexo, dt_nascimento, ds_estado_civil (σ dt_nascimento > '31/12/1975' (tb_pessoa_fisica |X| tb_estado_civil (tb_pessoa_fisica.nr_estado_civil = tb_estado_civil.nr_estado_civil)));

15. 
TEMP <- π nome (σ sexo = 'F' (tb_pessoa_fisica));
TEMP2 <- π nome (σ dt_nascimento > '31/12/1975' (tb_pessoa_fisica));
RESULT <- TEMP ⋂ TEMP2;