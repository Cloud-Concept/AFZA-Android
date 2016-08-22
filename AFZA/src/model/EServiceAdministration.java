package model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Abanoub Wagdy on 5/5/2016.
 */

/**
 * This class holds eservice administration requested for each service by its record type
 */
public class EServiceAdministration implements java.io.Serializable {

    public int getNo_of_Upload_Docs__c() {
        return No_of_Upload_Docs__c;
    }

    public void setNo_of_Upload_Docs__c(int no_of_Upload_Docs__c) {
        No_of_Upload_Docs__c = no_of_Upload_Docs__c;
    }

    @SerializedName("No_of_Upload_Docs__c")
    public int No_of_Upload_Docs__c;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @SerializedName("Id")
    public String ID;

    public Double active_Fee_Management_Fee__c;

    public Double amount__c;

    public String approval_Process_Name__c;

    public Boolean approval_Required__c;

    public String authority__c;

    public Boolean auto_Populated__c;

    public String available_for_Profiles__c;

    public String cancel_Page_Link__c;
    
    @SerializedName("Cancel_VF_Generator__c")
    public String cancel_VF_Generator__c;

    public String getDocument_Type() {
        return Document_Type;
    }

    public void setDocument_Type(String document_Type) {
        Document_Type = document_Type;
    }

    @SerializedName("Document_Type__c")
    public String Document_Type;
    @SerializedName("Type__c")
    public String type;

    public WebForm cancel_VF_Generator__r;
    
    public String category__c;
    
    public String createdById;

    public java.util.Calendar createdDate;

    public String currencyIsoCode;

    public Double default_Processing_Fee__c;

    public String detail_View_P__c;

    @SerializedName("Display_Name__c")
//    @JsonProperty("Display_Name__c")
    public String display_Name__c;

    public Boolean document_Required__c;

    public Double document_Upload_Count__c;


    public String duration__c;

    public String ERP_Name__c;

    public String ERP_Service_Name__c;

    public String external_ID__c;

    public Boolean internal_Use__c;

    public Boolean isDeleted;

    public Boolean is_Active__c;
    @SerializedName("Knowledge_Fee__c")
    public String knowledge_Fee__c;
    
    public String lastModifiedById;

    public java.util.Calendar lastModifiedDate;

    public java.util.Calendar lastReferencedDate;

    public java.util.Calendar lastViewedDate;
    
//    @JsonProperty("NOC_Type__c")
    @SerializedName("NOC_Type__c")
    public String NOC_Type__c;

    @SerializedName("Name")
//    @JsonProperty("Name")
    public String name;

    @SerializedName("New_Edit_VF_Generator__c")
//    @SerializedName("New_Edit_VF_Generator__c")
    public String new_Edit_VF_Generator__c;

//    @JsonProperty("New_Edit_VF_Generator__r")
    @SerializedName("New_Edit_VF_Generator__r")
    public WebForm new_Edit_VF_Generator__r;
    
    public String ownerId;
    
    public RecordType recordType;

//    @JsonProperty("RecordTypeId")
    @SerializedName("RecordTypeId")
    public String recordTypeId;
//    @JsonProperty("Record_Type_Picklist__c"))
    @SerializedName("Record_Type_Picklist__c")
    public String record_Type_Picklist__c;
//    @JsonProperty("Redirect_Page__c")
    @SerializedName("Redirect_Page__c")
    public String redirect_Page__c;

//    @JsonProperty("Related_to_Object__c")
    @SerializedName("Related_to_Object__c")
    public String related_to_Object__c;

    public String renewal_Page_Link__c;

//    @JsonProperty("Renewal_VF_Generator__c")
    @SerializedName("Renewal_VF_Generator__c")
    public String renewal_VF_Generator__c;

    public WebForm renewal_VF_Generator__r;

    public String replace_Page_Link__c;

//    @JsonProperty("Replace_VF_Generator__c")
    @SerializedName("Replace_VF_Generator__c")
    public String replace_VF_Generator__c;

    public WebForm replace_VF_Generator__r;

    public Boolean require_Knowledge_Fee__c;

    public Boolean required_Access_Card_Ref__c;

    public Boolean required_Account_Ref__c;

    public Boolean required_Agreement_Payment_Ref__c;

    public Boolean required_License_Amendment_Ref__c;

    public Boolean required_License_Ref__c;

    public Boolean required_NOC_Ref__c;

    public Boolean required_Quote_Ref__c;

    public Boolean required_Registration_Amendment_Ref__c;

    public Boolean required_Visa_Ref__c;

