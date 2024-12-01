public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to display the complex number in a + bi format
    @Override
    public String toString() {
        return String.format("%.1f + %.1fi", real, imaginary);
    }

    // Main method to test the ComplexNumber class
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, 4);
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);
    }
}
