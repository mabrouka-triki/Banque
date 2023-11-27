package metier;

public class Compte {
    // Déclaration de champs privés (variables) pour numéro et solde du compte
        private String numero;
        private double solde;
        private String nom;

    // Accesseur (getter) pour obtenir le numéro du compte
        public String getNumero() {

            return this.numero;
        }

    // Mutateur (setter) pour définir le numéro du compte
        public void setNumero(String n) {

            this.numero = n;
        }

    // Accesseur (getter) pour obtenir le solde du compte
        public double getSolde() {

            return this.solde;
        }

    // Mutateur (setter) pour définir le solde du compte
        public void setSolde(double s) {

            this.solde = s;
        }

    // Constructeur de la classe Compte avec deux paramètres : numéro et solde
    public Compte(String n, double s) {
        // Utilisation des mutateurs pour initialiser les champs numéro et solde
        setNumero(n);
        setSolde(s);
    }

    // Méthode pour effectuer un retrait d'un montant donné
    public void retirer(double montant) {
        // Décrémentation du solde en utilisant le mutateur setSolde
            setSolde((getSolde() - montant));
    }
    public void verser(double montant){
        double solde;
        solde = getSolde() + montant;
        setSolde(solde);
    }
    public void virer (double montant, Compte unCpt){
        retirer(montant);
        unCpt.verser(montant);
    }




    // Méthode setsolde
    public void setsolde(double solde) {
        if (solde == 0) {
            this.solde = solde;
        } else {
            this.solde = 0.0;
        }
    }

}
