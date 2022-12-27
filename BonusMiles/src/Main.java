public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int prise = 10_000;
        int miles = service.calculate(prise);
        System.out.println();
        System.out.println("Бонусные мили: " + miles);

    }
}
