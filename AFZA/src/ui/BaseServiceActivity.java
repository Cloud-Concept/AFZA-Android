package ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.cloudconcept.R;
import com.salesforce.androidsdk.rest.RestClient;
import com.salesforce.androidsdk.ui.SalesforceActivity;

import fragment.BaseFragmentFiveSteps;
import fragment.BaseFragmentFourSteps;
import fragment.BaseFragmentThreeSteps;
import model.EServiceAdministration;
import restAPI.RelatedServiceType;

/**
 * Created by Abanoub Wagdy on 5/4/2016.
 */
public class BaseServiceActivity extends SalesforceActivity {

    public String caseNumber, TotalAmount, mail;
    private FragmentManager fragmentManager;
    RelatedServiceType relatedServiceType;
    private boolean isFoundDocuments;
    private int numberScreens;
    private RestClient client;
    EServiceAdministration eServiceAdministration;
    Fragment fragment = null;

    public EServiceAdministration geteServiceAdministration() {
        return eServiceAdministration;
    }

    public void seteServiceAdministration(EServiceAdministration eServiceAdministration) {
        this.eServiceAdministration = eServiceAdministration;
    }

    public RestClient getClient() {
        return client;
    }

    public void setClient(RestClient client) {
        this.client = client;
    }

    public boolean isFoundDocuments() {
        return isFoundDocuments;
    }

    public void setIsFoundDocuments(boolean foundDocuments) {
        isFoundDocuments = foundDocuments;
    }

    @Override
    public void onResume(RestClient client) {
        this.client = client;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        setContentView(R.layout.layout_activity_base_service);
        relatedServiceType = (RelatedServiceType) getIntent().getSerializableExtra("RelatedServiceType");
        fragmentManager = getSupportFragmentManager();

        checkRelatedServiceType();

        if (numberScreens == 3) {
            fragment = BaseFragmentThreeSteps.newInstance(relatedServiceType);
        } else if (numberScreens == 4) {
            fragment = BaseFragmentFourSteps.newInstance(relatedServiceType);
        } else {
            fragment = BaseFragmentFiveSteps.newInstance(relatedServiceType);
        }

        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
        super.onResume();
    }

    public void PerformWizardNext() {
        if (numberScreens == 4) {
            BaseFragmentFourSteps.PerformNextAction();
        } else if (numberScreens == 5) {
            BaseFragmentFiveSteps.PerformNextAction();
        }
    }

    public void checkRelatedServiceType() {
        if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNameReservation) {
            numberScreens = 3;
        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCapitalChange) {
            numberScreens = 4;
        } else {
            numberScreens = 5;
        }
    }

    public int getNumberScreens() {
        return numberScreens;
    }

    public void setNumberScreens(int numberScreens) {
        this.numberScreens = numberScreens;
    }

    public RelatedServiceType getRelatedServiceType() {
        return relatedServiceType;
    }

    public void setRelatedServiceType(RelatedServiceType relatedServiceType) {
        this.relatedServiceType = relatedServiceType;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
