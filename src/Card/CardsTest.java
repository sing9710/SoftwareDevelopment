package Card;

public class CardsTest {

    public static void main(String[] args) {
        Cards c1 = new Cards();
        String arr[] = new String[52];
        int a;
        String suit[] = {"Heart", "Spades", "Clubs", "Diamonds"};
        for (int i = 0; i <= 51; i++) {
            a = (int) (Math.random() * 4);
            switch (a) {
                case 0:
                    c1.cardShape = suit[0];
                    break;
                case 1:
                    c1.cardShape = suit[1];
                    break;
                case 2:
                    c1.cardShape = suit[2];
                    break;
                case 3:
                    c1.cardShape = suit[3];
                    break;
                default:
                    break;
            }
            arr[i] = c1.cardShape;
        }
        for (int i = 0; i <= 51; i++) {
            System.out.println(arr[i]);
        }
    }

}
