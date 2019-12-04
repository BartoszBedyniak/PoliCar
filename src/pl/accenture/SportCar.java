package pl.accenture;

public class SportCar extends Car{
    public SportCar() {

    }

    @Override
    void go() {
        //super.go();
        System.out.println("sport car go");
    }
    void turbo()
    {
        System.out.println("akrywacja turbo w sportowym");
    }
}
