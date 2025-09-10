package com.google.android.apps.camera.wear.wearappv2.ui.supermodeswitcher;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ape;
import defpackage.ayc;
import defpackage.bai;
import defpackage.bp;
import defpackage.bxg;
import defpackage.cqh;
import defpackage.cxb;
import defpackage.cxp;
import defpackage.cxy;
import defpackage.gzi;
import defpackage.hay;
import defpackage.inl;
import defpackage.nso;
import defpackage.ujk;
import defpackage.ujp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearSupermodeSwitcher extends bxg {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WearSupermodeSwitcher(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(7102573);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !aycVarC.G()) {
            ujp.c("wcaConfig");
            gzi gziVar = hay.a;
            throw null;
        }
        aycVarC.r();
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 18);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WearSupermodeSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearSupermodeSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ((nso) ((inl) context).d(nso.class)).a();
        bp bpVar = (bp) context;
        cxb viewModelStore$ar$class_merging = bpVar.getViewModelStore$ar$class_merging();
        cxp defaultViewModelProviderFactory = bpVar.getDefaultViewModelProviderFactory();
        cxy cxyVarD = cqh.d(bpVar);
        defaultViewModelProviderFactory.getClass();
        cxyVarD.getClass();
    }

    public /* synthetic */ WearSupermodeSwitcher(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
