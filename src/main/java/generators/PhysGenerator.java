package generators;

import person.models.Physical;

public class PhysGenerator implements Generator {

    private static final int MIN_AGE = 10;
    private static final int MIN_HEIGHT = 100;
    private static final int MOD = 10;
    private static final int MIN_WEIGHT = 30;
    private static final double METER = 100.00;

    /**
     * Физические параметры генерируются по второй цифре кода:
     * Возраст: 10..100
     * Вес: 30..120 кг
     * Рост: 1..1,9 м.
     */
    @Override
    public Physical generate(final int code) {
        final int i = code % 1000 / 100;
        int age = (i + 1) * MIN_AGE;
        int weight = MIN_WEIGHT + i * MOD;
        double height = (MIN_HEIGHT + i * MOD) / METER;
        return new Physical(age, weight, height);
    }
}