    public String service_Abb__c;

    public String service_GL_Code__c;

//    @JsonProperty("Service_Identifier__c")
    @SerializedName("Service_Identifier__c")
    public String service_Identifier__c;

    public String service_Name__c;

//    @JsonProperty("Service_Type__c")
    @SerializedName("Service_Type__c")
    public String service_Type__c;

//    @JsonProperty("Service_VF_Page__c")
    @SerializedName("Service_VF_Page__c")
    public String service_VF_Page__c;

//    @JsonProperty("Short_Service_Name__c")
    @SerializedName("Short_Service_Name__c")
    public String short_Service_Name__c;

//    @JsonProperty("Sub_Category__c")
    @SerializedName("Sub_Category__c")
    public String sub_Category__c;

    public java.util.Calendar systemModstamp;
    
    @SerializedName("Total_Amount__c ")
    public double total_Amount__c;

//    @JsonProperty("Visa_Type__c")
    @SerializedName("Visa_Type__c")
    public String visa_Type__c;


//    @JsonProperty("EService_ERP_Details__c")
    @SerializedName("EService_ERP_Details__c")
    public String eService_ERP_Details__c;

//    @JsonProperty("IsAvailableOnPortal__c")
    @SerializedName("IsAvailableOnPortal__c")
    public Boolean isAvailableOnPortal__c;

    //@JsonProperty("records")
    ArrayList<EServices_Document_Checklist__c> eServices_document_checklist__c;

    public ArrayList<EServices_Document_Checklist__c> geteServices_document_checklist__c() {
        return eServices_document_checklist__c;
    }

    public void seteServices_document_checklist__c(ArrayList<EServices_Document_Checklist__c> eServices_document_checklist__c) {
        this.eServices_document_checklist__c = eServices_document_checklist__c;
    }


    public EServiceAdministration() {
    }


    /**
     * Gets the active_Fee_Management_Fee__c value for this EServiceAdministration.
     *
     * @return active_Fee_Management_Fee__c
     */
    public Double getActive_Fee_Management_Fee__c() {
        return active_Fee_Management_Fee__c;
    }


    /**
     * Sets the active_Fee_Management_Fee__c value for this EServiceAdministration.
     *
     * @param active_Fee_Management_Fee__c
     */
    public void setActive_Fee_Management_Fee__c(Double active_Fee_Management_Fee__c) {
        this.active_Fee_Management_Fee__c = active_Fee_Management_Fee__c;
    }


    /**
     * Gets the amount__c value for this EServiceAdministration.
     *
     * @return amount__c
     */
    public Double getAmount__c() {
        return amount__c;
    }


    /**
     * Sets the amount__c value for this EServiceAdministration.
     *
     * @param amount__c
     */
    public void setAmount__c(Double amount__c) {
        this.amount__c = amount__c;
    }


    /**
     * Gets the approval_Process_Name__c value for this EServiceAdministration.
     *
     * @return approval_Process_Name__c
     */
    public String getApproval_Process_Name__c() {
        return approval_Process_Name__c;
    }


    /**
     * Sets the approval_Process_Name__c value for this EServiceAdministration.
     *
     * @param approval_Process_Name__c
     */
    public void setApproval_Process_Name__c(String approval_Process_Name__c) {
        this.approval_Process_Name__c = approval_Process_Name__c;
    }


    /**
     * Gets the approval_Required__c value for this EServiceAdministration.
     *
     * @return approval_Required__c
     */
    public Boolean getApproval_Required__c() {
        return approval_Required__c;
    }


    /**
     * Sets the approval_Required__c value for this EServiceAdministration.
     *
     * @param approval_Required__c
     */
    public void setApproval_Required__c(Boolean approval_Required__c) {
        this.approval_Required__c = approval_Required__c;
    }


    /**
     * Gets the authority__c value for this EServiceAdministration.
     *
     * @return authority__c
     */
    public String getAuthority__c() {
        return authority__c;
    }


    /**
     * Sets the authority__c value for this EServiceAdministration.
     *
     * @param authority__c
     */
    public void setAuthority__c(String authority__c) {
        this.authority__c = authority__c;
    }


    /**
     * Gets the auto_Populated__c value for this EServiceAdministration.
     *
     * @return auto_Populated__c
     */
    public Boolean getAuto_Populated__c() {
        return auto_Populated__c;
    }


    /**
     * Sets the auto_Populated__c value for this EServiceAdministration.
     *
     * @param auto_Populated__c
     */
    public void setAuto_Populated__c(Boolean auto_Populated__c) {
        this.auto_Populated__c = auto_Populated__c;
    }


