package currency;

class Currency {
    private final String name;
    private final double rate;

    Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    double convertAmountTo(double amount, Currency currency) {
        amount /= this.rate;
        amount *= currency.rate;
        amount = Math.round(amount * 100.0) / 100.0;

        return amount;
    }
}