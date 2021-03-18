package nl.novi.basicprogramming;

public class Election {
    // Nieuwe partijen aanmaken
    private Party vvd = new Party("VVD");
    private Party d66 = new Party("D66");
    private Party fvd = new Party("Forum voor Democratie");

    // Nieuwe kandidaten aanmaken
    private Candidate rutte = new Candidate("Mark", "Rutte", vvd, true);
    private Candidate becker = new Candidate("Bente", "Becker", vvd, false);
    private Candidate kaag = new Candidate("Sigrid", "Kaag", d66, true);
    private Candidate baudet = new Candidate("Thierry", "Baudet", fvd, true);

    // Nieuwe stemmers maken
    private Voter voter1 = new Voter("Piet", "Arends", vvd);
    private Voter voter2 = new Voter("Jan", "Janssen", d66);
    private Voter voter3 = new Voter("Sjaak", "Pronk", fvd);

    // Methodes
    public void prepareCandidates() {
        rutte.talk();
        becker.talk();
        kaag.talk();
        baudet.talk();
    }

    public void prepareVoters() {
        voter1.talk();
        voter2.talk();
        voter3.talk();
    }
}
