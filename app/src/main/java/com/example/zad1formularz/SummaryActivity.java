package com.example.zad1formularz;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "NAME";
    public static final String EXTRA_EMAIL = "EMAIL";
    public static final String EXTRA_COURSE = "COURSE";
    public static final String EXTRA_LEVEL = "LEVEL";
    public static final String EXTRA_NEWSLETTER = "NEWSLETTER";

    TextView tvSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        tvSummary = findViewById(R.id.tvSummary);
        tvSummary.setText(buildSummary());

        findViewById(R.id.btnEdit).setOnClickListener(v -> finish());
    }

    private String buildSummary() {

        Intent intent = getIntent();

        String name = intent.getStringExtra(EXTRA_NAME);
        String email = intent.getStringExtra(EXTRA_EMAIL);
        String course = intent.getStringExtra(EXTRA_COURSE);
        int level = intent.getIntExtra(EXTRA_LEVEL, 0);
        boolean newsletter =
                intent.getBooleanExtra(EXTRA_NEWSLETTER, false);

        String newsletterText = getString(R.string.no_short);

        if (newsletter) {
            newsletterText = getString(R.string.yes_short);
        }

        return getString(
                R.string.summary_format,
                name, email, course, level, newsletterText);
    }
}
