package tddbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * FizzBuzz クラスをテストするためのクラス
 */
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeEach
    void 前準備() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void _1を渡すと文字列1を返す() {
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    public void _2を渡すと文字列2を返す() {
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    public void _3を渡すと文字列Fizzを返す() {
        assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    public void _5を渡すと文字列Buzzを返す() {
        assertEquals("Buzz", fizzbuzz.convert(5));
    }
}
