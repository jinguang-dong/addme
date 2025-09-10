package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.ird;
import defpackage.irn;
import defpackage.jjj;
import defpackage.krd;
import defpackage.krs;
import defpackage.ksa;
import defpackage.ksc;
import defpackage.ktj;
import defpackage.ktq;
import defpackage.mwq;
import defpackage.mxm;
import defpackage.sgt;
import defpackage.sgv;
import j$.util.Collection;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptionsMenuView extends NestedScrollView {
    private static final sgv n = sgv.g("com.google.android.apps.camera.optionsbar.view.OptionsMenuView");
    public final GestureDetector g;
    public final ArrayList h;
    public int i;
    public mxm j;
    public ksc k;
    public LinearLayout l;
    public mwq m;
    private final boolean o;
    private boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList();
        this.p = false;
        this.j = mxm.PORTRAIT;
        this.g = new GestureDetector(context, new ktq(this));
        if (context instanceof fdi) {
            this.o = ((fdi) context).b().p(gzo.bw);
        } else {
            this.o = false;
        }
    }

    public final void A(krs krsVar) {
        synchronized (this) {
            Collection.EL.removeIf(this.h, new krd(this, krsVar, 4));
        }
    }

    public final void B(krs krsVar, ksa ksaVar) {
        synchronized (this) {
            Collection.EL.stream(this.h).filter(new krd(krsVar, ksaVar, 3)).forEach(new ird(ksaVar, 18));
        }
    }

    public final boolean C(krs krsVar) {
        boolean zAnyMatch;
        synchronized (this) {
            zAnyMatch = Collection.EL.stream(this.h).anyMatch(new jjj(krsVar, 14));
        }
        return zAnyMatch;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenu:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.options_menu_layout, this);
        this.l = (LinearLayout) findViewById(R.id.options_menu_internal_list);
        setOnTouchListener(new ktj(this, 2));
        Trace.endSection();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g.onTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.p) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.i > 0 && mode != 1073741824 && (mode == 0 || View.MeasureSpec.getSize(i2) > this.i)) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.i, Integer.MIN_VALUE);
            }
        } else {
            try {
                int size = View.MeasureSpec.getSize(i2);
                int dimensionPixelSize = (this.i - getResources().getDimensionPixelSize(R.dimen.options_menu_setting_height)) - getResources().getDimensionPixelSize(R.dimen.options_menu_line_height);
                int i3 = dimensionPixelSize / (true != this.o ? R.dimen.options_row_height_legacy : R.dimen.options_row_height);
                if (size > dimensionPixelSize) {
                    size = (int) ((i3 - 0.5d) * 2.131167104E9d);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                getLayoutParams().height = size;
            } catch (RuntimeException e) {
                ((sgt) ((sgt) n.b().i(e)).M((char) 3451)).s("Error forcing height.");
            }
        }
        super.onMeasure(i, i2);
    }

    public final int x() {
        int size;
        synchronized (this) {
            size = this.h.size();
        }
        return size;
    }

    public final void y() {
        this.p = true;
        LinearLayout linearLayout = this.l;
        linearLayout.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        this.l.setLayoutParams(marginLayoutParams);
    }

    public final synchronized void z(krs krsVar) {
        Collection.EL.stream(this.h).filter(new jjj(krsVar, 15)).findFirst().ifPresent(new irn(20));
    }
}
