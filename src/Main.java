public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
<<<<<<< HEAD
        int miles = service.calculate(price);
=======
        int miles = service.calculate(price); 
>>>>>>> 75334fc6c0319d5c3c1a292b76fd132d37c858ce
        System.out.println(miles);
    }
}