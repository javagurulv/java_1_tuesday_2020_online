package student_valerija_ionova.lesson_7.level_x.super_task_3_6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsuranceObject {

	private InsuranceObjectType insuranceObjectType;
	private BigDecimal cadastralValue;
	private List<InsuranceRisk> insuranceRisks;
	private List<SubInsuranceObject> subInsuranceObjects;

	public InsuranceObject(InsuranceObjectType insuranceObjectType,
                           BigDecimal cadastralValue) {
		this.insuranceObjectType = insuranceObjectType;
		this.cadastralValue = cadastralValue;
		this.subInsuranceObjects = new ArrayList<>();
		this.insuranceRisks = new ArrayList<>();
	}

	public void addSubInsuranceObject(SubInsuranceObject subInsuranceObject) {
		this.subInsuranceObjects.add(subInsuranceObject);
	}

	public void addInsuranceRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
	}

	public InsuranceObjectType getInsuranceObjectType() {
		return insuranceObjectType;
	}

	public List<SubInsuranceObject> getSubInsuranceObjects() {
		return subInsuranceObjects;
	}

	public List<InsuranceRisk> getInsuranceRisks() {
		return insuranceRisks;
	}

	public BigDecimal getCadastralValue() {
		return cadastralValue;
	}
}
