public class Pessoa {
    //Atributos
    private String nome;
    private Integer idade;

    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

/*
* METODOS ACESSORES
*
* PUBLIC: Qualquer um pode acessar o elemento
* PRIVATE: Somente a classe do elemento consegue acessa-lo
* PROTECTED: Somente a classe e seus filhos conseguem acessar
* DEFAULT: Somente a classe, seus filhos e as classes no mesmo package podem acessar
*/
