package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import com.cloudconcept.R;

import model.FormField;
import restAPI.RelatedServiceType;
import utilities.Utilities;

/**
 * Created by Abanoub Wagdy on 10/26/2015.
 */
public class GenericPayAndSubmitFragment extends Fragment {

    LinearLayout linearLayout;
    RelatedServiceType relatedServiceType;
    String personName;
    String RefNumber;
    String Date;
    String Status;
    String TotalAmount;
    ArrayList<FormField> formFields;

    public static GenericPayAndSubmitFragment newInstance(RelatedServiceType relatedServiceType, String personName, String RefNumber, String Date, String Status, String TotalAmount, ArrayList<FormField> formFields) {
        GenericPayAndSubmitFragment fragment = new GenericPayAndSubmitFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("relatedServiceType", relatedServiceType);
        bundle.putString("personName", personName);
        bundle.putString("RefNumber", RefNumber);
        bundle.putString("Date", Date);
        bundle.putString("Status", Status);
        bundle.putString("TotalAmount", TotalAmount);
        bundle.putSerializable("formFields", formFields);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.empty_view, container, false);
        linearLayout = (LinearLayout) view.findViewById(R.id.linear);
        relatedServiceType = (RelatedServiceType) getArguments().get("relatedServiceType");
        personName = getArguments().getString("personName");
        RefNumber = getArguments().getString("RefNumber");
        Date = getArguments().getString("Date");
        Status = getArguments().getString("Status");
        TotalAmount = getArguments().getString("TotalAmount");
        formFields = (ArrayList<FormField>) getArguments().get("formFields");
//        View inflatedView = Utilities.DrawGenericPayAndSubmitView(getActivity(), relatedServiceType, personName, RefNumber, Date, Status, TotalAmount, formFields, card_management__c, noc__c);
//        linearLayout.removeAllViews();
//        linearLayout.addView(inflatedView);
        return view;
    }
}
