class A {
    public void showA() { //Base class
        System.out.println("This massage is from class A.");
    }
}

class B extends A { //B class inherit A class
    public void showB() {
        System.out.println("This massage is from class B.");

    }
}

class C extends B {//C class inherit class B
    public void showC() {
        System.out.println("This massage is from class c.");

    }
}

class InDemo3 {//mafin class
    public static void main(String[] args) {
        C c = new C();// object creation of class C which inherited the class A and B.
        c.showA();
        c.showB();
        c.showC();
    }
}