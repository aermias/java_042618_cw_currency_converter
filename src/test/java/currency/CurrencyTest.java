package currency;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {
    @Test
    public void DollarToEuroTest() {
        Currency usD = new USD();
        Currency eu = new EU();

        double expected = eu.getRate();
        double actual = usD.convertAmountTo(1, eu);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void EuroToDollarTest() {
        Currency eu = new EU();
        Currency usD = new USD();

        double expected = usD.getRate();
        double actual = eu.convertAmountTo(usD.getRate(), usD);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void EuroToBritishPoundTest() {
        Currency eu = new EU();
        Currency britP = new BRITP();

        double expected = britP.getRate();
        double actual = eu.convertAmountTo(eu.getRate(), eu);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void BritishPoundToIndianRupeeTest() {
        Currency britP = new BRITP();
        Currency indR = new INDR();

        double expected = indR.getRate();
        double actual = britP.convertAmountTo(britP.getRate(), indR);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void IndianRupeeToCanadianDollar() {
        Currency indR = new INDR();
        Currency canD = new CAND();

        double expected = canD.getRate();
        double actual = indR.convertAmountTo(indR.getRate(), canD);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void CanadianDollarToSingaporeDollar() {
        Currency canD = new CAND();
        Currency singD = new SINGD();

        double expected = singD.getRate();
        double actual = canD.convertAmountTo(canD.getRate(), singD);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void SingaporeDollarToSwissFranc() {
        Currency singD = new SINGD();
        Currency swissF = new SWISSF();

        double expected = swissF.getRate();
        double actual = singD.convertAmountTo(singD.getRate(), swissF);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void SwissFrancToMalaysianRinggit() {
        Currency swissF = new SWISSF();
        Currency malayR = new MALAYR();

        double expected = malayR.getRate();
        double actual = swissF.convertAmountTo(swissF.getRate(), malayR);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void MalaysianRinggitToJapaneseYen() {
        Currency malayR = new MALAYR();
        Currency japY = new JAPY();

        double expected = japY.getRate();
        double actual = malayR.convertAmountTo(malayR.getRate(), japY);

        Assert.assertEquals(expected, actual, 1.0);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi() {
        Currency japY = new JAPY();
        Currency chinR = new CHINR();

        double expected = chinR.getRate();
        double actual = japY.convertAmountTo(japY.getRate(), chinR);

        Assert.assertEquals(expected, actual, 1.0);
    }
}