    /**
     * Gets the available_for_Profiles__c value for this EServiceAdministration.
     *
     * @return available_for_Profiles__c
     */
    public String getAvailable_for_Profiles__c() {
        return available_for_Profiles__c;
    }


    /**
     * Sets the available_for_Profiles__c value for this EServiceAdministration.
     *
     * @param available_for_Profiles__c
     */
    public void setAvailable_for_Profiles__c(String available_for_Profiles__c) {
        this.available_for_Profiles__c = available_for_Profiles__c;
    }


    /**
     * Gets the cancel_Page_Link__c value for this EServiceAdministration.
     *
     * @return cancel_Page_Link__c
     */
    public String getCancel_Page_Link__c() {
        return cancel_Page_Link__c;
    }


    /**
     * Sets the cancel_Page_Link__c value for this EServiceAdministration.
     *
     * @param cancel_Page_Link__c
     */
    public void setCancel_Page_Link__c(String cancel_Page_Link__c) {
        this.cancel_Page_Link__c = cancel_Page_Link__c;
    }


    /**
     * Gets the cancel_VF_Generator__c value for this EServiceAdministration.
     *
     * @return cancel_VF_Generator__c
     */
    public String getCancel_VF_Generator__c() {
        return cancel_VF_Generator__c;
    }


    /**
     * Sets the cancel_VF_Generator__c value for this EServiceAdministration.
     *
     * @param cancel_VF_Generator__c
     */
    public void setCancel_VF_Generator__c(String cancel_VF_Generator__c) {
        this.cancel_VF_Generator__c = cancel_VF_Generator__c;
    }


    /**
     * Gets the cancel_VF_Generator__r value for this EServiceAdministration.
     *
     * @return cancel_VF_Generator__r
     */
    public WebForm getCancel_VF_Generator__r() {
        return cancel_VF_Generator__r;
    }


    /**
     * Sets the cancel_VF_Generator__r value for this EServiceAdministration.
     *
     * @param cancel_VF_Generator__r
     */
    public void setCancel_VF_Generator__r(WebForm cancel_VF_Generator__r) {
        this.cancel_VF_Generator__r = cancel_VF_Generator__r;
    }


    /**
     * Gets the category__c value for this EServiceAdministration.
     *
     * @return category__c
     */
    public String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this EServiceAdministration.
     *
     * @param category__c
     */
    public void setCategory__c(String category__c) {
        this.category__c = category__c;
    }

    /**
     * Gets the createdById value for this EServiceAdministration.
     *
     * @return createdById
     */
    public String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this EServiceAdministration.
     *
     * @param createdById
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this EServiceAdministration.
     *
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this EServiceAdministration.
     *
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this EServiceAdministration.
     *
     * @return currencyIsoCode
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this EServiceAdministration.
     *
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the default_Processing_Fee__c value for this EServiceAdministration.
     *
     * @return default_Processing_Fee__c
     */
    public Double getDefault_Processing_Fee__c() {
        return default_Processing_Fee__c;
    }


    /**
     * Sets the default_Processing_Fee__c value for this EServiceAdministration.
     *
     * @param default_Processing_Fee__c
     */
    public void setDefault_Processing_Fee__c(Double default_Processing_Fee__c) {
        this.default_Processing_Fee__c = default_Processing_Fee__c;
    }


    /**
     * Gets the detail_View_P__c value for this EServiceAdministration.
     *
     * @return detail_View_P__c
     */
    public String getDetail_View_P__c() {
        return detail_View_P__c;
    }


    /**
     * Sets the detail_View_P__c value for this EServiceAdministration.
     *
     * @param detail_View_P__c
     */
    public void setDetail_View_P__c(String detail_View_P__c) {
        this.detail_View_P__c = detail_View_P__c;
    }


    /**
     * Gets the display_Name__c value for this EServiceAdministration.
     *
     * @return display_Name__c
     */
    public String getDisplay_Name__c() {
        return display_Name__c;
    }


    /**
     * Sets the display_Name__c value for this EServiceAdministration.
     *
     * @param display_Name__c
     */
    public void setDisplay_Name__c(String display_Name__c) {
        this.display_Name__c = display_Name__c;
    }


    /**
     * Gets the document_Required__c value for this EServiceAdministration.
     *
     * @return document_Required__c
     */
    public Boolean getDocument_Required__c() {
        return document_Required__c;
    }


