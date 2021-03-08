package _review_oop.oop_java_1.excercise2;

public class AcountBank {
    private long numbercount;
    private String nameAcount;
    private double moneyAcount=50;
    private static double interestRate=0.035;

    public AcountBank() {
    }

    public AcountBank(long numbercount, String nameAcount) {
        this.numbercount = numbercount;
        this.nameAcount = nameAcount;
    }

    public AcountBank(long numbercount, String nameAcount, double moneyAcount) {
        this.numbercount = numbercount;
        this.nameAcount = nameAcount;
        this.moneyAcount = moneyAcount;
    }

    public long getNumbercount() {
        return numbercount;
    }

    public void setNumbercount(long numbercount) {
        this.numbercount = numbercount;
    }

    public String getNameAcount() {
        return nameAcount;
    }

    public void setNameAcount(String nameAcount) {
        this.nameAcount = nameAcount;
    }

    public double getMoneyAcount() {
        return moneyAcount;
    }

    public void setMoneyAcount(double moneyAcount) {
        this.moneyAcount = moneyAcount;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        AcountBank.interestRate = interestRate;
    }
    public void recharge(double money){
        setMoneyAcount(money+getMoneyAcount());
    }
    public void withDraw(double moeney){
         setMoneyAcount(getMoneyAcount()-(moeney)+1);
    }
    public void expireDate(){
        setMoneyAcount(getMoneyAcount()+getMoneyAcount()*interestRate);
    }
    

    @Override
    public String toString() {
        return "AcountBank{" +
                "numbercount=" + numbercount +
                ", nameAcount='" + nameAcount + '\'' +
                ", moneyAcount=" + moneyAcount +"$"+
                '}';
    }
}
