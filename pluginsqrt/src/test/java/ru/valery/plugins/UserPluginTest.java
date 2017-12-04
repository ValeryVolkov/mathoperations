package ru.valery.plugins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class UserPluginTest {
    private static UnaryPlugin plugin;


    @BeforeAll
    static void init(){
        plugin = new UserPlugin();
    }
    @Test
    void calculate() {
        Assertions.assertEquals(plugin.calculate(16.0).doubleValue(),4.0);
        Assertions.assertEquals(plugin.calculate(25.0).doubleValue(),5.0);
        Assertions.assertEquals(plugin.calculate(-1.0).doubleValue(),Double.NaN);
        Assertions.assertEquals(plugin.calculate(0.0).doubleValue(),0.0);
        Assertions.assertEquals(plugin.calculate(null).doubleValue(),0.0);
    }

    @Test
    void operatorName() {
        Assertions.assertEquals(plugin.operatorName(),"SQRT");
    }

}