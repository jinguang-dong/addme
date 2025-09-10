package com.google.android.apps.camera.wear.wearappv2.ui.countdown;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import defpackage.abr;
import defpackage.abs;
import defpackage.ape;
import defpackage.aqb;
import defpackage.asu;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayd;
import defpackage.ayg;
import defpackage.azb;
import defpackage.bai;
import defpackage.bdq;
import defpackage.bib;
import defpackage.bik;
import defpackage.bkv;
import defpackage.bp;
import defpackage.bxg;
import defpackage.bze;
import defpackage.cdo;
import defpackage.cfm;
import defpackage.cfn;
import defpackage.cfo;
import defpackage.chp;
import defpackage.chq;
import defpackage.clc;
import defpackage.cqh;
import defpackage.cxb;
import defpackage.cxp;
import defpackage.cxs;
import defpackage.cxy;
import defpackage.dob;
import defpackage.dou;
import defpackage.drp;
import defpackage.gno;
import defpackage.jkc;
import defpackage.jsv;
import defpackage.nrm;
import defpackage.qqq;
import defpackage.sw;
import defpackage.uhb;
import defpackage.uhg;
import defpackage.uif;
import defpackage.uiu;
import defpackage.ujk;
import defpackage.und;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearCountdownView extends bxg {
    public static final /* synthetic */ int b = 0;
    private static final long c = chp.C(96);
    public final nrm a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WearCountdownView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1645143409);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else if (((Boolean) this.a.a.a()).booleanValue()) {
            jsv.x(bdq.k(1640143956, new asu(this, 6), aycVarC), aycVarC, 6);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 14);
        }
    }

    public final void e(String str, ayc aycVar, int i) {
        int i2;
        abr abrVar;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1158606739);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = azb.a(uhg.a, aycVarC);
                aygVar.ac(objR);
            }
            und undVar = (und) objR;
            aycVarC.u(1849434622);
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                objR2 = abs.a(0.0f);
                aygVar.ac(objR2);
            }
            abr abrVar2 = (abr) objR2;
            aygVar.Y();
            aycVarC.u(-1224400529);
            boolean zD = ((i2 & 14) == 4) | aycVarC.D(undVar) | aycVarC.D(this) | aycVarC.D(abrVar2);
            Object objR3 = aygVar.R();
            if (zD || objR3 == obj) {
                abrVar = abrVar2;
                ayd aydVar = new ayd(undVar, this, str, abrVar, 2);
                aygVar.ac(aydVar);
                objR3 = aydVar;
            } else {
                abrVar = abrVar2;
            }
            uif uifVar = (uif) objR3;
            aygVar.Y();
            cfo cfoVar = new cfo(new cfm("wdth", 100.0f), new cfn(800));
            cfo cfoVar2 = new cfo(new cfm("wdth", 100.0f), new cfn(400));
            long j = c;
            cdo cdoVar = (cdo) aycVarC.e(drp.a);
            chq chqVar = (chq) aycVarC.e(bze.c);
            qqq qqqVar = (qqq) aycVarC.e(bze.e);
            aycVarC.u(-892660187);
            long jF = cdoVar.f();
            long j2 = jF != 16 ? jF : ((bkv) aycVarC.e(dou.a)).g;
            aygVar.Y();
            boolean zB = aycVarC.B(cdoVar) | aycVarC.B(cfoVar.toString()) | aycVarC.B(cfoVar2.toString()) | aycVarC.A(j2) | aycVarC.B(qqqVar);
            Object objR4 = aygVar.R();
            if (zB || objR4 == obj) {
                objR4 = new dob(cdoVar, cfoVar, cfoVar2, j, j, chqVar, qqqVar, j2);
                aygVar.ac(objR4);
            }
            nrm nrmVar = this.a;
            dob dobVar = (dob) objR4;
            String strValueOf = String.valueOf(nrmVar.a());
            aycVarC.u(5004770);
            boolean zD2 = aycVarC.D(abrVar);
            Object objR5 = aygVar.R();
            if (zD2 || objR5 == obj) {
                objR5 = new jkc(abrVar, 11);
                aygVar.ac(objR5);
            }
            aygVar.Y();
            AmbientLifecycleObserverKt.j(strValueOf, dobVar, (uif) objR5, clc.ag(bik.c, "Animated Text"), bib.j, aycVarC, 27712);
            Integer numValueOf = Integer.valueOf(nrmVar.a());
            aycVarC.u(-1633490746);
            boolean zD3 = aycVarC.D(this) | aycVarC.B(uifVar);
            Object objR6 = aygVar.R();
            if (zD3 || objR6 == obj) {
                objR6 = new sw(this, uifVar, (uhb) null, 2);
                aygVar.ac(objR6);
            }
            aygVar.Y();
            azb.f(numValueOf, (uiu) objR6, aycVarC);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, str, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.nrm r28, defpackage.ayc r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r30
            r3 = r2 & 6
            r4 = -1575473895(0xffffffffa2182d19, float:-2.0623716E-18)
            r5 = r29
            ayc r4 = r5.c(r4)
            r5 = 1
            if (r3 != 0) goto L1f
            boolean r3 = r4.D(r1)
            if (r5 == r3) goto L1c
            r3 = 2
            goto L1d
        L1c:
            r3 = 4
        L1d:
            r3 = r3 | r2
            goto L20
        L1f:
            r3 = r2
        L20:
            r6 = r2 & 48
            if (r6 != 0) goto L30
            boolean r6 = r4.D(r0)
            if (r5 == r6) goto L2d
            r6 = 16
            goto L2f
        L2d:
            r6 = 32
        L2f:
            r3 = r3 | r6
        L30:
            r6 = r3 & 19
            r7 = 18
            if (r6 != r7) goto L41
            boolean r6 = r4.G()
            if (r6 != 0) goto L3d
            goto L41
        L3d:
            r4.r()
            goto L8d
        L41:
            ayp r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a
            java.lang.Object r6 = r4.e(r6)
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            android.os.LocaleList r6 = r6.getLocales()
            r7 = 0
            java.util.Locale r6 = r6.get(r7)
            r6.getClass()
            int r7 = r1.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r7 = "%d"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r5.getClass()
            azr r6 = r1.c
            java.lang.Object r6 = r6.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L90
            r6 = 460077049(0x1b6c37f9, float:1.9539548E-22)
            r4.u(r6)
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0.e(r5, r4, r3)
            r3 = r4
            ayg r3 = (defpackage.ayg) r3
            r3.Y()
        L8d:
            r23 = r4
            goto Ld7
        L90:
            r3 = 460140041(0x1b6d2e09, float:1.9619055E-22)
            r4.u(r3)
            bih r3 = defpackage.bik.c
            bik r3 = defpackage.amd.g(r3)
            java.lang.String r6 = "Non Animated Text"
            bik r6 = defpackage.clc.ag(r3, r6)
            long r9 = com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView.c
            cfp r11 = new cfp
            r3 = 800(0x320, float:1.121E-42)
            r11.<init>(r3)
            chc r14 = new chc
            r3 = 3
            r14.<init>(r3)
            r25 = 0
            r26 = 130516(0x1fdd4, float:1.82892E-40)
            r7 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 199728(0x30c30, float:2.79879E-40)
            r23 = r4
            defpackage.drp.b(r5, r6, r7, r9, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            ayg r4 = (defpackage.ayg) r4
            r4.Y()
        Ld7:
            bai r3 = r23.I()
            if (r3 == 0) goto Le6
            aqb r4 = new aqb
            r5 = 15
            r4.<init>(r0, r1, r2, r5)
            r3.d = r4
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView.f(nrm, ayc, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WearCountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        bp bpVar = (bp) context;
        cxb viewModelStore$ar$class_merging = bpVar.getViewModelStore$ar$class_merging();
        cxp defaultViewModelProviderFactory = bpVar.getDefaultViewModelProviderFactory();
        cxy cxyVarD = cqh.d(bpVar);
        defaultViewModelProviderFactory.getClass();
        cxyVarD.getClass();
        nrm nrmVar = (nrm) cxs.a(nrm.class, new gno(viewModelStore$ar$class_merging, defaultViewModelProviderFactory, cxyVarD));
        this.a = nrmVar;
        nrmVar.c.b(Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) != 0.0f));
    }

    public /* synthetic */ WearCountdownView(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
