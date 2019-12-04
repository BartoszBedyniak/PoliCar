package pl.accenture;

public class Main {

    public static void main(String[] args) {
	//SportCar sc =new SportCar();
	//Vehicle v=new Vehicle();
	//Car c=new Car();
        Vehicle  sportCar=new SportCar();
        Vehicle vehicle=new Vehicle();
        Vehicle car=new Car();

        //rzutowanie 1 sposob
   // SportCar sc=((SportCar) sportCar);
    //sc.go();
    //rzutowanie 2 sposob
      //  ((SportCar)sportCar).go();



	Vehicle[]tab={vehicle,car,sportCar};
	for(Vehicle aa:tab)
    {
        if(aa instanceof Car) {
            ((Car) aa).horn();
        }
        if(aa instanceof SportCar) {
            ((SportCar) aa).turbo();
        }
        if(aa instanceof Vehicle) {
            aa.go();
        }
        System.out.println(" \n");
    }
	Car cc =new SportCar();

    }
}
