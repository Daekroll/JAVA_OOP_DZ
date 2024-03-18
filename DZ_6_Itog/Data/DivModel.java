package DZ_6_Itog.Data;

public class DivModel extends CalcModel{
    public DivModel() {
        
    }
    // do_it
    @Override
    public String result() {
        if(x2-(y2)>0){
            return String.valueOf(x1-y1) + "+" + String.valueOf(x2-(y2))+"i";
        }
        System.out.println(y2*-1);
        return String.valueOf(x1-y1) + String.valueOf(x2-(y2))+"i";
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
