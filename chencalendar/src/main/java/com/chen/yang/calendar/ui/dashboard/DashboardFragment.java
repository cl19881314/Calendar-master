package com.chen.yang.calendar.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.chen.yang.calendar.CalculationDaysUtil;
import com.chen.yang.calendar.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final EditText month = root.findViewById(R.id.edtMonth);
        final EditText day = root.findViewById(R.id.edtDay);
        final TextView totalDayView = root.findViewById(R.id.txtResult);
        root.findViewById(R.id.btnCalculation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                CalculationDaysUtil.getLunarCalculationDays();
                int totalDay = CalculationDaysUtil.getSolarCalculationDays(Integer.valueOf(month.getText().toString()), Integer.valueOf(day.getText().toString()));
                int totalDay2 = CalculationDaysUtil.getLunarCalculationDays(Integer.valueOf(month.getText().toString()), Integer.valueOf(day.getText().toString()));
                totalDayView.setText(totalDay + " " + totalDay2);
            }
        });

        return root;
    }


}
