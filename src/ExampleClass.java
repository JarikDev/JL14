public class ExampleClass {
    void method() {
        Car car = new Ferrary();
        car.run();
        car.stop();
    }
}

abstract class Ball extends ExampleClass{

}

final class MyFinalClass{
    void someLogin(){}

} // cannot inherit
/*
class ExtendsFinalClass extends MyFinalClass{

}*/


