<div align="center">

# ☕ Java: Orientação a Objetos | Alura

### Aprendendo orientação a objetos

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=18&duration=3200&pause=1200&color=F89820&center=true&vCenter=true&width=750&lines=Java+17;Programa%C3%A7%C3%A3o+Orientada+a+Objetos;Classes%2C+Objetos+e+Abstra%C3%A7%C3%A3o;Encapsulamento+e+Heran%C3%A7a;Polimorfismo+e+Interfaces;Exerc%C3%ADcios+e+Desafios+Pr%C3%A1ticos" />
</div>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/Orientação%20a%20Objetos-Programação-blue?style=for-the-badge">
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-success?style=for-the-badge">
  <img src="https://img.shields.io/badge/Alura-Curso-051933?style=for-the-badge&logo=alura&logoColor=00C86F"/>
</p>

---

## 📌 Sobre o Projeto

Este repositório reúne os exercícios, desafios e anotações desenvolvidos durante o curso **"Java: aplicando a Orientação a Objetos"**, da **Alura**.

O objetivo é documentar minha evolução na aprendizado da linguagem Java, registrando desde os conceitos fundamentais até a construção de pequenos projetos práticos, servindo como material de consulta para estudos futuros.

---

# 📚 Sumário

-   [O que é Orientação a Objetos](#-o-que-é-orientação-a-objetos)
-   [Classe](#-classe)
-   [Objeto](#-objeto)
-   [Instância de Objetos](#-instância-de-objetos)
-   [Tipos por Referência](#-tipos-por-referência)
-   [Atributos](#-atributos)
-   [Métodos](#-métodos)
-   [Palavra-chave `this`](#-palavra-chave-this)
-   [Pacotes (`package`)](#-pacotes-package)
-   [Importação (`import`)](#-importação-import)
-   [Abstração](#-abstração)
-   [Encapsulamento](#-encapsulamento)
-   [Modificadores de Acesso](#-modificadores-de-acesso)
-   [Getters e Setters](#-getters-e-setters)
-   [Design de Classes](#-design-de-classes)
-   [Herança](#-herança)
-   [Superclasse e Subclasse](#-superclasse-e-subclasse)
-   [Sobrescrita de Métodos](#-sobrescrita-de-métodos)
-   [Sobrecarga de Métodos](#-sobrecarga-de-métodos)
-   [Polimorfismo](#-polimorfismo)
-   [Interfaces](#-interfaces)
-   [Annotations](#-annotations)

---

# 🧩 O que é Orientação a Objetos

A **Programação Orientada a Objetos (POO)** é um paradigma de programação que organiza o sistema em **objetos**, tentando representar elementos do mundo real dentro do código.

Diferente da programação procedural, onde o foco está nas funções, na POO o foco está nos **objetos**, que possuem características (atributos) e comportamentos (métodos).

Imagine um jogo. Em vez de criar dezenas de variáveis soltas para representar um personagem (`vida`, `nome`, `ataque`, `defender()`...), criamos um objeto **Personagem** que reúne tudo isso em um único lugar.

Assim, o código fica mais:

- organizado;
- reutilizável;
- fácil de manter;
- próximo da forma como pensamos no mundo real.

A Programação Orientada a Objetos é baseada em quatro pilares:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

---

# 📦 Classe

Uma **classe** funciona como um **molde** ou **planta de construção**.

Ela define quais características e comportamentos um objeto possuirá, mas sozinha ainda não representa algo existente.

💡 **Analogia**

Uma planta de uma casa informa onde ficarão os quartos, banheiros e portas.

Entretanto, ela ainda não é uma casa de verdade.

Da mesma forma, uma classe apenas descreve como os objetos serão.

```java
public class Carro {

    String modelo;
    int ano;

    void acelerar() {
        System.out.println("Acelerando...");
    }

}
```

Nesse exemplo, a classe define que todo carro possuirá um modelo, um ano e poderá acelerar.

---

# 🚗 Objeto

Um **objeto** é uma representação concreta criada a partir de uma classe.

Enquanto a classe representa o molde, o objeto representa algo que realmente existe durante a execução do programa.

💡 **Analogia**

Se a classe é a planta de uma casa, o objeto é a casa construída.

Podemos construir diversas casas utilizando a mesma planta.

Da mesma forma, podemos criar diversos objetos utilizando a mesma classe.

```java
Carro carro = new Carro();
```

Agora existe um objeto do tipo `Carro` armazenado na memória.

---

# 🏗 Instância de Objetos

**Instanciar** significa criar um objeto utilizando a palavra-chave `new`.

Sempre que um objeto é criado, dizemos que ele é uma **instância** daquela classe.

```java
Carro carro1 = new Carro();
Carro carro2 = new Carro();
```

Mesmo sendo criados pela mesma classe, `carro1` e `carro2` são objetos completamente independentes.

Alterar um não altera o outro.

---

# 🔗 Tipos por Referência

Tipos primitivos armazenam diretamente um valor.

```java
int idade = 20;
```

Já objetos funcionam de forma diferente.

Quando criamos um objeto, a variável não guarda o objeto em si, mas sim uma **referência** (um endereço) que aponta para ele na memória.

```java
Carro carro1 = new Carro();
Carro carro2 = carro1;
```

Nesse caso:

- apenas um objeto foi criado;
- as duas variáveis apontam para o mesmo objeto.

Se alterarmos:

```java
carro2.modelo = "Civic";
```

Também veremos essa alteração através de `carro1`.

---

# 📝 Atributos

Os atributos representam as **características** de um objeto.

Eles armazenam informações que descrevem seu estado.

```java
public class Pessoa {

    String nome;
    int idade;
    double altura;

}
```

Nesse exemplo:

- nome
- idade
- altura

são atributos da classe.

💡 **Analogia**

Imagine uma ficha de cadastro.

Cada campo da ficha representa um atributo.

---

# ⚙ Métodos

Os métodos representam os **comportamentos** de um objeto.

São eles que definem as ações que um objeto pode realizar.

```java
public class Conta {

    void sacar() {}

    void depositar() {}

    double consultarSaldo() {}

}
```

Um método pode:

- não receber parâmetros;
- receber parâmetros;
- retornar um valor;
- não retornar nada (`void`).

💡 Pense nos métodos como os **verbos** de uma classe.

Enquanto os atributos são características, os métodos representam ações.

---

# 👉 Palavra-chave `this`

A palavra-chave `this` representa o **próprio objeto atual**.

Ela é utilizada quando queremos acessar atributos ou métodos da própria instância.

Seu uso mais comum ocorre quando o parâmetro possui o mesmo nome do atributo.

```java
public class Pessoa {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

Sem o `this`, o Java entenderia que estamos tentando atribuir o parâmetro a ele mesmo.

---

# 📁 Pacotes (`package`)

Pacotes servem para organizar as classes do projeto.

À medida que um sistema cresce, torna-se inviável manter todas as classes em uma única pasta.

Por isso utilizamos pacotes para separar responsabilidades.

Exemplo:

```java
br.com.empresa.projeto.modelos
```

Cada parte normalmente representa:

```
br
└── com
    └── empresa
        └── projeto
            ├── modelos
            ├── servicos
            ├── util
            └── principal
```

Essa organização facilita a manutenção do projeto.

---

# 📥 Importação (`import`)

Quando uma classe pertence a outro pacote, precisamos importá-la antes de utilizá-la.

```java
import br.com.empresa.projeto.modelos.Filme;
```

Sem o `import`, o Java não saberá onde localizar essa classe.

É semelhante a informar um endereço antes de encontrar uma pessoa.

---

# 🎭 Abstração

Abstração consiste em representar **apenas as características importantes** de um objeto, ignorando detalhes desnecessários.

💡 **Analogia**

Quando desenhamos um carro em um mapa, utilizamos apenas um pequeno ícone.

Não desenhamos o motor, bancos ou parafusos.

Isso é abstração.

Em programação acontece o mesmo.

Uma classe `ContaBancaria` precisa conhecer:

- saldo;
- titular;
- sacar();
- depositar();

Ela não precisa conhecer como funciona toda a infraestrutura do banco.

---

# 🔒 Encapsulamento

Encapsular significa **proteger os dados internos de uma classe**.

Em vez de permitir acesso direto aos atributos, disponibilizamos métodos controlados.

```java
private double saldo;
```

Assim evitamos alterações inválidas.

Por exemplo:

Não faz sentido alguém definir diretamente:

```java
conta.saldo = -500;
```

O correto seria utilizar um método que valide a operação.

O encapsulamento aumenta a segurança e reduz erros.

---

# 🔐 Modificadores de Acesso

Os modificadores definem quem pode acessar uma classe, atributo ou método.

| Modificador | Quem pode acessar |
|-------------|-------------------|
| `public` | qualquer classe |
| `protected` | mesmo pacote e subclasses |
| *(default)* | apenas classes do mesmo pacote |
| `private` | somente a própria classe |

Escolher corretamente o modificador ajuda a proteger o sistema e evita dependências desnecessárias.

---

# 🔄 Getters e Setters

Quando um atributo é privado, normalmente utilizamos **Getters** e **Setters** para acessá-lo.

Getter → retorna um valor.

Setter → altera um valor.

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

Esses métodos também permitem realizar validações antes de alterar os dados.

---

# 🏛 Design de Classes

Criar uma classe não significa apenas colocar atributos e métodos nela.

Uma boa classe deve possuir uma responsabilidade bem definida.

💡 Pergunte sempre:

> "Esta classe realmente deveria fazer isso?"

Se uma classe faz muitas coisas diferentes, provavelmente ela precisa ser dividida.

Classes menores costumam ser:

- mais reutilizáveis;
- mais fáceis de testar;
- mais fáceis de manter.

---

# 👨‍👩‍👧 Herança

Herança permite criar uma nova classe aproveitando características de outra.

Utilizamos a palavra-chave `extends`.

```java
public class Cachorro extends Animal {

}
```

Agora `Cachorro` herda atributos e métodos de `Animal`.

Isso evita repetição de código.

---

# 👪 Superclasse e Subclasse

A classe da qual outra herda recebe vários nomes:

- Superclasse
- Classe mãe
- Classe base

A classe que herda é chamada de:

- Subclasse
- Classe filha
- Classe derivada

```
Animal
   ▲
   │
Cachorro
```

Toda subclasse é um tipo especializado da superclasse.

---

# 🔁 Sobrescrita de Métodos

Sobrescrever significa alterar um comportamento herdado.

```java
@Override
public void emitirSom() {
    System.out.println("Au Au");
}
```

A anotação `@Override` informa ao compilador que aquele método deve substituir um método existente na superclasse.

Caso o nome esteja incorreto, o compilador emitirá um erro.

---

# ➕ Sobrecarga de Métodos

Sobrecarga ocorre quando vários métodos possuem o **mesmo nome**, porém assinaturas diferentes.

```java
public void imprimir(String texto){}

public void imprimir(int numero){}

public void imprimir(String texto, int quantidade){}
```

O Java escolhe automaticamente qual método executar com base nos parâmetros recebidos.

---

# 🎯 Polimorfismo

Polimorfismo significa "muitas formas".

Ele permite tratar objetos diferentes utilizando uma mesma referência.

```java
Animal animal = new Cachorro();
Animal outro = new Gato();
```

Mesmo utilizando uma variável do tipo `Animal`, cada objeto executará sua própria implementação.

Isso torna o código muito mais flexível.

---

# 🧩 Interfaces

Uma interface funciona como um **contrato**.

Ela define quais métodos uma classe deve possuir, mas não como eles serão implementados.

```java
public interface Pagamento {

    void pagar();

}
```

```java
public class Pix implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento via Pix");
    }

}
```

💡 **Analogia**

Imagine uma tomada.

Ela define um padrão.

Independentemente da marca da televisão, do computador ou do videogame, todos podem ser ligados nela porque seguem o mesmo padrão.

Interfaces fazem exatamente isso.

---

# 📝 Annotations

Annotations (anotações) são informações adicionadas ao código que ajudam o compilador ou frameworks a entender como determinado elemento deve ser tratado.

Elas não fazem parte da lógica da aplicação, mas fornecem instruções extras.

Exemplos comuns:

```java
@Override
```

Indica que um método está sobrescrevendo outro.

```java
@Deprecated
```

Indica que um elemento não deve mais ser utilizado.

No Spring Boot, annotations como `@RestController`, `@Service` e `@Autowired` são responsáveis por configurar grande parte da aplicação sem necessidade de código adicional.
