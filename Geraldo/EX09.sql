
-- Quest 01
CREATE TABLE tb_departamentos (
cod_depto CHAR(2) NOT NULL,
nm_departamento VARCHAR(60),
PRIMARY KEY (cod_depto)
);

CREATE TABLE tb_funcionarios (
cod_funcionario CHAR(2) NOT NULL,
nome VARCHAR(60),
cod_depto CHAR(2) NOT NULL,
salario NUMERIC(7,2),
PRIMARY KEY (cod_funcionario),
FOREIGN KEY (cod_depto) REFERENCES tb_departamentos(cod_depto)
);

-- Quest 02
INSERT INTO tb_departamentos
VALUES ('D1','Contabilidade'),
       ('D2','Administração'),
       ('D3','Informática'),
       ('D4','RH');
      
INSERT INTO tb_funcionarios 
VALUES ('E1', 'José', 'D1', 2500.00),
       ('E2', 'Maria', 'D1', 2800.00),
       ('E3', 'José', 'D2', 3200.00),
       ('E4', 'Sílvia', 'D3', 4650.00),
       ('E5', 'João', 'D1', 2800.00);


-- Quest 03

1.
  expressão: π nome (σ salario < 2600.00 (tb_funcionarios));

  DQL: SELECT nome 
       FROM tb_funcionarios 
       WHERE salario < 2600.00;

2.
  expressão: π nm_departamento (σ salario <= 3500.00 (tb_departamentos |X|(tb_departamentos.cod_depto = tb_funcionarios.cod_depto) tb_funcionarios));

  DQL: SELECT nm_departamento 
       FROM tb_departamentos td
       JOIN tb_funcionarios tf ON td.cod_depto = tf.cod_depto
       WHERE tf.salario <= 3500.00
       GROUP BY nm_departamento ORDER BY nm_departamento ASC;

3. 
  expressão: π nome (σ cod_depto = 'D3' (tb_funcionarios));

  DQL: SELECT nome 
       FROM tb_funcionarios 
       WHERE cod_depto = 'D3';

4.
  expressão: π nome (σ nm_departamento = 'Contabilidade' (tb_departamentos |X|(tb_departamentos.cod_depto = tb_funcionarios.cod_depto) tb_funcionarios));

  DQL: SELECT nome 
       FROM tb_funcionarios tf 
       JOIN tb_departamentos td ON td.cod_depto = tf.cod_depto 
       WHERE td.nm_departamento = 'Contabilidade'
       ORDER BY nome ASC;

5.
  expressão: π salario (σ nm_departamento = 'Contabilidade' (tb_departamentos |X|(tb_departamentos.cod_depto = tb_funcionarios.cod_depto) tb_funcionarios));

  DQL: SELECT salario 
       FROM tb_funcionarios tf 
       JOIN tb_departamentos td ON td.cod_depto = tf.cod_depto 
       WHERE td.nm_departamento = 'Contabilidade'
       ORDER BY salario ASC;