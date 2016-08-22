/**
 * EServices_Document_Checklist__c.java
 * <p/>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

import com.google.gson.annotations.SerializedName;

//import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class holds EServices_Document_Checklist attributes
 * Note:this class contains documents generated from eServiceAdministration
 * and it is displayed when there is no documents attached to indicated service by copying them
 * to case and attach related documents to it
 */
public class EServices_Document_Checklist__c implements java.io.Serializable {

    @SerializedName("Id")
    public String Id;

//    @JsonProperty("Authority__c")
    @SerializedName("Authority__c")
    public String authority__c;
//    @JsonProperty("Available_for_Preview__c")
    @SerializedName("Available_for_Preview__c")
    public Boolean available_for_Preview__c;

    public Boolean chairperson__c;

    public Boolean corporate_Shareholder__c;

    public String createdById;

    public java.util.Calendar createdDate;

    public String currencyIsoCode;

    public String deployment_ID__c;

    public Boolean director__c;

    public String document_Required_for_Branch_or_LLC__c;

    @SerializedName("Document_Type__c")
//    @JsonProperty("Document_Type__c")
    public String document_Type__c;

    public String gender__c;

    public Boolean general_Manager__c;


    public Boolean individual_Shareholder__c;

//    @JsonProperty("Instructions__c ")
    @SerializedName("Instructions__c")
    public String instructions__c;

    public Boolean isDeleted;

    @SerializedName("Language__c")
//    @JsonProperty("Language__c")
    public String language__c;

    public java.util.Date lastActivityDate;

    public String lastModifiedById;

    public java.util.Calendar lastModifiedDate;

    public Boolean legal_Representative__c;


    public String loop_ID__c;

    @SerializedName("Name")
//    @JsonProperty("Name")
    public String name;

//    @JsonProperty("Original_can_be_Requested__c")
    @SerializedName("Original_can_be_Requested__c")
    public Boolean original_can_be_Requested__c;

    public String payment_eService__c;

    public EServiceAdministration payment_eService__r;

    @SerializedName("RecordType")
    public RecordType recordType;

    public String recordTypeId;

    public String record_Type_Name__c;

    public Boolean required_Original__c;
    @SerializedName("Required_Scan_copy__c")
//    @JsonProperty("Required_Scan_copy__c")
    public Boolean required_Scan_copy__c;

    public Boolean required_Template_from_DWC__c;

    public Boolean required_for_Specific_Naionalities__c;

    public Boolean required_for_Specific_Qualifications__c;

    public String requirements__c;

    public Boolean secretary__c;

    public java.util.Calendar systemModstamp;

    public String template_Attached_Id__c;

    @SerializedName("Template_Name_Link__c")
    public String template_Name_Link__c;

    @SerializedName("Type__c")
    public String type__c;

    public Boolean eCopy_can_be_Requested__c;

    public String eService_Administration__c;

    @SerializedName("eService_Administration__r")
    public EServiceAdministration eService_Administration__r;

    @SerializedName("EService_Type__c")
    public String eService_Type__c;
    @SerializedName("eCopy_Receiver_Email__c")
    public String eCopy_Receiver_Email__c;

    String tenId;
    String tenName;

    public String getTenId() {
        return tenId;
    }

    public void setTenId(String tenId) {
        this.tenId = tenId;
    }

    public String getTenName() {
        return tenName;
    }

    public void setTenName(String tenName) {
        this.tenName = tenName;
    }

    public EServices_Document_Checklist__c() {
    }

    /**
     * Gets the authority__c value for this EServices_Document_Checklist__c.
     *
     * @return authority__c
     */
    public String getAuthority__c() {
        return authority__c;
    }


    /**
     * Sets the authority__c value for this EServices_Document_Checklist__c.
     *
     * @param authority__c
     */
    public void setAuthority__c(String authority__c) {
        this.authority__c = authority__c;
    }


    /**
     * Gets the available_for_Preview__c value for this EServices_Document_Checklist__c.
     *
     * @return available_for_Preview__c
     */
    public Boolean getAvailable_for_Preview__c() {
        return available_for_Preview__c;
    }


    /**
     * Sets the available_for_Preview__c value for this EServices_Document_Checklist__c.
     *
     * @param available_for_Preview__c
     */
    public void setAvailable_for_Preview__c(Boolean available_for_Preview__c) {
        this.available_for_Preview__c = available_for_Preview__c;
    }



