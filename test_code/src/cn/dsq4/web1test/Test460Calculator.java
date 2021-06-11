package cn.dsq4.web1test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author: 段市庆
 * @date: 2021/6/11 16:07
 */
public class Test460Calculator {

    @Test
    @DisplayName("新名称")
    public void testAdd(){
        cn.dsq4.web1.Test460Calculator clac = new cn.dsq4.web1.Test460Calculator();
        clac.add(4,5);
        //断言操作
        Assertions.assertEquals(9,clac.add(4,5));
    };
}
