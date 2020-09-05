
package brain.models;
import brain.controller.IAction;
import java.sql.Date;

public class ClsPaiement implements IAction{
    
    private int id;
    private ClsJournalier Journalier;
    private ClsPrestation prestation;
    private Date datePaiement;
    private float montant;
    private ClsUser user;

    public ClsPaiement(int id, ClsJournalier Journalier, ClsPrestation prestation, Date datePaiement, float montant, ClsUser user) {
        this.id = id;
        this.Journalier = Journalier;
        this.prestation = prestation;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.user = user;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClsJournalier getJournalier() {
        return Journalier;
    }

    public void setJournalier(ClsJournalier Journalier) {
        this.Journalier = Journalier;
    }

    public ClsPrestation getPrestation() {
        return prestation;
    }

    public void setPrestation(ClsPrestation prestation) {
        this.prestation = prestation;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public ClsUser getUser() {
        return user;
    }

    public void setUser(ClsUser user) {
        this.user = user;
    }
    
    @Override
    public boolean updateData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
