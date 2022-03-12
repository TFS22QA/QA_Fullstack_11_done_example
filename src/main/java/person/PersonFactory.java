package person;

import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;

public class PersonFactory {

    public static Person getPerson(final String code) {
        Person.Builder person = new Person.Builder(code);
        final int intCode = Integer.parseInt(code);
        person
                .withFio(new FioGenerator().generate(intCode))
                .withPhysical(new PhysGenerator().generate(intCode))
                .withAppearance(new AppearanceGenerator().generate(intCode));
        // добавляем телефон, только если введённый код не палиндром
        if (!code.equals(new StringBuilder(code).reverse().toString())) {
            person.withPhone(new PhoneGenerator().generate(intCode));
        }
        return person.build();
    }
}
