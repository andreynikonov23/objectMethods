import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public int hashCode(){
        return numerator / denominator + denominator / numerator;
    }
    @Override
    public boolean equals(Object obj){
        boolean isTrue = false;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        Fraction fraction = (Fraction) obj;
        if (this.hashCode() != fraction.hashCode()) {
            return false;
        } else {
            isTrue = this.numerator * fraction.denominator == this.denominator * fraction.numerator;
        }
        return isTrue;
    }
}
