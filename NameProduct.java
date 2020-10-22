public class NameProduct {

    public String Brand;
    public String Prize;
    public String Amount;

    public NameProduct(String Brand, String Prize, String Amount) {
        this.Brand = Brand;
        this.Prize = Prize;
        this.Amount = Amount;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getPrize() {
        return Prize;
    }

    public void setPrize(String Prize) {
        this.Prize = Prize;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "NameProduct{" +
                "Brand='" + Brand + '\'' +
                ", Prize='" + Prize + '\'' +
                ", Amount='" + Amount + '\'' +
                '}';
    }
}
