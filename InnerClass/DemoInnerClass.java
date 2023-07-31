package InnerClass;

public class DemoInnerClass {
    private int data = 30;

    // A non-static class that is created inside a class but outside a method. Also
    // known as a regular inner class. It can be declared with access modifiers like
    // public, default, private, protected
    class DemoMemberInnerClass {
        void message() {
            System.out.println("data is: " + data);
        }
    }

    public static void main(String[] args) {
        DemoInnerClass dic = new DemoInnerClass();
        DemoInnerClass.DemoMemberInnerClass dmic = dic.new DemoMemberInnerClass();
        dmic.message();
    }
}
