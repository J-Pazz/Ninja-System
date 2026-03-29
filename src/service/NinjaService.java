package service;

import model.Ninja;

public class NinjaService {

    public boolean isApto(Ninja ninja) {
        return ninja.idade >= 15 && ninja.genin != null &&
                ninja.genin.equalsIgnoreCase("sim");
    }

}





