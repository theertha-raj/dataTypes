package Datatypes;

public class downcasting {
    int age = 55;

}

class Daughter extends downcasting {
    int Daughterage = 25;
}

class Son extends downcasting {
    int ageSon = 21;

    public static void main(String[] args) {
        downcasting f1 = new Son(); // upcasting
        downcasting f2 = new Daughter(); // upcasting
        Son s = (Son) f1;// downcasting
        Daughter d = (Daughter) f2;// downcasting
        System.out.println(f1.age);
    }
}
