package uk.gov.hmcts.reform.dev.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.ResponseEntity.ok;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.gov.hmcts.reform.dev.models.Case;
import uk.gov.hmcts.reform.dev.models.CaseDB;




@RestController
public class CaseController {

    @Autowired
    CaseDB cases;

    @GetMapping(value = "/get-example-case", produces = "application/json")
    public ResponseEntity<Case> getCase() {
        return ok(new Case(1, "ABC12345", "Case Title",
                                  "Case Description", "Case Status", LocalDateTime.now()
        ));
    }  
    
    @GetMapping("/createProduct/{caseNumber}/{title}/{desc}/{status}")
    public ResponseEntity<Object> createCase(@PathVariable String caseNumber, @PathVariable String title, @PathVariable String desc, @PathVariable String status){
        cases.addCases(new Case(1, caseNumber, title ,desc, status, LocalDateTime.now()));
        return ok("Product Created");
    }

    @GetMapping("/LastCase") //Change to task by ID
    public ResponseEntity<Object> getCaseAdded() {
        return ok(cases.getLastEle());
    }

    @GetMapping("/deleteCase") //Implement these 
    public ResponseEntity<Object> deleteCase(){
        return ok("case deleted");
    }
    
    @GetMapping("/allCases")
    public ResponseEntity<Object> getAllCases() {
        return ok("All Cases");
    }

    @GetMapping("/updateTask")
    public ResponseEntity<Object> updateTask(){
        return ok("updated");
    }    
}
