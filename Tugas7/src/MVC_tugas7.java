/**
 *
 * @author Agave-PC
 */
public class MVC_tugas7 {
    ViewPraktikum viewpraktikum = new ViewPraktikum();
    ModelPraktikum modelpraktikum = new ModelPraktikum();
    ControllerPraktikum controllerpraktikum = new ControllerPraktikum(modelpraktikum,viewpraktikum);
}