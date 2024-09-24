package Assaignmet;

public class MultipleClassFiles {
    public static void main(String[] args) {
        classOne one = new classOne();
        one.print();
        classTwo two = new classTwo();
        two.print();
    }
}

class classOne {
    void print() {
        System.out.println("Class One.. ");
    }
}

class classTwo {
    void print() {
        System.out.println("Class two.. ");
    }
}
