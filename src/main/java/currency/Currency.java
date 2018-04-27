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

    public String getName() { return name; }
    public double getRate() { return rate; }
}

class USD extends Currency {
    USD() { super("US Dollar", 1); }
}

class EU extends Currency {
    EU() { super("Euro", 0.94); }
}

class BRITP extends Currency {
    BRITP() { super("British Pound", 0.82); }
}

class INDR extends Currency {
    INDR() { super("Indian Rupee", 68.32); }
}

class AUSD extends Currency {
    AUSD() { super("Australian Dollar", 1.35); }
}

class CAND extends Currency {
    CAND() { super("Canadian Dollar", 1.32); }
}

class SINGD extends Currency {
    SINGD() { super("Singapore Dollar", 1.43); }
}

class SWISSF extends Currency {
    SWISSF() { super("Swiss Franc", 1.01); }
}

class MALAYR extends Currency {
    MALAYR() { super("Malaysian Ringgit", 4.47); }
}

class JAPY extends Currency {
    JAPY() { super("Japanese Yen", 115.82); }
}

class CHINR extends Currency {
    CHINR() { super("Chinese Yuan Renminbi", 6.92); }
}