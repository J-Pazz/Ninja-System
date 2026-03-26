package service;
import Missao.Missao;

public class NivelService {

    public int calcularPontos(Missao missao){
        if (missao.concluida){
            return missao.dificuldade * 10;
        }else { return 0;

    }
  }
}