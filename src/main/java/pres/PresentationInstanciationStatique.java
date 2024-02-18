package pres;

import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationInstanciationStatique {
    public static void main(String[] args) {

        /*
            Injection des dépendances Instaciation statique
         */

        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.println("Résultats avec instanciation statique: " + metier.calcul());

    }
}
