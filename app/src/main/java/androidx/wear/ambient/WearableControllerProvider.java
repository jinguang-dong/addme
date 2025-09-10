package androidx.wear.ambient;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.compose.foundation.HierarchicalFocusCoordinatorModifierElement;
import androidx.wear.compose.material3.PainterElement;
import com.google.android.wearable.compat.WearableActivityController;
import com.google.ar.core.ImageMetadata;
import defpackage.a;
import defpackage.afn;
import defpackage.afy;
import defpackage.afz;
import defpackage.aga;
import defpackage.aku;
import defpackage.aky;
import defpackage.alv;
import defpackage.alw;
import defpackage.amj;
import defpackage.amq;
import defpackage.aor;
import defpackage.aqb;
import defpackage.axa;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayp;
import defpackage.azb;
import defpackage.bai;
import defpackage.bay;
import defpackage.bbr;
import defpackage.bdp;
import defpackage.bdq;
import defpackage.bfh;
import defpackage.bfk;
import defpackage.bgz;
import defpackage.bib;
import defpackage.bie;
import defpackage.bih;
import defpackage.bik;
import defpackage.bko;
import defpackage.bkv;
import defpackage.bll;
import defpackage.blp;
import defpackage.bne;
import defpackage.brj;
import defpackage.brk;
import defpackage.bsr;
import defpackage.bum;
import defpackage.byi;
import defpackage.bze;
import defpackage.cbp;
import defpackage.chq;
import defpackage.djh;
import defpackage.dke;
import defpackage.dkf;
import defpackage.dkh;
import defpackage.dlh;
import defpackage.dlm;
import defpackage.dme;
import defpackage.dmq;
import defpackage.dpr;
import defpackage.dqe;
import defpackage.dqj;
import defpackage.dqk;
import defpackage.dql;
import defpackage.dqm;
import defpackage.dqn;
import defpackage.dqo;
import defpackage.dqp;
import defpackage.dri;
import defpackage.drm;
import defpackage.kwp;
import defpackage.nw;
import defpackage.ocq;
import defpackage.tdy;
import defpackage.ugi;
import defpackage.uif;
import defpackage.uiq;
import defpackage.uiu;
import defpackage.uiv;
import defpackage.uiw;
import defpackage.ukc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearableControllerProvider {
    public static volatile boolean a;

    /* compiled from: PG */
    /* renamed from: androidx.wear.ambient.WearableControllerProvider$1, reason: invalid class name */
    final class AnonymousClass1 extends WearableActivityController.AmbientCallback {
        final /* synthetic */ AmbientDelegate.AmbientCallback a;

        public AnonymousClass1(AmbientDelegate.AmbientCallback ambientCallback) {
            this.a = ambientCallback;
        }

        public final void onEnterAmbient(Bundle bundle) {
            this.a.onEnterAmbient(bundle);
        }

        public final void onExitAmbient() {
            this.a.onExitAmbient();
        }

        public final void onInvalidateAmbientOffload() {
            this.a.onAmbientOffloadInvalidated();
        }

        public final void onUpdateAmbient() {
            this.a.onUpdateAmbient();
        }
    }

    public static final bik a(bik bikVar) {
        return bikVar.cM(new HierarchicalFocusCoordinatorModifierElement());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(dlm dlmVar, Object obj, int i, Object obj2, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1534134928);
        if (i4 == 0) {
            i3 = (true != aycVarC.B(dlmVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.B(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(obj2) ? 1024 : 2048;
        }
        if (aycVarC.H((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, bdq.k(-489925041, new dmq(dlmVar, i, obj2), aycVarC), aycVarC, 48);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aor(dlmVar, obj, i, obj2, i2, 3);
        }
    }

    public static final int c(bdp bdpVar, int i) {
        int i2 = bdpVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = bdpVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((nw) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((nw) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static /* synthetic */ bik d(bik bikVar, bne bneVar, brk brkVar, int i) {
        bie bieVar = (i & 2) != 0 ? bib.j : null;
        if ((i & 4) != 0) {
            brkVar = brj.c;
        }
        return bikVar.cM(new PainterElement(bneVar, brkVar, bieVar));
    }

    public static final bik e(bik bikVar, dri driVar, bne bneVar, blp blpVar, ayc aycVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            blpVar = bll.a;
        }
        if (a.ao(driVar, drm.a)) {
            aycVar.u(-86456265);
            ((ayg) aycVar).Y();
            return d(bdq.C(bikVar, blpVar), bneVar, brj.a, 2);
        }
        aycVar.u(-86921420);
        int i3 = (i & ScriptIntrinsicBLAS.TRANSPOSE) ^ 48;
        int i4 = (i & 7168) ^ 3072;
        byte[] bArr = null;
        boolean zB = ((i3 > 32 && aycVar.B(driVar)) || (i & 48) == 32) | aycVar.B(bneVar) | ((i4 > 2048 && aycVar.B(blpVar)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && aycVar.B(null)) || (i & 24576) == 16384);
        ayg aygVar = (ayg) aycVar;
        Object objR = aygVar.R();
        if (zB || objR == ayb.a) {
            objR = driVar.c(bneVar, blpVar);
            aygVar.ac(objR);
        }
        bik bikVarD = d(bikVar, (bne) objR, null, 6);
        boolean z = ((i4 > 2048 && aycVar.B(blpVar)) || (i & 3072) == 2048) | ((i3 > 32 && aycVar.D(driVar)) || (i & 48) == 32);
        Object objR2 = aygVar.R();
        if (z || objR2 == ayb.a) {
            objR2 = new dql(blpVar, driVar, 3, bArr);
            aygVar.ac(objR2);
        }
        bik bikVarC = bko.c(bikVarD, (uiq) objR2);
        aygVar.Y();
        return bikVarC;
    }

    public static final void f(afy afyVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1354447358);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(afyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if (aycVarC.H((i2 & 19) != 18, i2 & 1)) {
            aycVarC.u(1271982530);
            int iMo0do = ((chq) aycVarC.e(bze.c)).mo0do(((Configuration) aycVarC.e(AndroidCompositionLocals_androidKt.a)).screenHeightDp);
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            ayp aypVar = aga.a;
            afz afzVar = (afz) aycVarC.e(aypVar);
            dpr dprVar = null;
            if (afzVar != null && afyVar != null) {
                dprVar = new dpr(afzVar, afyVar, iMo0do);
            }
            if (dprVar != null) {
                aycVarC.u(876951632);
                bay.K(aypVar.b(dprVar), uiuVar, aycVarC, (i2 & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
                aygVar.Y();
            } else {
                aycVarC.u(-248801237);
                uiuVar.a(aycVarC, Integer.valueOf((i2 >> 3) & 14));
                aygVar.Y();
            }
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(afyVar, uiuVar, i, 10);
        }
    }

    public static final void g(bik bikVar, dkf dkfVar, alv alvVar, uiv uivVar, afy afyVar, uiw uiwVar, ayc aycVar, int i) {
        bik bikVar2;
        int i2;
        afy afyVar2;
        Object next;
        kwp kwpVar;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-869096448);
        if (i3 == 0) {
            bikVar2 = bikVar;
            i2 = (true != aycVarC.B(bikVar2) ? 2 : 4) | i;
        } else {
            bikVar2 = bikVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(dkfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(alvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.D(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uivVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.B(afyVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.D(uiwVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        int i4 = i2;
        int i5 = 0;
        if (aycVarC.H((599187 & i4) != 599186, i4 & 1)) {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            kwp kwpVar2 = (kwp) aycVarC.e(dqe.a);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new Object();
                aygVar.ac(objR);
            }
            tdy tdyVar = (tdy) kwpVar2.a;
            ugi ugiVar = new ugi((bgz) tdyVar.c, 0, 1);
            while (true) {
                if (!ugiVar.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = ugiVar.next();
                    if (a.ao(((dqj) next).a, objR)) {
                        break;
                    }
                }
            }
            dqj dqjVar = (dqj) next;
            if (dqjVar != null) {
                dqjVar.c = null;
                dqjVar.b.b(dkfVar);
            }
            boolean zD = aycVarC.D(kwpVar2) | aycVarC.D(objR);
            Object objR2 = aygVar.R();
            if (zD || objR2 == obj) {
                objR2 = new dql(kwpVar2, objR, i5, null);
                aygVar.ac(objR2);
            }
            azb.c(objR, (uiq) objR2, aycVarC);
            tdyVar.g(aycVarC, 0);
            Boolean bool = (Boolean) aycVarC.e(djh.d);
            boolean zBooleanValue = bool.booleanValue();
            boolean zC = aycVarC.C(zBooleanValue) | aycVarC.D(kwpVar2) | aycVarC.D(objR) | ((i4 & 7168) == 2048) | aycVarC.D(dkfVar);
            Object objR3 = aygVar.R();
            if (zC || objR3 == obj) {
                kwpVar = kwpVar2;
                dqo dqoVar = new dqo(zBooleanValue, kwpVar, objR, dkfVar, null);
                aygVar.ac(dqoVar);
                objR3 = dqoVar;
            } else {
                kwpVar = kwpVar2;
            }
            azb.f(bool, (uiu) objR3, aycVarC);
            afyVar2 = afyVar;
            f(afyVar2, bdq.k(713002057, new dqp(afyVar2, dkfVar, uivVar, uiwVar, alvVar, kwpVar), aycVarC), aycVarC, ((i4 >> 15) & 14) | 48);
        } else {
            afyVar2 = afyVar;
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dqk(bikVar2, dkfVar, alvVar, uivVar, afyVar2, uiwVar, i, 2);
        }
    }

    public static final void h(dkf dkfVar, uiv uivVar, bik bikVar, alv alvVar, uiv uivVar2, float f, afy afyVar, uiw uiwVar, ayc aycVar, int i) {
        dkf dkfVar2;
        int i2;
        uiv uivVar3;
        bik bikVar2;
        uiv uivVar4;
        afy afyVar2;
        ayc aycVar2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1837495076);
        if (i3 == 0) {
            dkfVar2 = dkfVar;
            i2 = (true != aycVarC.D(dkfVar2) ? 2 : 4) | i;
        } else {
            dkfVar2 = dkfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            uivVar3 = uivVar;
            i2 |= true != aycVarC.D(uivVar3) ? 16 : 32;
        } else {
            uivVar3 = uivVar;
        }
        if ((i & 384) == 0) {
            bikVar2 = bikVar;
            i2 |= true != aycVarC.B(bikVar2) ? 128 : 256;
        } else {
            bikVar2 = bikVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(alvVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            uivVar4 = uivVar2;
            i2 |= true != aycVarC.D(uivVar4) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            uivVar4 = uivVar2;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != aycVarC.y(f) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            afyVar2 = afyVar;
            i2 |= true != aycVarC.B(afyVar2) ? 4194304 : 8388608;
        } else {
            afyVar2 = afyVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != aycVarC.D(uiwVar) ? 33554432 : 67108864;
        }
        if (aycVarC.H((38347923 & i2) != 38347922, i2 & 1)) {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            ayp aypVar = bze.c;
            chq chqVar = (chq) aycVarC.e(aypVar);
            float fK = ukc.k((-3.0f) + f, 0.0f);
            dkf dkfVar3 = dkfVar2;
            bfh bfhVarK = bdq.k(391660059, new dqn(uivVar3, uiwVar, alvVar, (chq) aycVarC.e(aypVar), dkfVar3, chqVar.dk(fK), fK), aycVarC);
            int i4 = i2 >> 6;
            int i5 = i2 << 3;
            int i6 = i2 >> 3;
            aycVar2 = aycVarC;
            g(bikVar2, dkfVar, alvVar, uivVar4, afyVar2, bfhVarK, aycVar2, (i6 & 57344) | (i4 & 14) | 1572864 | (i5 & ScriptIntrinsicBLAS.TRANSPOSE) | (i6 & 896) | (i6 & 7168) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES));
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dqm(dkfVar, uivVar, bikVar, alvVar, uivVar2, f, afyVar, uiwVar, i, 1);
        }
    }

    public static final void i(dme dmeVar, bik bikVar, alv alvVar, uiv uivVar, afy afyVar, uiw uiwVar, ayc aycVar, int i) {
        int i2;
        bik bikVar2;
        alv alvVar2;
        uiv uivVar2;
        afy afyVar2;
        bik bikVar3;
        alv alvVarK;
        uiv uivVarK;
        afy afyVarB;
        ayc aycVarC = aycVar.c(-2047495393);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(dmeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        int i4 = i3 | 27648;
        if ((196608 & i) == 0) {
            i4 = i3 | 93184;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != aycVarC.D(uiwVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if (aycVarC.H((599187 & i4) != 599186, i4 & 1)) {
            int i5 = (-459649) & i4;
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                bih bihVar = bik.c;
                bikVar3 = bihVar;
                alvVarK = k(aycVarC);
                uivVarK = bdq.k(-1082927886, new amj(dmeVar, 7), aycVarC);
                afyVarB = aga.b(aycVarC);
            } else {
                aycVarC.r();
                bikVar3 = bikVar;
                alvVarK = alvVar;
                uivVarK = uivVar;
                afyVarB = afyVar;
            }
            aycVarC.l();
            g(bikVar3, new dkh(dmeVar), alvVarK, uivVarK, afyVarB, uiwVar, aycVarC, ((i5 >> 3) & 14) | (i4 & 7168) | (57344 & i4) | (i4 & 3670016));
            bikVar2 = bikVar3;
            alvVar2 = alvVarK;
            uivVar2 = uivVarK;
            afyVar2 = afyVarB;
        } else {
            aycVarC.r();
            bikVar2 = bikVar;
            alvVar2 = alvVar;
            uivVar2 = uivVar;
            afyVar2 = afyVar;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dqk(dmeVar, bikVar2, alvVar2, uivVar2, afyVar2, uiwVar, i, 0);
        }
    }

    public static final void j(dlh dlhVar, uiv uivVar, bik bikVar, alv alvVar, uiv uivVar2, float f, afy afyVar, uiw uiwVar, ayc aycVar, int i) {
        int i2;
        ayc aycVar2;
        bik bikVar2;
        alv alvVar2;
        uiv uivVar3;
        float f2;
        afy afyVar2;
        bik bikVar3;
        alv alvVarK;
        uiv uivVarK;
        afy afyVarB;
        float f3;
        ayc aycVarC = aycVar.c(-694206896);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(dlhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uivVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= true != aycVarC.D(null) ? 8192 : 16384;
        }
        int i4 = 1769472 | i3;
        if ((12582912 & i) == 0) {
            i4 = i3 | 5963776;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != aycVarC.D(uiwVar) ? 33554432 : 67108864;
        }
        if (aycVarC.H((38347923 & i4) != 38347922, i4 & 1)) {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                bikVar3 = bik.c;
                alvVarK = k(aycVarC);
                uivVarK = bdq.k(-1245881821, new amj(dlhVar, 6), aycVarC);
                afyVarB = aga.b(aycVarC);
                f3 = 16.0f;
            } else {
                aycVarC.r();
                bikVar3 = bikVar;
                alvVarK = alvVar;
                uivVarK = uivVar2;
                f3 = f;
                afyVarB = afyVar;
            }
            aycVarC.l();
            aycVar2 = aycVarC;
            h(new dke(dlhVar), uivVar, bikVar3, alvVarK, uivVarK, f3, afyVarB, uiwVar, aycVar2, i4 & 239068144);
            bikVar2 = bikVar3;
            alvVar2 = alvVarK;
            uivVar3 = uivVarK;
            f2 = f3;
            afyVar2 = afyVarB;
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
            bikVar2 = bikVar;
            alvVar2 = alvVar;
            uivVar3 = uivVar2;
            f2 = f;
            afyVar2 = afyVar;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dqm(dlhVar, uivVar, bikVar2, alvVar2, uivVar3, f2, afyVar2, uiwVar, i, 0);
        }
    }

    public static final alv k(ayc aycVar) {
        ayp aypVar = AndroidCompositionLocals_androidKt.a;
        float f = (((Configuration) aycVar.e(aypVar)).screenWidthDp * 5.2f) / 100.0f;
        float f2 = (((Configuration) aycVar.e(aypVar)).screenHeightDp * 10.0f) / 100.0f;
        return new alw(f, f2, f, f2);
    }

    public static final void l(uif uifVar, bik bikVar, boolean z, uiv uivVar, ocq ocqVar, blp blpVar, uiv uivVar2, afn afnVar, uiv uivVar3, ayc aycVar, int i, int i2) {
        int i3;
        ocq ocqVar2;
        afn afnVar2;
        int i4;
        int i5 = i & 6;
        ayc aycVarC = aycVar.c(-1337444848);
        if (i5 == 0) {
            i3 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != aycVarC.B(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != aycVarC.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != aycVarC.D(uivVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            ocqVar2 = ocqVar;
            i3 |= true != aycVarC.B(ocqVar2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            ocqVar2 = ocqVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != aycVarC.B(blpVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != aycVarC.D(uivVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            afnVar2 = afnVar;
            i3 |= true != aycVarC.B(afnVar2) ? 268435456 : 536870912;
        } else {
            afnVar2 = afnVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != aycVarC.D(uivVar3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (aycVarC.H(((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i3 >> 12;
            uivVar2.a(boolValueOf, aycVarC, Integer.valueOf(((i3 >> 21) & ScriptIntrinsicBLAS.TRANSPOSE) | (i6 & 14)));
            bie bieVar = bib.j;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new axa(17);
                aygVar.ac(objR);
            }
            bik bikVarAR = byi.aR(byi.bL(bdq.C(cbp.b(bikVar, false, (uiq) objR), blpVar), ocqVar2, afnVar2, z, null, uifVar, 408).cM(bik.c), ((bkv) uivVar.a(boolValueOf, aycVarC, Integer.valueOf(i6 & 126))).g, blpVar);
            int i7 = ((i4 << 9) & 7168) | 48;
            bsr bsrVarC = aku.c(bieVar, false);
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarAR);
            uif uifVar2 = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar2);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            uivVar3.a(aky.a, aycVarC, Integer.valueOf(((i7 >> 6) & ScriptIntrinsicBLAS.TRANSPOSE) | 6));
            aycVarC.m();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new amq(uifVar, bikVar, z, uivVar, ocqVar, blpVar, uivVar2, afnVar, uivVar3, i, i2, 3);
        }
    }

    public final WearableActivityController getWearableController(Activity activity, AmbientDelegate.AmbientCallback ambientCallback) throws NoSuchMethodException, SecurityException {
        SharedLibraryVersion.verifySharedLibraryPresent();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(ambientCallback);
        if (!a) {
            try {
                if (!".onEnterAmbient".equals("." + WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class).getName())) {
                    throw new NoSuchMethodException();
                }
                a = true;
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
            }
        }
        return new WearableActivityController("WearableControllerProvider", activity, anonymousClass1);
    }
}
