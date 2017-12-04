package ru.valery.plugins;

public class UserPlugin implements BinaryPlugin{

    @Override
    public Double calculate(Double aDouble, Double aDouble2) {
        if(aDouble2==null || aDouble2.equals(0.0))
            return Double.NaN;
        return (aDouble==null?0.0:aDouble) / (aDouble2==null?0.0:aDouble2);
    }

    @Override
    public boolean isHighPriority() {
        return true;
    }

    @Override
    public String operatorName() {
        return "/";
    }
}
