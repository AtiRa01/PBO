public class ShallowCopy {
    public static void main(String args[]) {
        ShallowCopy main = new ShallowCopy();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        NameProduct product = new NameProduct("Wardah", "Rp. 1.350.000,-", "2");
        Categories Ati = new Categories("Lipstik, Foundation", "Baju, Celana", "set Pizza");

        Categories Suci = new Categories(
                Ati.getMakeUp(), Ati.getFashion(), Ati.getAFood());

        Suci.setMakeUp("Mascara, Eyeliner");
        Suci.setFashion("Gamis, Rok");
        Suci.setFood("D'Top Spicy Cheese");

        System.out.println(Ati);
        System.out.println(Suci);
    }
}
