class Animal {
    protected void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    // @Override
    // void eat() {
    // System.out.println("Dog eats");
    // }
}

class OverrideWAccessModifiers {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}