package com.google.android.apps.camera.wear.wearappv2.ui.settings;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.amd;
import defpackage.ape;
import defpackage.aqb;
import defpackage.asu;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayp;
import defpackage.bai;
import defpackage.bbo;
import defpackage.bdq;
import defpackage.bih;
import defpackage.bik;
import defpackage.bko;
import defpackage.bkv;
import defpackage.bne;
import defpackage.bp;
import defpackage.bxg;
import defpackage.byi;
import defpackage.byx;
import defpackage.cbp;
import defpackage.clc;
import defpackage.cqh;
import defpackage.cwq;
import defpackage.cxb;
import defpackage.cxp;
import defpackage.cxs;
import defpackage.cxy;
import defpackage.dpf;
import defpackage.gno;
import defpackage.jkc;
import defpackage.jsv;
import defpackage.ltw;
import defpackage.nrp;
import defpackage.nrx;
import defpackage.nsc;
import defpackage.uet;
import defpackage.uif;
import defpackage.uiq;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ComposeMenuButton extends bxg {
    public final bp a;
    public final nrx b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeMenuButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private static final ltw g(bbo bboVar) {
        return (ltw) bboVar.a();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-760392537);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            jsv.x(bdq.k(1953568777, new asu(this, 7), aycVarC), aycVarC, 6);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 15);
        }
    }

    public final void e(nrx nrxVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(817424507);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nrxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayp aypVar = AndroidCompositionLocals_androidKt.c;
            float f = ((Resources) aycVarC.e(aypVar)).getFloat(R.dimen.wear_menu_button_width_ratio);
            float f2 = ((Resources) aycVarC.e(aypVar)).getFloat(R.dimen.wear_menu_button_height_ratio);
            ayp aypVar2 = AndroidCompositionLocals_androidKt.a;
            long jT = a.t(((Configuration) aycVarC.e(aypVar2)).screenWidthDp * f, ((Configuration) aycVarC.e(aypVar2)).screenHeightDp * f2);
            long j = bkv.a;
            dpf dpfVar = new dpf(bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.6f, bkv.f(j)), bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.6f, bkv.f(j)), bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.6f, bkv.f(j)), bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.6f, bkv.f(j)));
            bih bihVar = bik.c;
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new nsc(i4);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarAg = clc.ag(amd.d(byi.aH(cbp.b(bihVar, false, (uiq) objR), 9.0f, 13.0f), jT), "show_action_menu");
            aycVarC.u(5004770);
            boolean zD = aycVarC.D(this);
            Object objR2 = aygVar.R();
            if (zD || objR2 == obj) {
                objR2 = new jkc(this, 12);
                aygVar.ac(objR2);
            }
            aygVar.Y();
            AmbientModeSupport.AmbientCallback.j((uif) objR2, bikVarAg, false, null, dpfVar, bdq.k(2008527219, new nrp(this, nrxVar), aycVarC), aycVarC, 806879232);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, nrxVar, i, i5);
        }
    }

    public final void f(nrx nrxVar, ayc aycVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        ayc aycVarC = aycVar.c(-2120718513);
        if (i4 == 0) {
            i2 = (true != aycVarC.D(nrxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            cwq cwqVar = nrxVar.h;
            ltw ltwVar = ltw.OFF;
            bbo bboVarAb = byi.ab(cwqVar, ltwVar, aycVarC);
            ltw ltwVarG = g(bboVarAb);
            if (ltwVarG == ltwVar || ltwVarG == ltw.THREE || ltwVarG == ltw.FIVE || ltwVarG == ltw.TEN) {
                int iOrdinal = g(bboVarAb).ordinal();
                int i5 = 0;
                if (iOrdinal == 0) {
                    i3 = R.drawable.quantum_gm_ic_menu_white_24;
                } else if (iOrdinal == 1) {
                    i3 = R.drawable.gs_timer_3_alt_1_vd_theme_24;
                } else if (iOrdinal == 2) {
                    i3 = R.drawable.gs_timer_5_vd_theme_24;
                } else if (iOrdinal == 3) {
                    i3 = R.drawable.gs_timer_10_alt_1_vd_theme_24;
                } else {
                    if (iOrdinal != 4) {
                        throw new uet();
                    }
                    i3 = 0;
                }
                bne bneVarD = byx.d(i3, aycVarC, 0);
                int iOrdinal2 = g(bboVarAb).ordinal();
                if (iOrdinal2 == 0) {
                    i5 = R.string.wear_menu_button_content_description;
                } else if (iOrdinal2 == 1) {
                    i5 = R.string.timer_3_seconds_option_desc;
                } else if (iOrdinal2 == 2) {
                    i5 = R.string.timer_5_seconds_option_desc;
                } else if (iOrdinal2 == 3) {
                    i5 = R.string.timer_10_seconds_option_desc;
                } else if (iOrdinal2 != 4) {
                    throw new uet();
                }
                AmbientModeSupport.AmbientCallback.h(bneVarD, clc.ae(i5, aycVarC), amd.c(bik.c, byx.c(R.dimen.wear_menu_button_icon_size, aycVarC)), bkv.b, aycVarC, 3072);
            }
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, nrxVar, i, 17);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        bp bpVar = (bp) context;
        this.a = bpVar;
        bpVar.getClass();
        cxb viewModelStore$ar$class_merging = bpVar.getViewModelStore$ar$class_merging();
        cxp defaultViewModelProviderFactory = bpVar.getDefaultViewModelProviderFactory();
        cxy cxyVarD = cqh.d(bpVar);
        defaultViewModelProviderFactory.getClass();
        cxyVarD.getClass();
        this.b = (nrx) cxs.a(nrx.class, new gno(viewModelStore$ar$class_merging, defaultViewModelProviderFactory, cxyVarD));
    }

    public /* synthetic */ ComposeMenuButton(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
