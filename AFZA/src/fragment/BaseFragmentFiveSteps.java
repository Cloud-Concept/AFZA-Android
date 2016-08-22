package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.cloudconcept.R;

import restAPI.RelatedServiceType;
import ui.BaseServiceActivity;
import utilities.Utilities;


/**
 * Created by Abanoub Wagdy on 8/25/2015.
 */
public class BaseFragmentFiveSteps extends Fragment implements View.OnClickListener {

    static FragmentManager fragmentManager;
    public static Button btnNext;
    public static Button btnCancel;
    public static Button btnBackTransparent;
    public static ImageView btnBack;
    public static Button btnNOC1;
    public static Button btnNOC2;
    public static Button btnNOC3;
    public static Button btnNOC4;
    public static Button btnNOC5;
    public static int status = 1;
    static FrameLayout frameLayout;
    public static TextView tvTitle;
    private static BaseServiceActivity activity;
    private static Button btnClose;
    private RelatedServiceType relatedServiceType;


    public static Fragment newInstance(RelatedServiceType relatedServiceType) {
        BaseFragmentFiveSteps fragment = new BaseFragmentFiveSteps();
        Bundle bundle = new Bundle();
        bundle.putSerializable("RelatedServiceType", relatedServiceType);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_base_service_five_steps, container, false);
        relatedServiceType = (RelatedServiceType) getArguments().get("RelatedServiceType");
        InitializeViews(view);
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content, getInitialFragment())
                .commit();
        activity = (BaseServiceActivity) getActivity();
        return view;
    }


    private void InitializeViews(View view) {

        btnNext = (Button) view.findViewById(R.id.btnNext);
        btnCancel = (Button) view.findViewById(R.id.btnCancel);
        btnBackTransparent = (Button) view.findViewById(R.id.btnBackTransparent);
        btnBack = (ImageView) view.findViewById(R.id.btnBack);
        tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        btnClose = (Button) view.findViewById(R.id.btnClose);

        btnNext.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnBackTransparent.setOnClickListener(this);
        btnBack.setOnClickListener(this);

        btnNOC1 = (Button) view.findViewById(R.id.btnNOC1);
        btnNOC2 = (Button) view.findViewById(R.id.btnNOC2);
        btnNOC3 = (Button) view.findViewById(R.id.btnNOC3);
        btnNOC4 = (Button) view.findViewById(R.id.btnNOC4);
        btnNOC5 = (Button) view.findViewById(R.id.btnNOC5);

        btnNOC1.setSelected(true);
        btnNOC1.setEnabled(true);

        frameLayout = (FrameLayout) view.findViewById(R.id.content);
    }

    @Override
    public void onClick(View v) {

        if (v == btnBack || v == btnBackTransparent) {
            PerformBackAction();
        } else if (v == btnNext) {
            PerformNextAction();
        } else if (v == btnCancel) {
            Utilities.showCustomNiftyDialog("Cancel Process", getActivity(), listenerOk1, "Are you sure want to cancel the process ?");
        }
    }

    public static void PerformNextAction() {
        if (status == 1) {
            frameLayout.removeAllViews();
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getSecondFragment())
                    .commitAllowingStateLoss();
            btnNOC1.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC1.setText("");
            btnNOC2.setSelected(true);
            status = 2;
        } else if (status == 2) {
            frameLayout.removeAllViews();
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getThirdFragment())
                    .commitAllowingStateLoss();
            btnNOC2.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC2.setText("");
            btnNOC3.setSelected(true);
            status = 3;
        } else if (status == 3) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FragmentTransaction fragmentTransaction;
            fragmentManager = activity.getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction
                    .replace(R.id.content, getFourthFragment())
                    .commitAllowingStateLoss();
            btnNOC3.setBackgroundResource(R.mipmap.bullet_success);
            btnNext.setText(activity.getApplicationContext().getResources().getString(R.string.pay_and_submit));
            btnNOC3.setText("");
            btnNOC4.setSelected(true);
            status = 4;
        } else if (status == 4) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FragmentTransaction fragmentTransaction;
            fragmentManager = activity.getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction
                    .replace(R.id.content, getFifthFragment())
                    .commitAllowingStateLoss();
            btnNOC4.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC4.setText("");
            btnNOC5.setSelected(true);

            btnBack.setVisibility(View.GONE);
            btnBackTransparent.setVisibility(View.GONE);
            btnNext.setVisibility(View.GONE);
            btnCancel.setVisibility(View.GONE);
            btnClose.setVisibility(View.VISIBLE);

            btnClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.finish();
                }
            });
            status = 5;
        }
    }

    private static void PerformBackAction() {
        if (status == 1) {
            Utilities.showCustomNiftyDialog("Cancel Process", activity, listenerOk1, "Are you sure want to cancel the process ?");
        } else if (status == 2) {

            frameLayout.removeAllViewsInLayout();
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getInitialFragment())
                    .commit();

            btnNOC1.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
            btnNOC1.setSelected(true);
            btnNOC1.setTextColor(activity.getResources().getColor(R.color.white));
            btnNOC1.setGravity(Gravity.CENTER);
            btnNOC1.setText("1");

            btnNOC2.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
            btnNOC2.setSelected(false);
            btnNOC2.setTextColor(activity.getResources().getColor(R.color.white));
            btnNOC2.setGravity(Gravity.CENTER);
            btnNOC2.setText("2");
            status = 1;

        } else if (status == 3) {
            frameLayout.removeAllViewsInLayout();
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getSecondFragment())
                    .commit();

            btnNOC2.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
            btnNOC2.setSelected(true);
            btnNOC2.setTextColor(activity.getResources().getColor(R.color.white));
            btnNOC2.setGravity(Gravity.CENTER);
            btnNOC2.setText("2");

            btnNOC3.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
            btnNOC3.setSelected(false);
            btnNOC3.setTextColor(activity.getResources().getColor(R.color.white));
            btnNOC3.setGravity(Gravity.CENTER);
            btnNOC3.setText("3");

            status = 2;
        } else if (status == 4) {
            frameLayout.removeAllViewsInLayout();
            fragmentManager = activity.getSupportFragmentManager();
            if (activity.isFoundDocuments() == false) {
                fragmentManager.beginTransaction()
                        .replace(R.id.content, getSecondFragment())
                        .commit();

                btnNOC2.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
                btnNOC2.setSelected(true);
                btnNOC2.setTextColor(activity.getResources().getColor(R.color.white));
                btnNOC2.setGravity(Gravity.CENTER);
                btnNOC2.setText("2");

                btnNOC3.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
                btnNOC3.setSelected(false);
                btnNOC3.setTextColor(activity.getResources().getColor(R.color.white));
                btnNOC3.setGravity(Gravity.CENTER);
                btnNOC3.setText("3");

                status = 2;
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.content, getThirdFragment())
                        .commit();

                btnNOC3.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
                btnNOC3.setSelected(true);
                btnNOC3.setTextColor(activity.getResources().getColor(R.color.white));
                btnNOC3.setGravity(Gravity.CENTER);
                btnNOC3.setText("3");

                status = 3;
            }

            btnNext.setText(activity.getResources().getString(R.string.next));
        }
    }

    private static View.OnClickListener listenerOk1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            status = 1;
            activity.finish();
        }
    };

    public static Fragment getInitialFragment() {
        return null;
    }

    public static Fragment getSecondFragment() {
        return null;
    }

    public static Fragment getThirdFragment() {
        return null;
    }

    public static Fragment getFourthFragment() {
        return null;
    }

    public static Fragment getFifthFragment() {
        GenericThankYouFragment fragment = GenericThankYouFragment.newInstance(activity.caseNumber, activity.TotalAmount, activity.mail);
        return fragment;
    }
}