    /**
     * Sets the document_Required__c value for this EServiceAdministration.
     *
     * @param document_Required__c
     */
    public void setDocument_Required__c(Boolean document_Required__c) {
        this.document_Required__c = document_Required__c;
    }


    /**
     * Gets the document_Upload_Count__c value for this EServiceAdministration.
     *
     * @return document_Upload_Count__c
     */
    public Double getDocument_Upload_Count__c() {
        return document_Upload_Count__c;
    }


    /**
     * Sets the document_Upload_Count__c value for this EServiceAdministration.
     *
     * @param document_Upload_Count__c
     */
    public void setDocument_Upload_Count__c(Double document_Upload_Count__c) {
        this.document_Upload_Count__c = document_Upload_Count__c;
    }

    /**
     * Gets the duration__c value for this EServiceAdministration.
     *
     * @return duration__c
     */
    public String getDuration__c() {
        return duration__c;
    }


    /**
     * Sets the duration__c value for this EServiceAdministration.
     *
     * @param duration__c
     */
    public void setDuration__c(String duration__c) {
        this.duration__c = duration__c;
    }


    /**
     * Gets the ERP_Name__c value for this EServiceAdministration.
     *
     * @return ERP_Name__c
     */
    public String getERP_Name__c() {
        return ERP_Name__c;
    }


    /**
     * Sets the ERP_Name__c value for this EServiceAdministration.
     *
     * @param ERP_Name__c
     */
    public void setERP_Name__c(String ERP_Name__c) {
        this.ERP_Name__c = ERP_Name__c;
    }


    /**
     * Gets the ERP_Service_Name__c value for this EServiceAdministration.
     *
     * @return ERP_Service_Name__c
     */
    public String getERP_Service_Name__c() {
        return ERP_Service_Name__c;
    }


    /**
     * Sets the ERP_Service_Name__c value for this EServiceAdministration.
     *
     * @param ERP_Service_Name__c
     */
    public void setERP_Service_Name__c(String ERP_Service_Name__c) {
        this.ERP_Service_Name__c = ERP_Service_Name__c;
    }


    /**
     * Gets the external_ID__c value for this EServiceAdministration.
     *
     * @return external_ID__c
     */
    public String getExternal_ID__c() {
        return external_ID__c;
    }


    /**
     * Sets the external_ID__c value for this EServiceAdministration.
     *
     * @param external_ID__c
     */
    public void setExternal_ID__c(String external_ID__c) {
        this.external_ID__c = external_ID__c;
    }

    /**
     * Gets the internal_Use__c value for this EServiceAdministration.
     *
     * @return internal_Use__c
     */
    public Boolean getInternal_Use__c() {
        return internal_Use__c;
    }


    /**
     * Sets the internal_Use__c value for this EServiceAdministration.
     *
     * @param internal_Use__c
     */
    public void setInternal_Use__c(Boolean internal_Use__c) {
        this.internal_Use__c = internal_Use__c;
    }

    /**
     * Gets the isDeleted value for this EServiceAdministration.
     *
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this EServiceAdministration.
     *
     * @param isDeleted
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_Active__c value for this EServiceAdministration.
     *
     * @return is_Active__c
     */
    public Boolean getIs_Active__c() {
        return is_Active__c;
    }


    /**
     * Sets the is_Active__c value for this EServiceAdministration.
     *
     * @param is_Active__c
     */
    public void setIs_Active__c(Boolean is_Active__c) {
        this.is_Active__c = is_Active__c;
    }


    /**
     * Gets the knowledge_Fee__c value for this EServiceAdministration.
     *
     * @return knowledge_Fee__c
     */
    public String getKnowledge_Fee__c() {
        return knowledge_Fee__c;
    }


    /**
     * Sets the knowledge_Fee__c value for this EServiceAdministration.
     *
     * @param knowledge_Fee__c
     */
    public void setKnowledge_Fee__c(String knowledge_Fee__c) {
        this.knowledge_Fee__c = knowledge_Fee__c;
    }

    /**
     * Gets the lastModifiedById value for this EServiceAdministration.
     *
     * @return lastModifiedById
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this EServiceAdministration.
     *
     * @param lastModifiedById
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this EServiceAdministration.
     *
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EServiceAdministration.
     *
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this EServiceAdministration.
     *
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this EServiceAdministration.
     *
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this EServiceAdministration.
     *
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this EServiceAdministration.
     *
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets the NOC_Type__c value for this EServiceAdministration.
     *
     * @return NOC_Type__c
     */
    public String getNOC_Type__c() {
        return NOC_Type__c;
    }


