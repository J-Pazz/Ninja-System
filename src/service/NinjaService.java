package service;

import model.Ninja;

public class NinjaService {

    public boolean isApto(Ninja ninja) {
        return ninja.idade >= 15 && ninja.hokage != null &&
                ninja.hokage.equalsIgnoreCase("sim");
    }

    public int subirNivel(int nivelAtual, int pontosTotal) {
        int niveisGanhos = pontosTotal / 50;
        return nivelAtual + niveisGanhos;
    }
}
}




