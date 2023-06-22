package Model;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void print() {
        if(im > 0){
            System.out.println(re + " + " + im + "i");
        } else if (im < 0) {
            System.out.println(re + "" + im + "i");
        } else {
            System.out.println(re);
        }
    }

    @Override
    public String toString() {
        return "{" + "Re: " + re + ", Im: " + im + '}';
    }
}