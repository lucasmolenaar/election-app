package nl.novi.basicprogramming;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Election election = new Election();

        election.prepareCandidates();
        System.out.println();
        election.prepareVoters();

    }
}
