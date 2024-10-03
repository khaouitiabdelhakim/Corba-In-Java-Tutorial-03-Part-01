public class impl_compte_heritage extends CompteCourantRemunerePOA{

    float solde;
    float decouvertAutorise;
    float taux;

    impl_compte_heritage(float a, float b, float c){
        this.solde = a;
        this.decouvertAutorise = b;
        this.taux = c;
    }


    @Override
    public boolean DecouvertAutorise() {
        return false;
    }

    @Override
    public void DecouvertAutorise(boolean newDecouvertAutorise) {

    }

    @Override
    public int taux() {
        return 0;
    }

    @Override
    public void taux(int newTaux) {

    }

    @Override
    public float lire_montant() {
        return this.solde;
    }

    @Override
    public void crediter(float somme_credit) {
        if (somme_credit >= 0 && somme_credit <= this.decouvertAutorise) {
            this.solde = this.solde + somme_credit;
        }
    }

    @Override
    public void debiter(float somme_debit) {
        if (somme_debit <= solde) {
            this.solde = this.solde - somme_debit;
        }
    }
}
