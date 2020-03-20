package spring.beans.ecourse.Lessons456;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    String fileName;
    File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void logEvent(Event event) {

        try {
            FileWriter writer=new FileWriter(file);
            writer.append(event.toString());
            writer.close();
          //  FileUtils.writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void init() throws IOException {
        String filePath = new File("").getAbsolutePath();
        filePath=filePath.concat("/src/spring/src/main/java/spring/beans/ecourse/Lessons456/log.txt");
        // filePath="log.txt";
        this.file = new File(filePath);
        if(!file.exists()){
            System.out.println("hi");
        }

    }
}

