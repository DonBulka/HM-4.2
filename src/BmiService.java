public class BmiService {
    public int calculate(int waist, int growth) {
        int result = (waist / (growth * 2));
        return result;

    }
}
