
package brain.models;

import brain.controller.IAction;

public class ClsSalaire implements  IAction{
    
    private int id ;
    private String  salaireItem ;
    private String descriptionItem ;
    private float montant ;
    private ClsService service ;

    public ClsSalaire(int id, String salaireItem, String descriptionItem, float montant, ClsService service) {
        this.id = id;
        this.salaireItem = salaireItem;
        this.descriptionItem = descriptionItem;
        this.montant = montant;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalaireItem() {
        return salaireItem;
    }

    public void setSalaireItem(String salaireItem) {
        this.salaireItem = salaireItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public ClsService getService() {
        return service;
    }

    public void setService(ClsService service) {
        this.service = service;
    }

    @Override
    public boolean updateData() throws Exception {
        return brain.controller.ClsUpdate.updateData(this);
    }

    @Override
    public boolean deleteData() throws Exception {
        return brain.controller.ClsUpdate.fx_IdeleteData("t_salaire", getId());
    }
    
}
