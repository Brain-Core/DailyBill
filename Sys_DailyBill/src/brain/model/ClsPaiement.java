
package brain.model;

import java.sql.Date;


public class ClsPaiement {
    
    
    private int id;
    private ClsJournalier Journalier;
    private ClsPrestation prestation;
    private Date datePaiement;
    private float montant;
    private ClsAgent UName;

    public ClsPaiement(int id, ClsJournalier Journalier, ClsPrestation prestation, Date datePaiement, float montant, ClsAgent UName) {
        this.id = id;
        this.Journalier = Journalier;
        this.prestation = prestation;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.UName = UName;
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

    public ClsAgent getUName() {
        return UName;
    }

    public void setUName(ClsAgent UName) {
        this.UName = UName;
    }
            
            
    
}
