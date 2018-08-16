package testpackage;


import final_project_finaledition.Neural_Network;
import UserInterface.NewJPanel;
import final_project_finaledition.ImageModel;
import final_project_finaledition.ImageUtil;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllTests {
    @Test public void test1(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        network.SGD(modelList, 100, 0.5);
        assertTrue(network.isTrain());
    }
    
    @Test public void test2(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        network.SGD(modelList, 100, 0.5);
        assertEquals(3,network.getLayerNum());

    }
}
