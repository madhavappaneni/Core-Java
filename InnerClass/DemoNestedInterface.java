package InnerClass;

interface Showable {
    void show();

    interface subShowable {
        void msg();

    }
}

class DemoNestedInterface implements Showable.subShowable {
    public void msg() {
        System.out.println("Printing Message");
    }

    public static void main(String[] args) {
        DemoNestedInterface dni = new DemoNestedInterface();
        dni.msg();
    }
}