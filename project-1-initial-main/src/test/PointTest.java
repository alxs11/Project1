import com.csc205.project1.Point;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

   /*  @org.junit.jupiter.api.Test
    void distance() {

        double expected = 5.0;
        double actual = new Point().distance(6.0, 5.0);
        assertEquals(expected, actual);
    }
   */

    @org.junit.jupiter.api.Test
    void shiftX() {
        double expected = 8.0;
        double actual = new Point().shiftX(2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shiftY() {
        double expected = 7.0;
        double actual = new Point().shiftY(2);
        assertEquals(expected, actual);
    }

   /* @org.junit.jupiter.api.Test
    void rotate() {
        double expected = -0.999;
        double actual = new Point().rotate(1.57);
        assertEquals(expected, actual);
    } */
}