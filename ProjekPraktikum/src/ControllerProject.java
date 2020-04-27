/**
 *
 * @author Agave-PC
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerProject {
    
    ModelProject modelproject;
    ViewLoginUser viewloginuser;
    ViewLoginAdmin viewloginadmin;
    ViewRegisterUser viewregisteruser;
    
    ControllerProject(ModelProject modelproject, ViewLoginUser viewloginuser, ViewLoginAdmin viewloginadmin, ViewRegisterUser viewregisteruser) {
        this.modelproject = modelproject;
        this.viewloginuser = viewloginuser;
    }
    
}
