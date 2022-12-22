public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        if (cost > 10_000) {
            result = cost;
        } else {
            result = 10_000;
        }
        return result;
    }
}
