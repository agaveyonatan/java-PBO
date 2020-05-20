import view.*;
import controller.ControllerResponsi;
import model.ModelResponsi;

/**
 *
 * @author Agave-PC
 */
public class MVC_responsi {
    ModelResponsi modelresponsi = new ModelResponsi();
    ViewLoginAdmin viewloginadmin = new ViewLoginAdmin();
    ViewModeAdmin viewmodeadmin = new ViewModeAdmin();
    ViewLoan viewloan = new ViewLoan();
    ViewRecord viewrecord = new ViewRecord();
    ViewEdit viewedit = new ViewEdit();
    ViewAbout viewabout = new ViewAbout();
    ControllerResponsi controllerresponsi;
    
    public MVC_responsi(){
        this.controllerresponsi = new ControllerResponsi(modelresponsi, viewloginadmin, viewmodeadmin, viewloan, viewrecord, viewedit, viewabout);         
    }
}
