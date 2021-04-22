package com.gmail.quebed.datasaver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializerTests {
    public final Object deserialize(String sourcePath) {
        Object obj = null;

        try {
            FileInputStream fileIn = new FileInputStream(sourcePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        return obj;
    }
}
