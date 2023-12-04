package org.example;

public class PrivateInvestor implements IInvestor {
    private Stock _stock;
    private String _investorName;

    public PrivateInvestor(String investorName, Stock stock)
    {
        _stock = stock;
        _investorName = investorName;
        stock.attachInvestor(this);
    }

    @Override
    public void update() {
        System.out.println(_investorName + " has been notified that the new stock price is "+_stock.getStockInfo());
    }
}
