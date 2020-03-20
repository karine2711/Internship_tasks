package spring.beans.ecourse.Lessons456;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    final static String lineSeparator = System.lineSeparator();

    String fileName;
    File file;


    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }



    @Override
    public void logEvent(Event event) {

        try {
           FileWriter writer= new FileWriter(file,true);
            writer.append(event.toString());
            writer.append(lineSeparator);
            writer.close();
            //  FileUtils.writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void closeWrite(){
//        try {
//          //  writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    public void init() throws IOException {
        String filePath = new File("").getAbsolutePath();
        filePath = filePath.concat("/src/spring/src/main/java/spring/beans/ecourse/Lessons456/log.txt");
        // filePath="log.txt";
        this.file = new File(filePath);

      //  this.writer = new FileWriter(file,true);
        if (!file.exists()) {
            System.out.println("hi");
        }

    }

}

