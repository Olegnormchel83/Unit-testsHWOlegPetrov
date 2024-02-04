import seminars.first.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));

        double validBreadPrice = 35;
        double validDiscountPercent = 15;
        //Корректные цена и скидка
        System.out.println("calculateDiscount(breadPrice, discount) = " + calculateDiscount(validBreadPrice, validDiscountPercent));

        double invalidBreadPrice = -35;
        //Цена меньше 0, корректная скидка
        //System.out.println("calculateDiscount(invalidBreadPrice, validDiscountPercent) = " + calculateDiscount(invalidBreadPrice, validDiscountPercent));

        double invalidDiscountPercent1 = 115;
        double invalidDiscountPercent2 = -115;
        //Корректная цена, но скидка больше 100%
        //System.out.println("calculateDiscount(validBreadPrice, invalidDiscountPercent1) = " + calculateDiscount(validBreadPrice, invalidDiscountPercent1));

        //Корректная цена, но скидка меньше 0%
        //System.out.println("calculateDiscount(validBreadPrice, invalidDiscountPercent2) = " + calculateDiscount(validBreadPrice, invalidDiscountPercent2));

        //Цена меньше 0, скидка больше 100%
        //System.out.println("calculateDiscount(invalidBreadPrice, invalidDiscountPercent1) = " + calculateDiscount(invalidBreadPrice, invalidDiscountPercent1));

        //Цена меньше 0, скидка меньше 0%
        //System.out.println("calculateDiscount(invalidBreadPrice, invalidDiscountPercent2) = " + calculateDiscount(invalidBreadPrice, invalidDiscountPercent2));

    }

    private static double calculateDiscount(double price, double discountPercent) {
        if (discountPercent <= 0 || discountPercent > 100) {
            throw new ArithmeticException("Invalid discount");
        }
        if (price < 0) {
            throw new ArithmeticException("Price can not be less then 0");
        }

        return price * (1 - discountPercent / 100);
    }
}