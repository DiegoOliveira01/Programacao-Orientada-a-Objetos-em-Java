public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[5];

        animais[0] = new Animal("Vaca", 51, "Mato Grosso");
        animais[1] = new Animal("Bode", 7, "Rio Grande do Sul");
        animais[2] = new Animal("Arara", 2 , "Rio de Janeiro");
        animais[3] = new Animal("Boi", 6 , "Sao Paulo");
        animais[4] = new Animal("Onça", 15 , "Amazonia");
        System.out.println("Animais com mais de 50 anos: ");
        for (Animal animal : animais) {
            if (animal.getIdade() > 50) {
                System.out.println(animal.getClassificacao() + " tem " + animal.getIdade() + " anos.");
            }
        }
    }
}
