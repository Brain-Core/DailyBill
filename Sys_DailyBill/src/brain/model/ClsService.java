Package brain.model;

public Class ClsService implement IAction
{

    private int id;
    private String serviceItem;
    private String descriptionItem;

    public ClsService(int id, String serviceItem, String descriptionItem)
    {
        this.id = id;
        this.serviceItem = serviceItem;
        this.descriptionItem = descriptionItem;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;    
    }

    public String getServiceItem()
    {
        return serviceItem;
    }

    public void setServiceItem(String serviceItem) 
    {
        this.serviceItem = serviceItem;    
    }

    public String getDescriptionItem()
    {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) 
    {
        this.descriptionItem = descriptionItem;    
    }
}