package Controller;

import Model.Complex;
import Service.*;
import View.View;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    private View View;
    private Logger logger;

    public Controller(View view) {
        this.View = view;
    }

    public void buttonClick() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        try {
            Complex c1 = new Complex(View.inputValue("Первое число: "), View.inputValue("Еще число: "));

            char operation = View.inputOperationSign("Знак необходимой операции: ");

            Complex c2 = new Complex(View.inputValue("Сново число: "), View.inputValue("И последнее число: "));

            switch (operation) {
                case '+' -> {
                    ComplexOperation complexOperation = new ComplexAddition();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                    logger.log(Level.INFO, c1 + " + " + c2 + " = " + result);
                }
                case '-' -> {
                    ComplexOperation complexOperation = new ComplexSubstraction();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                    logger.log(Level.INFO, c1 + " - " + c2 + " = " + result);
                }
                case '*' -> {
                    ComplexOperation complexOperation = new ComplexMultiplication();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                    logger.log(Level.INFO, c1 + " * " + c2 + " = " + result);
                }
                case '/' -> {
                    ComplexOperation complexOperation = new ComplexDivision();
                    Complex result = complexOperation.mathOperation(c1, c2);
                    complexOperation.print(result);
                    logger.log(Level.INFO, c1 + " / " + c2 + " = " + result);
                }
                default -> logger.log(Level.WARNING, "Unexpected sign: " + operation);
            }
            fileHandler.close();
        } catch (InputMismatchException ex) {
            logger.log(Level.WARNING, "Введены некорректные данные при вводе комлексного числа!");
        }
    }
}