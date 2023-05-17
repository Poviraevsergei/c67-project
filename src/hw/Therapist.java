package hw;

public class Therapist extends Doctor {

    void treat() {
        System.out.println("Therapist prescribes medication");
    }

    void appointDoctor(Patient ob) {
        switch (ob.getTreatmentPlan()) {
            case 1 -> ob.setDoctor(new Surgeon());
            case 2 -> ob.setDoctor(new Dentist());
            default -> ob.setDoctor(new Therapist());
        }
        ob.getDoctor().treat();
    }
}
