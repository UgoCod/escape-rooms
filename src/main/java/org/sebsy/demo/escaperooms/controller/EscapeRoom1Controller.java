package org.sebsy.demo.escaperooms.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EscapeRoom1Controller {

    public void entreeSalle1() {
        System.out.println("Bravo, vous avez trouvé la première salle !");
    }

}
