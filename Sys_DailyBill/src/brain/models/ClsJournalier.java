package brain.models;

import brain.controller.IAction;
import java.sql.Date;

public class ClsJournalier implements IAction
{

    private int id;
    private String nom;
    private String postnom;
    private String prenom;
    private String sexe;
    private String lieu_naissance;
    private Date date_naissance;
    private String etat_civil;
    private String piece_identite;
    private String numero_piece_identite;

    public ClsJournalier(int id, String nom, String postnom, String prenom, String sexe, String lieu_naissance, Date date_naissance, String etat_civil, String piece_identite, String numero_piece_identite) {
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.lieu_naissance = lieu_naissance;
        this.date_naissance = date_naissance;
        this.etat_civil = etat_civil;
        this.piece_identite = piece_identite;
        this.numero_piece_identite = numero_piece_identite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getLieu_naissance() {
        return lieu_naissance;
    }

    public void setLieu_naissance(String lieu_naissance) {
        this.lieu_naissance = lieu_naissance;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEtat_civil() {
        return etat_civil;
    }

    public void setEtat_civil(String etat_civil) {
        this.etat_civil = etat_civil;
    }

    public String getPiece_identite() {
        return piece_identite;
    }

    public void setPiece_identite(String piece_identite) {
        this.piece_identite = piece_identite;
    }

    public String getNumero_piece_identite() {
        return numero_piece_identite;
    }

    public void setNumero_piece_identite(String numero_piece_identite) {
        this.numero_piece_identite = numero_piece_identite;
    }

    

    @Override
    public boolean updateData() throws Exception {
        return brain.controller.ClsUpdate.updateData(this);
    }

    @Override
    public boolean deleteData() throws Exception {
        return brain.controller.ClsUpdate.fx_IdeleteData("t_journalier", getId());
    }
}