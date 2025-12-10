package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("passage")
public class Room2Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Perdu, vous etes dans la mauvaise salle !";
    }

}
