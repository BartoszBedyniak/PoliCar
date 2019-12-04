package pl.accenture;

public class Car extends  Vehicle{
    public Car() {
    }

    @Override
    void go() {
       // super.go();
        System.out.println("car go");
    }
    void horn()
    {
        System.out.println("Beep Beep normalnie");
    }
}