    /**
     * Gets the chairperson__c value for this EServices_Document_Checklist__c.
     *
     * @return chairperson__c
     */
    public Boolean getChairperson__c() {
        return chairperson__c;
    }


    /**
     * Sets the chairperson__c value for this EServices_Document_Checklist__c.
     *
     * @param chairperson__c
     */
    public void setChairperson__c(Boolean chairperson__c) {
        this.chairperson__c = chairperson__c;
    }


    /**
     * Gets the corporate_Shareholder__c value for this EServices_Document_Checklist__c.
     *
     * @return corporate_Shareholder__c
     */
    public Boolean getCorporate_Shareholder__c() {
        return corporate_Shareholder__c;
    }


    /**
     * Sets the corporate_Shareholder__c value for this EServices_Document_Checklist__c.
     *
     * @param corporate_Shareholder__c
     */
    public void setCorporate_Shareholder__c(Boolean corporate_Shareholder__c) {
        this.corporate_Shareholder__c = corporate_Shareholder__c;
    }


    /**
     * Gets the createdById value for this EServices_Document_Checklist__c.
     *
     * @return createdById
     */
    public String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this EServices_Document_Checklist__c.
     *
     * @param createdById
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this EServices_Document_Checklist__c.
     *
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this EServices_Document_Checklist__c.
     *
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this EServices_Document_Checklist__c.
     *
     * @return currencyIsoCode
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this EServices_Document_Checklist__c.
     *
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the deployment_ID__c value for this EServices_Document_Checklist__c.
     *
     * @return deployment_ID__c
     */
    public String getDeployment_ID__c() {
        return deployment_ID__c;
    }


    /**
     * Sets the deployment_ID__c value for this EServices_Document_Checklist__c.
     *
     * @param deployment_ID__c
     */
    public void setDeployment_ID__c(String deployment_ID__c) {
        this.deployment_ID__c = deployment_ID__c;
    }


    /**
     * Gets the director__c value for this EServices_Document_Checklist__c.
     *
     * @return director__c
     */
    public Boolean getDirector__c() {
        return director__c;
    }


    /**
     * Sets the director__c value for this EServices_Document_Checklist__c.
     *
     * @param director__c
     */
    public void setDirector__c(Boolean director__c) {
        this.director__c = director__c;
    }


    /**
     * Gets the document_Required_for_Branch_or_LLC__c value for this EServices_Document_Checklist__c.
     *
     * @return document_Required_for_Branch_or_LLC__c
     */
    public String getDocument_Required_for_Branch_or_LLC__c() {
        return document_Required_for_Branch_or_LLC__c;
    }


    /**
     * Sets the document_Required_for_Branch_or_LLC__c value for this EServices_Document_Checklist__c.
     *
     * @param document_Required_for_Branch_or_LLC__c
     */
    public void setDocument_Required_for_Branch_or_LLC__c(String document_Required_for_Branch_or_LLC__c) {
        this.document_Required_for_Branch_or_LLC__c = document_Required_for_Branch_or_LLC__c;
    }


    /**
     * Gets the document_Type__c value for this EServices_Document_Checklist__c.
     *
     * @return document_Type__c
     */
    public String getDocument_Type__c() {
        return document_Type__c;
    }


    /**
     * Sets the document_Type__c value for this EServices_Document_Checklist__c.
     *
     * @param document_Type__c
     */
    public void setDocument_Type__c(String document_Type__c) {
        this.document_Type__c = document_Type__c;
    }

    /**
     * Gets the gender__c value for this EServices_Document_Checklist__c.
     *
     * @return gender__c
     */
    public String getGender__c() {
        return gender__c;
    }


    /**
     * Sets the gender__c value for this EServices_Document_Checklist__c.
     *
     * @param gender__c
     */
    public void setGender__c(String gender__c) {
        this.gender__c = gender__c;
    }


    /**
     * Gets the general_Manager__c value for this EServices_Document_Checklist__c.
     *
     * @return general_Manager__c
     */
    public Boolean getGeneral_Manager__c() {
        return general_Manager__c;
    }


    /**
     * Sets the general_Manager__c value for this EServices_Document_Checklist__c.
     *
     * @param general_Manager__c
     */
    public void setGeneral_Manager__c(Boolean general_Manager__c) {
        this.general_Manager__c = general_Manager__c;
    }




