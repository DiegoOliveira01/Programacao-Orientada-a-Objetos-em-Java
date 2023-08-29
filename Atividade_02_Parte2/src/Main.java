public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        animais[0] = new Animal("Vaca", 51, "Mato Grosso");
        animais[1] = new Animal("Bode", 7, "Rio Grande do Sul");
        animais[2] = new Animal("Arara", 2 , "Rio de Janeiro");
        animais[3] = new Animal("Boi", 6 , "Sao Paulo");
        animais[4] = new Animal("Tartaruga", 64 , "Amazonia");
        animais[5] = new Animal("Condor Sos Andes", 53 , "Argentina");
        animais[6] = new Animal("Elefante", 68 , "Angola");
        animais[7] = new Animal("Macaco", 12 , "Rio De Janeiro");
        animais[8] = new Animal("Jabuti", 15 , "Amazonia");
        animais[9] = new Animal("Orca", 15 , "Havai");
        System.out.println("Animais com mais de 50 anos: ");
        for (Animal animal : animais) {
            if (animal.getIdade() > 50) {
                System.out.println(animal.getClassificacao() + " tem " + animal.getIdade() + " anos.");
            }
        }
    }
}
