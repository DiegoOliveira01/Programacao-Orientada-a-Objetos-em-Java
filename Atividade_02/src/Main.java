public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Pessoa("Ana", 12, 55.5);
        pessoas[1] = new Pessoa("Carlos", 9, 75.0);
        pessoas[2] = new Pessoa("Maria", 28, 60.2);
        pessoas[3] = new Pessoa("Joao", 8, 70.8);
        pessoas[4] = new Pessoa("Sofia", 27, 52.0);
        System.out.println("Pessoas com idade inferior a 12 anos:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 12) {
                System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
            }
        }
    }
}