    /**
     * Gets the individual_Shareholder__c value for this EServices_Document_Checklist__c.
     *
     * @return individual_Shareholder__c
     */
    public Boolean getIndividual_Shareholder__c() {
        return individual_Shareholder__c;
    }


    /**
     * Sets the individual_Shareholder__c value for this EServices_Document_Checklist__c.
     *
     * @param individual_Shareholder__c
     */
    public void setIndividual_Shareholder__c(Boolean individual_Shareholder__c) {
        this.individual_Shareholder__c = individual_Shareholder__c;
    }


    /**
     * Gets the instructions__c value for this EServices_Document_Checklist__c.
     *
     * @return instructions__c
     */
    public String getInstructions__c() {
        return instructions__c;
    }


    /**
     * Sets the instructions__c value for this EServices_Document_Checklist__c.
     *
     * @param instructions__c
     */
    public void setInstructions__c(String instructions__c) {
        this.instructions__c = instructions__c;
    }


    /**
     * Gets the isDeleted value for this EServices_Document_Checklist__c.
     *
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this EServices_Document_Checklist__c.
     *
     * @param isDeleted
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the language__c value for this EServices_Document_Checklist__c.
     *
     * @return language__c
     */
    public String getLanguage__c() {
        return language__c;
    }


    /**
     * Sets the language__c value for this EServices_Document_Checklist__c.
     *
     * @param language__c
     */
    public void setLanguage__c(String language__c) {
        this.language__c = language__c;
    }


    /**
     * Gets the lastActivityDate value for this EServices_Document_Checklist__c.
     *
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this EServices_Document_Checklist__c.
     *
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedById value for this EServices_Document_Checklist__c.
     *
     * @return lastModifiedById
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this EServices_Document_Checklist__c.
     *
     * @param lastModifiedById
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this EServices_Document_Checklist__c.
     *
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EServices_Document_Checklist__c.
     *
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the legal_Representative__c value for this EServices_Document_Checklist__c.
     *
     * @return legal_Representative__c
     */
    public Boolean getLegal_Representative__c() {
        return legal_Representative__c;
    }


    /**
     * Sets the legal_Representative__c value for this EServices_Document_Checklist__c.
     *
     * @param legal_Representative__c
     */
    public void setLegal_Representative__c(Boolean legal_Representative__c) {
        this.legal_Representative__c = legal_Representative__c;
    }

    /**
     * Gets the loop_ID__c value for this EServices_Document_Checklist__c.
     *
     * @return loop_ID__c
     */
    public String getLoop_ID__c() {
        return loop_ID__c;
    }


    /**
     * Sets the loop_ID__c value for this EServices_Document_Checklist__c.
     *
     * @param loop_ID__c
     */
    public void setLoop_ID__c(String loop_ID__c) {
        this.loop_ID__c = loop_ID__c;
    }


    /**
     * Gets the name value for this EServices_Document_Checklist__c.
     *
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this EServices_Document_Checklist__c.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the original_can_be_Requested__c value for this EServices_Document_Checklist__c.
     *
     * @return original_can_be_Requested__c
     */
    public Boolean getOriginal_can_be_Requested__c() {
        return original_can_be_Requested__c;
    }


    /**
     * Sets the original_can_be_Requested__c value for this EServices_Document_Checklist__c.
     *
     * @param original_can_be_Requested__c
     */
    public void setOriginal_can_be_Requested__c(Boolean original_can_be_Requested__c) {
        this.original_can_be_Requested__c = original_can_be_Requested__c;
    }


    /**
     * Gets the payment_eService__c value for this EServices_Document_Checklist__c.
     *
     * @return payment_eService__c
     */
    public String getPayment_eService__c() {
        return payment_eService__c;
    }


    /**
     * Sets the payment_eService__c value for this EServices_Document_Checklist__c.
     *
     * @param payment_eService__c
     */
    public void setPayment_eService__c(String payment_eService__c) {
        this.payment_eService__c = payment_eService__c;
    }


    /**
     * Gets the payment_eService__r value for this EServices_Document_Checklist__c.
     *
     * @return payment_eService__r
     */
    public EServiceAdministration getPayment_eService__r() {
        return payment_eService__r;
    }


    /**
     * Sets the payment_eService__r value for this EServices_Document_Checklist__c.
     *
     * @param payment_eService__r
     */
    public void setPayment_eService__r(EServiceAdministration payment_eService__r) {
        this.payment_eService__r = payment_eService__r;
    }

