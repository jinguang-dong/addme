package com.google.android.apps.camera.wear.wearappv2.elapsedtimer;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ape;
import defpackage.arv;
import defpackage.ayc;
import defpackage.bai;
import defpackage.bdq;
import defpackage.bkv;
import defpackage.bxg;
import defpackage.con;
import defpackage.inl;
import defpackage.jsv;
import defpackage.nrj;
import defpackage.nrk;
import defpackage.ujk;
import defpackage.ujp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ComposeElapsedTimerUi extends bxg {
    static {
        long j = bkv.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeElapsedTimerUi(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public static final void e() {
        ujp.c("wearElapsedTimeViewModel");
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(77026867);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            jsv.x(bdq.k(595345681, new arv(8), aycVarC), aycVarC, 6);
            con.i(this, new nrj(this));
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeElapsedTimerUi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeElapsedTimerUi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ((nrk) ((inl) context).d(nrk.class)).a();
    }

    public /* synthetic */ ComposeElapsedTimerUi(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
