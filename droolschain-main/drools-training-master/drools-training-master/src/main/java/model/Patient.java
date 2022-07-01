package model;

import org.kie.api.definition.type.Position;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Patient {



	@Position(0)
	private String patientId;
	@Position(1)
	private String code;

	@Position(2)
	private String status;

	@Position(3)
	private String timeframe;



	@Position(4)
	private String prefill;

	@Position(5)
    private Boolean isRisk;

	@Position(6)
	private Map<String, Set<String>> patientMap;

	@Position(7)
	private Set<String> riskFlag;


	public Patient(){}

	public Patient(String riskFlag, String code,String status,String timeframe,String prefill) {
		super();
		this.patientId = patientId;
		this.status = status;
		this.code = code;
		this.timeframe = timeframe;
		this.prefill=prefill;	}
	
	public String getPatientId() {
		return patientId;
	}
	
	public void setPatientId(String thing) {
		this.patientId = patientId;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsRisk() {
		return isRisk;
	}

	public void setIsRisk(Boolean isRisk) {
		this.isRisk = isRisk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String code) {
		this.status = status;
	}

	public Map<String,Set<String>> getPatientMap() {
		return patientMap;
	}

	public void setPatientMap(Map<String,Set<String>>  patientMap) {
		this.patientMap = patientMap;
	}

	public String getTimeframe() {return timeframe;}

	public void setTimeframe(String code) {
		this.timeframe = timeframe;
	}

	public Set<String> getRiskFlag() {
		return riskFlag;
	}

	public void setRiskFlag(Set<String> riskFlag) {
		this.riskFlag = riskFlag;
	}

	public String getPrefill() {return prefill;}

	public void setPrefill(String prefill) {
		this.prefill = prefill;
	}



	/*@Override
	public String toString() {
		return "Location [thing=" + thing + ", location=" + location + "]";
	}*/
	
	
	
}
