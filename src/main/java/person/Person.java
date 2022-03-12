package person;

import person.models.Fio;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

import java.util.Objects;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n")
                .append(phone);
        return sb.toString();
    }


    public static final class Builder {

        private final String id;
        private Fio fio;
        private Appearance appearance;
        private Physical phys;
        private Phone phone;

        public Builder(final String id) {
            this.id = id;
        }

        public Builder withFio(final Fio newFio) {
            fio = newFio;
            return this;
        }

        public Builder withPhysical(final Physical newPhys) {
            phys = newPhys;
            return this;
        }

        public Builder withAppearance(final Appearance newAppearance) {
            appearance = newAppearance;
            return this;
        }

        public Builder withPhone(final Phone newPhone) {
            phone = newPhone;
            return this;
        }


        public Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.phys = this.phys;
            person.fio = this.fio;
            person.appearance = this.appearance;
            person.phone = Objects.requireNonNullElseGet(this.phone, () -> new Phone("N/A"));
            return person;
        }
    }
}