package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.cloudconcept.R;

import custom.customdialog.NiftyDialogBuilder;
import restAPI.RelatedServiceType;
import ui.BaseServiceActivity;
import utilities.Utilities;

/**
 * Created by Abanoub Wagdy on 5/5/2016.
 */
public class BaseFragmentFourSteps extends Fragment implements View.OnClickListener {

    static FragmentManager fragmentManager;
    public static Button btnNext;
    public static Button btnCancel;
    public static Button btnBackTransparent;
    public static ImageView btnBack;
    public static Button btnNOC1;
    public static Button btnNOC2;
    public static Button btnNOC3;
    public static Button btnNOC4;
    public static Button btnClose;
    //    View line1, line2, line3, line4, line5;
    private static NiftyDialogBuilder builder;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static int status = 1;
    static FrameLayout frameLayout;
    static BaseServiceActivity activity;
    public static TextView tvTitle;

    RelatedServiceType relatedServiceType;

    public static Fragment newInstance(RelatedServiceType relatedServiceType) {
        BaseFragmentFourSteps fragment = new BaseFragmentFourSteps();
        Bundle bundle = new Bundle();
        bundle.putSerializable("RelatedServiceType", relatedServiceType);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_base_service_four_steps, container, false);
        if (savedInstanceState != null) {
            relatedServiceType = (RelatedServiceType) getArguments().get("RelatedServiceType");
        }
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
        btnClose = (Button) view.findViewById(R.id.btnClose);
        btnBackTransparent = (Button) view.findViewById(R.id.btnBackTransparent);
        btnBack = (ImageView) view.findViewById(R.id.btnBack);
        tvTitle = (TextView) view.findViewById(R.id.tvTitle);

        btnNext.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnBackTransparent.setOnClickListener(this);
        btnBack.setOnClickListener(this);

        btnNOC1 = (Button) view.findViewById(R.id.btnNOC1);
        btnNOC2 = (Button) view.findViewById(R.id.btnNOC2);
        btnNOC3 = (Button) view.findViewById(R.id.btnNOC3);
        btnNOC4 = (Button) view.findViewById(R.id.btnNOC4);

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
            builder = Utilities.showCustomNiftyDialog("Cancel Process", getActivity(), listenerOk1, "Are you sure want to cancel the process ?");
        }
    }

    public static void PerformNextAction() {
        if (status == 1) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getSecondFragment())
                    .commitAllowingStateLoss();
            btnNOC1.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC1.setText("");
            btnNOC2.setSelected(true);
            status = 2;
        } else if (status == 2) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getThirdFragment())
                    .commitAllowingStateLoss();
            btnNOC2.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC2.setText("");
            btnNOC3.setSelected(true);
            btnNext.setText("Pay & Submit");
            status = 3;
        } else if (status == 3) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, getFourthFragment())
                    .commitAllowingStateLoss();
            btnNOC3.setBackgroundResource(R.mipmap.bullet_success);
            btnNOC3.setText("");
            btnNOC4.setSelected(true);
            status = 4;
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
        }
    }

    public static void PerformBackAction() {
        if (status == 1) {
            builder = Utilities.showCustomNiftyDialog("Cancel Process", activity, listenerOk1, "Are you sure want to cancel the process ?");
        } else if (status == 2) {
            btnNOC2.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
            btnNOC2.setSelected(false);
            btnNOC2.setTextColor(activity.getResources().getColor(R.color.white));
            btnNOC2.setGravity(Gravity.CENTER);
            btnNOC2.setText("2");
            status = 1;
        } else if (status == 3) {
            frameLayout.removeAllViewsInLayout();
            fragmentManager = activity.getSupportFragmentManager();
            if (activity.isFoundDocuments() == false) {
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
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.content, getSecondFragment())
                        .commit();
                btnNOC2.setBackground(activity.getResources().getDrawable(R.drawable.noc_selector));
                btnNOC2.setSelected(true);
                btnNOC2.setTextColor(activity.getResources().getColor(R.color.white));
                btnNOC2.setGravity(Gravity.CENTER);
                btnNOC2.setText("2");
                status = 2;
            }

            btnNext.setText(activity.getResources().getString(R.string.next));
        }
    }

    private static Fragment getInitialFragment() {
        return null;
    }

    private static Fragment getSecondFragment() {
        return null;
    }

    private static Fragment getThirdFragment() {
        return null;
    }

    private static Fragment getFourthFragment() {
        GenericThankYouFragment fragment = GenericThankYouFragment.newInstance(activity.caseNumber, activity.TotalAmount, activity.mail);
        return fragment;
    }

    private static View.OnClickListener listenerOk1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            status = 1;
            builder.dismiss();
            activity.finish();
        }
    };
}
