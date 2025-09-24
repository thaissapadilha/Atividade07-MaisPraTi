# Lista de Exercícios 7 — Java

Este projeto contém a implementação dos 8 exercícios da **Lista 7**, organizados por pacotes (`exer01e02`, `exer03`, ..., `exer08`).  
Cada exercício foca em um conceito central de **Programação Orientada a Objetos em Java**.

---

## 📂 Estrutura dos Exercícios

### ✅ Ex. 1 e 2 — Encapsulamento e Validação de Regra
**Pacote:** `exer01e02`  
- `Produto.java`: atributos privados (`nome`, `preco`, `quantidadeEmEstoque`) com validações.  
- `DescontoInvalidoException.java`: exceção para regras de desconto.  
- `ProdutoTest.java`: demonstra criação, validação e aplicação de descontos (0% a 50%).  

---

### ✅ Ex. 3 — Herança (Hierarquia de Funcionários)
**Pacote:** `exer03`  
- `Funcionario.java`: classe base abstrata com `nome`, `salario` e `calcularBonus()`.  
- `Gerente.java`: bônus de 20%.  
- `Desenvolvedor.java`: bônus de 10%.  
- `FuncionarioTest.java`: lista de funcionários exibindo bônus via polimorfismo.  

---

### ✅ Ex. 4 — Polimorfismo com Interface
**Pacote:** `exer04`  
- `IMeioTransporte.java`: interface com `acelerar()` e `frear()`.  
- `Carro.java`, `Bicicleta.java`, `Trem.java`: implementações com regras de velocidade próprias.  
- `TransporteTest.java`: lista de transportes testando polimorfismo.  

---

### ✅ Ex. 5 — Abstração (Sistema de Pagamentos)
**Pacote:** `exer05`  
- `FormaPagamento.java`: classe abstrata com `validarPagamento()` e `processarPagamento()`.  
- `CartaoCredito.java`, `Boleto.java`, `Pix.java`: implementações concretas com validações específicas.  
- `PagamentoInvalidoException.java`: exceção para validações.  
- `PagamentoTest.java`: simulação do uso de cada forma de pagamento.  

---

### ✅ Ex. 6 — Imutabilidade e Objetos de Valor
**Pacote:** `exer06`  
- `Dinheiro.java`: objeto imutável com `BigDecimal` e `Moeda` (enum).  
- `ProdutoCarrinho.java`: produto para uso no carrinho.  
- `ItemCarrinho.java`: item com validação de quantidade > 0.  
- `Carrinho.java`: imutável; operações retornam novo carrinho.  
- `CarrinhoTest.java`: fluxo completo com adicionar/remover itens e aplicar cupom (até 30%).  

---

### ✅ Ex. 7 — Generics (Repositório Genérico)
**Pacote:** `exer07`  
- `Identificavel.java`: interface com `getId()`.  
- `IRepository.java`: interface genérica (salvar, buscar, listar, remover).  
- `InMemoryRepository.java`: implementação com `Map<ID, T>`.  
- `EntidadeNaoEncontradaException.java`: exceção ao remover inexistente.  
- `ProdutoRepo.java`, `FuncionarioRepo.java`: exemplos de uso.  
- `RepositoryTest.java`: demonstra operações com generics.  

---

### ✅ Ex. 8 — Padrão Strategy (Cálculo de Frete)
**Pacote:** `exer08`  
- `CalculadoraFrete.java`: interface da estratégia.  
- `FreteSedex.java`, `FretePac.java`, `FreteRetiradaNaLoja.java`: estratégias concretas.  
- `Pedido.java`: permite injeção/troca da estratégia em tempo de execução.  
- `StrategyDemo.java`: exemplo com troca de estratégias e uso de lambda (frete grátis acima de X).  

---

## 🚀 Como Executar
- Abrir o projeto em uma IDE (IntelliJ / Eclipse / VS Code).  
- Cada exercício possui uma classe `*Test.java` ou `*Demo.java` para rodar e visualizar a saída.  
- O código está em **Java 17+** (pode ser adaptado para versões anteriores sem problemas).  

---

## 📌 Conceitos Trabalhados
1. Encapsulamento e validação  
2. Regras de negócio com exceções  
3. Herança e sobrescrita  
4. Polimorfismo com interface  
5. Abstração e classes abstratas  
6. Imutabilidade e objetos de valor  
7. Generics e repositórios  
8. Padrão Strategy com lambdas  

---
