package credit;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        BigDecimal creditValue = input.nextBigDecimal();
        BigDecimal interestRates = input.nextBigDecimal();
        BigDecimal rates = input.nextBigDecimal();
        CreditTemplate credit = new CreditTemplate(creditValue,interestRates,rates);
        for (int i = 0; i < credit.getCreditNumberOfRates().intValue(); i++) {
            System.out.println(credit.getCapitalRate());
            System.out.println(credit.jewishRate(credit.getCreditValue(), credit.getCreditInterestRate(), i));
        }
        System.out.println(credit.creditCosts());
        //System.out.println(credit.totalCredit(credit.getCreditNumberOfRates().remainder(BigDecimal.valueOf(12))));
        if (credit.getCreditNumberOfRates().remainder(BigDecimal.valueOf(12)).equals(BigDecimal.valueOf(0))) {
            System.out.println(credit.getTotalCredit().subtract(credit.totalCredit(credit.getCreditNumberOfRates().subtract(BigDecimal.valueOf(12)))));
        } else {
            System.out.println(credit.getTotalCredit().subtract(credit.totalCredit(credit.getCreditNumberOfRates().subtract(credit.getCreditNumberOfRates().remainder(BigDecimal.valueOf(12))))));

        }
    }
}
