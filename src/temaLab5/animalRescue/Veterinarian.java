package temaLab5.animalRescue;

public class Veterinarian extends Human {

    private String specialisation;

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    @Override
    public void activity() {
        System.out.println("Treating a dog");
    }

    @Override
    public void hobby() {
        System.out.println("The favourite hobby is camping");
    }
}
