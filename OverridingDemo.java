/*Method overriding : Re-writing the base class method into derived class method
Rules:
1.class must be inherited.
2.base method name and derived class name must be same.
3.base class and derived class parameter must be same.
4.base class and derived class return type can be same.*/
class X {
    public void m1() {
        System.out.println("m1 of X");

    }

    public void m2() {
        System.out.println("m2 of X");

    }
}

class Y extends X {
    public void m1() {
        System.out.println("m1 of Y");

    }

    public void m3() {
        System.out.println("m3 of Y");

    }

}

class OverridingDemo {
    public static void main(String[] args) {
        System.out.println("X class methods: ");
        X x = new X();
        x.m1();
        x.m2();
        System.out.println("Y class methods: ");
        Y y = new Y();
        y.m1();// override method of class X.
        y.m3();

    }
}