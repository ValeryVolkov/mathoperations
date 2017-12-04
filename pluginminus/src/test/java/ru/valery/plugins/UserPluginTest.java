package ru.valery.plugins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class UserPluginTest {
    private static BinaryPlugin plugin;

    @Test
    void isHighPriority() {
        Assertions.assertFalse(plugin.isHighPriority());
    }
    @BeforeAll
    static void init(){
        plugin = new UserPlugin();
    }
    @Test
    void calculate() {
        Assertions.assertEquals(plugin.calculate(10.0, 11.0).doubleValue(),-1.0);
        Assertions.assertEquals(plugin.calculate(-1.0, 11.0).doubleValue(),-12.0);
        Assertions.assertEquals(plugin.calculate(null, 11.0).doubleValue(),-11.0);
        Assertions.assertEquals(plugin.calculate(11.0, null).doubleValue(),11.0);
        Assertions.assertEquals(plugin.calculate(null, null).doubleValue(),0.0);
    }

    @Test
    void operatorName() {
        Assertions.assertEquals(plugin.operatorName(),"-");
    }

}