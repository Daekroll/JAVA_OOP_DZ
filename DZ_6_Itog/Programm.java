package DZ_6_Itog;

import DZ_6_Itog.Controller.Controller;
import DZ_6_Itog.Data.DivModel;
import DZ_6_Itog.Data.MultModel;
import DZ_6_Itog.Data.SubModel;
import DZ_6_Itog.Data.SumModel;
import DZ_6_Itog.View.View;

public class Programm {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());

        controller.buttonClick(new SumModel());
        // controller.buttonClick(new SubModel());
        // controller.buttonClick(new DivModel());
        // controller.buttonClick(new MultModel());

    }
}
