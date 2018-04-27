package currency;

public class Main {
    public static void main(String[] args) {
        Currency usD = new USD();
        Currency eu = new EU();
        Currency britP = new BRITP();
        Currency indR = new INDR();
        Currency austD = new AUSD();
        Currency canD = new CAND();
        Currency singD = new SINGD();
        Currency swissF = new SWISSF();
        Currency malayR = new MALAYR();
        Currency japY = new JAPY();
        Currency chinR = new CHINR();

        // FORMAT
        // ------
        // Currency.convertAmountTo(amount, newCurrency);

        double amount = 10;

        double amountOfEuros = usD.convertAmountTo(amount, eu);
        double amountOfUSDollars = eu.convertAmountTo(amount, usD);

        System.out.println(amount + " US dollars is " + amountOfEuros + " euros");
        System.out.println(amount + " euros is " + amountOfUSDollars + " US dollars");
    }
}
