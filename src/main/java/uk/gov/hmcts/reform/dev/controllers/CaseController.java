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
    
    @GetMapping("/createProduct/{caseNumber}/{title}/{desc}/{status}/{dueDate}")
    public ResponseEntity<Object> createCase(@PathVariable String caseNumber, @PathVariable String title, @PathVariable String desc, @PathVariable String status, @PathVariable String dueDate){
        int id = cases.getId();
        cases.addCases(new Case(id, caseNumber, title ,desc, status, dueDate, LocalDateTime.now()));
        return ok("Product Created");
    }

    @GetMapping("/LastCase") //Change to task by ID
    public ResponseEntity<Object> getCaseAdded() {
        return ok(cases.getLastEle());
    }

    @GetMapping("/deleteCase") //Implement these 
    public ResponseEntity<Object> deleteCase(){
        cases.delCase();
        return ok("case deleted");
    }
    
    @GetMapping("/deleteCase/{id}")
    public ResponseEntity<Object> deleteId(@PathVariable int id){
        cases.delCase(id);
        return ok("Case Deleted");
    }
    
    @GetMapping("/allCases")
    public ResponseEntity<Object> getAllCases() {
        return ok(cases.entries());
    }

    @GetMapping("/updateTask/{id}/{updateStr}")
    public ResponseEntity<Object> updateTask(@PathVariable int id, @PathVariable String updateStr){
        cases.update(id, updateStr);
        return ok("updated");
    }    
}
