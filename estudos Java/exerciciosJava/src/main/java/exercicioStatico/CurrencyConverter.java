package exercicioStatico;

public class CurrencyConverter {

    public double dollarPrice;
    public double totalReais;
    public double valorCompra;
    public double iof = valorCompra * 6/100;

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double converter() {
        totalReais = (dollarPrice * valorCompra) + iof;
        return totalReais;

    }
}
