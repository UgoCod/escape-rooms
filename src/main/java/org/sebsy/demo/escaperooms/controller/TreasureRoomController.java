package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TreasureRoomController {
    @Qualifier("treasure2Service")
    @Autowired
    private TreasureService tresorService;

    public String fin() {
        return tresorService.ouvrir();
    }

    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }
}