    /**
     * Gets the recordType value for this EServices_Document_Checklist__c.
     *
     * @return recordType
     */
    public RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this EServices_Document_Checklist__c.
     *
     * @param recordType
     */
    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this EServices_Document_Checklist__c.
     *
     * @return recordTypeId
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this EServices_Document_Checklist__c.
     *
     * @param recordTypeId
     */
    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the record_Type_Name__c value for this EServices_Document_Checklist__c.
     *
     * @return record_Type_Name__c
     */
    public String getRecord_Type_Name__c() {
        return record_Type_Name__c;
    }


    /**
     * Sets the record_Type_Name__c value for this EServices_Document_Checklist__c.
     *
     * @param record_Type_Name__c
     */
    public void setRecord_Type_Name__c(String record_Type_Name__c) {
        this.record_Type_Name__c = record_Type_Name__c;
    }


    /**
     * Gets the required_Original__c value for this EServices_Document_Checklist__c.
     *
     * @return required_Original__c
     */
    public Boolean getRequired_Original__c() {
        return required_Original__c;
    }


    /**
     * Sets the required_Original__c value for this EServices_Document_Checklist__c.
     *
     * @param required_Original__c
     */
    public void setRequired_Original__c(Boolean required_Original__c) {
        this.required_Original__c = required_Original__c;
    }


    /**
     * Gets the required_Scan_copy__c value for this EServices_Document_Checklist__c.
     *
     * @return required_Scan_copy__c
     */
    public Boolean getRequired_Scan_copy__c() {
        return required_Scan_copy__c;
    }


    /**
     * Sets the required_Scan_copy__c value for this EServices_Document_Checklist__c.
     *
     * @param required_Scan_copy__c
     */
    public void setRequired_Scan_copy__c(Boolean required_Scan_copy__c) {
        this.required_Scan_copy__c = required_Scan_copy__c;
    }


    /**
     * Gets the required_Template_from_DWC__c value for this EServices_Document_Checklist__c.
     *
     * @return required_Template_from_DWC__c
     */
    public Boolean getRequired_Template_from_DWC__c() {
        return required_Template_from_DWC__c;
    }


    /**
     * Sets the required_Template_from_DWC__c value for this EServices_Document_Checklist__c.
     *
     * @param required_Template_from_DWC__c
     */
    public void setRequired_Template_from_DWC__c(Boolean required_Template_from_DWC__c) {
        this.required_Template_from_DWC__c = required_Template_from_DWC__c;
    }


    /**
     * Gets the required_for_Specific_Naionalities__c value for this EServices_Document_Checklist__c.
     *
     * @return required_for_Specific_Naionalities__c
     */
    public Boolean getRequired_for_Specific_Naionalities__c() {
        return required_for_Specific_Naionalities__c;
    }


    /**
     * Sets the required_for_Specific_Naionalities__c value for this EServices_Document_Checklist__c.
     *
     * @param required_for_Specific_Naionalities__c
     */
    public void setRequired_for_Specific_Naionalities__c(Boolean required_for_Specific_Naionalities__c) {
        this.required_for_Specific_Naionalities__c = required_for_Specific_Naionalities__c;
    }


    /**
     * Gets the required_for_Specific_Qualifications__c value for this EServices_Document_Checklist__c.
     *
     * @return required_for_Specific_Qualifications__c
     */
    public Boolean getRequired_for_Specific_Qualifications__c() {
        return required_for_Specific_Qualifications__c;
    }


    /**
     * Sets the required_for_Specific_Qualifications__c value for this EServices_Document_Checklist__c.
     *
     * @param required_for_Specific_Qualifications__c
     */
    public void setRequired_for_Specific_Qualifications__c(Boolean required_for_Specific_Qualifications__c) {
        this.required_for_Specific_Qualifications__c = required_for_Specific_Qualifications__c;
    }


    /**
     * Gets the requirements__c value for this EServices_Document_Checklist__c.
     *
     * @return requirements__c
     */
    public String getRequirements__c() {
        return requirements__c;
    }


    /**
     * Sets the requirements__c value for this EServices_Document_Checklist__c.
     *
     * @param requirements__c
     */
    public void setRequirements__c(String requirements__c) {
        this.requirements__c = requirements__c;
    }


    /**
     * Gets the secretary__c value for this EServices_Document_Checklist__c.
     *
     * @return secretary__c
     */
    public Boolean getSecretary__c() {
        return secretary__c;
    }


