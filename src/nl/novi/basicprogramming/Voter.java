package nl.novi.basicprogramming;

public class Voter extends Person {

    private Party party;

    public Voter(String firstName, String lastName, Party party) {
        super(firstName, lastName);
        this.party = party;
    }

    @Override
    public void talk() {
        System.out.println("Mijn naam is " + getFullName() + " en ik stem op " + party.getName());
    }
}
