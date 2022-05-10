package ss3_ClassAndMethod.Exercise.QuadraticEquation;

public class BuildQuadraticEquationClass {
    double a, b, c;

    public BuildQuadraticEquationClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return  Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1(){

        return (-b + Math.pow(getDiscriminant(),0.5) )/(2*a);
    }
    public double getRoot2(){

        return (-b - Math.pow(getDiscriminant(),0.5) )/(2*a);
    }
}
