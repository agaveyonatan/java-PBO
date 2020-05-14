
import view.ViewAdminGameDetailed;
import view.ViewModeAdmin;
import view.ViewUpdateGame;
import view.ViewModeUser;
import view.ViewUserGameDetailed;
import view.ViewCheckout;
import view.ViewTambahGame;
import view.ViewLoginAdmin;
import view.ViewLoginUser;
import view.ViewRegisterUser;
import view.ViewDirectoryGame;
import model.ModelProject;
import controller.ControllerProject;




/**
 *
 * @author Agave-PC
 */
public class MVC_project {
    ViewLoginUser viewloginuser = new ViewLoginUser();
    ViewLoginAdmin viewloginadmin = new ViewLoginAdmin();
    ViewRegisterUser viewregisteruser = new ViewRegisterUser();
    ViewTambahGame viewtambahgame = new ViewTambahGame();
    ViewModeAdmin viewmodeadmin = new ViewModeAdmin();
    ViewModeUser viewmodeuser = new ViewModeUser();
    ViewAdminGameDetailed viewadmingamedetailed = new ViewAdminGameDetailed();
    ViewUserGameDetailed viewusergamedetailed = new ViewUserGameDetailed();
    ViewUpdateGame viewupdategame = new ViewUpdateGame();
    ViewCheckout viewcheckout = new ViewCheckout();
    ViewDirectoryGame viewdirectorygame = new ViewDirectoryGame();
    ModelProject modelproject = new ModelProject();
    ControllerProject controllerproject;

    public MVC_project() {
        this.controllerproject = new ControllerProject(modelproject,viewloginuser, viewloginadmin, viewregisteruser,viewtambahgame, viewmodeadmin,viewmodeuser, viewadmingamedetailed, viewusergamedetailed, viewupdategame, viewcheckout, viewdirectorygame);
    }
}