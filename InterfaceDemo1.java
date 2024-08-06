/*Abstraction method of Interface.
We use "interface "key word to create an interface.
Interface is a container of abstract method.
Interface only contain abstract method only.*/
interface MyInterface {
    void m1();// public abstract void m1()

    void m2();// public abstract void m2()

    void m3();// public abstract void m3()

}

class TestInterface implements MyInterface { 

    public void m1() {
        System.out.println("This message from m1()");//method initialise of abstract method.
    }

    public void m2() {
        System.out.println("This message from m2()");//method initialise of abstract method.

    }

    public void m3() {
        System.out.println("This message from m3()");//method initialise of abstract method.

    }

}

class InterfaceDemo1 {
    public static void main(String[] args) {
        TestInterface t1 = new TestInterface();
        t1.m1();
        t1.m2();
        t1.m3();
    }
}