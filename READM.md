# MEDICO, PACIENTE, CONSULTAS

=> O nosso sistema receberá dados de médicos e pacientes. Um médico atende a um paciente por vez. O paciente pode ter várias consultas com diferentes médicos.

1. O nosso sitema é de gestão de médicos para uma clínica. Ele permite o cadastro e gerenciamento de médicos, armazenando suas informções como:
- nome
- email 
- CRM
- especialidade
- endereço(logradouro, bairro, cep, cidade, uf, numero, complemento)

2. Funcionalidas 
- Cadastro de médico
- Listagem de médicos cadastrados
- Atualização de dados do médico
- Remoção de médicos

- Construir um pacote chamado endereco dentro de model e criar uma classe Endereco com os atributos listados anaixo. Além disso, crie os getters, setters, construtor com todos os parametros e construtor sem nenhum parametro usando o lombok.
(logradouro, bairro, cep, cidade, uf, numero, complemento).

# AULA 2
Verbos/métodos HTTP
`GET` -> É quando você pede algo de retorno.
`POST` -> É quando você passa informações.
PUT 
DELETE

Request[REQUISIÇÃO] -> É o que você passa esperando retorno.
Response[RESPOSTA] -> É a resposta que você recebe.

# AULA 03
`DTO` -> Padrão de projetos onde isolamos cada item que está sendo enviado pelo `simulador de requisição`. DATA TRANSFER OBJECT
- Criação de uma classe record chamada DadosCadastroMedico, onde iremos receber os dados do json e converter em dados autônomos.

`API` -> É um conjunto de ações e regras para a comunicação entre diferents ferramentas. Define como os sistemas devem interagir. Normalmente, uma API oferece dados para serem consumidos pelo front-end.


`POLOMORFISMO` -> É quando um método se comporta de maneira diferente dependendo da forma que é invoacado.
- Sobrecarga de método - [OVERLOADING] - Tempo de compilação.
- Sobrescrita de método -[OVERRIDING] - Tempo de execução.


`ABSTRAÇÃO` -> É quano uma classe ou método não pode ser instanciada(clonada). [ABSTRACT].

## ANOTATIONS
1. Anotações do Spring Web
@RequestMapping
=> Define que a classe está mapeada para a URL[endpoint]/medicos.

@RestController 
=> Define que a classe é uma classe controladora no Spring.

@GetMapping
=> Define que o método será somente de leitura. 

@PostMapping
=> Define que o método vai receber dados.

@PutMapping
=> Atualiza alguma informação.

@Deletemapping
=> Deleta dados.

@RequestBody
=> É utilizada quando você irá receber dados pelo simulador de requisições(insomnia) e informa que os dados serão enviados no corpo da requisição.

2. Anotações do Lombok
@Getter
=> Cria todos os getters para todos atributos da classe.

@Setter
=> Cria todos os setters para todos atributos da classe.

@AllArgsConstructor
=> Cria um método construtor com todos os argumentos.

@NoArgsConstructor
=> Cria um método construtor com nenhum dos argumentos.

3. Anotações do Spring JPA
@Entity
=> É uma anotação que você irá utilizar para informar ao springboot que a classe anotada será uma tabela n banco de dados.

@Table
=> É uma anotação que você irá utilizar para criar no Bnco de Dados uma tabela com o nome da classe anotada
* Você pode alterar o padrão do nome da tabela usando: @Table(name = "nome da tabela").

@Id
=>Define que o atributo será uma chave primária na tabela.

@GenerateValue
=>Define que a criação do ID será de forma automática.

@Enumerated
=> Informa que aquele atributo é uma classe enum.