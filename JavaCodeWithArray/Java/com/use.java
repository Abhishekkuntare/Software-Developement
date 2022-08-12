import com.codewithharry.shape.Circle;

class howtouse extends Circle {

    howtouse(int a, int b) {
        super(a, b);
    }

}

public class use {
    public static void main(String[] args) {
        int a = 4, b = 3;
        howtouse hwt = new howtouse(a, b);
        System.out.println(hwt.area());
    }
}
