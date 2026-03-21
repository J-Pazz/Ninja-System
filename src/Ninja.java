public class Ninja {
    String nome;
    int idade;
    Missao missao;
    //ai aiii
    public Ninja( String nome, int idade, Missao missao){
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        //condição
        if (idade < 16){
            System.out.println("Ele não pode ser ninja por causa da idade!");
        } else{
            System.out.println("Ele tem idade.");
        }
//a
    }

}