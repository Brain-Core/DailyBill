package brain.models;

import brain.controller.IAction;

public class ClsUser implements IAction
{
    private String u_name;
    private String u_pass;
    private String u_accreditation;

    public ClsUser(String u_name, String u_pass, String u_accreditation)
    {
        this.u_name = u_name;
        this.u_pass = u_pass;
        this.u_accreditation = u_accreditation;
    }

    public String getUName()
    {
        return u_name;
    }

    public void setUName(String u_name)
    {
        this.u_name = u_name;
    }

    public String getUPass()
    {
        return u_pass;
    }

    public void setUPass(String u_pass)
    {
        this.u_pass = u_pass;   
    }

    public String getUAccreditation()
    {
        return u_accreditation;
    }

    private void setUAccreditatin(String u_accreditation) 
    {
        this.u_accreditation = u_accreditation;    
    }

    @Override
    public boolean updateData() throws Exception {
        return brain.controller.ClsUpdate.updateData(this);
    }

    @Override
    public boolean deleteData() throws Exception {
        return brain.controller.ClsUpdate.deleteData(this);
    }
    
}