package generators;

import person.models.appearance.Appearance;
import person.models.appearance.Hair;
import person.models.appearance.enums.EyesColor;
import person.models.appearance.enums.HairColor;

public class AppearanceGenerator implements Generator {

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: из enum по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public Appearance generate(final int code) {
        final int i = code % 100 / 10;
        String eyes = EyesColor.values()[i / 2].name().toLowerCase();
        String hairColor = null;
        if (i > 0) {
            hairColor = HairColor.values()[i - 1].name().toLowerCase();
        }
        return new Appearance(eyes, new Hair(i, hairColor));
    }

}

