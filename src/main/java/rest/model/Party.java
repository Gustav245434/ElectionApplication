package rest.model;

import java.util.List;

public class Party {

    private String partyID;
    private int amountVotes;
    private List<PreferredVote> preferredVotes;

    public List<PreferredVote> getPreferredVotes() {
        return preferredVotes;
    }

    public void setPreferredVotes(List<PreferredVote> preferredVotes) {
        this.preferredVotes = preferredVotes;
    }

    public Party() {}

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public void setAmountVotes(int amountVotes) {
        if(amountVotes < 0) return;
        this.amountVotes = amountVotes;
    }

}
