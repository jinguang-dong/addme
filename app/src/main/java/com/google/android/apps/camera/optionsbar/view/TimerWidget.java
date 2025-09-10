package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.ar.core.R;
import defpackage.kto;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TimerWidget extends LinearLayoutCompat {
    public kto a;

    public TimerWidget(Context context) {
        super(context);
    }

    public final LinearLayout a() {
        return (LinearLayout) findViewById(R.id.timer_widget_row_holder);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("timerWidget:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.timer_widget, this);
        Trace.endSection();
    }

    public TimerWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimerWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
