class Person{
    int a = 0;
    static int b = 1;

    public static void greet(){
        System.out.println("static method");

        // System.out.println(a);       // Person 클래스 선언 x. 객체 생성되지 않아 변수도 생성되지 않음
        System.out.println(b);
    }

    public void Hello(){
        System.out.println("instance method");
    }
}

public class Main {
    public static void main(String[] args){
        Person.greet();

        Person p = new Person();
        p.Hello();
        p.greet();
    }
}