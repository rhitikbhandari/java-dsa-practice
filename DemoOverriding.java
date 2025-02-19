class animal {
    void makesound()// parent class method.
    {
        System.out.println("Animal Makes a Sound");
    }
}

class dog extends animal // child class have some properties of parent class
{
    void makesound()// child class method.
    {
        System.out.println("Dog Barks ");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        animal myanimal = new animal(); // myanimal is a new object
        myanimal.makesound();

        dog mydog = new dog(); // mydog is a new object
        mydog.makesound();
    }
}