    /**
     * Sets the NOC_Type__c value for this EServiceAdministration.
     *
     * @param NOC_Type__c
     */
    public void setNOC_Type__c(String NOC_Type__c) {
        this.NOC_Type__c = NOC_Type__c;
    }


    /**
     * Gets the name value for this EServiceAdministration.
     *
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this EServiceAdministration.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the new_Edit_VF_Generator__c value for this EServiceAdministration.
     *
     * @return new_Edit_VF_Generator__c
     */
    public String getNew_Edit_VF_Generator__c() {
        return new_Edit_VF_Generator__c;
    }


    /**
     * Sets the new_Edit_VF_Generator__c value for this EServiceAdministration.
     *
     * @param new_Edit_VF_Generator__c
     */
    public void setNew_Edit_VF_Generator__c(String new_Edit_VF_Generator__c) {
        this.new_Edit_VF_Generator__c = new_Edit_VF_Generator__c;
    }


    /**
     * Gets the new_Edit_VF_Generator__r value for this EServiceAdministration.
     *
     * @return new_Edit_VF_Generator__r
     */
    public WebForm getNew_Edit_VF_Generator__r() {
        return new_Edit_VF_Generator__r;
    }


    /**
     * Sets the new_Edit_VF_Generator__r value for this EServiceAdministration.
     *
     * @param new_Edit_VF_Generator__r
     */
    public void setNew_Edit_VF_Generator__r(WebForm new_Edit_VF_Generator__r) {
        this.new_Edit_VF_Generator__r = new_Edit_VF_Generator__r;
    }
    /**
     * Gets the ownerId value for this EServiceAdministration.
     *
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this EServiceAdministration.
     *
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the recordType value for this EServiceAdministration.
     *
     * @return recordType
     */
    public RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this EServiceAdministration.
     *
     * @param recordType
     */
    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this EServiceAdministration.
     *
     * @return recordTypeId
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this EServiceAdministration.
     *
     * @param recordTypeId
     */
    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the record_Type_Picklist__c value for this EServiceAdministration.
     *
     * @return record_Type_Picklist__c
     */
    public String getRecord_Type_Picklist__c() {
        return record_Type_Picklist__c;
    }


    /**
     * Sets the record_Type_Picklist__c value for this EServiceAdministration.
     *
     * @param record_Type_Picklist__c
     */
    public void setRecord_Type_Picklist__c(String record_Type_Picklist__c) {
        this.record_Type_Picklist__c = record_Type_Picklist__c;
    }


    /**
     * Gets the redirect_Page__c value for this EServiceAdministration.
     *
     * @return redirect_Page__c
     */
    public String getRedirect_Page__c() {
        return redirect_Page__c;
    }


    /**
     * Sets the redirect_Page__c value for this EServiceAdministration.
     *
     * @param redirect_Page__c
     */
    public void setRedirect_Page__c(String redirect_Page__c) {
        this.redirect_Page__c = redirect_Page__c;
    }


    /**
     * Gets the related_to_Object__c value for this EServiceAdministration.
     *
     * @return related_to_Object__c
     */
    public String getRelated_to_Object__c() {
        return related_to_Object__c;
    }


    /**
     * Sets the related_to_Object__c value for this EServiceAdministration.
     *
     * @param related_to_Object__c
     */
    public void setRelated_to_Object__c(String related_to_Object__c) {
        this.related_to_Object__c = related_to_Object__c;
    }


    /**
     * Gets the renewal_Page_Link__c value for this EServiceAdministration.
     *
     * @return renewal_Page_Link__c
     */
    public String getRenewal_Page_Link__c() {
        return renewal_Page_Link__c;
    }


    /**
     * Sets the renewal_Page_Link__c value for this EServiceAdministration.
     *
     * @param renewal_Page_Link__c
     */
    public void setRenewal_Page_Link__c(String renewal_Page_Link__c) {
        this.renewal_Page_Link__c = renewal_Page_Link__c;
    }


    /**
     * Gets the renewal_VF_Generator__c value for this EServiceAdministration.
     *
     * @return renewal_VF_Generator__c
     */
    public String getRenewal_VF_Generator__c() {
        return renewal_VF_Generator__c;
    }


    /**
     * Sets the renewal_VF_Generator__c value for this EServiceAdministration.
     *
     * @param renewal_VF_Generator__c
     */
    public void setRenewal_VF_Generator__c(String renewal_VF_Generator__c) {
        this.renewal_VF_Generator__c = renewal_VF_Generator__c;
    }


