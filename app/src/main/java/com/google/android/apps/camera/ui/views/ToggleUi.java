package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.con;
import defpackage.ctj;
import defpackage.cto;
import defpackage.ctp;
import defpackage.dth;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.lig;
import defpackage.mdw;
import defpackage.mmr;
import defpackage.mms;
import defpackage.mmw;
import defpackage.muu;
import defpackage.mxm;
import defpackage.ndk;
import defpackage.nhp;
import defpackage.nhq;
import defpackage.ojl;
import defpackage.sgt;
import defpackage.sgv;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ToggleUi extends FrameLayout {
    public static final sgv a;
    public LinearLayout b;
    public ToggleButton c;
    public View d;
    public TextView e;
    public Runnable f;
    public Runnable g;
    public Integer h;
    public muu i;
    private mxm j;
    private final List k;

    /* compiled from: PG */
    public class ToggleButton extends ImageButton {
        private static final sgv a = sgv.g("com.google.android.apps.camera.ui.views.ToggleUi$ToggleButton");

        public ToggleButton(Context context) {
            super(context);
        }

        @Override // android.view.View
        public final void setScaleX(float f) {
            ((sgt) a.c().M(5382)).v("setScaleX ignored %s", Float.valueOf(f));
        }

        @Override // android.view.View
        public final void setScaleY(float f) {
            ((sgt) a.c().M(5383)).v("setScaleY ignored %s", Float.valueOf(f));
        }

        public ToggleButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    static {
        Duration.ofMillis(200L);
        a = sgv.g("com.google.android.apps.camera.ui.views.ToggleUi");
    }

    public ToggleUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = mxm.PORTRAIT;
        this.f = new ndk(7);
        this.g = new ndk(8);
        this.k = new ArrayList();
        this.h = null;
    }

    private final void h(float f, float f2, cto ctoVar, mmw mmwVar) {
        ctp ctpVar = new ctp(f2);
        ctpVar.e(mmwVar.b);
        ctpVar.c(mmwVar.a);
        ctoVar.s = ctpVar;
        ctoVar.l(f);
        ctoVar.g();
        this.k.add(ctoVar);
    }

    public final mmw a() {
        Object context = this.e.getContext();
        return ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) ? mmr.e : mms.d;
    }

    public final String b() {
        return this.e.getText().toString();
    }

    public final void c(View view, float f, float f2, mmw mmwVar) {
        h(f, f2, new cto(view, ctj.g, f2), mmwVar);
    }

    public final void d(View view, float f, float f2, mmw mmwVar, Runnable runnable) {
        cto ctoVar = new cto(view, ctj.a, f2);
        if (runnable != null) {
            ctoVar.i(new dth(this, runnable, 2));
        }
        h(f, f2, ctoVar, mmwVar);
    }

    public final void e(mxm mxmVar) {
        this.j = mxmVar;
        Iterable$EL.forEach(ojl.bj(this.b), new mdw(mxmVar, 11));
    }

    public final void f() {
        removeCallbacks(this.f);
        removeCallbacks(this.g);
        lig ligVar = new lig(9);
        List list = this.k;
        Iterable$EL.forEach(list, ligVar);
        list.clear();
        g();
    }

    public final void g() {
        this.e.setVisibility(8);
        this.e.setTranslationX(0.0f);
        this.c.setTranslationX(0.0f);
        Integer num = this.h;
        if (num != null) {
            this.d.setVisibility(num.intValue());
            this.h = null;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ToggleUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.toggle_view_contents, this);
        Trace.endSection();
        this.b = (LinearLayout) findViewById(R.id.toggle_container);
        this.c = (ToggleButton) findViewById(R.id.toggle_button);
        this.e = (TextView) findViewById(R.id.toggle_hint);
        this.d = findViewById(R.id.beta_content);
        con.i(this.b, new nhq());
        this.f = new nhp(this, 0);
        this.g = new nhp(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            e(this.j);
        }
    }
}
