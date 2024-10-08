package tradearea.warehouse;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

@RestController
public class ElectionController {

    @Autowired
    private tradearea.warehouse.ElectionService service;
	
    @RequestMapping("/")
    public String warehouseMain() {
    	String mainPage = "Generator für die Erzeugung eine Wahlergebnisses!<br/><br/>" +
                          "<a href='http://localhost:8080/election/001/json'>Link to election/001/json</a><br/>" +
                          "<a href='http://localhost:8080/election/001/xml'>Link to election/001/xml</a><br/>";
        return mainPage;
    }

    @RequestMapping(value="/election/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public tradearea.model.ElectionData electionDataJSON(@PathVariable String inID ) {
        return service.getElectionData( inID );
    }

    @RequestMapping(value="/election/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public tradearea.model.ElectionData electionDataXML(@PathVariable String inID ) {
        return service.getElectionData( inID );
    }

}