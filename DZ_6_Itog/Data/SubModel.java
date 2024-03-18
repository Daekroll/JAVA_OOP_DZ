package DZ_6_Itog.Data;

public class SubModel extends CalcModel{
    public SubModel() {
        
    }
    // do_it
    @Override
    public String result() {
        double res1 = (x1*y1)+(x2*y2);
        double res2 = (x2*y1)-(x1*y2);
        double res3 = (y1*y1)+(y2*y2);
        res1/=res3;
        res2/=res3;
        if(res2>0){
            return String.valueOf(res1) + "+" +String.valueOf(res2) + "i";
        }
        return String.valueOf(res1) + String.valueOf(res2) + "i";
        
    }

    @Override
    public void setX(String value) {
        if(value.length() == 5){
            super.x1 = Double.parseDouble(value.substring(0, 2));
            super.x2 = Double.parseDouble(value.substring(2,4));
            
        } else {
            super.x1 = Double.parseDouble(value.substring(0, 1));
            super.x2 = Double.parseDouble(value.substring(1,3));
        }
    }

    @Override
    public void setY(String value) {
        if(value.length() == 5){
            super.y1 = Double.parseDouble(value.substring(0, 2));
            super.y2 = Double.parseDouble(value.substring(2,4));
            
        } else {
            super.y1 = Double.parseDouble(value.substring(0, 1));
            super.y2 = Double.parseDouble(value.substring(1,3));
        }
    }
}
