package org.example;

public class Main {
    public static void main(String[] args){
        AmazonStock amzStock = new AmazonStock("$", 1000);

        PrivateInvestor privateInvestor = new PrivateInvestor("John Doe", amzStock);
        PublicInvestor publicInvestor = new PublicInvestor("VOO", amzStock);

        amzStock.set_price(1001);
        amzStock.set_price(1000);
        amzStock.detachInvestor(publicInvestor);

        amzStock.set_price(1002);



        // 1. Identify wrong dependencies
        // 2. Improve code
        // 3. Think what other pattern(s) could be used to make code as SOLID as possible
        // 4. Implement both versions of Observer, one that only sends the notification and the other that also sends info about what has changed
    }
}
