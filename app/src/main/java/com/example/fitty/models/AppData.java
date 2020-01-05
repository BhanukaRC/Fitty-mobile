package com.example.fitty.models;

import com.example.fitty.R;

public class AppData {

    public static final String SHARED_PREF = "account_preferences";

    public static final String FIRST_TIME = "first_time_login";

    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String GENDER = "gender";
    public static final String HEIGHT = "height";
    public static final String WEIGHT = "weight";

    public static final int RUN_INIT_STATE = 1;
    public static final int RUN_ACTIVE_STATE = 2;
    public static final int RUN_FINAL_STATE = 3;

    public static final String RECEIVER_CODE = "code_de_receive";
    public static final int COUNTER_START_RECEIVER = 34;
    public static final int COUNTER_STOP_RECEIVER = 35;

    public static final int CHART_LIMIT = 30;
    public static final int[] CHART_VIEW_IDS = {
            R.layout.view_step_chart,
            R.layout.view_run_chart,
            R.layout.view_sleep_chart
    };
}
