/**
 *
 * @author Agave-PC
 */
public class MVC_tugas6 {
    ViewPraktikum viewpraktikum = new ViewPraktikum();
    ModelPraktikum modelpraktikum = new ModelPraktikum();
    ControllerPraktikum controllerpraktikum = new ControllerPraktikum(modelpraktikum,viewpraktikum);
}
