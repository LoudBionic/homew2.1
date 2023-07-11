// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int check = 100;
        int replenishment = 1400;

        int bonus = replenishment/100;

        if (replenishment < 1000) {
            bonus = 0;
        }


        System.out.println(check + replenishment);
        System.out.println(bonus);

    }

}
