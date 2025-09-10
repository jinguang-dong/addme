package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ElapsedTimerView extends FrameLayout {
    private final int a;
    private final boolean b;
    private boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public ElapsedTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = View.MeasureSpec.makeMeasureSpec(context.getResources().getDimensionPixelSize(R.dimen.timer_height), 1073741824);
        this.b = context instanceof fdi ? ((fdi) context).b().p(gzo.bw) : false;
    }

    public final View a() {
        return findViewById(R.id.elapsed_time_chip);
    }

    public final ImageView b() {
        return (ImageView) findViewById(R.id.speech_enhance_view);
    }

    public final TextView c() {
        return (TextView) findViewById(R.id.output_timer);
    }

    public final TextView d() {
        return (TextView) findViewById(R.id.recording_timer);
    }

    public final void e(String str) {
        this.c = true;
        c().setText(str);
    }

    public final void f(String str) {
        this.c = true;
        d().setText(str);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(true != this.b ? R.layout.elapsed_time_layout_legacy : R.layout.elapsed_time_layout, this);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Trace.beginSection("ElapsedTimerView#requestLayout()");
        if (this.c) {
            this.c = false;
            if (!isLayoutRequested() && isLaidOut()) {
                onMeasure(View.MeasureSpec.makeMeasureSpec(((View) getParent()).getWidth(), 1073741824), this.a);
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                Trace.endSection();
                return;
            }
        }
        super.requestLayout();
        Trace.endSection();
    }
}
