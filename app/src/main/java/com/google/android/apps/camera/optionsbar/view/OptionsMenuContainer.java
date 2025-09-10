package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.irn;
import defpackage.ksf;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.nlr;
import defpackage.yf;
import j$.lang.Iterable$EL;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptionsMenuContainer extends RelativeLayout implements mxl {
    public mxj a;
    public final nlr b;
    public final ImageButton c;
    public final Context d;
    public final Set e;
    public boolean f;
    private final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsMenuContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new yf();
        this.f = false;
        this.b = new nlr(this);
        this.c = new ImageButton(context, null, 0, R.style.options_bar_rightside_option);
        this.d = context;
        if (context instanceof fdi) {
            this.g = ((fdi) context).b().p(gzo.bw);
        } else {
            this.g = false;
        }
    }

    public final View a() {
        return findViewById(R.id.options_menu_view);
    }

    public final View d() {
        return findViewById(R.id.options_menu_standalone_settings);
    }

    public final OptionsMenuView e() {
        return (OptionsMenuView) findViewById(R.id.options_menu_view_internal);
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        if (this.a != mxjVar) {
            this.a = mxjVar;
            k();
        }
        OptionsMenuView optionsMenuViewE = e();
        optionsMenuViewE.j = mxmVar;
        optionsMenuViewE.setNestedScrollingEnabled(mxmVar.d());
    }

    public final void f(ksf ksfVar) {
        this.e.add(ksfVar);
    }

    public final void g() {
        OptionsMenuView optionsMenuViewE = e();
        synchronized (optionsMenuViewE) {
            LinearLayout linearLayout = optionsMenuViewE.l;
            linearLayout.getClass();
            linearLayout.removeAllViews();
            optionsMenuViewE.h.clear();
        }
    }

    public final void h() {
        setEnabled(false);
    }

    public final void i() {
        setEnabled(true);
    }

    public final void j(ksf ksfVar) {
        this.e.remove(ksfVar);
    }

    public final void k() {
        if (this.f) {
            if (l()) {
                ImageButton imageButton = this.c;
                ((ViewManager) imageButton.getParent()).removeView(imageButton);
            }
            int i = this.i;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            ImageButton imageButton2 = this.c;
            imageButton2.setLayoutParams(layoutParams);
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.intent_close_container);
            frameLayout.getClass();
            frameLayout.addView(imageButton2);
        }
    }

    public final boolean l() {
        return this.c.getParent() != null;
    }

    public final boolean m() {
        nlr nlrVar = this.b;
        int i = nlrVar.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return nlrVar.b.getVisibility() == 0;
        }
        throw new RuntimeException(null, null);
    }

    public final void n() {
        Iterable$EL.forEach(this.e, new irn(16));
        e().o(33);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenuContainer:inflate");
        super.onFinishInflate();
        boolean z = this.g;
        this.h = z ? 0 : getResources().getDimensionPixelSize(R.dimen.bottom_panel_settings_button_height);
        this.i = getResources().getDimensionPixelSize(R.dimen.options_menu_top_bar_size);
        this.j = z ? 0 : getResources().getDimensionPixelOffset(R.dimen.bottom_panel_settings_button_top_margin);
        this.k = getResources().getDimensionPixelSize(z ? R.dimen.options_row_height : R.dimen.options_row_height_legacy);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.options_menu_container_bottomsheet, this);
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        if (View.MeasureSpec.getMode(i2) == 0) {
            e().i = 0;
        } else {
            int size = (View.MeasureSpec.getSize(i2) - this.j) - this.h;
            if (e().x() > 0 && (childAt = ((ViewGroup) e().getChildAt(0)).getChildAt(0)) != null && childAt.getMeasuredHeight() > 0) {
                this.k = childAt.getMeasuredHeight();
                if (e().x() > 1) {
                    View childAt2 = ((ViewGroup) e().getChildAt(0)).getChildAt(1);
                    if (childAt2.getMeasuredHeight() > 0 && childAt2.getMeasuredHeight() < this.k) {
                        this.k = childAt2.getMeasuredHeight();
                    }
                }
            }
            e().i = size < e().x() * this.k ? size : 0;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
