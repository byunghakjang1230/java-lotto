package lotto.domain;

import java.util.Objects;

public class LottoNumber {
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;
    private final int numbers;

    public LottoNumber(int number) {
        validateOutOfRange(number);
        this.numbers = number;
    }

    public int getNumber() {
        return this.numbers;
    }

    private void validateOutOfRange(int number) {
        if (number < LOTTO_NUMBER_MIN || number > LOTTO_NUMBER_MAX) {
            throw new IllegalArgumentException("로또 번호는 1~45 사이의 숫자만 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return this.numbers == that.numbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
