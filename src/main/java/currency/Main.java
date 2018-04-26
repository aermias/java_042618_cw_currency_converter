package currency;

public class Main {
    public static void main(String[] args) {
        Currency USD = new Currency("US Dollar", 1);
        Currency EU = new Currency("Euro", 0.94);
        Currency BRITP = new Currency("British Pound", 0.82);
        Currency IND = new Currency("Indian Rupee", 68.32);
        Currency AUSTD = new Currency("Australian Dollar", 1.35);
        Currency CAND = new Currency("Canadian Dollar", 1.32);
        Currency SINGD = new Currency("Singapore Dollar", 1.43);
        Currency SWISSF = new Currency("Swiss Franc", 1.01);
        Currency MALAYR = new Currency("Malaysian Ringgit", 4.47);
        Currency JAPY = new Currency("Japanese Yen", 115.82);
        Currency CHINYR = new Currency("Chinese Yuan Renminbi", 6.92);

        // FORMAT
        // ------
        // Currency.convertAmountTo(amount, newCurrency);

        double amount = 10;

        double amountOfEuros = USD.convertAmountTo(amount, EU);
        double amountOfUSDollars = EU.convertAmountTo(amount, USD);

        System.out.println(amount + " US dollars is " + amountOfEuros + " euros");
        System.out.println(amount + " euros is " + amountOfUSDollars + " US dollars");
    }
}
