package generators;

import person.models.Fio;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator implements Generator {

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     */
    @Override
    public Fio generate(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        final String lastName = getLinesFromFile("lastNames_" + sex).get(lastNameIndex);
        final String firstName = getLinesFromFile("names_" + sex).get(getDigitsSum(code / 100));
        final String middleName = getLinesFromFile("middleNames_" + sex).get(getDigitsSum(code % 100));
        return new Fio(lastName, firstName, middleName);
    }

}

