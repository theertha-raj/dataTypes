package Datatypes;

class Upcasting {
    int age = 55;
}

class Son extends Upcasting {
    int ageSon = 21;

    public static void main(String[] args) {
        Upcasting f = new Son();
        System.out.println(f.age);
    }
}
s
class Daughter extends Upcasting {
    int ageDaughter = 21;
}
