package testpackage;


import final_project_finaledition.Neural_Network;
import UserInterface.NewJPanel;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllTests {
    @Test public void testAdd1(){
        final Neural_Network n = new Neural_Network(new int[]{28*28,30,10});
        n.isTrain();
        //n.predict(new double[]{7.00,8.00,9.00});
//        n.add(n., 32, 100);
//        n.add(n.result, 1024, 100);
//
//        assertEquals(2, c.getNum(28));
//        assertEquals(1,c.getNum(8));
//        assertEquals(0,c.getNum(0));

    }
}
