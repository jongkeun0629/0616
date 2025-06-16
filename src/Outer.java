public class Outer {
    private String data = "Outer data";

    class Inner {
        void printData(){
            System.out.println(data);
        }
    }

    public Inner createInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        // Outer.this
        Outer.Inner inner = outer.createInner();

        inner.printData();

        // 이미 참조해서 출력에 영향x
        outer = null;
        inner.printData();

        // 참조한 값을 지움. 에러 발생
        inner = null;

        System.gc();
    }
}