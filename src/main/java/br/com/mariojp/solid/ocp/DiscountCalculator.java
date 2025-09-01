package br.com.mariojp.solid.ocp;
import java.util.Map;

public class DiscountCalculator {
    private Map<CustomerType, DiscountPolicy>polMap;

    public DiscountCalculator(Map<CustomerType, DiscountPolicy>polMap){
        this.polMap = polMap;
    }

    public double apply(double amount, CustomerType type){
        DiscountPolicy dipolicy = polMap.get(type);

        if (dipolicy == null) {
            return amount;
        }else{
            return dipolicy.apply(amount);
        }
    }
}
