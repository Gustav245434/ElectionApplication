package tradearea.model;

import rest.model.CountingData;
import rest.model.Party;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ElectionData {
	
	private String electionID;
	private String electionName;
	private String timestamp;
	private String electionRegionAddress;
	private String electionPostalCode;
	private String electionFederalState;
	private List<Party> parties;

	public String getElectionRegionAddress() {
		return electionRegionAddress;
	}

	public void setElectionRegionAddress(String electionRegionAddress) {
		this.electionRegionAddress = electionRegionAddress;
	}

	public String getElectionPostalCode() {
		return electionPostalCode;
	}

	public void setElectionPostalCode(String electionPostalCode) {
		this.electionPostalCode = electionPostalCode;
	}

	public String getElectionFederalState() {
		return electionFederalState;
	}

	public void setElectionFederalState(String electionFederalState) {
		this.electionFederalState = electionFederalState;
	}

	public void setCountingData(List<Party> data) {
		this.parties = data;
	}

	public List<Party> getCountingData() {
		return this.parties;
	}

	/**
	 * Constructor
	 */
	public ElectionData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getRegionID() {
		return electionID;
	}

	public void setRegionID(String warehouseID) {
		this.electionID = warehouseID;
	}

	public String getRegionName() {
		return electionName;
	}

	public void setRegionName(String warehouseName) {
		this.electionName = warehouseName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		return String.format("Warehouse Info: ID = %s, timestamp = %s", electionID, timestamp);
	}
}
