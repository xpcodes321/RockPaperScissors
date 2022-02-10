package utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class RPSTest {
    private RockPaperScissors underTest;

    @BeforeEach
    void setUp(){
        underTest = new RockPaperScissors();
    }


    @Test
    void TestRPS() {
        String RPSvalue = "2";

        //When
        boolean isValid = underTest.test(RPSvalue);

        //Then
        assertThat(isValid).isTrue();


    }


}