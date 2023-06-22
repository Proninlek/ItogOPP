import Controller.Controller;
import View.View;

public class Programm {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.buttonClick();
    }
}