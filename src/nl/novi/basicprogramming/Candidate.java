package nl.novi.basicprogramming;

public class Candidate extends Person {

    private Party currentParty;
    private boolean isPartyLeader;

    public Candidate(String firstName, String lastName, Party currentParty, boolean isPartyLeader) {
        super(firstName, lastName);
        this.currentParty = currentParty;
        this.isPartyLeader = isPartyLeader;
    }

    @Override
    public void talk() {
        if (isPartyLeader) {
            System.out.println("Mijn naam is " + getFullName() + " en ik ben lijsttrekker van de " + currentParty.getName());
        } else {
            System.out.println("Mijn naam is " + getFullName() + " en ik ben lid van de " + currentParty.getName());
        }
    }
}
