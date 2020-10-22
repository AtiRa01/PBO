public class DCInterface {
    public static void main(String args[]) {
        DCInterface main = new DCInterface();
        main.testCase();
    }

    public void testCase() {
        NameProduct product = new NameProduct("Wardah", "Rp. 1.350.000,-", "2");
        Categories Ati = new Categories("Lipstik, Foundation", "Baju, Celana", "set Pizza");
        Categories Suci = new Categories(Ati);

        Suci.setMakeUp("Mascara, Eyeliner");
        Suci.setFashion("Gamis, Rok");
        Suci.setFood("D'Top Spicy Cheese");

        System.out.println(Ati);
        System.out.println(Suci);
    }

}
