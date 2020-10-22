public class Categories {

    public String MakeUp;
    public String Fashion;
    public String Food;

    // standard constructors, getters and setters

    public Categories(Categories product) {
        this(product.getMakeUp(), product.getFashion(), new String(product.getAFood()));
    }

    public Categories(String MakeUp, String Fashion, String Food) {
        this.MakeUp = MakeUp;
        this.Fashion = Fashion;
        this.Food = Food;
    }

    public String getMakeUp() {
        return MakeUp;
    }

    public void setMakeUp(String MakeUp) {
        this.MakeUp = MakeUp;
    }

    public String getFashion() {
        return Fashion;
    }

    public void setFashion(String Fashion) {
        this.Fashion = Fashion;
    }

    public String getAFood() {
        return Food;
    }

    public void setFood(String Food) {
        this.Food = Food;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "MakeUp='" + MakeUp + '\'' +
                ", Fashion='" + Fashion + '\'' +
                ", Food=" + Food +
                '}';
    }
}
