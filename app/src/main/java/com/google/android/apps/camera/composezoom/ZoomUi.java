package com.google.android.apps.camera.composezoom;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import defpackage.ape;
import defpackage.ayc;
import defpackage.azr;
import defpackage.azz;
import defpackage.bai;
import defpackage.bap;
import defpackage.bdq;
import defpackage.bxg;
import defpackage.fdi;
import defpackage.fvf;
import defpackage.gsn;
import defpackage.gvi;
import defpackage.gvj;
import defpackage.gwv;
import defpackage.gzo;
import defpackage.hhw;
import defpackage.inl;
import defpackage.ujk;
import defpackage.ujp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ZoomUi extends bxg {
    public gwv a;
    public final Rect b;
    public final boolean c;
    public final azr d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomUi(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1950786968);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            gsn.l(this.c, false, bdq.k(-341586436, new gvi(this, 0), aycVarC), aycVarC, 384, 2);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 7);
        }
    }

    public final gwv e() {
        gwv gwvVar = this.a;
        if (gwvVar != null) {
            return gwvVar;
        }
        ujp.c("viewModel");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomUi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ZoomUi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.b = new Rect();
        this.d = new azz(new RectF(), bap.c);
        ((gvj) ((inl) context).d(gvj.class)).a(this);
        int i2 = 1;
        boolean z = false;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) {
            z = true;
        }
        this.c = z;
        setOnHoverListener(new hhw(this, i2));
        addOnLayoutChangeListener(new fvf(this, 4));
    }

    public /* synthetic */ ZoomUi(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
