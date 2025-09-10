package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.mvn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LongPressElapsedTimeView extends FrameLayout {
    public Animation a;
    public Animation b;
    public ImageView c;
    public boolean d;
    public final Runnable e;
    private final int f;
    private final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public LongPressElapsedTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new mvn(this, 1);
        this.f = View.MeasureSpec.makeMeasureSpec(context.getResources().getDimensionPixelSize(R.dimen.timer_height), 1073741824);
        this.g = context instanceof fdi ? ((fdi) context).b().p(gzo.bw) : false;
    }

    public final View a() {
        return findViewById(R.id.long_shot_elapsed_time_chip);
    }

    public final TextView b() {
        if (this.g) {
            return null;
        }
        return (TextView) findViewById(R.id.long_shot_output_timer);
    }

    public final TextView c() {
        return (TextView) findViewById(R.id.long_shot_recording_timer);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.g) {
            layoutInflater.inflate(R.layout.longshot_elapsed_time_layout, this);
            a().setBackground(getResources().getDrawable(R.drawable.bg_elapsed_timer, null));
        } else {
            layoutInflater.inflate(R.layout.longshot_elapsed_time_layout_legacy, this);
            a().setBackground(getResources().getDrawable(R.drawable.top_shot_background, null));
        }
        this.a = AnimationUtils.loadAnimation(getContext(), R.anim.blink_animation);
        this.b = AnimationUtils.loadAnimation(getContext(), R.anim.blink_animation_2s);
        this.c = (ImageView) findViewById(R.id.indicator_icon);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Trace.beginSection("LongPressElapsedTimeView#requestLayout()");
        if (this.d) {
            this.d = false;
            if (!isLayoutRequested() && isLaidOut()) {
                onMeasure(View.MeasureSpec.makeMeasureSpec(((View) getParent()).getWidth(), 1073741824), this.f);
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                Trace.endSection();
                return;
            }
        }
        super.requestLayout();
        Trace.endSection();
    }
}
