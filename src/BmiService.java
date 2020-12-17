public class BmiService {
    public double calculate(float bodyMass, double growth) {
        double index = bodyMass / (growth * growth);
        return index;
    }
}
