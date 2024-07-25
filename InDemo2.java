import java.util.*;

class Shape {
    int s;// instance variable (hold the value of side)

    public void setValue(int side) {
        s = side;//setting s value as side 
    }
}

class Square extends Shape {//inherit shape class for square class
    public int area() {
        return s * s;
    }
}

class Cube extends Shape {//inherit shape class for cube class
    public int volume() {
        return s * s * s;
    }
}

class InDemo2 { //main class
    public static void main(String[] args) {
        int x, a, v;
        Scanner ip = new Scanner(System.in);
        Square sq = new Square();  //object creation of square class
        System.out.println("Enter the side of Square: ");
        x = ip.nextInt();
        sq.setValue(x);  //setting value of square class as x
        a = sq.area(); //class calling
        System.out.println("Area of square: " + a);
        Cube cu = new Cube();  //object creation of cube class 
        cu.setValue(x);  //setting value of cube class as x
        v = cu.volume();  //class calling
        System.out.println("Volume of cube: " + v);
    }
}