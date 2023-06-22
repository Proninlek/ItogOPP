package Service;

import Model.Complex;

public class ComplexSubstraction implements ComplexOperation {
    @Override
    public Complex mathOperation(Complex c1, Complex c2) {
        double resultRe = c1.getRe() - c2.getRe();
        double resultIm = c1.getIm() - c2.getIm();
        Complex result = new Complex(resultRe, resultIm);
        return  result;
    }

    @Override
    public void print(Complex complex) {
        complex.print();
    }
}