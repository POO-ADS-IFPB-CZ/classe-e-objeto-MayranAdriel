# Questão 7
#### O nome da classe possui espaços e não possui o modificador de acesso explicito, embora não seja obrigado, mas é uma boa prática.

# Questão 8
#### 1- O tipo de retorno do método maior() é int, mas está tentando retornar boolean.
#### 2- O tipo de retorno da função menor() é void mas está tentando retornar um tipo inteiro.

# Questão 14
- #### Proteger os dados de acesso indevido ao torná-los privados.
- #### Expor apenas o necessário por meio de métodos public ou protected.
- #### Ao privar os atributos de uma classe e utilizar métodos getters e setters é possível controlar como os atributos são modificados ou acessados através de validações e lógicas de negócios.
- #### A manutenibilidade fica mais fácil, já que alterações do design interno de uma classe não altera partes do código que a usam, desde que não hajam mudanças nas interfaces no acesso das interfaces públicas.