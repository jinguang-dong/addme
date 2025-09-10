package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.iwh;
import defpackage.kcm;
import defpackage.mjh;
import defpackage.mle;
import defpackage.mxm;
import defpackage.sgv;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ToastView extends FrameLayout {
    public static final Duration d = Duration.ofMillis(300);
    public static final Duration e = Duration.ofMillis(300);
    public static final sgv f = sgv.g("com.google.android.apps.camera.toast.ToastView");
    private View a;
    private boolean b;
    public float g;
    public long h;
    public Runnable i;
    public Runnable j;
    public Runnable k;
    public Runnable l;
    public PopupWindow m;
    public View n;

    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new iwh(16);
        this.j = new iwh(17);
        this.k = new iwh(18);
        this.l = new iwh(19);
        this.b = false;
    }

    public void a(mle mleVar) {
        TextView textView = (TextView) findViewById(R.id.toast_text_view);
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = (TextView) findViewById(R.id.toast_learn_more_text_view);
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        if (!mleVar.e) {
            this.h = (mleVar.b() - e.toMillis()) - d.toMillis();
            this.i = new mjh(this, 15);
        }
        f(mleVar);
        d();
        this.j = mleVar.c;
        this.k = mleVar.g;
        this.l = mleVar.d;
        this.b = mleVar.f;
        View viewFindViewById = findViewById(R.id.toast_inner_layout);
        this.a = viewFindViewById;
        if (viewFindViewById != null) {
            int i = mleVar.b;
            if (i != 0) {
                viewFindViewById.setBackgroundResource(i);
            }
            int paddingBottom = this.a.getPaddingBottom();
            this.g = TypedValue.applyDimension(0, paddingBottom + paddingBottom, getResources().getDisplayMetrics());
        }
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.a.setOnClickListener(new kcm(this, 20));
    }

    public final PopupWindow d() {
        PopupWindow popupWindow = new PopupWindow(new View(getContext()), 1, 1);
        this.m = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.m.setOutsideTouchable(true);
        return this.m;
    }

    public final void e() {
        Runnable runnable = this.i;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        setAlpha(0.0f);
        this.m.dismiss();
        removeAllViews();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(this);
    }

    public final void f(mle mleVar) {
        this.n = mleVar.a;
    }

    public final void g() {
        animate().alpha(1.0f).setDuration(d.toMillis()).withEndAction(new mjh(this, 14)).translationYBy(-this.g).start();
    }

    public void c(mxm mxmVar) {
    }
}
