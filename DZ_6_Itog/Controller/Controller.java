package DZ_6_Itog.Controller;

import DZ_6_Itog.Data.LogToFile;
import DZ_6_Itog.Data.Model;
import DZ_6_Itog.View.View;

public class Controller {
    View view;
    Model model;
    private LogToFile logger = new LogToFile();
    public Controller(View v) {
        view = v;
    }

    public void buttonClick(Model model){
        System.out.println("Допускаются только комплексные числа\n" 
                            +"с указанием неявных цифр, примеры:\n"
                            +"-5+2i, 3-2i, 6+1i, -2-1i\n");
        String a = view.getValue("Введите первое число: ");
        String b = view.getValue("Введите второе число: ");
        model.setX(a);
        model.setY(b);
        String result = model.result();
        view.print(result, "Результат: ");
        logger.log(result);
    }
}
