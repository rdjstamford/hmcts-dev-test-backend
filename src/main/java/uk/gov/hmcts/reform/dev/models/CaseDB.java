package uk.gov.hmcts.reform.dev.models;
import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class CaseDB {

    private static ArrayList<Case> cases;

    public CaseDB(){
        cases = new ArrayList<>();
    }


   public void addCases(Case x){
        cases.add(x);
   }

   public Case getLastEle(){
        return cases.getLast();
   }
}

