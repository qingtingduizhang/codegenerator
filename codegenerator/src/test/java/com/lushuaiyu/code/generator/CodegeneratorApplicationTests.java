package com.lushuaiyu.code.generator;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
class CodegeneratorApplicationTests {

    @Test
    void contextLoads() {

        // 男生人数
        Integer man = 125;

        // 女生人数
        Integer women = 50;

        BigDecimal ma = new BigDecimal(String.valueOf(man));
        BigDecimal wom = new BigDecimal(String.valueOf(women));
        BigDecimal percentage = new BigDecimal("100");

        // 女生人数的比例
        int divide = wom.divide(ma.add(wom), 2, BigDecimal.ROUND_HALF_UP).multiply(percentage).intValue();

        // 男生人数的比例
        int divide1 = ma.divide(ma.add(wom), 2, BigDecimal.ROUND_HALF_UP).multiply(percentage).intValue();
        System.out.println("women is percentage: " + divide + "and women number is: " + wom);
        System.out.println("man is percentage: " + divide1 + "and men number is: " + ma);
    }

    @Test
    public void strTest(){
        String str = "1";
        List<String> collect = Arrays.stream(str.split(",")).collect(Collectors.toList());
        System.out.println(new Gson().toJson(collect));
    }

    @Test
    public void additiveInverse(){

        Integer a = 0;
        Integer b = 0;
        System.out.println(a.equals(b));
    }

}
