// package DZ_6_Itog.Controller;

// import DZ_6_Itog.Data.CalcModel;
// import DZ_6_Itog.Data.Model;
// import DZ_6_Itog.View.View;

// public class ControllerOfT<T extends CalcModel> {
//     View view;
//     Model model;

//     public ControllerOfT(T m, View v) {
//         model = m;
//         view = v;
//     }

//     public void buttonClick(){
//         String a = view.getValue("a: ");
//         String b = view.getValue("b: ");
//         model.setX(a);
//         model.setY(b);
//         String result = model.result();
//         view.print(result, "Sum: ");
//     }
// }
