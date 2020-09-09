/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.controller;

import brain.models.ClsJournalier;
import brain.models.ClsPaiement;
import brain.models.ClsPrestation;
import brain.models.ClsSalaire;
import brain.models.ClsService;
import brain.models.ClsUser;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class ClsUpdate 
{
    public static boolean updateData(Object obj) throws ClassNotFoundException, SQLException, Exception
    {
        if (obj instanceof ClsUser)
        {
            ClsUser user = (ClsUser)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tuser ?,?,?");
            ps.setString(1, user.getUName());
            ps.setString(2, user.getUPass());
            ps.setString(3, user.getUAccreditation());
            ps.executeUpdate();
            DbConnect.disconnectDb();
            return true;
        }
        
        else if (obj instanceof ClsService)
        {
            ClsService se = (ClsService)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tservice ?,?");
            ps.setString(1, se.getServiceItem());
            ps.setString(2, se.getDescriptionItem());
            ps.executeUpdate();
            DbConnect.disconnectDb();
            return true;
        }
        
        else if (obj instanceof ClsJournalier)
        {
            ClsJournalier jo = (ClsJournalier)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tjournalier ?,?,?,?,?,?,?,?,?");
            ps.setString(1, jo.getNom());
            ps.setString(2, jo.getPostnom());
            ps.setString(3, jo.getPrenom());
            ps.setString(4, jo.getSexe());
            ps.setString(5, jo.getEtat_civil());
            ps.setDate(6, jo.getDate_naissance());
            ps.setString(7, jo.getEtat_civil());
            ps.setString(8, jo.getPiece_identite());
            ps.setString(9, jo.getNumero_piece_identite());
            ps.executeUpdate();
            DbConnect.disconnectDb();
            return true;
        }
        
        else if (obj instanceof ClsSalaire)
        {
            ClsSalaire sa = (ClsSalaire)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tsalaire ?,?,?,?");
            ps.setString(1, sa.getSalaireItem());
            ps.setString(2, sa.getDescriptionItem());
            ps.setFloat(3, sa.getMontant());
            ps.setInt(4, sa.getService().getId());
            ps.executeUpdate();
            DbConnect.disconnectDb();
            return true;
        }
        
        else if (obj instanceof ClsPrestation)
        {
            ClsPrestation pr = (ClsPrestation)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tpresentation ?,?,?,?,?");
            ps.setInt(1, pr.getJournalier().getId());
            ps.setInt(2, pr.getService().getId());
            ps.setDate(3, pr.getDatePrestation());
            ps.setString(4, pr.getHeureDebut());
            ps.setString(5, pr.getHeure_fin());
            ps.executeUpdate();
            DbConnect.connectDb();
            return true;
        }
        
        else if (obj instanceof ClsPaiement)
        {
            ClsPaiement pa = (ClsPaiement)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareStatement("EXECUTE SP_UPDATE_tpaiement ?,?,?,?");
            ps.setInt(1, pa.getJournalier().getId());
            ps.setString(2, pa.getPrestation().getId());
            ps.setDate(3, pa.getDatePaiement());
            ps.setFloat(3, pa.getMontant());
            ps.setString(4, pa.getUser().getUName());
            ps.executeUpdate();
            DbConnect.disconnectDb();
            return true;
        }
        return false;
    }
    
    public static boolean fx_IdeleteData(String tbl, int id) throws ClassNotFoundException, SQLException, Exception
    {
        PreparedStatement ps = DbConnect.connectDb().prepareStatement
                                ("DELETE FROM " + tbl + "WHERE id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        DbConnect.disconnectDb();
        return true;
    }
    
    public static boolean fx_SdeleteData(String tbl, String id) throws ClassNotFoundException, SQLException, Exception
    {
        PreparedStatement ps = DbConnect.connectDb().prepareStatement
                                ("DELETE FROM " + tbl + "WHERE id = ?");
        ps.setString(1, id);
        ps.executeUpdate();
        DbConnect.disconnectDb();
        return true;
    }
}
