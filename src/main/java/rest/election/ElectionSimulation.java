package tradearea.warehouse;

import rest.model.CountingData;
import rest.model.Party;
import rest.model.PreferredVote;

import java.util.ArrayList;
import java.util.List;

public class ElectionSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public tradearea.model.ElectionData getData(String inID ) {
		
		tradearea.model.ElectionData data = new tradearea.model.ElectionData();
		data.setRegionID( inID );
		data.setRegionName( "Wien" );
		data.setElectionFederalState("Austria");
		data.setElectionRegionAddress("Darwingasse 2");
		data.setElectionPostalCode("1020");

		Party party = new Party();
		party.setPartyID("SPOE");
		party.setAmountVotes(200);

		PreferredVote preferredVote1 = new PreferredVote();
		preferredVote1.setName("Andi");
		preferredVote1.setListNumber(1);
		preferredVote1.setVoteCount(254);

		PreferredVote preferredVote2 = new PreferredVote();
		preferredVote1.setName("Thomas");
		preferredVote1.setListNumber(1);
		preferredVote1.setVoteCount(198);

		List<PreferredVote> preferredVotes = new ArrayList<>();
		preferredVotes.add(preferredVote1);

		party.setPreferredVotes(preferredVotes);

		Party party1 = new Party();
		party1.setPartyID("NEOS");
		party1.setAmountVotes(123);

		List<PreferredVote> preferredVotes2 = new ArrayList<>();
		preferredVotes.add(preferredVote2);
		party1.setPreferredVotes(preferredVotes2);

		List<Party> parties = new ArrayList<>();
		parties.add(party);
		parties.add(party1);

		data.setCountingData(parties);



		return data;
		
	}

}