    /**
     * Gets the renewal_VF_Generator__r value for this EServiceAdministration.
     *
     * @return renewal_VF_Generator__r
     */
    public WebForm getRenewal_VF_Generator__r() {
        return renewal_VF_Generator__r;
    }


    /**
     * Sets the renewal_VF_Generator__r value for this EServiceAdministration.
     *
     * @param renewal_VF_Generator__r
     */
    public void setRenewal_VF_Generator__r(WebForm renewal_VF_Generator__r) {
        this.renewal_VF_Generator__r = renewal_VF_Generator__r;
    }


    /**
     * Gets the replace_Page_Link__c value for this EServiceAdministration.
     *
     * @return replace_Page_Link__c
     */
    public String getReplace_Page_Link__c() {
        return replace_Page_Link__c;
    }


    /**
     * Sets the replace_Page_Link__c value for this EServiceAdministration.
     *
     * @param replace_Page_Link__c
     */
    public void setReplace_Page_Link__c(String replace_Page_Link__c) {
        this.replace_Page_Link__c = replace_Page_Link__c;
    }


    /**
     * Gets the replace_VF_Generator__c value for this EServiceAdministration.
     *
     * @return replace_VF_Generator__c
     */
    public String getReplace_VF_Generator__c() {
        return replace_VF_Generator__c;
    }


    /**
     * Sets the replace_VF_Generator__c value for this EServiceAdministration.
     *
     * @param replace_VF_Generator__c
     */
    public void setReplace_VF_Generator__c(String replace_VF_Generator__c) {
        this.replace_VF_Generator__c = replace_VF_Generator__c;
    }


    /**
     * Gets the replace_VF_Generator__r value for this EServiceAdministration.
     *
     * @return replace_VF_Generator__r
     */
    public WebForm getReplace_VF_Generator__r() {
        return replace_VF_Generator__r;
    }


    /**
     * Sets the replace_VF_Generator__r value for this EServiceAdministration.
     *
     * @param replace_VF_Generator__r
     */
    public void setReplace_VF_Generator__r(WebForm replace_VF_Generator__r) {
        this.replace_VF_Generator__r = replace_VF_Generator__r;
    }


    /**
     * Gets the require_Knowledge_Fee__c value for this EServiceAdministration.
     *
     * @return require_Knowledge_Fee__c
     */
    public Boolean getRequire_Knowledge_Fee__c() {
        return require_Knowledge_Fee__c;
    }


    /**
     * Sets the require_Knowledge_Fee__c value for this EServiceAdministration.
     *
     * @param require_Knowledge_Fee__c
     */
    public void setRequire_Knowledge_Fee__c(Boolean require_Knowledge_Fee__c) {
        this.require_Knowledge_Fee__c = require_Knowledge_Fee__c;
    }


    /**
     * Gets the required_Access_Card_Ref__c value for this EServiceAdministration.
     *
     * @return required_Access_Card_Ref__c
     */
    public Boolean getRequired_Access_Card_Ref__c() {
        return required_Access_Card_Ref__c;
    }


    /**
     * Sets the required_Access_Card_Ref__c value for this EServiceAdministration.
     *
     * @param required_Access_Card_Ref__c
     */
    public void setRequired_Access_Card_Ref__c(Boolean required_Access_Card_Ref__c) {
        this.required_Access_Card_Ref__c = required_Access_Card_Ref__c;
    }


    /**
     * Gets the required_Account_Ref__c value for this EServiceAdministration.
     *
     * @return required_Account_Ref__c
     */
    public Boolean getRequired_Account_Ref__c() {
        return required_Account_Ref__c;
    }


    /**
     * Sets the required_Account_Ref__c value for this EServiceAdministration.
     *
     * @param required_Account_Ref__c
     */
    public void setRequired_Account_Ref__c(Boolean required_Account_Ref__c) {
        this.required_Account_Ref__c = required_Account_Ref__c;
    }


    /**
     * Gets the required_Agreement_Payment_Ref__c value for this EServiceAdministration.
     *
     * @return required_Agreement_Payment_Ref__c
     */
    public Boolean getRequired_Agreement_Payment_Ref__c() {
        return required_Agreement_Payment_Ref__c;
    }


    /**
     * Sets the required_Agreement_Payment_Ref__c value for this EServiceAdministration.
     *
     * @param required_Agreement_Payment_Ref__c
     */
    public void setRequired_Agreement_Payment_Ref__c(Boolean required_Agreement_Payment_Ref__c) {
        this.required_Agreement_Payment_Ref__c = required_Agreement_Payment_Ref__c;
    }


