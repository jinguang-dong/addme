package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.cog;
import defpackage.con;
import defpackage.pmg;
import defpackage.rkv;
import defpackage.rkw;
import defpackage.rlg;
import defpackage.rnx;
import defpackage.roc;
import defpackage.rqb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final String i = "FloatingToolbarLayout";
    private static final int j = 2132085240;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    private Rect k;

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.k;
        if (rect == null) {
            Log.w(i, "Unable to update margins because original view margins are not set");
            return;
        }
        int i2 = rect.left + (this.a ? this.g : 0);
        int i3 = this.k.right + (this.c ? this.h : 0);
        int i4 = this.k.top + (this.b ? this.f : 0);
        int i5 = this.k.bottom + (this.d ? this.e : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i5 && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.topMargin == i4) {
            return;
        }
        marginLayoutParams.bottomMargin = i5;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.topMargin = i4;
        requestLayout();
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.k = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        a();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, j);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(rqb.a(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        pmg pmgVarD = rlg.d(context2, attributeSet, rkw.a, i2, i3, new int[0]);
        if (pmgVarD.F(0)) {
            int iG = pmgVarD.G();
            rnx rnxVar = new rnx(new roc(roc.c(context2, attributeSet, i2, i3)));
            rnxVar.n(ColorStateList.valueOf(iG));
            setBackground(rnxVar);
        }
        this.a = pmgVarD.E(2, true);
        this.b = pmgVarD.E(4, false);
        this.c = pmgVarD.E(3, true);
        this.d = pmgVarD.E(1, true);
        rkv rkvVar = new rkv(this, 0);
        int[] iArr = con.a;
        cog.i(this, rkvVar);
        pmgVarD.D();
    }
}