    /**
     * Sets the secretary__c value for this EServices_Document_Checklist__c.
     *
     * @param secretary__c
     */
    public void setSecretary__c(Boolean secretary__c) {
        this.secretary__c = secretary__c;
    }


    /**
     * Gets the systemModstamp value for this EServices_Document_Checklist__c.
     *
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this EServices_Document_Checklist__c.
     *
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the template_Attached_Id__c value for this EServices_Document_Checklist__c.
     *
     * @return template_Attached_Id__c
     */
    public String getTemplate_Attached_Id__c() {
        return template_Attached_Id__c;
    }


    /**
     * Sets the template_Attached_Id__c value for this EServices_Document_Checklist__c.
     *
     * @param template_Attached_Id__c
     */
    public void setTemplate_Attached_Id__c(String template_Attached_Id__c) {
        this.template_Attached_Id__c = template_Attached_Id__c;
    }


    /**
     * Gets the template_Name_Link__c value for this EServices_Document_Checklist__c.
     *
     * @return template_Name_Link__c
     */
    public String getTemplate_Name_Link__c() {
        return template_Name_Link__c;
    }


    /**
     * Sets the template_Name_Link__c value for this EServices_Document_Checklist__c.
     *
     * @param template_Name_Link__c
     */
    public void setTemplate_Name_Link__c(String template_Name_Link__c) {
        this.template_Name_Link__c = template_Name_Link__c;
    }

    /**
     * Gets the type__c value for this EServices_Document_Checklist__c.
     *
     * @return type__c
     */
    public String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this EServices_Document_Checklist__c.
     *
     * @param type__c
     */
    public void setType__c(String type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the eCopy_can_be_Requested__c value for this EServices_Document_Checklist__c.
     *
     * @return eCopy_can_be_Requested__c
     */
    public Boolean getECopy_can_be_Requested__c() {
        return eCopy_can_be_Requested__c;
    }


    /**
     * Sets the eCopy_can_be_Requested__c value for this EServices_Document_Checklist__c.
     *
     * @param eCopy_can_be_Requested__c
     */
    public void setECopy_can_be_Requested__c(Boolean eCopy_can_be_Requested__c) {
        this.eCopy_can_be_Requested__c = eCopy_can_be_Requested__c;
    }


    /**
     * Gets the eService_Administration__c value for this EServices_Document_Checklist__c.
     *
     * @return eService_Administration__c
     */
    public String getEService_Administration__c() {
        return eService_Administration__c;
    }


    /**
     * Sets the eService_Administration__c value for this EServices_Document_Checklist__c.
     *
     * @param eService_Administration__c
     */
    public void setEService_Administration__c(String eService_Administration__c) {
        this.eService_Administration__c = eService_Administration__c;
    }


    /**
     * Gets the eService_Administration__r value for this EServices_Document_Checklist__c.
     *
     * @return eService_Administration__r
     */
    public EServiceAdministration getEService_Administration__r() {
        return eService_Administration__r;
    }


    /**
     * Sets the eService_Administration__r value for this EServices_Document_Checklist__c.
     *
     * @param eService_Administration__r
     */
    public void setEService_Administration__r(EServiceAdministration eService_Administration__r) {
        this.eService_Administration__r = eService_Administration__r;
    }


    /**
     * Gets the eService_Type__c value for this EServices_Document_Checklist__c.
     *
     * @return eService_Type__c
     */
    public String getEService_Type__c() {
        return eService_Type__c;
    }


    /**
     * Sets the eService_Type__c value for this EServices_Document_Checklist__c.
     *
     * @param eService_Type__c
     */
    public void setEService_Type__c(String eService_Type__c) {
        this.eService_Type__c = eService_Type__c;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String geteService_Administration__c() {
        return eService_Administration__c;
    }

    public void seteService_Administration__c(String eService_Administration__c) {
        this.eService_Administration__c = eService_Administration__c;
    }

    public EServiceAdministration geteService_Administration__r() {
        return eService_Administration__r;
    }

    public void seteService_Administration__r(EServiceAdministration eService_Administration__r) {
        this.eService_Administration__r = eService_Administration__r;
    }

    public String geteService_Type__c() {
        return eService_Type__c;
    }

    public void seteService_Type__c(String eService_Type__c) {
        this.eService_Type__c = eService_Type__c;
    }
}