public class BmiService {
    public int calculate(int waist, int growth) {
        int result = (waist / (growth * growth));
        return result;

    }
}