    /**
     * Gets the required_License_Amendment_Ref__c value for this EServiceAdministration.
     *
     * @return required_License_Amendment_Ref__c
     */
    public Boolean getRequired_License_Amendment_Ref__c() {
        return required_License_Amendment_Ref__c;
    }


    /**
     * Sets the required_License_Amendment_Ref__c value for this EServiceAdministration.
     *
     * @param required_License_Amendment_Ref__c
     */
    public void setRequired_License_Amendment_Ref__c(Boolean required_License_Amendment_Ref__c) {
        this.required_License_Amendment_Ref__c = required_License_Amendment_Ref__c;
    }


    /**
     * Gets the required_License_Ref__c value for this EServiceAdministration.
     *
     * @return required_License_Ref__c
     */
    public Boolean getRequired_License_Ref__c() {
        return required_License_Ref__c;
    }


    /**
     * Sets the required_License_Ref__c value for this EServiceAdministration.
     *
     * @param required_License_Ref__c
     */
    public void setRequired_License_Ref__c(Boolean required_License_Ref__c) {
        this.required_License_Ref__c = required_License_Ref__c;
    }


    /**
     * Gets the required_NOC_Ref__c value for this EServiceAdministration.
     *
     * @return required_NOC_Ref__c
     */
    public Boolean getRequired_NOC_Ref__c() {
        return required_NOC_Ref__c;
    }


    /**
     * Sets the required_NOC_Ref__c value for this EServiceAdministration.
     *
     * @param required_NOC_Ref__c
     */
    public void setRequired_NOC_Ref__c(Boolean required_NOC_Ref__c) {
        this.required_NOC_Ref__c = required_NOC_Ref__c;
    }


    /**
     * Gets the required_Quote_Ref__c value for this EServiceAdministration.
     *
     * @return required_Quote_Ref__c
     */
    public Boolean getRequired_Quote_Ref__c() {
        return required_Quote_Ref__c;
    }


    /**
     * Sets the required_Quote_Ref__c value for this EServiceAdministration.
     *
     * @param required_Quote_Ref__c
     */
    public void setRequired_Quote_Ref__c(Boolean required_Quote_Ref__c) {
        this.required_Quote_Ref__c = required_Quote_Ref__c;
    }


    /**
     * Gets the required_Registration_Amendment_Ref__c value for this EServiceAdministration.
     *
     * @return required_Registration_Amendment_Ref__c
     */
    public Boolean getRequired_Registration_Amendment_Ref__c() {
        return required_Registration_Amendment_Ref__c;
    }


    /**
     * Sets the required_Registration_Amendment_Ref__c value for this EServiceAdministration.
     *
     * @param required_Registration_Amendment_Ref__c
     */
    public void setRequired_Registration_Amendment_Ref__c(Boolean required_Registration_Amendment_Ref__c) {
        this.required_Registration_Amendment_Ref__c = required_Registration_Amendment_Ref__c;
    }


    /**
     * Gets the required_Visa_Ref__c value for this EServiceAdministration.
     *
     * @return required_Visa_Ref__c
     */
    public Boolean getRequired_Visa_Ref__c() {
        return required_Visa_Ref__c;
    }


    /**
     * Sets the required_Visa_Ref__c value for this EServiceAdministration.
     *
     * @param required_Visa_Ref__c
     */
    public void setRequired_Visa_Ref__c(Boolean required_Visa_Ref__c) {
        this.required_Visa_Ref__c = required_Visa_Ref__c;
    }


    /**
     * Gets the service_Abb__c value for this EServiceAdministration.
     *
     * @return service_Abb__c
     */
    public String getService_Abb__c() {
        return service_Abb__c;
    }


    /**
     * Sets the service_Abb__c value for this EServiceAdministration.
     *
     * @param service_Abb__c
     */
    public void setService_Abb__c(String service_Abb__c) {
        this.service_Abb__c = service_Abb__c;
    }


    /**
     * Gets the service_GL_Code__c value for this EServiceAdministration.
     *
     * @return service_GL_Code__c
     */
    public String getService_GL_Code__c() {
        return service_GL_Code__c;
    }


    /**
     * Sets the service_GL_Code__c value for this EServiceAdministration.
     *
     * @param service_GL_Code__c
     */
    public void setService_GL_Code__c(String service_GL_Code__c) {
        this.service_GL_Code__c = service_GL_Code__c;
    }


    /**
     * Gets the service_Identifier__c value for this EServiceAdministration.
     *
     * @return service_Identifier__c
     */
    public String getService_Identifier__c() {
        return service_Identifier__c;
    }


