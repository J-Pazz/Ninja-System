public class Main {
    public static void main(String[] args) {
        Missao m1 = new Missao("Capturar um gato.", "Médio", true);
        Ninja n1 = new Ninja("Naruto", 16, m1);
//a
        System.out.println("Missao " + n1.missao.nomee);
        System.out.println("Naruto pode ser um ninja!");
    }

}
}