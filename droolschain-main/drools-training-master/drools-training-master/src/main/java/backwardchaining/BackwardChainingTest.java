package backwardchaining;

import model.Patient;
import org.kie.api.KieServices;

import org.kie.api.runtime.KieSession;

import java.util.*;

public class BackwardChainingTest {

	public static void main(String[] args) {
		try {
			
	      KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("backwardcainingstep1");
		  Patient patient = new Patient("123", "R13.19,E64.0,K21.9", "Active", "2022-07-04","N");
			String[] codes = patient.getCode().split(",");
			Set<String> redFlag = new HashSet<>();
			Boolean isRisk=false;

			for(String code : codes){
				if(code.contains("R13.1") || code.contains("R13.19") || code.contains("R13.12") || code.contains("R13.13") || code.contains("R13.14")){
					redFlag.add("Dysphagia");
					patient.setIsRisk(true);

				}
				if( (code.contains("R63.4") || code.contains("E64.0") || code.contains("E46") || code.contains("E44.0") || code.contains("E44.1"))){
					redFlag.add("Weight Loss");
					patient.setIsRisk(true);
				}
				if(code.contains("R68.81")){
					redFlag.add("Early Satiety");
					patient.setIsRisk(true);
				}
			}
            patient.setRiskFlag(redFlag);




					ksession.insert(patient);

		  ksession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}


	}

}
