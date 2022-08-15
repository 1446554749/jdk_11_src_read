public class TestClassMethod {
    public static void main(String[] args) {
        System.out.println(Parent.class.isAssignableFrom(Children.class));
    }
}

class Parent{

}

class Children extends Parent{

}

