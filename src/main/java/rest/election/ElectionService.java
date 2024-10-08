package tradearea.warehouse;

import org.springframework.stereotype.Service;

@Service
public class ElectionService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public tradearea.model.ElectionData getElectionData(String inID ) {
    	
    	tradearea.warehouse.ElectionSimulation simulation = new tradearea.warehouse.ElectionSimulation();
        return simulation.getData( inID );
        
    }
    
}