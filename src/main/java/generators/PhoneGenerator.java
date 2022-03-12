package generators;

import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PhoneGenerator implements Generator {

    private final Random random = new Random();

    /**
     * Номер телефона генерируется следующим образом:
     * +79[сумма цифр в коде][3 случайных цифры][код].
     */
    @Override
    public Phone generate(final int code) {
        final String number = "+79"
                + String.format("%02d", MyMath.getDigitsSum(code))
                + String.format("%03d", random.nextInt(1000))
                + String.format("%04d", code);
        return new Phone(number);
    }
}

