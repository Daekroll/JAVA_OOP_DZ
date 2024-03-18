package DZ_6_Itog.Data;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogToFile {
    private static Logger logger = Logger.getLogger("My logger");
    private String file = "C:\\Users\\vavil\\Desktop\\DZ_JAVA\\JAVA_OOP_DZ\\DZ_6_Itog\\log.txt";

    public void log (String text){
        try {
            FileHandler fh = new FileHandler(file, true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
            logger.info("result: " + text);
            fh.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл!");
        }
    }
}
