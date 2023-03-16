package com.example.githubactionpractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeArithmeticTest {

    @Test
    @DisplayName("더하기 테스트")
    public void AddTest() throws Exception{
        int first = 1;
        int second = 2;
        ComputeArithmetic computer = new ComputeArithmetic();
        Assertions.assertThat(computer.add(first,second))
                .isEqualTo(first + second);
    }

    @Test
    @DisplayName("빼기 테스트")
    public void minusTest() throws Exception{
        int first = 1;
        int second = 2;
        ComputeArithmetic computer = new ComputeArithmetic();
        Assertions.assertThat(computer.minus(first,second))
                .isEqualTo(first - second);
    }
}