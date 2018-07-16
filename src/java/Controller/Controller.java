package Controller;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {

    public void template() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/Template_PFUltima/faces/Vistas/Template/Template.xhtml");
    }
    
}
