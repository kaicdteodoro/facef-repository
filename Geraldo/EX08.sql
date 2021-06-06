1. π Funcionario.nome, sobrenome, endereco (σ Departamento.nome = 'Pesquisa' (Departamento |X|(Departamento.cod_departamento = Funcionario.cod_departamento) Funcionario)));

2.
  R1 <- σ Departamento.cpf_Gerente = Funcionario.cpf (Departamento |X|(Departamento.cod_departamento = Funcionario.cod_departamento) Funcionario);
  R2 <- Projeto |X|(Projeto.cod_departamento = Departamento.cod_departamento) (R1);
  R3 <- σ localizacao = 'Mauá' (R2);
  R4 < - π Projeto.cod_projeto, Projeto.cod_departamento, Funcionario.sobrenome, Funcionario.endereco, Funcionario.dt_nascimento (R3);

3.
  R1 <- Funcionario |X|(Funcionario.cpf = Trabalha_em.cpf) Trabalha_em;
  R2 <- Projeto |X| (Projeto.cod_projeto = Trabalha_em.cod_projeto) (R1);
  R3 <- σ Projeto.cod_departamento = 5 (R2);
  R4 <- π Funcionario.nome, Funcionario.sobrenome (R3);

4. 
  R1 <- π cpf (Funcionario) - π cpf_func (Dependente);
  R2 <- π nome, sobrenome (Funcionario |X|(Funcionario.cpf = R1.cpf) R1);

5.
  R1 <- Departamento |X|(Departamento.cod_departamento = Funcionario.cod_departamento) Funcionario;
  R2 <- σ Departamento.cpf_Gerente = Funcionario.cpf (R1);
  R3 <- Þ cpf (π Funcionario.cpf (R2) ⋂ π cpf_func (Dependente));
  R4 <- π Funcionario.nome (R3 |X|(R3.cpf = Funcionario.cpf) Funcionario);

6. σ (cod_departamento = 4 AND salario > 25.000) OR (cod_departamento = 5 AND salario > 30.000) (Funcionario);

7. π nome, sobrenome, salario (σ cod_departamento = 5 (Funcionario));
