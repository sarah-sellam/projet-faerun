package tp6.tabledoperation;

public class Multiplication extends Operation {

    Multiplication(double terme1, double terme2) {
        super(terme1, terme2);
    }

    public double calculResultat() {
        return super.getTerme1()*super.getTerme2();
    }

    @Override
    public String toString() {
        return super.getTerme1() + " x " + super.getTerme2() + " = ";
    }
}
