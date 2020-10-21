package credit;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CreditTemplate {
    private BigDecimal creditValue;
     private BigDecimal creditInterestRate;
    private BigDecimal creditNumberOfRates;
    private int alreadyPaidCapitalRates;

     public CreditTemplate(BigDecimal creditValue, BigDecimal creditInterestRate, BigDecimal creditNumberOfRates) {
         this.creditValue = creditValue;
         this.creditInterestRate = creditInterestRate;
         this.creditNumberOfRates = creditNumberOfRates;
     }

     public BigDecimal getCreditValue() {
         return creditValue;
     }

     public BigDecimal getCreditInterestRate() {
         return creditInterestRate;
     }

     public BigDecimal getCreditNumberOfRates() {
         return creditNumberOfRates;
     }

    public int getAlreadyPaidCapitalRates() {
        return alreadyPaidCapitalRates;
    }

    private BigDecimal capitalRate(BigDecimal creditValue, BigDecimal creditNumberOfRates){

         BigDecimal result = creditValue.divide(creditNumberOfRates,2, RoundingMode.HALF_UP);
         return result;
     }

     public BigDecimal getCapitalRate(){
         return capitalRate(getCreditValue(),getCreditNumberOfRates());
     }
     public BigDecimal jewishRate(BigDecimal creditValue, BigDecimal creditInterestRate,int alreadyPaidCapitalRates){
         BigDecimal finalCreditInterestRate = creditInterestRate.divide(BigDecimal.valueOf(100));
         return ((creditValue.subtract(BigDecimal.valueOf(alreadyPaidCapitalRates).multiply(BigDecimal.valueOf(1000)))).multiply(finalCreditInterestRate)).divide(BigDecimal.valueOf(12),2,RoundingMode.HALF_UP);
     }
     public BigDecimal getJewishRate(){
         return jewishRate(getCreditValue(),getCreditInterestRate(),getAlreadyPaidCapitalRates());
     }

     public BigDecimal totalCredit (BigDecimal creditNumberOfRates){
         return creditNumberOfRates.multiply((getCapitalRate().add(getJewishRate())));
     }

     public BigDecimal getTotalCredit (){
         return totalCredit(getCreditNumberOfRates());
     }

     public BigDecimal creditCosts(){
         return getTotalCredit().subtract(getCreditValue());
     }

 }