package rest.model;

import java.util.Arrays;

public class CountingData {
    private Party[] party;

    public CountingData() {
        this.party = new Party[0];
    }

    public Party[] getParty() {
        return this.party;
    }

    public void addParty(Party party) {
        Party[] parties = Arrays.copyOf(this.party, this.party.length + 1);
        parties[this.party.length] = party;
        this.party = parties;
    }
}
