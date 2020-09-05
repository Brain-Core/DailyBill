Package brain.model;

public Class ClsJournalier implement IAction
{

    public ClsJournalier(int id, String nom, String postnom, String prenom, String lieu_naissance, Date date_naissance, String etat_civil, String piece_identite, String numero_piece_identite)
    {
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.lieu_naissance = lieu_naissance;
        this.date_naissance = date_naissance;
        this.date_naissance = date_naissance;
        this.etat_civil = etat_civil;
        this.piece_identite = piece_identite;
        this.numero_piece_identite = numero_piece_identite;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;    
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom) 
    {
        this.nom = nom;    
    }

    public String getPostnom()
    {
        return postnom;
    }

    public void setPostnom(String postnom) 
    {
        this.postnom = postnom;    
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom) 
    {
        this.prenom = prenom;    
    }

    public String getLieuNaissance()
    {
        return lieu_naissance;
    }

    public void setLieuNaissance(String lieu_naissance) 
    {
        this.lieu_naissance = lieu_naissance;    
    }

    public Date getDateNaissance()
    {
        return date_naissance;
    }
    
    public void setDateNaissance(Date date_naissance) 
    {
        this.date_naissance = date_naissance;    
    }

    public String getEtatCivil()
    {
        return etat_civil;
    }

    public void setEtatCivil(String etat_civil) 
    {
        this.etat_civil = etat_civil;    
    }

    public String getPieceIdentite()
    {
        return piece_identite;
    }

    public void setPieceIdentite(String piece_identite) 
    {
        this.piece_identite = piece_identite;    
    }

    public String getNumeroPieceIdentite()
    {
        return numero_piece_identite;
    }

    public void setNumeroPieceIdentite(String numero_piece_identite) 
    {
        this.numero_piece_identite = numero_piece_identite;    
    }
}