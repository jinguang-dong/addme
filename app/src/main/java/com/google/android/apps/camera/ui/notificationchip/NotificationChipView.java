package com.google.android.apps.camera.ui.notificationchip;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.ir;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.nam;
import defpackage.nlj;
import defpackage.oer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NotificationChipView extends ir {
    public final Context a;
    public int b;
    public boolean c;
    public nam d;
    public mxj e;
    public long f;
    public Runnable g;
    public final oer h;
    private FrameLayout.LayoutParams i;

    public NotificationChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new oer();
        this.e = mxj.PHONE_LAYOUT;
        this.a = context;
    }

    public final void a() {
        removeCallbacks(this.g);
    }

    public final void b() {
        FrameLayout.LayoutParams layoutParams;
        if (getDisplay() == null || this.i == null) {
            return;
        }
        Display display = getDisplay();
        Context context = this.a;
        mxm mxmVarI = nlj.i(display, context);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
        Resources resources = context.getResources();
        if (this.e.a()) {
            layoutParams = new FrameLayout.LayoutParams(this.i);
            layoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.notification_chip_layout_top_margin_tab);
        } else if (mxmVarI == mxm.PORTRAIT) {
            int dimensionPixelSize = ((Activity) context).isInMultiWindowMode() ? resources.getDimensionPixelSize(R.dimen.notification_chip_layout_margin_with_split_screen) : resources.getDimensionPixelSize(R.dimen.notification_chip_layout_margin_with_options_menu_closed_icon);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.i);
            layoutParams3.topMargin = dimensionPixelSize;
            layoutParams = layoutParams3;
        } else if (mxmVarI == mxm.REVERSE_LANDSCAPE) {
            layoutParams = new FrameLayout.LayoutParams(this.i);
            layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.notification_chip_layout_top_margin_landscape);
            layoutParams.gravity = 81;
        } else if (mxmVarI == mxm.LANDSCAPE) {
            layoutParams = new FrameLayout.LayoutParams(this.i);
            layoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.notification_chip_layout_top_margin_landscape);
        } else {
            layoutParams = this.i;
        }
        if (layoutParams2.topMargin == layoutParams.topMargin && layoutParams2.bottomMargin == layoutParams.bottomMargin && layoutParams2.gravity == layoutParams.gravity) {
            return;
        }
        setLayoutParams(layoutParams);
    }

    public final void c(int i) {
        postDelayed(this.g, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = (FrameLayout.LayoutParams) getLayoutParams();
    }
}
