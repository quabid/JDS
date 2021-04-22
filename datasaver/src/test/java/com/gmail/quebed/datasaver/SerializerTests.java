package com.gmail.quebed.datasaver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializerTests {
    public final void serialize(Object obj, String destinationPath) {
        try {
            FileOutputStream fos = new FileOutputStream(destinationPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            return;
        }

    }
}
