package androidx.wear.ambient;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.IntrinsicWidthElement;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.ar.core.ImageMetadata;
import defpackage.a;
import defpackage.afs;
import defpackage.akq;
import defpackage.alv;
import defpackage.ama;
import defpackage.amc;
import defpackage.amd;
import defpackage.amq;
import defpackage.ana;
import defpackage.anb;
import defpackage.ang;
import defpackage.ank;
import defpackage.apz;
import defpackage.asj;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.bag;
import defpackage.bai;
import defpackage.bay;
import defpackage.bbr;
import defpackage.bdq;
import defpackage.bfh;
import defpackage.bfk;
import defpackage.bib;
import defpackage.bid;
import defpackage.bik;
import defpackage.bkv;
import defpackage.blp;
import defpackage.bnd;
import defpackage.bsr;
import defpackage.bum;
import defpackage.byi;
import defpackage.bze;
import defpackage.cbk;
import defpackage.cdo;
import defpackage.chc;
import defpackage.cib;
import defpackage.dbq;
import defpackage.dji;
import defpackage.djl;
import defpackage.djn;
import defpackage.dkm;
import defpackage.dkz;
import defpackage.dof;
import defpackage.doi;
import defpackage.doj;
import defpackage.dok;
import defpackage.don;
import defpackage.doo;
import defpackage.dop;
import defpackage.doq;
import defpackage.dos;
import defpackage.dou;
import defpackage.dpd;
import defpackage.dpt;
import defpackage.dpu;
import defpackage.dpx;
import defpackage.dqe;
import defpackage.dri;
import defpackage.drn;
import defpackage.drw;
import defpackage.dsk;
import defpackage.edv;
import defpackage.edy;
import defpackage.eed;
import defpackage.eep;
import defpackage.eer;
import defpackage.ees;
import defpackage.eet;
import defpackage.fct;
import defpackage.gga;
import defpackage.hbp;
import defpackage.hwt;
import defpackage.jeg;
import defpackage.k;
import defpackage.kad;
import defpackage.kae;
import defpackage.kai;
import defpackage.kbz;
import defpackage.kwp;
import defpackage.llj;
import defpackage.lzh;
import defpackage.lzj;
import defpackage.nic;
import defpackage.ogk;
import defpackage.ojl;
import defpackage.owf;
import defpackage.owi;
import defpackage.row;
import defpackage.seo;
import defpackage.sxo;
import defpackage.ufg;
import defpackage.ufw;
import defpackage.uhb;
import defpackage.uhi;
import defpackage.uif;
import defpackage.uiq;
import defpackage.uiu;
import defpackage.uiv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class AmbientMode extends Fragment {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
    AmbientDelegate a;
    AmbientCallback b;
    private final AmbientDelegate.AmbientCallback c = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientMode.1
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
    public class AmbientCallback {
        public AmbientCallback() {
        }

        private static void A(String str) throws edv {
            int i = eed.a;
            if (str.length() <= 0 || eed.d(str.charAt(0))) {
                for (int i2 = 1; i2 < str.length(); i2++) {
                    if (eed.c(str.charAt(i2))) {
                    }
                }
                return;
            }
            throw new edv("Bad XML name", 102);
        }

        public static float a(float f) {
            return (f * 180.0f) / 3.1415927f;
        }

        public static float b(float f) {
            return (f * 3.1415927f) / 180.0f;
        }

        public static void c(bik bikVar, float f, float f2, uiq uiqVar, ayc aycVar, int i) {
            int i2;
            int i3;
            ayc aycVarC = aycVar.c(-1074057563);
            if ((i & 6) == 0) {
                i2 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
            } else {
                i2 = i;
            }
            int i4 = i2 | 28080;
            if ((196608 & i) == 0) {
                i4 |= true != aycVarC.D(uiqVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
            }
            if (aycVarC.H((74899 & i4) != 74898, i4 & 1)) {
                cib cibVar = (cib) aycVarC.e(bze.h);
                if (a.p(0, 0) || a.p(0, 2)) {
                    i3 = 0;
                } else {
                    if (!a.p(0, 1) && !a.p(0, 3)) {
                        "Angular(value=0)".toString();
                        throw new RuntimeException("Unexpected CurvedDirection.Angular: ".concat("Angular(value=0)"));
                    }
                    i3 = 1;
                }
                djl djlVar = new djl(i3, cibVar);
                dji djiVar = new dji(djlVar, null, uiqVar);
                boolean zD = aycVarC.D(djiVar);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (zD || objR == ayb.a) {
                    objR = new asj(djiVar, 15);
                    aygVar.ac(objR);
                }
                bik bikVarB = bdq.B(bikVar, (uiq) objR);
                boolean zB = aycVarC.B(djlVar) | aycVarC.D(djiVar);
                boolean z = (i4 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
                boolean z2 = (i4 & 896) == 256;
                Object objR2 = aygVar.R();
                if ((z2 | zB | z) || objR2 == ayb.a) {
                    objR2 = new djn(djlVar, djiVar, 0);
                    aygVar.ac(objR2);
                }
                bsr bsrVar = (bsr) objR2;
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
                bbr.a(aycVarC, bsrVar, bum.d);
                bbr.a(aycVarC, bfkVarAg, bum.c);
                uiu uiuVar = bum.e;
                if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                    Integer numValueOf = Integer.valueOf(iM);
                    aygVar.ac(numValueOf);
                    aycVarC.h(numValueOf, uiuVar);
                }
                bbr.a(aycVarC, bikVarV, bum.b);
                djiVar.h(new kbz((String) null, 7), aycVarC, 0);
                aycVarC.m();
                f2 = 0.5f;
                f = 270.0f;
            } else {
                aycVarC.r();
            }
            float f3 = f;
            float f4 = f2;
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new nic(bikVar, f3, f4, uiqVar, i, 1);
            }
        }

        public static long d(int i, int i2, int i3) {
            float f = i3;
            return a.t(i / f, (i2 + i) / f);
        }

        public static long e(int i, int i2, int i3) {
            float f = i;
            float f2 = i - i2;
            float f3 = i3;
            return a.t(f2 / f3, f / f3);
        }

        public static Object f(ank ankVar, boolean z, int i, int i2, uhb uhbVar) {
            if (z) {
                Object objB = ankVar.b(afs.a, new ang(ankVar, i, i2, null), uhbVar);
                uhi uhiVar = uhi.a;
                if (objB != uhiVar) {
                    objB = ufg.a;
                }
                if (objB == uhiVar) {
                    return objB;
                }
            } else {
                Object objH = ankVar.h(i, i2, uhbVar);
                if (objH == uhi.a) {
                    return objH;
                }
            }
            return ufg.a;
        }

        public static List g(dkz dkzVar) {
            dkm dkmVar = dkzVar instanceof dkm ? (dkm) dkzVar : null;
            return dkmVar != null ? dkmVar.a : ufw.a;
        }

        public static anb h(ana anaVar, int i) {
            Object obj;
            List list = anaVar.i;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((anb) obj).a == i) {
                    break;
                }
                i2++;
            }
            return (anb) obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x01f1, code lost:
        
            if (r53 > 100.01d) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01f5, code lost:
        
            if (r55 > 100.01d) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01f9, code lost:
        
            if (r57 <= 100.01d) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01fc, code lost:
        
            r0 = defpackage.dop.e(r53, r55, r57);
         */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static long i(long r59, float r61) {
            /*
                Method dump skipped, instructions count: 1366
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientMode.AmbientCallback.i(long, float):long");
        }

        public static doo j(int i) {
            dpd dpdVar = dpd.a;
            float[][] fArr = dop.a;
            double dB = dop.b((i >> 16) & 255);
            float fB = dop.b((i >> 8) & 255);
            float fB2 = dop.b(i & 255);
            double[][] dArr = dop.d;
            double[] dArr2 = dArr[0];
            double d = dArr2[0] * dB;
            double d2 = fB;
            double d3 = dArr2[1] * d2;
            double d4 = fB2;
            double d5 = dArr2[2] * d4;
            double[] dArr3 = dArr[1];
            double d6 = dArr3[0] * dB;
            double d7 = dArr3[1] * d2;
            double d8 = dArr3[2] * d4;
            double[] dArr4 = dArr[2];
            float f = (float) ((dB * dArr4[0]) + (d2 * dArr4[1]) + (d4 * dArr4[2]));
            float[] fArr2 = {(float) (d + d3 + d5), (float) (d6 + d7 + d8), f};
            float[][] fArr3 = dop.a;
            float f2 = fArr2[0];
            float[] fArr4 = fArr3[0];
            float f3 = fArr4[0] * f2;
            float f4 = fArr2[1];
            float f5 = fArr4[1] * f4;
            float f6 = fArr4[2] * f;
            float[] fArr5 = fArr3[1];
            float f7 = fArr5[0] * f2;
            float f8 = fArr5[1] * f4;
            float f9 = fArr5[2] * f;
            float[] fArr6 = fArr3[2];
            float f10 = f2 * fArr6[0];
            float f11 = f4 * fArr6[1];
            float f12 = f * fArr6[2];
            float[] fArr7 = dpdVar.g;
            float f13 = fArr7[0] * (f3 + f5 + f6);
            float f14 = fArr7[1] * (f7 + f8 + f9);
            float f15 = fArr7[2] * (f10 + f11 + f12);
            float f16 = dpdVar.h;
            float fPow = (float) Math.pow((Math.abs(f13) * f16) / 100.0f, 0.41999998688697815d);
            float fPow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0f, 0.41999998688697815d);
            float fPow3 = (float) Math.pow((f16 * Math.abs(f15)) / 100.0f, 0.41999998688697815d);
            float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
            float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
            float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
            float fAtan2 = (((float) Math.atan2(((fSignum + fSignum2) - (fSignum3 + fSignum3)) / 9.0f, (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f)) * 180.0f) / 3.1415927f;
            if (fAtan2 < 0.0f) {
                fAtan2 += 360.0f;
            } else if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            float f17 = fAtan2;
            float f18 = (f17 * 3.1415927f) / 180.0f;
            float f19 = ((((40.0f * fSignum) + (fSignum2 * 20.0f)) + fSignum3) / 20.0f) * dpdVar.d;
            float f20 = dpdVar.c;
            float f21 = dpdVar.f;
            float fPow4 = ((float) Math.pow(f19 / f20, dpdVar.j * 0.69000006f)) * 100.0f;
            float fSqrt = ((float) Math.sqrt(fPow4 / 100.0f)) * ((float) Math.pow((((((((float) Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * dpdVar.e) * ((float) Math.sqrt((r9 * r9) + (r3 * r3)))) / (((((fSignum * 20.0f) + r4) + (fSignum3 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, dpdVar.b)), 0.7300000190734863d));
            float f22 = dpdVar.i * fSqrt;
            Math.sqrt((r0 * 0.69000006f) / (f20 + 4.0f));
            double d9 = f18;
            float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
            return new doo(f17, fSqrt, fPow4, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
        }

        public static doo k(float f, float f2, float f3) {
            dpd dpdVar = dpd.a;
            float f4 = dpdVar.i * f2;
            float fSqrt = (float) Math.sqrt(f / 100.0d);
            float f5 = dpdVar.f;
            Math.sqrt(((f2 / fSqrt) * 0.69000006f) / (dpdVar.c + 4.0f));
            float fLog = (float) Math.log((f4 * 0.0228d) + 1.0d);
            double d = (3.1415927f * f3) / 180.0f;
            float f6 = fLog * 43.85965f;
            return new doo(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), f6 * ((float) Math.cos(d)), f6 * ((float) Math.sin(d)));
        }

        public static void l(final uif uifVar, final bik bikVar, final uiv uivVar, final uiv uivVar2, final boolean z, final blp blpVar, final cdo cdoVar, final doj dojVar, final alv alvVar, final dri driVar, final uiv uivVar3, ayc aycVar, final int i, final int i2) {
            int i3;
            bik bikVar2;
            uiv uivVar4;
            int i4;
            uiv uivVar5;
            int i5;
            boolean z2;
            blp blpVar2;
            cdo cdoVar2;
            int i6;
            uiv uivVar6;
            int i7 = i & 6;
            ayc aycVarC = aycVar.c(1142294511);
            if (i7 == 0) {
                i3 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                bikVar2 = bikVar;
                i3 |= true != aycVarC.B(bikVar2) ? 16 : 32;
            } else {
                bikVar2 = bikVar;
            }
            if ((i & 384) == 0) {
                i3 |= true != aycVarC.D(null) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i3 |= true != aycVarC.B(null) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                uivVar4 = uivVar;
                i3 |= true != aycVarC.D(uivVar4) ? 8192 : 16384;
            } else {
                uivVar4 = uivVar;
            }
            int i8 = i & ImageMetadata.EDGE_MODE;
            int i9 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            if (i8 == 0) {
                i4 = 196608;
                uivVar5 = uivVar2;
                i3 |= true != aycVarC.D(uivVar5) ? 65536 : 131072;
            } else {
                i4 = 196608;
                uivVar5 = uivVar2;
            }
            int i10 = i & 1572864;
            int i11 = ImageMetadata.SHADING_MODE;
            if (i10 == 0) {
                i5 = 1572864;
                z2 = z;
                i3 |= true != aycVarC.C(z2) ? ImageMetadata.LENS_APERTURE : 1048576;
            } else {
                i5 = 1572864;
                z2 = z;
            }
            if ((12582912 & i) == 0) {
                blpVar2 = blpVar;
                i3 |= true != aycVarC.B(blpVar2) ? 4194304 : 8388608;
            } else {
                blpVar2 = blpVar;
            }
            if ((100663296 & i) == 0) {
                cdoVar2 = cdoVar;
                i3 |= true != aycVarC.B(cdoVar2) ? 33554432 : 67108864;
            } else {
                cdoVar2 = cdoVar;
            }
            if ((805306368 & i) == 0) {
                i3 |= true != aycVarC.D(null) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i6 = i2 | (true != aycVarC.D(null) ? 2 : 4);
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                i6 |= true != aycVarC.B(dojVar) ? 16 : 32;
            }
            if ((i2 & 384) == 0) {
                i6 |= true != aycVarC.B(null) ? 128 : 256;
            }
            if ((i2 & 3072) == 0) {
                i6 |= true == aycVarC.B(alvVar) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i6 |= true == aycVarC.B(null) ? 16384 : 8192;
            }
            if ((i2 & i4) == 0) {
                if (true == ((262144 & i2) == 0 ? aycVarC.B(driVar) : aycVarC.D(driVar))) {
                    i9 = 131072;
                }
                i6 |= i9;
            }
            if ((i2 & i5) == 0) {
                uivVar6 = uivVar3;
                if (true != aycVarC.D(uivVar6)) {
                    i11 = ImageMetadata.LENS_APERTURE;
                }
                i6 |= i11;
            } else {
                uivVar6 = uivVar3;
            }
            if (aycVarC.H(((306783379 & i3) == 306783378 && (599187 & i6) == 599186) ? false : true, i3 & 1)) {
                bfh bfhVarK = bdq.k(-508149983, new don(uivVar5, dojVar, z2, uivVar6, uivVar4), aycVarC);
                int i12 = i3 >> 6;
                int i13 = i6 << 24;
                int i14 = i6 >> 6;
                m(uifVar, bikVar2, z, blpVar2, cdoVar2, dojVar, alvVar, driVar, bfhVarK, aycVarC, (i12 & 29360128) | (i3 & 8190) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (234881024 & i13) | (i13 & 1879048192), (i14 & ScriptIntrinsicBLAS.TRANSPOSE) | (i14 & 14) | 24576 | (i14 & 896) | (i14 & 7168));
            } else {
                aycVarC.r();
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new uiu() { // from class: dom
                    @Override // defpackage.uiu
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        uif uifVar2 = uifVar;
                        bik bikVar3 = bikVar;
                        uiv uivVar7 = uivVar;
                        uiv uivVar8 = uivVar2;
                        boolean z3 = z;
                        blp blpVar3 = blpVar;
                        cdo cdoVar3 = cdoVar;
                        doj dojVar2 = dojVar;
                        alv alvVar2 = alvVar;
                        dri driVar2 = driVar;
                        int i15 = i;
                        AmbientMode.AmbientCallback.l(uifVar2, bikVar3, uivVar7, uivVar8, z3, blpVar3, cdoVar3, dojVar2, alvVar2, driVar2, uivVar3, (ayc) obj, bay.j(i15 | 1), bay.j(i2));
                        return ufg.a;
                    }
                };
            }
        }

        public static void m(uif uifVar, bik bikVar, boolean z, blp blpVar, cdo cdoVar, doj dojVar, alv alvVar, dri driVar, uiv uivVar, ayc aycVar, int i, int i2) {
            int i3;
            blp blpVar2;
            int i4;
            uiv uivVar2;
            int i5 = i & 6;
            ayc aycVarC = aycVar.c(1759235055);
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
                blpVar2 = blpVar;
                i3 |= true != aycVarC.B(blpVar2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
            } else {
                blpVar2 = blpVar;
            }
            if ((1572864 & i) == 0) {
                i3 |= true != aycVarC.B(cdoVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
            }
            if ((12582912 & i) == 0) {
                i3 |= true != aycVarC.D(null) ? 4194304 : 8388608;
            }
            if ((100663296 & i) == 0) {
                i3 |= true != aycVarC.D(null) ? 33554432 : 67108864;
            }
            if ((805306368 & i) == 0) {
                i3 |= true != aycVarC.B(dojVar) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i4 = i2 | (true != aycVarC.B(null) ? 2 : 4);
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= true == aycVarC.B(alvVar) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= true == aycVarC.B(null) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= true == ((i2 & 4096) == 0 ? aycVarC.B(driVar) : aycVarC.D(driVar)) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= true == aycVarC.D(uivVar) ? 16384 : 8192;
            }
            if (aycVarC.H(((306783379 & i3) == 306783378 && (i4 & 9363) == 9362) ? false : true, i3 & 1)) {
                int i6 = i3;
                bnd bndVar = new bnd(dojVar.a(z));
                bid bidVar = bib.b;
                int i7 = i4 >> 6;
                uivVar2 = uivVar;
                bik bikVarAF = byi.aF(byi.bL(WearableControllerProvider.e(bikVar.cM(new IntrinsicWidthElement()), driVar, bndVar, blpVar2, aycVarC, ((i6 >> 6) & 7168) | (i7 & ScriptIntrinsicBLAS.TRANSPOSE) | ((i4 << 12) & 57344), 0), null, dpx.a(), z, new cbk(0), uifVar, 392), alvVar);
                bfh bfhVar = new bfh(-991262140, true, new dpt(dojVar.b(z), cdoVar, uivVar2));
                bsr bsrVarA = ama.a(akq.a, bidVar, aycVarC, 48);
                int iM = bay.M(aycVarC);
                ayg aygVar = (ayg) aycVarC;
                bfk bfkVarAg = aygVar.ag();
                bik bikVarV = bay.v(aycVarC, bikVarAF);
                uif uifVar2 = bum.a;
                aycVarC.v();
                if (aygVar.v) {
                    aycVarC.j(uifVar2);
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
                bfhVar.a(amc.a, aycVarC, 6);
                aycVarC.m();
            } else {
                uivVar2 = uivVar;
                aycVarC.r();
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new amq(uifVar, bikVar, z, blpVar, cdoVar, dojVar, alvVar, driVar, uivVar2, i, i2, 2);
            }
        }

        public static void n(final uif uifVar, final bik bikVar, final uiv uivVar, final uiv uivVar2, boolean z, blp blpVar, final doj dojVar, final alv alvVar, final dri driVar, final uiv uivVar3, ayc aycVar, final int i, final int i2) {
            int i3;
            int i4;
            final boolean z2;
            final blp blpVar2;
            blp blpVar3;
            boolean z3;
            boolean z4;
            int i5;
            int i6;
            int i7;
            int i8;
            bfh bfhVar;
            bfh bfhVar2;
            int i9;
            ayc aycVarC = aycVar.c(-565599387);
            if ((i & 6) == 0) {
                i3 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= true != aycVarC.B(bikVar) ? 16 : 32;
            }
            int i10 = i3 | 3456;
            if ((i & 24576) == 0) {
                i10 |= true != aycVarC.D(uivVar) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                i10 |= true != aycVarC.D(uivVar2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
            }
            int i11 = 1572864 | i10;
            if ((12582912 & i) == 0) {
                i11 = i10 | 5767168;
            }
            if ((100663296 & i) == 0) {
                i11 |= true != aycVarC.B(dojVar) ? 33554432 : 67108864;
            }
            if ((i2 & 6) == 0) {
                i4 = (true != aycVarC.B(alvVar) ? 2 : 4) | i2;
            } else {
                i4 = i2;
            }
            int i12 = i4 | 48;
            if ((i2 & 384) == 0) {
                i12 |= true != ((i2 & 512) == 0 ? aycVarC.B(driVar) : aycVarC.D(driVar)) ? 128 : 256;
            }
            if ((i2 & 3072) == 0) {
                i12 |= true != aycVarC.D(uivVar3) ? 1024 : 2048;
            }
            int i13 = i11 | 805306368;
            if (aycVarC.H(((306783379 & i13) == 306783378 && (i12 & 1171) == 1170) ? false : true, i13 & 1)) {
                int i14 = i13 >> 21;
                aycVarC.s();
                if ((i & 1) == 0 || aycVarC.E()) {
                    alv alvVar2 = dok.a;
                    apz apzVar = dsk.a;
                    blpVar3 = dsk.d;
                    z3 = true;
                } else {
                    aycVarC.r();
                    z3 = z;
                    blpVar3 = blpVar;
                }
                aycVarC.l();
                alv alvVar3 = dok.a;
                bik bikVarA = amd.a(bikVar, Float.NaN, dok.b);
                long j = z3 ? dojVar.a : dojVar.c;
                cdo cdoVarC = drw.c(10, aycVarC);
                boolean z5 = z3;
                drn drnVar = new drn(new chc(5), 2, 2);
                if (uivVar != null) {
                    long j2 = j;
                    z4 = z5;
                    i6 = i14;
                    i8 = 5;
                    i5 = i12;
                    i7 = i13;
                    bfhVar = new bfh(1799575903, true, new dpu(j2, cdoVarC, drnVar, uivVar, 1));
                } else {
                    z4 = z5;
                    i5 = i12;
                    i6 = i14;
                    i7 = i13;
                    i8 = 5;
                    bfhVar = null;
                }
                bfh bfhVar3 = bfhVar;
                cdo cdoVarC2 = drw.c(9, aycVarC);
                long jB = dojVar.b(z4);
                cdo cdoVarC3 = drw.c(9, aycVarC);
                if (uivVar2 == null && uivVar == null) {
                    bfhVar2 = bfhVar3;
                    i9 = 3;
                } else {
                    bfhVar2 = bfhVar3;
                    i9 = i8;
                }
                uiv uivVarG = SharedLibraryVersion.g(jB, cdoVarC3, new drn(new chc(i9), 2, 3), uivVar3);
                int i15 = i5 << 9;
                int i16 = (i7 & 3670016) | (i7 & 14) | 805306368 | (i7 & 896) | (i7 & 7168) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES);
                int i17 = (i6 & 896) | (i6 & ScriptIntrinsicBLAS.TRANSPOSE) | 6 | (i15 & 7168) | (57344 & i15) | (i15 & ImageMetadata.JPEG_GPS_COORDINATES);
                boolean z6 = z4;
                blp blpVar4 = blpVar3;
                l(uifVar, bikVarA, bfhVar2, uivVar2, z6, blpVar4, cdoVarC2, dojVar, alvVar, driVar, uivVarG, aycVarC, i16, i17);
                z2 = z6;
                blpVar2 = blpVar4;
            } else {
                aycVarC.r();
                z2 = z;
                blpVar2 = blpVar;
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                baiVarI.d = new uiu() { // from class: dol
                    @Override // defpackage.uiu
                    public final Object a(Object obj, Object obj2) {
                        ayc aycVar2 = (ayc) obj;
                        ((Integer) obj2).intValue();
                        uif uifVar2 = uifVar;
                        bik bikVar2 = bikVar;
                        uiv uivVar4 = uivVar;
                        uiv uivVar5 = uivVar2;
                        boolean z7 = z2;
                        blp blpVar5 = blpVar2;
                        doj dojVar2 = dojVar;
                        alv alvVar4 = alvVar;
                        dri driVar2 = driVar;
                        int i18 = i;
                        AmbientMode.AmbientCallback.n(uifVar2, bikVar2, uivVar4, uivVar5, z7, blpVar5, dojVar2, alvVar4, driVar2, uivVar3, aycVar2, bay.j(i18 | 1), bay.j(i2));
                        return ufg.a;
                    }
                };
            }
        }

        public static void o(bik bikVar, uiu uiuVar, long j, long j2, final uiv uivVar, ayc aycVar, final int i, final int i2) {
            int i3;
            final uiu uiuVar2;
            final long j3;
            final long j4;
            uiu uiuVar3;
            long j5;
            long j6;
            int i4 = i2 & 1;
            ayc aycVarC = aycVar.c(1403203394);
            if (i4 != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
            } else {
                i3 = i;
            }
            int i5 = i2 & 2;
            if (i5 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= true != aycVarC.D(uiuVar) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= true != aycVarC.D(uivVar) ? 8192 : 16384;
            }
            if (aycVarC.H((i3 & 9363) != 9362, i3 & 1)) {
                aycVarC.s();
                if ((i & 1) == 0 || aycVarC.E()) {
                    if (i4 != 0) {
                        bikVar = bik.c;
                    }
                    uiuVar3 = i5 != 0 ? dos.a : uiuVar;
                    j5 = SharedLibraryVersion.h(aycVarC).w;
                    aycVarC.u(578391361);
                    doq doqVarH = SharedLibraryVersion.h(aycVarC);
                    long j7 = doqVarH.a;
                    long j8 = bkv.a;
                    j6 = (a.q(j5, j7) || a.q(j5, doqVarH.b)) ? doqVarH.d : a.q(j5, doqVarH.c) ? doqVarH.e : (a.q(j5, doqVarH.f) || a.q(j5, doqVarH.g)) ? doqVarH.i : a.q(j5, doqVarH.h) ? doqVarH.j : (a.q(j5, doqVarH.k) || a.q(j5, doqVarH.l)) ? doqVarH.n : a.q(j5, doqVarH.m) ? doqVarH.o : (a.q(j5, doqVarH.q) || a.q(j5, doqVarH.p) || a.q(j5, doqVarH.r)) ? doqVarH.s : a.q(j5, doqVarH.w) ? doqVarH.x : (a.q(j5, doqVarH.y) || a.q(j5, doqVarH.z)) ? doqVarH.B : a.q(j5, doqVarH.A) ? doqVarH.C : bkv.f;
                    if (j6 == 16) {
                        j6 = ((bkv) aycVarC.e(dou.a)).g;
                    }
                    ((ayg) aycVarC).Y();
                } else {
                    aycVarC.r();
                    uiuVar3 = uiuVar;
                    j5 = j;
                    j6 = j2;
                }
                aycVarC.l();
                dof.a.a(aycVarC, 0);
                bay.L(new bag[]{dqe.a.b(new kwp(uiuVar3)), dou.a.b(new bkv(j6))}, bdq.k(2010293250, new doi(j5, uivVar, 0), aycVarC), aycVarC, 56);
                j3 = j5;
                uiuVar2 = uiuVar3;
                j4 = j6;
            } else {
                aycVarC.r();
                uiuVar2 = uiuVar;
                j3 = j;
                j4 = j2;
            }
            bai baiVarI = aycVarC.I();
            if (baiVarI != null) {
                final bik bikVar2 = bikVar;
                baiVarI.d = new uiu() { // from class: doh
                    @Override // defpackage.uiu
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        bik bikVar3 = bikVar2;
                        uiu uiuVar4 = uiuVar2;
                        long j9 = j3;
                        long j10 = j4;
                        AmbientMode.AmbientCallback.o(bikVar3, uiuVar4, j9, j10, uivVar, (ayc) obj, bay.j(i | 1), i2);
                        return ufg.a;
                    }
                };
            }
        }

        public static boolean p(Intent intent) {
            if (intent == null) {
                return false;
            }
            return intent.getBooleanExtra("isSetupFlow", false);
        }

        public static String q(Context context, int i, Object... objArr) throws Resources.NotFoundException {
            Locale locale = Locale.getDefault();
            String string = context.getResources().getString(i);
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                int i2 = k.d;
                StringBuilder sb = new StringBuilder(string.length());
                new k(string, locale).b(0, null, null, null, objArr, new ogk(sb), null);
                return sb.toString();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }

        public static String r(String str) {
            return str.toLowerCase(Locale.US).replaceAll("_", "-");
        }

        public static String s(String str) {
            return str.toUpperCase(Locale.US).replaceAll("-", "_");
        }

        public static String t(int i) {
            if (i == 1) {
                return "OPEN_CAMERA";
            }
            if (i == 2) {
                return mNLbzhCxd.ZPSiagJGvVeUn;
            }
            if (i == 3) {
                return "RECONNECT";
            }
            if (i == 4) {
                return "UNLOCK";
            }
            if (i == 5) {
                return "LOCK";
            }
            if (i == 501) {
                return "ENABLE_SHUTTER_SOUND";
            }
            if (i == 502) {
                return "SET_DISPLAY_ORIENTATION";
            }
            if (i == 601) {
                return "CAPTURE_PHOTO";
            }
            switch (i) {
                case 101:
                    return "SET_PREVIEW_TEXTURE_ASYNC";
                case 102:
                    return "START_PREVIEW_ASYNC";
                case 103:
                    return "STOP_PREVIEW";
                case 104:
                    return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
                case 105:
                    return "ADD_CALLBACK_BUFFER";
                case 106:
                    return "SET_PREVIEW_DISPLAY_ASYNC";
                case 107:
                    return "SET_PREVIEW_CALLBACK";
                case 108:
                    return "SET_ONE_SHOT_PREVIEW_CALLBACK";
                default:
                    switch (i) {
                        case 201:
                            return "SET_PARAMETERS";
                        case 202:
                            return "GET_PARAMETERS";
                        case 203:
                            return "REFRESH_PARAMETERS";
                        case 204:
                            return UvOvSgfD.PIwXoZhoHBLfP;
                        default:
                            switch (i) {
                                case 301:
                                    return "AUTO_FOCUS";
                                case 302:
                                    return "CANCEL_AUTO_FOCUS";
                                case 303:
                                    return "SET_AUTO_FOCUS_MOVE_CALLBACK";
                                case 304:
                                    return "SET_ZOOM_CHANGE_LISTENER";
                                case 305:
                                    return "CANCEL_AUTO_FOCUS_FINISH";
                                default:
                                    switch (i) {
                                        case 461:
                                            return "SET_FACE_DETECTION_LISTENER";
                                        case 462:
                                            return "START_FACE_DETECTION";
                                        case 463:
                                            return "STOP_FACE_DETECTION";
                                        default:
                                            return a.bE(i, "UNKNOWN(", ")");
                                    }
                            }
                    }
            }
        }

        public static int u(float f, int i, int i2) {
            if (i == i2) {
                return i;
            }
            float f2 = ((i >> 24) & 255) / 255.0f;
            float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
            float fW = w(((i >> 16) & 255) / 255.0f);
            float fW2 = w(((i >> 8) & 255) / 255.0f);
            float fW3 = w((i & 255) / 255.0f);
            float fW4 = fW + ((w(((i2 >> 16) & 255) / 255.0f) - fW) * f);
            float fW5 = fW2 + ((w(((i2 >> 8) & 255) / 255.0f) - fW2) * f);
            float fW6 = fW3 + (f * (w((i2 & 255) / 255.0f) - fW3));
            float fX = x(fW4) * 255.0f;
            float fX2 = x(fW5) * 255.0f;
            float fX3 = x(fW6) * 255.0f;
            return (Math.round(fX) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(fX2) << 8) | Math.round(fX3);
        }

        public static eer v(String str, String str2) throws edv {
            int i;
            int i2;
            ees eesVar;
            int i3;
            boolean z;
            int i4;
            char c;
            if (str == null) {
                throw new edv("Parameter must not be null", 4);
            }
            eer eerVar = new eer();
            int i5 = 0;
            while (i5 < str2.length() && "/[*".indexOf(str2.charAt(i5)) < 0) {
                i5++;
            }
            if (i5 == 0) {
                throw new edv("Empty initial XMPPath step", 102);
            }
            String strY = y(str, str2.substring(0, i5));
            eep eepVarE = edy.a.e(strY);
            int i6 = 3;
            int i7 = 1;
            if (eepVarE == null) {
                eerVar.c(new ees(str, Integer.MIN_VALUE));
                eerVar.c(new ees(strY, 1));
            } else {
                String str3 = eepVarE.a;
                eerVar.c(new ees(str3, Integer.MIN_VALUE));
                ees eesVar2 = new ees(y(str3, eepVarE.c), 1);
                eesVar2.a();
                eet eetVar = eepVarE.d;
                eesVar2.d = eetVar.a;
                eerVar.c(eesVar2);
                if (eetVar.c()) {
                    ees eesVar3 = new ees("[?xml:lang='x-default']", 5);
                    eesVar3.a();
                    eesVar3.d = eetVar.a;
                    eerVar.c(eesVar3);
                } else if (eetVar.h(512)) {
                    ees eesVar4 = new ees("[1]", 3);
                    eesVar4.a();
                    eesVar4.d = eetVar.a;
                    eerVar.c(eesVar4);
                }
            }
            int i8 = 0;
            int i9 = 0;
            while (i5 < str2.length()) {
                if (str2.charAt(i5) == '/' && (i5 = i5 + 1) >= str2.length()) {
                    throw new edv("Empty XMPPath segment", 102);
                }
                if (str2.charAt(i5) == '*' && ((i5 = i5 + 1) >= str2.length() || str2.charAt(i5) != '[')) {
                    throw new edv("Missing '[' after '*'", 102);
                }
                if (str2.charAt(i5) == '[') {
                    int i10 = i5 + 1;
                    if (str2.charAt(i10) >= '0') {
                        i = i7;
                        if (str2.charAt(i10) <= '9') {
                            while (i10 < str2.length() && str2.charAt(i10) >= '0' && str2.charAt(i10) <= '9') {
                                i10++;
                            }
                            int i11 = i10;
                            i10 = i9;
                            eesVar = new ees(null, i6);
                            i2 = i11;
                        }
                        if (i2 < str2.length() || str2.charAt(i2) != ']') {
                            throw new edv("Missing ']' for array index", 102);
                        }
                        i3 = i2 + 1;
                        eesVar.a = str2.substring(i5, i3);
                        i5 = i10;
                    } else {
                        i = i7;
                    }
                    i2 = i10;
                    while (i2 < str2.length() && str2.charAt(i2) != ']' && str2.charAt(i2) != '=') {
                        i2++;
                    }
                    if (i2 >= str2.length()) {
                        throw new edv("Missing ']' or '=' for array index", 102);
                    }
                    if (str2.charAt(i2) != ']') {
                        char cCharAt = str2.charAt(i2 + 1);
                        if (cCharAt != '\'' && cCharAt != '\"') {
                            throw new edv("Invalid quote in array selector", 102);
                        }
                        int i12 = i2 + 2;
                        while (i12 < str2.length()) {
                            if (str2.charAt(i12) == cCharAt) {
                                int i13 = i12 + 1;
                                if (i13 >= str2.length() || str2.charAt(i13) != cCharAt) {
                                    break;
                                }
                                i12 = i13;
                            }
                            i12++;
                        }
                        if (i12 >= str2.length()) {
                            throw new edv("No terminating quote for array selector", 102);
                        }
                        int i14 = i12 + 1;
                        eesVar = new ees(null, 6);
                        int i15 = i2;
                        i2 = i14;
                        i8 = i15;
                    } else {
                        if (!"[last()".equals(str2.substring(i5, i2))) {
                            throw new edv("Invalid non-numeric array index", 102);
                        }
                        i10 = i9;
                        eesVar = new ees(null, 4);
                    }
                    if (i2 < str2.length()) {
                    }
                    throw new edv("Missing ']' for array index", 102);
                }
                i8 = i5;
                while (i8 < str2.length() && "/[*".indexOf(str2.charAt(i8)) < 0) {
                    i8++;
                }
                if (i8 == i5) {
                    throw new edv("Empty XMPPath segment", 102);
                }
                eesVar = new ees(str2.substring(i5, i8), i7);
                i = i7;
                i3 = i8;
                int i16 = eesVar.b;
                int i17 = i;
                if (i16 == i17) {
                    if (eesVar.a.charAt(0) == '@') {
                        eesVar.a = "?".concat(String.valueOf(eesVar.a.substring(i17)));
                        if (!"?xml:lang".equals(eesVar.a)) {
                            throw new edv("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    z = false;
                    if (eesVar.a.charAt(0) == '?') {
                        eesVar.b = 2;
                        i5++;
                    }
                    z(str2.substring(i5, i8));
                    c = 5;
                    i4 = 1;
                } else {
                    z = false;
                    if (i16 == 6) {
                        if (eesVar.a.charAt(1) == '@') {
                            eesVar.a = "[?".concat(String.valueOf(eesVar.a.substring(2)));
                            if (!eesVar.a.startsWith("[?xml:lang=")) {
                                throw new edv("Only xml:lang allowed with '@'", 102);
                            }
                        }
                        i4 = 1;
                        if (eesVar.a.charAt(1) == '?') {
                            i5++;
                            c = 5;
                            eesVar.b = 5;
                            z(str2.substring(i5, i8));
                        }
                    } else {
                        i4 = 1;
                    }
                    c = 5;
                }
                eerVar.c(eesVar);
                i9 = i5;
                i5 = i3;
                i6 = 3;
                i7 = i4;
            }
            return eerVar;
        }

        private static float w(float f) {
            return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }

        private static float x(float f) {
            return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
        }

        private static String y(String str, String str2) throws edv {
            if (str.length() == 0) {
                throw new edv("Schema namespace URI is required", 101);
            }
            if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
                throw new edv("Top level name must not be a qualifier", 102);
            }
            if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
                throw new edv("Top level name must be simple", 102);
            }
            gga ggaVar = edy.a;
            String strA = ggaVar.a(str);
            if (strA == null) {
                throw new edv("Unregistered schema namespace URI", 101);
            }
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf < 0) {
                A(str2);
                return strA.concat(String.valueOf(str2));
            }
            A(str2.substring(0, iIndexOf));
            A(str2.substring(iIndexOf));
            String strSubstring = str2.substring(0, iIndexOf + 1);
            String strA2 = ggaVar.a(str);
            if (strA2 == null) {
                throw new edv("Unknown schema namespace prefix", 101);
            }
            if (strSubstring.equals(strA2)) {
                return str2;
            }
            throw new edv("Schema namespace URI and prefix mismatch", 101);
        }

        private static void z(String str) throws edv {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf > 0) {
                String strSubstring = str.substring(0, iIndexOf);
                if (eed.e(strSubstring)) {
                    if (edy.a.b(strSubstring) == null) {
                        throw new edv("Unknown namespace prefix for qualified name", 102);
                    }
                    return;
                }
            }
            throw new edv("Ill-formed qualified name", 102);
        }

        public final void onAmbientOffloadInvalidated() {
        }

        public final void onEnterAmbient(Bundle bundle) {
        }

        public final void onExitAmbient() {
        }

        public final void onUpdateAmbient() {
        }

        protected /* synthetic */ AmbientCallback(byte[] bArr) {
        }

        public AmbientCallback(char[] cArr) {
        }
    }

    /* compiled from: PG */
    public interface AmbientCallbackProvider {
        AmbientCallback getAmbientCallback();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class AmbientController {
        public final /* synthetic */ Object a;

        public AmbientController() {
            throw null;
        }

        public final void a(int i, Object obj) {
            String str;
            String str2 = dbq.a;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
            ((ProfileInstallReceiver) this.a).setResultCode(i);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, syu] */
        public final void b(lzh lzhVar, lzj lzjVar) {
            ojl.ck(this.a, new fct(lzhVar, lzjVar, 10), sxo.a);
        }

        public final owf c() {
            return new owi(Long.valueOf(((llj) this.a).b));
        }

        public final owf d() {
            return ((llj) this.a).a;
        }

        public final boolean e(seo seoVar) {
            Deque deque = ((kai) this.a).i;
            if (deque.isEmpty()) {
                return seo.c(Long.valueOf(r4.d.a() - 1500000000)).m(seoVar);
            }
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                if (((kae) it.next()).d.m(seoVar)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(seo seoVar) {
            Iterator it = ((kai) this.a).j.iterator();
            while (it.hasNext()) {
                if (((kad) it.next()).d().m(seoVar)) {
                    return true;
                }
            }
            return false;
        }

        public final void g() {
            hbp hbpVar = (hbp) this.a;
            if (((AtomicInteger) hbpVar.a).decrementAndGet() == 0) {
                ((hwt) hbpVar.b).c();
            }
        }

        public final void h() {
            ((jeg) this.a).b.r = true;
        }

        public final void i(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            ((row) this.a).d(0);
        }

        public final boolean isAmbient() {
            AmbientDelegate ambientDelegate = ((AmbientMode) this.a).a;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.h();
        }

        public final void setAmbientOffloadEnabled(boolean z) {
            AmbientDelegate ambientDelegate = ((AmbientMode) this.a).a;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z);
            }
        }

        public AmbientController(Object obj) {
            this.a = obj;
        }

        public /* synthetic */ AmbientController(Object obj, byte[] bArr) {
            this.a = obj;
        }
    }

    public static AmbientController attachAmbientSupport(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        AmbientMode ambientMode = (AmbientMode) fragmentManager.findFragmentByTag("android.support.wearable.ambient.AmbientMode");
        if (ambientMode == null) {
            ambientMode = new AmbientMode();
            fragmentManager.beginTransaction().add(ambientMode, "android.support.wearable.ambient.AmbientMode").commit();
        }
        return ambientMode.d;
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.a;
        if (ambientDelegate != null) {
            ambientDelegate.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = new AmbientDelegate(getActivity(), this.c);
        if (context instanceof AmbientCallbackProvider) {
            this.b = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientMode", "No callback provided - enabling only smart resume");
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b();
        if (this.b != null) {
            this.a.g();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        this.a = null;
        super.onDetach();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        this.a.d();
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        this.a.f();
        super.onStop();
    }
}
