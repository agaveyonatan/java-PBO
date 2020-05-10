
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
    ControllerProject controllerproject = new ControllerProject(modelproject,viewloginuser, viewloginadmin, viewregisteruser,viewtambahgame, viewmodeadmin,viewmodeuser, viewadmingamedetailed, viewusergamedetailed, viewupdategame, viewcheckout, viewdirectorygame);
}