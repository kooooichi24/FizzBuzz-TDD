package tddbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * FizzBuzz クラスをテストするためのクラス
 */
@DisplayName("FizzBuzz 数列と変換規則を扱う FizzBuzz クラス")
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeEach
    void 前準備() {
        fizzbuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは数を文字列に変換する {
        @Nested
        class _3の倍数のときは数の代わりにFizzに変換する {
            @Test
            public void _3を渡すと文字列Fizzを返す() {
                assertEquals("Fizz", fizzbuzz.convert(3));
            }
        }

        @Nested
        class _5の倍数のときは数の代わりにBuzzに変換する {
            @Test
            public void _5を渡すと文字列Buzzを返す() {
                assertEquals("Buzz", fizzbuzz.convert(5));
            }
        }

        @Nested
        class _3と5両方の倍数のときは数の代わりにFizzBuzzに変換する {
            @Test
            public void _15を渡すと文字列FizzBuzzを返す() {
                assertEquals("FizzBuzz", fizzbuzz.convert(15));
            }
        }

        @Nested
        class その他の数のときはそのまま文字列に変換する {
            @Test
            public void _1を渡すと文字列1を返す() {
                assertEquals("1", fizzbuzz.convert(1));
            }
        }
    }
}
