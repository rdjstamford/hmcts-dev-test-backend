package uk.gov.hmcts.reform.dev.models;
import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class CaseDB {

    private static ArrayList<Case> cases;

    private int id = 0;

    public CaseDB(){
        cases = new ArrayList<>();
     }

   public int getId(){
     id += 1;
     return id;
   }

   public void addCases(Case x){
        cases.add(x);
     }

   public Case getLastEle(){
        return cases.getLast();
     }

   public void delCase(int id){
          cases.remove(id-1);
     }

   public void delCase(){
          cases.remove(cases.size()-1);
     }

     public ArrayList<Case> entries(){
          return cases;
     }
}

