package DZ_6_Itog.View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public void print(String data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
