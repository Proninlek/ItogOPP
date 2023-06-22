package Service;

import Model.Complex;
public class ComplexAddition implements ComplexOperation {
    @Override
    public Complex mathOperation(Complex c1, Complex c2) {
        double resultRe = c1.getRe() + c2.getRe();
        double resultIm = c1.getIm() + c2.getIm();
        Complex result = new Complex(resultRe, resultIm);
        return  result;
    }

    public void print(Complex complex) {
        complex.print();
    }
}