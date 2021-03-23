package by.semashko;

import by.semashko.controller.Controller;
import by.semashko.model.Dog;
import by.semashko.view.Frame;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(14,3);
        Frame frame = new Frame();
        Controller controller = new Controller(dog,frame);
        controller.initController();
    }
}
