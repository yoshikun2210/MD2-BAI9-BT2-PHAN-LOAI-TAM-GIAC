import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifierTest {
    @Test
    void testTamGiacDeu(){
        int a = 2;
        int b = 2;
        int c = 2;
        String result = TriangleClassifier.triangleClassifier(a ,b,c);
        String tamgiac1 = "Là tam giác đều";
        assertEquals(result,tamgiac1);
    }
    @Test
     void testTamGiacCan(){
        double a = 2;
        double b = 2;
        double c = 3;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String tamgiac2 = "Là tam giác cân";
        assertEquals(result,tamgiac2);
    }
    @Test
    void testTamGiacVuongCan(){
        double a = 3;
        double b = 3;
        double c = Math.sqrt(18);
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String tamgiac3= "Là tam giác vuông cân";
        assertEquals(tamgiac3,result);
    }
    @Test
    void testTamgiacVuong(){
        double a = 3;
        double b = 4;
        double c = 5;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String tamgiac4 = "Là tam giác vuông";
        assertEquals(result,tamgiac4);

    }
    @Test
    void  testTamGiacThuong(){
        double a = 5;
        double b = 3;
        double c = 6;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String tamgiac5 = "Là tam giác thường";
        assertEquals(result,tamgiac5);
    }






}
