/**
 *
 * @author Agave-PC
 */
public class MVC_project {
    ViewLoginUser viewloginuser = new ViewLoginUser();
    ViewLoginAdmin viewloginadmin = new ViewLoginAdmin();
    ViewRegisterUser viewregisteruser = new ViewRegisterUser();
    ModelProject modelproject = new ModelProject();
    ControllerProject controllerproject = new ControllerProject(modelproject,viewloginuser, viewloginadmin, viewregisteruser);
}