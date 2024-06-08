package packagea;

public class Bear {
    private Bear pandaBear;
    private int numForks;

    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;

    }

    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;

        int numKnives;
        System.out.print("""
                "# forks = " + numForks +
                " # knives = " + numKnives +
                # cups = 0""");



        System.gc();
        System.out.println();
        System.out.println("Hello World ");
}
}