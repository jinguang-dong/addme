package com.google.android.apps.camera.ui.remotecontrol;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteControlView extends FrameLayout {
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public View e;
    public View f;
    private LinearLayout g;
    private int h;

    public RemoteControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void b(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.topMargin = this.h;
        layoutParams.bottomMargin = this.h;
        layoutParams.gravity = i | 1;
        this.g.setLayoutParams(layoutParams);
    }

    public final void a() {
        this.b.setText("--");
        this.a.setText("--");
        this.c.setText("");
        this.e.setVisibility(8);
        this.d.setText("");
        this.f.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("RemoteControlUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.remote_control_view_contents, this);
        this.a = (TextView) findViewById(R.id.device_battery);
        this.b = (TextView) findViewById(R.id.phone_battery);
        this.c = (TextView) findViewById(R.id.water_depth);
        this.d = (TextView) findViewById(R.id.water_temp);
        this.e = findViewById(R.id.water_depth_container);
        this.f = findViewById(R.id.water_temp_container);
        this.g = (LinearLayout) findViewById(R.id.remote_control_content);
        this.h = getResources().getDimensionPixelSize(R.dimen.remote_control_view_margin);
        a();
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r3, int r4) {
        /*
            r2 = this;
            android.view.Display r0 = r2.getDisplay()
            android.content.Context r1 = r2.getContext()
            mxm r0 = defpackage.nlj.i(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L28
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L28
            goto L3d
        L1c:
            r0 = 48
            r2.b(r0)
            goto L3d
        L22:
            r0 = 80
            r2.b(r0)
            goto L3d
        L28:
            android.widget.LinearLayout r0 = r2.g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r2.h
            r0.topMargin = r1
            r1 = 49
            r0.gravity = r1
            android.widget.LinearLayout r1 = r2.g
            r1.setLayoutParams(r0)
        L3d:
            super.onMeasure(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.remotecontrol.RemoteControlView.onMeasure(int, int):void");
    }
}
