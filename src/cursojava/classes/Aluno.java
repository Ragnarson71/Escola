package cursojava.classes;

public class Aluno {

    /*Esta e' a nossa classe/objeto q representa o aluno*/
    /*Esses sao os atributos do aluno*/

    public String nome;
    public int idade;
    public String dataNascimento;
    public String registroGeral;
    public String numeroCPF;
    public String nomeMae;
    public String nomePai;
    public String dataMatricula;
    public String nomeEscola;
    public String serieMatriculado;

    public Aluno() { /*cria os dados na memoria - E' ligado com o comando NEW do outro arquivo*/


    }
    public Aluno (String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno (String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }
    /*Metodos Set e Get do objeto*/
    /*O Set e' para adicionar ou receber dados para os atributos*/
    /*O Get e' pata resgatar ou obter o valor do atributo*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }
}
