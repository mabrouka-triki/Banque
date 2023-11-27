package Banque;
import metier.*;

public class Banque {
    public static void main(String[] args) {
        double depot, retrait, virement;
        Compte unCompte = new Compte("00112345", 1000.0);

        // Affichage du solde initial du compte
        System.out.println("compte : " + unCompte.getNumero() + " solde à la création du compte = " + unCompte.getSolde());

        depot = 500.0;
        // Appel à la méthode virer() pour déposer de l'argent
        unCompte.virer(depot, unCompte);

        // Affichage du solde après le dépôt
        System.out.println("compte : " + unCompte.getNumero() + " solde après dépôt de " + depot + " = " + unCompte.getSolde());

        retrait = 250.0;
        // Appel à la méthode retirer() pour effectuer un retrait
        unCompte.retirer(retrait);

        // Affichage du solde après le retrait
        System.out.println("compte : " + unCompte.getNumero() + " solde après retrait de " + retrait + " = " + unCompte.getSolde());

        // Crée un nouveau compte avec le numéro "7827456" et un solde de 2500.0
        Compte unAutreCompte = new Compte("7827456 ", 2500.0);


        // Affiche le solde du compte lors de sa création
        System.out.println("compte : " +unAutreCompte.getNumero() + " solde à la création du compte = " + unAutreCompte.getSolde());

        retrait= 200.0;
        unAutreCompte.retirer(retrait);
        System.out.println("compte : " + unAutreCompte.getNumero() + " solde après retrait de " + retrait + " = " + unAutreCompte.getSolde());

        depot=150.0;
        unCompte.virer(depot, unAutreCompte);

         System.out.println("compte:"+unAutreCompte.getNumero()+ " solde aprés le dépôt  = " + depot + " = "+ unAutreCompte.getSolde());

        virement = 350.0;
        unCompte.virer(virement, unAutreCompte);
        System.out.println("compte : " +unAutreCompte.getNumero() + " solde après virement de " + virement + " = " + unAutreCompte.getSolde());
        System.out.println("compte : " +unCompte.getNumero() + " solde après virement de " + virement + " = " + unCompte.getSolde());
    }

}
