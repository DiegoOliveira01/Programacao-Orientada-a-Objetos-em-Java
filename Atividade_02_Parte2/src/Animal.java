public class Animal {
    private String classificacao;
    private int idade;
    private String local_encontrado;

    public Animal(String classificacao, int idade, String local_encontrado) {
        this.classificacao = classificacao;
        this.idade = idade;
        this.local_encontrado = local_encontrado;
    }

    public void andar() {
        System.out.println(classificacao + " esta andando.");
    }

    public void comer() {
        System.out.println(classificacao + " esta dormindo.");
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getIdade() {
        return idade;
    }

    public String getLocal_Encontrado() {
        return classificacao;
    }
}