    /**
     * Sets the service_Identifier__c value for this EServiceAdministration.
     *
     * @param service_Identifier__c
     */
    public void setService_Identifier__c(String service_Identifier__c) {
        this.service_Identifier__c = service_Identifier__c;
    }


    /**
     * Gets the service_Name__c value for this EServiceAdministration.
     *
     * @return service_Name__c
     */
    public String getService_Name__c() {
        return service_Name__c;
    }


    /**
     * Sets the service_Name__c value for this EServiceAdministration.
     *
     * @param service_Name__c
     */
    public void setService_Name__c(String service_Name__c) {
        this.service_Name__c = service_Name__c;
    }


    /**
     * Gets the service_Type__c value for this EServiceAdministration.
     *
     * @return service_Type__c
     */
    public String getService_Type__c() {
        return service_Type__c;
    }


    /**
     * Sets the service_Type__c value for this EServiceAdministration.
     *
     * @param service_Type__c
     */
    public void setService_Type__c(String service_Type__c) {
        this.service_Type__c = service_Type__c;
    }


    /**
     * Gets the service_VF_Page__c value for this EServiceAdministration.
     *
     * @return service_VF_Page__c
     */
    public String getService_VF_Page__c() {
        return service_VF_Page__c;
    }


    /**
     * Sets the service_VF_Page__c value for this EServiceAdministration.
     *
     * @param service_VF_Page__c
     */
    public void setService_VF_Page__c(String service_VF_Page__c) {
        this.service_VF_Page__c = service_VF_Page__c;
    }


    /**
     * Gets the short_Service_Name__c value for this EServiceAdministration.
     *
     * @return short_Service_Name__c
     */
    public String getShort_Service_Name__c() {
        return short_Service_Name__c;
    }


    /**
     * Sets the short_Service_Name__c value for this EServiceAdministration.
     *
     * @param short_Service_Name__c
     */
    public void setShort_Service_Name__c(String short_Service_Name__c) {
        this.short_Service_Name__c = short_Service_Name__c;
    }


    /**
     * Gets the sub_Category__c value for this EServiceAdministration.
     *
     * @return sub_Category__c
     */
    public String getSub_Category__c() {
        return sub_Category__c;
    }


    /**
     * Sets the sub_Category__c value for this EServiceAdministration.
     *
     * @param sub_Category__c
     */
    public void setSub_Category__c(String sub_Category__c) {
        this.sub_Category__c = sub_Category__c;
    }


    /**
     * Gets the systemModstamp value for this EServiceAdministration.
     *
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this EServiceAdministration.
     *
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    /**
     * Gets the total_Amount__c value for this EServiceAdministration.
     *
     * @return total_Amount__c
     */
    public double getTotal_Amount__c() {
        return total_Amount__c;
    }


    /**
     * Sets the total_Amount__c value for this EServiceAdministration.
     *
     * @param total_Amount__c
     */
    public void setTotal_Amount__c(double total_Amount__c) {
        this.total_Amount__c = total_Amount__c;
    }


    /**
     * Gets the visa_Type__c value for this EServiceAdministration.
     *
     * @return visa_Type__c
     */
    public String getVisa_Type__c() {
        return visa_Type__c;
    }


    /**
     * Sets the visa_Type__c value for this EServiceAdministration.
     *
     * @param visa_Type__c
     */
    public void setVisa_Type__c(String visa_Type__c) {
        this.visa_Type__c = visa_Type__c;
    }

    /**
     * Gets the eService_ERP_Details__c value for this EServiceAdministration.
     *
     * @return eService_ERP_Details__c
     */
    public String getEService_ERP_Details__c() {
        return eService_ERP_Details__c;
    }


    /**
     * Sets the eService_ERP_Details__c value for this EServiceAdministration.
     *
     * @param eService_ERP_Details__c
     */
    public void setEService_ERP_Details__c(String eService_ERP_Details__c) {
        this.eService_ERP_Details__c = eService_ERP_Details__c;
    }

    /**
     * Gets the isAvailableOnPortal__c value for this EServiceAdministration.
     *
     * @return isAvailableOnPortal__c
     */
    public Boolean getIsAvailableOnPortal__c() {
        return isAvailableOnPortal__c;
    }


    /**
     * Sets the isAvailableOnPortal__c value for this EServiceAdministration.
     *
     * @param isAvailableOnPortal__c
     */
    public void setIsAvailableOnPortal__c(Boolean isAvailableOnPortal__c) {
        this.isAvailableOnPortal__c = isAvailableOnPortal__c;
    }

}