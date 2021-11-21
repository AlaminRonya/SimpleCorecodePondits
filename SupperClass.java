public class SupperClass {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
class A {
    String getH(){
        return "A-Class";
    }
    void show(){
        System.out.println("In A " +this.getH());
    }
}
class B extends A{

    @Override
    String getH(){
        return "B-Class";
    }
    @Override
    void show(){
        super.show();
        System.out.println("In B "+this.getH());
    }
}