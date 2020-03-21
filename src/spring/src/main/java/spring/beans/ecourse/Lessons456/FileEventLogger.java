package spring.beans.ecourse.Lessons456;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    final static String lineSeparator = System.lineSeparator();

    private String fileName = "/src/spring/src/main/java/spring/beans/ecourse/Lessons456/log.txt";
    private File file;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void logEvent(Event event) {

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.append(event.toString());
            writer.append(lineSeparator);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @PostConstruct
    public void init() throws IOException {
        String filePath = new File("").getAbsolutePath();
        filePath = filePath.concat(fileName);
        this.file = new File(filePath);

        if (!file.exists()) {
            System.out.println("hi");
        }

    }

}

