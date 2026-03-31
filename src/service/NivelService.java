package service;
import model.Missao;

public class NivelService {

    public int calcularPontos(Missao missao){
        if (missao.concluida){
            return missao.dificuldade * 10;
        }else { return 0;
//esquema do nivel
    }
  }
    public int subirNivel(int nivelAtual, int pontosTotal) {
        int niveisGanhos = pontosTotal / 50;
        return nivelAtual + niveisGanhos;
    }

    public String definirRank(int pontosTotal){
        if (pontosTotal >= 500) {
            return "Hokage";
        } else if (pontosTotal >= 300) {
            return "Jounin";
        } else if (pontosTotal >= 150) {
            return "Chunin";
        } else if (pontosTotal >= 50) {
            return "Genin";
        } else {
            return "Estudante";
        }
    }

    }
