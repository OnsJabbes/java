public class RacineExc {
 private double precision;

 public RacineExc(double precision) {
 this.precision = precision;
 }
 public double racine(double operande) throws OperandNegativeException {
    if (operande < 0) {
        throw new OperandNegativeException("Operand cannot be negative");
    }

    double solution, carre, a, b;
    a = 0;
    b = operande;
    solution = (a + b) / 2;
    
    while (b - a > precision) {
        carre = solution * solution;
        if (carre > operande) b = solution;
        else a = solution;
        solution = (a + b) / 2;
    }
    return solution;
}

 public double getPrecision() {
 return precision;
}
 public void setPrecision(double precision) {
 this.precision = precision;
}


public static void main(String[] args) {
    RacineExc sqrtCalculator = new RacineExc(0.00001);
    double number = -25.0; 
    try {
        double result = sqrtCalculator.racine(number);
        System.out.println("Square root of " + number + " is approximately " + result);
    } catch (OperandNegativeException e) {
        System.err.println("Error: " + e.getMessage());
       
    }
}

}