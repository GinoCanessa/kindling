package org.hl7.fhir.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.utilities.StandardsStatus;

public class OperationParameter {

  private String name;
  private String use;
  private String doc;
  private int min;
  private String max;
  private String fhirType;
  private String searchType;
  private String profile;
  private List<OperationParameter> parts;
  private BindingSpecification bs;
  private StandardsStatus status;
  private List<String> scopes = new ArrayList<>();

  public OperationParameter(String name, String use, String doco, int min, String max, String fhirType, String searchType, String profile, StandardsStatus status) {
    this.name = name; 
    this.use = use;
    this.doc = doco; 
    this.min = min; 
    this.max = max; 
    this.fhirType = fhirType;
    this.searchType = searchType;
    this.profile = profile;
    this.status = status;
    if (fhirType.equals("Tuple"))
      parts = new ArrayList<OperationParameter>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public String getDoc() {
    return doc;
  }

  public void setDoc(String doc) {
    this.doc = doc;
  }

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public String describeCardinality() {
    return Integer.toString(min)+".."+max;
  }

  public List<OperationParameter> getParts() {
    if (parts == null) {
      parts = new ArrayList<>();
    }
    return parts;
  }

  public BindingSpecification getBs() {
    return bs;
  }

  public void setBs(BindingSpecification bs) {
    this.bs = bs;
  }

  public String getFhirType() {
    return fhirType;
  }

  public void setFhirType(String fhirType) {
    this.fhirType = fhirType;
  }

  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }

  public boolean hasBinding() {
    return bs != null;
  }

  public BindingSpecification getBinding() {
    return bs;
  }

  public StandardsStatus getStatus() {
    return status;
  }

  public List<String> getScopes() {
    return scopes;
  }

}
