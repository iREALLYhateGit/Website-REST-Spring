package ru.ldinka.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class PersonalApplication {
    public static Logger logger = Logger.getLogger("main");

    public static void main(String[] args) {
        SpringApplication.run(PersonalApplication.class, args);
        logger.log(Level.FINE, "All is fine");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")))) {
            writer.write("Fine");
        } catch (IOException ioException){
            logger.log(Level.WARNING, "IoException");
        }
    }

}
