public class Missao{
    String nomee;
    String nivelDificuldade;
    boolean concluida;
    String nivel= "S";
    //construtor 1
    public Missao(String nome, String nivelDificuldade, boolean concluida){
        this.nomee = nome;
        this.nivelDificuldade = nivelDificuldade;
        this.concluida = concluida;
        //condição
        if (!nivel.equals("D") && !nivel.equals("C") &&
                !nivel.equals("B") && !nivel.equals("A") &&
                !nivel.equals("S")) {

            System.out.println("Nível inválido!");
        } else {
            System.out.println("Nivel é valido!");
        }
    }

}