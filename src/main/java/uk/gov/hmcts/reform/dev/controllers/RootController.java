package uk.gov.hmcts.reform.dev.controllers;

import org.springframework.http.ResponseEntity;
import static org.springframework.http.ResponseEntity.ok;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return ok("Welcome to test-backend");
    }

    @GetMapping("/create")
    public ResponseEntity<String> create() {
        return ok("Created.");
        
        //placeholder, create code to create entry
    }

    @DeleteMapping("/1")
    public ResponseEntity<Object> delete() {
        //placeholder, create code to delete entry
        return ok("Deleted.");

    }

}
