package com.google.android.apps.camera.wear.wearappv2.compose;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ape;
import defpackage.ayc;
import defpackage.bai;
import defpackage.bxg;
import defpackage.jsv;
import defpackage.nrg;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TapToOpenCameraUi extends bxg {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TapToOpenCameraUi(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2 = i & 1;
        ayc aycVarC = aycVar.c(-1384393220);
        if (i2 == 0 && aycVarC.G()) {
            aycVarC.r();
        } else {
            jsv.x(nrg.a, aycVarC, 6);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TapToOpenCameraUi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToOpenCameraUi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ TapToOpenCameraUi(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
