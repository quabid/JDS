package com.gmail.quebed.datasaver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private final MyConstantsTests mct = new MyConstantsTests();
    private final DeserializerTests dt = new DeserializerTests();
    private final SerializerTests st = new SerializerTests();
    private final PathRemoverTests prt = new PathRemoverTests();
    private final PathValidatorTests pvt = new PathValidatorTests();
    private SomeObject so;

    @Test
    public void testSerializationLifeCycle() {
        String dest = mct.USRDIR + "someobject.ser";
        so = new SomeObject(3, 4);
        st.serialize(so, dest);

        assertTrue(pvt.pathExists(dest));

        SomeObject someObject = (SomeObject) dt.deserialize(dest);
        assertTrue((someObject.x == 3 && someObject.y == 4));

        prt.removePath(dest);
        assertFalse(pvt.pathExists(dest));
    }
}
