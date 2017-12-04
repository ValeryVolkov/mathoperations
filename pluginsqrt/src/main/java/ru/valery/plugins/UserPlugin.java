package ru.valery.plugins;

public class UserPlugin implements UnaryPlugin{

    @Override
    public String operatorName() {
        return "SQRT";
    }

    @Override
    public Double calculate(Double aDouble) {
        if(aDouble==null)
            return 0.0;
        if(aDouble<0)
            return Double.NaN;
        return Math.sqrt(aDouble);
    }
}
