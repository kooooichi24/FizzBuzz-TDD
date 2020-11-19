package tddbc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void _1を渡すと文字列1を返す() {
        // 準備
        FizzBuzz fizzbuzz = new FizzBuzz();
        // 実行 & 検証
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    public void _2を渡すと文字列2を返す() {
        // 準備
        FizzBuzz fizzbuzz = new FizzBuzz();
        // 実行 & 検証
        assertEquals("2", fizzbuzz.convert(2));
    }
}
