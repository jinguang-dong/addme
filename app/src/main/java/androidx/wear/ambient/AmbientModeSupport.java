package androidx.wear.ambient;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.compose.material3.MinimumInteractiveModifier;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.wearable.compat.WearableActivityController;
import com.google.ar.core.ImageMetadata;
import defpackage.a;
import defpackage.abr;
import defpackage.abs;
import defpackage.abz;
import defpackage.acn;
import defpackage.acy;
import defpackage.afn;
import defpackage.afr;
import defpackage.ai;
import defpackage.akl;
import defpackage.akq;
import defpackage.alv;
import defpackage.ama;
import defpackage.amc;
import defpackage.amd;
import defpackage.amj;
import defpackage.apu;
import defpackage.apz;
import defpackage.ars;
import defpackage.arx;
import defpackage.axa;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.azb;
import defpackage.bag;
import defpackage.bai;
import defpackage.bay;
import defpackage.bbo;
import defpackage.bbr;
import defpackage.bdq;
import defpackage.bfk;
import defpackage.bib;
import defpackage.bik;
import defpackage.bkg;
import defpackage.bkn;
import defpackage.bkv;
import defpackage.blp;
import defpackage.bm;
import defpackage.bnd;
import defpackage.bne;
import defpackage.bp;
import defpackage.bsr;
import defpackage.bum;
import defpackage.byi;
import defpackage.cbp;
import defpackage.ch;
import defpackage.cho;
import defpackage.chp;
import defpackage.chr;
import defpackage.djq;
import defpackage.djr;
import defpackage.djz;
import defpackage.dlc;
import defpackage.dlq;
import defpackage.dlr;
import defpackage.dls;
import defpackage.dlu;
import defpackage.dme;
import defpackage.doa;
import defpackage.dor;
import defpackage.dou;
import defpackage.dpf;
import defpackage.dph;
import defpackage.dpi;
import defpackage.dpk;
import defpackage.dpx;
import defpackage.dqb;
import defpackage.drf;
import defpackage.dri;
import defpackage.drp;
import defpackage.drw;
import defpackage.dsk;
import defpackage.dsp;
import defpackage.dsq;
import defpackage.hbv;
import defpackage.hti;
import defpackage.irk;
import defpackage.iry;
import defpackage.nwj;
import defpackage.ocq;
import defpackage.qzl;
import defpackage.qzm;
import defpackage.sgv;
import defpackage.ske;
import defpackage.uev;
import defpackage.ufw;
import defpackage.uhg;
import defpackage.uif;
import defpackage.uiq;
import defpackage.uiu;
import defpackage.uiv;
import defpackage.und;
import defpackage.ung;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class AmbientModeSupport extends bm {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
    AmbientDelegate a;
    AmbientCallback b;
    private final AmbientDelegate.AmbientCallback c = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientModeSupport.1
        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onAmbientOffloadInvalidated() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onExitAmbient() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onUpdateAmbient() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onEnterAmbient(Bundle bundle) {
        }
    };
    private final AmbientController d = new AmbientController(this);

    /* compiled from: PG */
    public interface AmbientCallbackProvider {
        AmbientCallback getAmbientCallback();
    }

    /* compiled from: PG */
    public final class AmbientController {
        public final /* synthetic */ Object a;

        public AmbientController(Object obj) {
            this.a = obj;
        }

        public final float a() {
            int i;
            dlq dlqVar = (dlq) ((dme) this.a).a.a();
            if (dlqVar.d.isEmpty()) {
                i = 0;
            } else {
                int iB = SharedLibraryVersion.b(dlqVar);
                int i2 = dlqVar.e;
                i = (dlqVar.f * (i2 - 1)) + (iB * i2);
            }
            return i;
        }

        public final void b(boolean z) {
            irk irkVar = ((iry) this.a).n;
            if (irkVar != null) {
                if (z) {
                    irkVar.m();
                } else {
                    irkVar.h();
                }
            }
        }

        public final void c(boolean z) {
            sgv sgvVar = hti.a;
            Object obj = this.a;
            hti htiVar = (hti) obj;
            htiVar.L.f(htiVar.F);
            if (z) {
                return;
            }
            htiVar.g.c(new hbv(obj, 15));
        }

        public final void d(Drawable drawable) {
            if (drawable != null) {
                super/*rll*/.setBackgroundDrawable(drawable);
            }
        }

        public final boolean e() {
            return ((FloatingActionButton) this.a).b;
        }

        public final boolean f(String str, String str2) {
            qzm[] qzmVarArrA = ((qzl) this.a).a(str);
            if (qzmVarArrA == null || qzmVarArrA.length == 0) {
                return false;
            }
            if (!str2.equals("")) {
                return Arrays.binarySearch(qzmVarArrA, str2) >= 0;
            }
            qzm qzmVar = qzmVarArrA[0];
            qzl qzlVar = qzm.a;
            return qzmVar.d.equals("");
        }

        public final boolean g() {
            WearInlineSlider wearInlineSlider = (WearInlineSlider) this.a;
            float f = wearInlineSlider.e;
            float f2 = wearInlineSlider.c;
            if (f == f2) {
                return false;
            }
            wearInlineSlider.m(nwj.n(f - wearInlineSlider.b, f2, wearInlineSlider.d), false);
            return true;
        }

        public final boolean h() {
            WearInlineSlider wearInlineSlider = (WearInlineSlider) this.a;
            float f = wearInlineSlider.e;
            float f2 = wearInlineSlider.d;
            if (f == f2) {
                return false;
            }
            wearInlineSlider.m(nwj.n(f + wearInlineSlider.b, wearInlineSlider.c, f2), false);
            return true;
        }

        public final boolean isAmbient() {
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.a).a;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.h();
        }

        public final void setAmbientOffloadEnabled(boolean z) {
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.a).a;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z);
            }
        }

        public final void setAutoResumeEnabled(boolean z) {
            Object obj;
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.a).a;
            if (ambientDelegate == null || (obj = ambientDelegate.a) == null) {
                return;
            }
            ((WearableActivityController) obj).setAutoResumeEnabled(z);
        }

        public /* synthetic */ AmbientController(Object obj, byte[] bArr) {
            this.a = obj;
        }
    }

    public static AmbientController attach(bp bpVar) {
        ch chVarEo = bpVar.eo();
        AmbientModeSupport ambientModeSupport = (AmbientModeSupport) chVarEo.e("android.support.wearable.ambient.AmbientMode");
        if (ambientModeSupport == null) {
            ambientModeSupport = new AmbientModeSupport();
            ai aiVar = new ai(chVarEo);
            aiVar.n(ambientModeSupport, "android.support.wearable.ambient.AmbientMode");
            aiVar.h();
        }
        return ambientModeSupport.d;
    }

    @Override // defpackage.bm
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.a;
        if (ambientDelegate != null) {
            ambientDelegate.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b();
        if (this.b != null) {
            this.a.g();
        }
    }

    @Override // defpackage.bm
    public final void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    @Override // defpackage.bm
    public final void onDetach() {
        this.a = null;
        super.onDetach();
    }

    @Override // defpackage.bm
    public final void onPause() {
        this.a.d();
        super.onPause();
    }

    @Override // defpackage.bm
    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    @Override // defpackage.bm
    public final void onStop() {
        this.a.f();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bm
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = new AmbientDelegate((Activity) getActivity(), this.c);
        if (context instanceof AmbientCallbackProvider) {
            this.b = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientModeSupport", zflNUOOzDfM.SailHp);
        }
    }

    /* compiled from: PG */
    public final class AmbientCallback {
        public static final djq a(djq djqVar, djz djzVar) {
            return new djr(ske.bK(b(djqVar), djzVar));
        }

        public static final List b(djq djqVar) {
            if (a.ao(djqVar, djq.b)) {
                return ufw.a;
            }
            djqVar.getClass();
            return ((djr) djqVar).a;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [bss, java.lang.Object] */
        public static final dlq c(long j, int i, int i2, uiv uivVar) {
            ufw ufwVar = ufw.a;
            ung.j(uhg.a);
            chr chrVar = new chr(1.0f, 1.0f);
            int iA = cho.a(j);
            int iB = cho.b(j);
            return new dlq(uivVar.a(Integer.valueOf(iB), Integer.valueOf(iA), new axa(11)), 0, 0, Integer.MIN_VALUE, ufwVar, 0, 0, chp.k(0, 0, 15), chrVar, i, i2, false, false);
        }

        public static final dlr d(dls dlsVar, int i, int i2, int i3) {
            return dlsVar.a(i, i2, new dlu(i2, i3, 1));
        }

        public static final dlr e(dls dlsVar, int i, int i2, int i3) {
            dlr dlrVarA = dlsVar.a(i, i2, new dlu(i2, i3, 0));
            dlrVarA.d -= dlrVarA.b();
            return dlrVarA;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0234 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void f(final defpackage.bik r25, final defpackage.dme r26, final defpackage.alv r27, defpackage.akp r28, defpackage.bic r29, defpackage.apg r30, boolean r31, defpackage.dnj r32, defpackage.afy r33, final defpackage.uiq r34, defpackage.ayc r35, final int r36) {
            /*
                Method dump skipped, instructions count: 740
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientModeSupport.AmbientCallback.f(bik, dme, alv, akp, bic, apg, boolean, dnj, afy, uiq, ayc, int):void");
        }

        public static final void g(final bik bikVar, long j, long j2, alv alvVar, final dri driVar, final uiv uivVar, ayc aycVar, final int i) {
            int i2;
            final long j3;
            final long j4;
            ayc aycVar2;
            final alv alvVar2;
            long j5;
            long jB;
            alv alvVar3;
            ayc aycVarC = aycVar.c(1130422412);
            if ((i & 6) == 0) {
                i2 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | 48;
            if ((i & 384) == 0) {
                i3 = i2 | 176;
            }
            int i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 |= true != ((32768 & i) == 0 ? aycVarC.B(driVar) : aycVarC.D(driVar)) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                i4 |= true != aycVarC.D(uivVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
            }
            if (aycVarC.H((74899 & i4) != 74898, i4 & 1)) {
                int i5 = i4 & (-897);
                aycVarC.s();
                if ((i & 1) == 0 || aycVarC.E()) {
                    long j6 = bkv.e;
                    alv alvVar4 = dpk.a;
                    j5 = j6;
                    jB = dor.b(SharedLibraryVersion.h(aycVarC), 5);
                    alvVar3 = dpk.a;
                } else {
                    aycVarC.r();
                    j5 = j;
                    jB = j2;
                    alvVar3 = alvVar;
                }
                aycVarC.l();
                akl aklVar = akq.d;
                long j7 = jB;
                bik bikVarAF = byi.aF(WearableControllerProvider.e(amd.i(amd.a(bikVar, Float.NaN, 48.0f), null, 3), driVar, new bnd(j5), null, aycVarC, (i5 >> 9) & ScriptIntrinsicBLAS.TRANSPOSE, 12), alvVar3);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (objR == ayb.a) {
                    objR = new axa(16);
                    aygVar.ac(objR);
                }
                bik bikVarB = cbp.b(bikVarAF, true, (uiq) objR);
                bsr bsrVarA = ama.a(aklVar, bib.a, aycVarC, 6);
                int iM = bay.M(aycVarC);
                bfk bfkVarAg = aygVar.ag();
                bik bikVarV = bay.v(aycVarC, bikVarB);
                uif uifVar = bum.a;
                aycVarC.v();
                if (aygVar.v) {
                    aycVarC.j(uifVar);
                } else {
                    aycVarC.x();
                }
                bbr.a(aycVarC, bsrVarA, bum.d);
                bbr.a(aycVarC, bfkVarAg, bum.c);
                uiu uiuVar = bum.e;
                if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                    Integer numValueOf = Integer.valueOf(iM);
                    aygVar.ac(numValueOf);
                    aycVarC.h(numValueOf, uiuVar);
                }
                bbr.a(aycVarC, bikVarV, bum.b);
                bay.L(new bag[]{dou.a.b(new bkv(j7)), drp.a.b(drw.c(17, aycVarC))}, bdq.k(1645110960, new ars(uivVar, amc.a, 15, null), aycVarC), aycVarC, 56);
                aycVarC.m();
                j4 = j7;
                j3 = j5;
                aycVar2 = aycVarC;
                alvVar2 = alvVar3;
            } else {
                aycVarC.r();
                j3 = j;
                j4 = j2;
                aycVar2 = aycVarC;
                alvVar2 = alvVar;
            }
            bai baiVarI = aycVar2.I();
            if (baiVarI != null) {
                baiVarI.d = new uiu() { // from class: dpl
                    @Override // defpackage.uiu
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        bik bikVar2 = bikVar;
                        long j8 = j3;
                        long j9 = j4;
                        alv alvVar5 = alvVar2;
                        dri driVar2 = driVar;
                        AmbientModeSupport.AmbientCallback.g(bikVar2, j8, j9, alvVar5, driVar2, uivVar, (ayc) obj, bay.j(i | 1));
                        return ufg.a;
                    }
                };
            }
        }

        public static final void h(bne bneVar, String str, bik bikVar, long j, ayc aycVar, int i) {
            int i2;
            ayc aycVarC = aycVar.c(113400192);
            if ((i & 6) == 0) {
                i2 = (true != aycVarC.D(bneVar) ? 2 : 4) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= true != aycVarC.B(str) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i2 |= true != aycVarC.A(j) ? 1024 : 2048;
            }
            if (aycVarC.H((i2 & 1171) != 1170, i2 & 1)) {
                aycVarC.s();
                if ((i & 1) != 0 && !aycVarC.E()) {
                    aycVarC.r();
                }
                aycVarC.l();
                dsq.a(bneVar, str, bikVar, j, aycVarC, i2 & 8190);
            } else {
                aycVarC.r();
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new dsp(bneVar, str, bikVar, j, i, 1);
            }
        }

        public static final void i(final uif uifVar, final bik bikVar, final boolean z, final uiv uivVar, final dpi dpiVar, final uiv uivVar2, final afn afnVar, final uiv uivVar3, ayc aycVar, final int i, final int i2) {
            uif uifVar2;
            int i3;
            uiv uivVar4;
            int i4;
            ayc aycVar2;
            uev uevVar;
            doa doaVar;
            int i5 = i & 6;
            ayc aycVarC = aycVar.c(2009273510);
            if (i5 == 0) {
                uifVar2 = uifVar;
                i3 = (true != aycVarC.D(uifVar2) ? 2 : 4) | i;
            } else {
                uifVar2 = uifVar;
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
                i3 |= true != aycVarC.B(null) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
            }
            if ((12582912 & i) == 0) {
                i3 |= true != aycVarC.B(dpiVar) ? 4194304 : 8388608;
            }
            if ((100663296 & i) == 0) {
                i3 |= true != aycVarC.D(uivVar2) ? 33554432 : 67108864;
            }
            if ((805306368 & i) == 0) {
                i3 |= true != aycVarC.B(afnVar) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                uivVar4 = uivVar3;
                i4 = i2 | (true != aycVarC.D(uivVar4) ? 2 : 4);
            } else {
                uivVar4 = uivVar3;
                i4 = i2;
            }
            if (aycVarC.H(((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
                blp blpVar = dpiVar.a;
                blp blpVar2 = dpiVar.b;
                acy acyVar = (acy) SharedLibraryVersion.l(aycVarC).d();
                int i6 = i3;
                int i7 = i4;
                acy acyVar2 = new acy(acyVar.a, acyVar.b * 3.0f * 3.0f, acyVar.c);
                acn acnVarE = SharedLibraryVersion.l(aycVarC).e();
                if ((blpVar instanceof apu) && (blpVar2 instanceof apu) && blpVar != blpVar2) {
                    aycVarC.u(-520067202);
                    aycVarC.u(-520021942);
                    ayg aygVar = (ayg) aycVarC;
                    Object objR = aygVar.R();
                    Object obj = ayb.a;
                    if (objR == obj) {
                        objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                        aygVar.ac(objR);
                    }
                    ocq ocqVar = (ocq) objR;
                    aygVar.Y();
                    Object objR2 = aygVar.R();
                    if (objR2 == obj) {
                        objR2 = abs.a(0.0f);
                        aygVar.ac(objR2);
                    }
                    abr abrVar = (abr) objR2;
                    Object objR3 = aygVar.R();
                    if (objR3 == obj) {
                        objR3 = azb.a(uhg.a, aycVarC);
                        aygVar.ac(objR3);
                    }
                    und undVar = (und) objR3;
                    boolean zB = aycVarC.B(ocqVar) | aycVarC.D(undVar) | aycVarC.D(abrVar) | aycVarC.D(acyVar2) | aycVarC.D(acnVarE);
                    Object objR4 = aygVar.R();
                    if (zB || objR4 == obj) {
                        objR4 = new dqb(ocqVar, undVar, abrVar, acyVar2, acnVarE, null);
                        aygVar.ac(objR4);
                    }
                    azb.f(ocqVar, (uiu) objR4, aycVarC);
                    if ((blpVar instanceof apz) && (blpVar2 instanceof apz)) {
                        aycVarC.u(2028699050);
                        abz abzVar = abrVar.a;
                        boolean zB2 = aycVarC.B(blpVar) | aycVarC.B(blpVar2) | aycVarC.B(abzVar);
                        Object objR5 = aygVar.R();
                        if (zB2 || objR5 == obj) {
                            objR5 = new doa((apz) blpVar, (apz) blpVar2, (uif) new dlc(abzVar, 7), 0);
                            aygVar.ac(objR5);
                        }
                        doaVar = (doa) objR5;
                        aygVar.Y();
                    } else {
                        aycVarC.u(2028705448);
                        abz abzVar2 = abrVar.a;
                        boolean zB3 = aycVarC.B(blpVar) | aycVarC.B(blpVar2) | aycVarC.B(abzVar2);
                        Object objR6 = aygVar.R();
                        if (zB3 || objR6 == obj) {
                            objR6 = new doa((apu) blpVar, (apu) blpVar2, new dlc(abzVar2, 8), 1);
                            aygVar.ac(objR6);
                        }
                        doaVar = (doa) objR6;
                        aygVar.Y();
                    }
                    uevVar = new uev(doaVar, ocqVar);
                    aygVar.Y();
                } else {
                    aycVarC.u(-519577836);
                    ((ayg) aycVarC).Y();
                    uevVar = new uev(blpVar, null);
                }
                aycVar2 = aycVarC;
                WearableControllerProvider.l(uifVar2, bikVar, z, uivVar, (ocq) uevVar.b, (blp) uevVar.a, uivVar2, afnVar, uivVar4, aycVar2, i6 & 2114453502, i7 & 14);
            } else {
                aycVar2 = aycVarC;
                aycVar2.r();
            }
            bai baiVarI = aycVar2.I();
            if (baiVarI != null) {
                baiVarI.d = new uiu() { // from class: dpg
                    @Override // defpackage.uiu
                    public final Object a(Object obj2, Object obj3) {
                        ayc aycVar3 = (ayc) obj2;
                        ((Integer) obj3).intValue();
                        uif uifVar3 = uifVar;
                        bik bikVar2 = bikVar;
                        boolean z2 = z;
                        uiv uivVar5 = uivVar;
                        dpi dpiVar2 = dpiVar;
                        uiv uivVar6 = uivVar2;
                        afn afnVar2 = afnVar;
                        int i8 = i;
                        AmbientModeSupport.AmbientCallback.i(uifVar3, bikVar2, z2, uivVar5, dpiVar2, uivVar6, afnVar2, uivVar3, aycVar3, bay.j(i8 | 1), bay.j(i2));
                        return ufg.a;
                    }
                };
            }
        }

        public static final void j(uif uifVar, bik bikVar, boolean z, dpi dpiVar, dpf dpfVar, uiv uivVar, ayc aycVar, int i) {
            uif uifVar2;
            int i2;
            boolean z2;
            dpi dpiVar2;
            boolean z3;
            dpi dpiVar3;
            int i3;
            long j;
            ayc aycVarC = aycVar.c(848193499);
            if ((i & 6) == 0) {
                uifVar2 = uifVar;
                i2 = i | (true != aycVarC.D(uifVar2) ? 2 : 4);
            } else {
                uifVar2 = uifVar;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
            }
            int i4 = i2 | 28032;
            if ((i & ImageMetadata.EDGE_MODE) == 0) {
                i4 = i2 | 93568;
            }
            if ((i & 1572864) == 0) {
                i4 |= true != aycVarC.B(dpfVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
            }
            int i5 = i4 | 113246208;
            if ((i & 805306368) == 0) {
                i5 |= true != aycVarC.D(uivVar) ? 268435456 : 536870912;
            }
            if (aycVarC.H((306783379 & i5) != 306783378, i5 & 1)) {
                int i6 = i5 >> 6;
                aycVarC.s();
                if ((i & 1) == 0 || aycVarC.E()) {
                    drf drfVarI = SharedLibraryVersion.i(aycVarC);
                    dpi dpiVar4 = drfVarI.a;
                    if (dpiVar4 == null) {
                        aycVarC.u(-913332199);
                        apz apzVar = dsk.a;
                        apz apzVar2 = dsk.c;
                        dpiVar4 = new dpi(apzVar2, apzVar2);
                        drfVarI.a = dpiVar4;
                        ((ayg) aycVarC).Y();
                    } else {
                        aycVarC.u(-913334710);
                        ((ayg) aycVarC).Y();
                    }
                    z3 = true;
                    dpiVar3 = dpiVar4;
                } else {
                    aycVarC.r();
                    z3 = z;
                    dpiVar3 = dpiVar;
                }
                aycVarC.l();
                bik bikVarC = amd.c(bikVar.cM(MinimumInteractiveModifier.a), 52.0f);
                amj amjVar = new amj(dpfVar, 5);
                arx arxVar = new arx(2);
                afr afrVarA = dpx.a();
                if (z3) {
                    i3 = 805306368;
                    j = dpfVar.b;
                } else {
                    i3 = 805306368;
                    j = dpfVar.d;
                }
                i(uifVar2, bikVarC, z3, amjVar, dpiVar3, arxVar, afrVarA, SharedLibraryVersion.f(j, uivVar), aycVarC, (i5 & 7168) | (i5 & 14) | i3 | (i5 & 896) | (i5 & 57344) | (i6 & 3670016), 0);
                z2 = z3;
                dpiVar2 = dpiVar3;
            } else {
                aycVarC.r();
                z2 = z;
                dpiVar2 = dpiVar;
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new dph(uifVar, bikVar, z2, dpiVar2, dpfVar, uivVar, i, 0);
            }
        }

        public static final void k(bkn bknVar, long j, float f, float f2, float f3) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            bkg bkgVar = new bkg(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f2, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f2);
            if (bknVar.b == null) {
                bknVar.b = new RectF();
            }
            float f4 = bkgVar.e;
            float f5 = bkgVar.d;
            float f6 = bkgVar.c;
            float f7 = bkgVar.b;
            RectF rectF = bknVar.b;
            rectF.getClass();
            rectF.set(f7, f6, f5, f4);
            Path path = bknVar.a;
            RectF rectF2 = bknVar.b;
            rectF2.getClass();
            path.arcTo(rectF2, f3, 90.0f, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void l(final defpackage.uif r28, defpackage.bik r29, boolean r30, final defpackage.doj r31, defpackage.uiv r32, defpackage.ayc r33, final int r34) {
            /*
                Method dump skipped, instructions count: 725
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientModeSupport.AmbientCallback.l(uif, bik, boolean, doj, uiv, ayc, int):void");
        }

        private static final uif m(bbo bboVar) {
            return (uif) bboVar.a();
        }

        public final void onAmbientOffloadInvalidated() {
        }

        public final void onExitAmbient() {
        }

        public final void onUpdateAmbient() {
        }

        public final void onEnterAmbient(Bundle bundle) {
        }
    }
}
