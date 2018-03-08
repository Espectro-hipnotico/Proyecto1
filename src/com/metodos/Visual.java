package com.metodos;

import static com.menus.Menus.*;

public class Visual {

    public void verPanelesMenus(String nombrePanel) {
        
        switch (nombrePanel) {
            case "jPTraductor":
                jPTraductor.setVisible(true);
                jPComunes.setVisible(false);
                jPAdmin.setVisible(false);
                break;
            case "jPComunes":
                jPComunes.setVisible(true);
                jPTraductor.setVisible(false);
                jPAdmin.setVisible(false);
                break;
            case "jPAdmin":
                jPAdmin.setVisible(true);
                jPTraductor.setVisible(false);
                jPComunes.setVisible(false);
                break;

        }

    }

}
