package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.hardware.HardwareBuffer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.SharedLibraryVersion;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsv {
    public jsv() {
    }

    public static String A(npl nplVar) {
        return nplVar.c().name();
    }

    public static npk B() {
        throw new UnsupportedOperationException("unsupported process(GLExternalTexture, GLCanvas)");
    }

    public static String C(long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        return hours > 0 ? String.format("%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%1d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public static paq D(Context context, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.getClass();
        rnt.L(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        connectivityManager.registerDefaultNetworkCallback(networkCallback, new Handler(Looper.getMainLooper()));
        return new loe(connectivityManager, networkCallback, 11);
    }

    public static int E(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(13)) {
            return 1;
        }
        return !connectivityManager.isActiveNetworkMetered() ? 3 : 2;
    }

    public static rwc F(PackageManager packageManager, Intent intent, boolean z) {
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, ImageMetadata.SCALER_CROP_REGION);
        if (resolveInfoResolveActivity != null) {
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            if (activityInfo.name == null || !activityInfo.name.endsWith("ResolverActivity")) {
                return rwc.j(resolveInfoResolveActivity.activityInfo.applicationInfo);
            }
            if (z) {
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, ImageMetadata.SCALER_CROP_REGION);
                rvk rvkVar = rvk.a;
                rwc rwcVarJ = rvkVar;
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                        if (rwcVarJ.h()) {
                            return rvkVar;
                        }
                        rwcVarJ = rwc.j(resolveInfo.activityInfo.applicationInfo);
                    }
                }
                return rwcVarJ;
            }
        }
        return rvk.a;
    }

    public static final double G(float f) {
        return Math.pow(2.0d, f + 4.78d);
    }

    public static Object H(Class cls, final scn scnVar) {
        if (scnVar == null || scnVar.isEmpty()) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: nmp
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                try {
                    sgj sgjVarListIterator = scnVar.listIterator();
                    while (sgjVarListIterator.hasNext()) {
                        method.invoke(sgjVarListIterator.next(), objArr);
                    }
                    return null;
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw e;
                }
            }
        }));
    }

    public static Bitmap I(Bitmap bitmap, int i) {
        if (i % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void J(boolean z, uem uemVar) {
        if (z) {
            return;
        }
        ((nkm) uemVar.a()).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K(defpackage.bqc r10, defpackage.uif r11, defpackage.uif r12, defpackage.uiq r13, defpackage.uhb r14) {
        /*
            boolean r0 = r14 instanceof defpackage.niv
            if (r0 == 0) goto L13
            r0 = r14
            niv r0 = (defpackage.niv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            niv r0 = new niv
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nir r12 = r0.c
            defpackage.rnt.aN(r14)     // Catch: java.util.concurrent.CancellationException -> L4e
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.rnt.aN(r14)
            niw r4 = new niw     // Catch: java.util.concurrent.CancellationException -> L4c
            r8 = 0
            r9 = 0
            r5 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L4d
            r12 = r7
            nir r12 = (defpackage.nir) r12     // Catch: java.util.concurrent.CancellationException -> L4d
            r0.c = r12     // Catch: java.util.concurrent.CancellationException -> L4d
            r0.b = r3     // Catch: java.util.concurrent.CancellationException -> L4d
            java.lang.Object r10 = defpackage.e.u(r10, r4, r0)     // Catch: java.util.concurrent.CancellationException -> L4d
            if (r10 != r1) goto L51
            return r1
        L4c:
            r7 = r12
        L4d:
            r12 = r7
        L4e:
            r12.a()
        L51:
            ufg r10 = defpackage.ufg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.K(bqc, uif, uif, uiq, uhb):java.lang.Object");
    }

    public static final void L(nhx nhxVar, uif uifVar, float f, float f2, ayc aycVar, int i) {
        int i2;
        float f3;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-506360880);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nhxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uifVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.y(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            f3 = f2;
            i2 |= true != aycVarC.y(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
        } else {
            bik bikVarAM = byi.aM(bik.c, 0.0f, 0.0f, 0.0f, f3, 7);
            long j = nia.a;
            amo.g(uifVar, amd.c(bikVarAM, 48.0f), false, null, null, bdq.k(854684786, new nio(f, nhxVar), aycVarC), aycVarC, ((i2 >> 3) & 14) | 1572864, 60);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new nic(nhxVar, uifVar, f, f2, i, 3);
        }
    }

    public static final void M(final String str, final mxm mxmVar, boolean z, final boolean z2, ayc aycVar, final int i, final int i2) {
        int i3;
        boolean z3;
        ayc aycVar2;
        final boolean z4;
        str.getClass();
        mxmVar.getClass();
        int i4 = i2 & 1;
        ayc aycVarC = aycVar.c(547318970);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != aycVarC.z(mxmVar.ordinal()) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z5 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != aycVarC.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != aycVarC.C(z2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            z4 = z;
            aycVar2 = aycVarC;
        } else {
            final boolean z6 = (!z5) | z;
            if (str.length() == 0) {
                bai baiVarI = aycVarC.I();
                if (baiVarI != null) {
                    final int i6 = 1;
                    baiVarI.d = new uiu() { // from class: nil
                        @Override // defpackage.uiu
                        public final Object a(Object obj, Object obj2) {
                            if (i6 != 0) {
                                ((Integer) obj2).intValue();
                                int iJ = bay.j(i | 1);
                                int i7 = i2;
                                boolean z7 = z2;
                                boolean z8 = z6;
                                mxm mxmVar2 = mxmVar;
                                jsv.M(str, mxmVar2, z8, z7, (ayc) obj, iJ, i7);
                                return ufg.a;
                            }
                            ((Integer) obj2).intValue();
                            int iJ2 = bay.j(i | 1);
                            int i8 = i2;
                            boolean z9 = z2;
                            boolean z10 = z6;
                            mxm mxmVar3 = mxmVar;
                            jsv.M(str, mxmVar3, z10, z9, (ayc) obj, iJ2, i8);
                            return ufg.a;
                        }
                    };
                    return;
                }
                return;
            }
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                azz azzVar = new azz(mxmVar, bap.c);
                aygVar.ac(azzVar);
                objR = azzVar;
            }
            azr azrVar = (azr) objR;
            aygVar.Y();
            float f = Z(azrVar) != mxmVar ? 0.0f : 1.0f;
            aycVarC.u(-1633490746);
            int i7 = i3 & ScriptIntrinsicBLAS.TRANSPOSE;
            Object objR2 = aygVar.R();
            if (i7 == 32 || objR2 == obj) {
                objR2 = new upu(mxmVar, azrVar, 1);
                aygVar.ac(objR2);
            }
            int i8 = i3 & 910;
            aygVar.Y();
            bbo bboVarA = abu.a(f, null, (uiq) objR2, aycVarC, 0, 14);
            if (z2) {
                aycVarC.u(1484058699);
                z3 = z6;
                P(str, Z(azrVar), z3, ((Number) bboVarA.a()).floatValue(), aycVarC, i8);
                aycVar2 = aycVarC;
                aygVar.Y();
            } else {
                z3 = z6;
                aycVarC.u(1484156969);
                R(str, Z(azrVar), z3, ((Number) bboVarA.a()).floatValue(), aycVarC, i8);
                aycVar2 = aycVarC;
                aygVar.Y();
            }
            z4 = z3;
        }
        bai baiVarI2 = aycVar2.I();
        if (baiVarI2 != null) {
            final int i9 = 0;
            baiVarI2.d = new uiu() { // from class: nil
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj22) {
                    if (i9 != 0) {
                        ((Integer) obj22).intValue();
                        int iJ = bay.j(i | 1);
                        int i72 = i2;
                        boolean z7 = z2;
                        boolean z8 = z4;
                        mxm mxmVar2 = mxmVar;
                        jsv.M(str, mxmVar2, z8, z7, (ayc) obj2, iJ, i72);
                        return ufg.a;
                    }
                    ((Integer) obj22).intValue();
                    int iJ2 = bay.j(i | 1);
                    int i82 = i2;
                    boolean z9 = z2;
                    boolean z10 = z4;
                    mxm mxmVar3 = mxmVar;
                    jsv.M(str, mxmVar3, z10, z9, (ayc) obj2, iJ2, i82);
                    return ufg.a;
                }
            };
        }
    }

    public static final void N(azr azrVar, boolean z) {
        azrVar.b(Boolean.valueOf(z));
    }

    public static final void O(nhw nhwVar, float f, bik bikVar, float f2, ayc aycVar, int i) {
        int i2;
        Object obj;
        ayg aygVar;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-502980359);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nhwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.y(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
        } else {
            Object objA = byi.aa(nhwVar.e, aycVarC).a();
            objA.getClass();
            final boolean zBooleanValue = ((Boolean) objA).booleanValue();
            Object objA2 = byi.aa(nhwVar.d, aycVarC).a();
            objA2.getClass();
            boolean zBooleanValue2 = ((Boolean) objA2).booleanValue();
            bbo bboVarA = abu.a(true != zBooleanValue2 ? 0.0f : 1.0f, null, null, aycVarC, 0, 30);
            final long jE = byx.e(R.color.camera_protection_background_on_viewfinder_freeway, aycVarC);
            final long j = bay.O(aycVarC).a;
            long j2 = nia.a;
            final float fA = nia.a(aycVarC);
            uif uifVar = nhwVar.c;
            bik bikVarC = amd.c(byi.aL(kk.j(bikVar, ((Number) bboVarA.a()).floatValue()), 0.0f, f2, 1), fA);
            aycVarC.u(-1224400529);
            boolean zA = aycVarC.A(jE) | aycVarC.y(fA) | aycVarC.C(zBooleanValue) | aycVarC.A(j);
            ayg aygVar2 = (ayg) aycVarC;
            Object objR = aygVar2.R();
            if (zA || objR == ayb.a) {
                aygVar = aygVar2;
                obj = new uiq() { // from class: nib
                    @Override // defpackage.uiq
                    public final Object a(Object obj2) {
                        bvo bvoVar = (bvo) obj2;
                        bvoVar.getClass();
                        float f3 = fA;
                        byi.am(bvoVar, jE, bvoVar.dk(f3 / 2.0f), 0L, null, 0, 124);
                        if (zBooleanValue) {
                            byi.am(bvoVar, j, bvoVar.dk((f3 - 4.0f) / 2.0f), 0L, null, 0, 124);
                        }
                        bvoVar.p();
                        return ufg.a;
                    }
                };
                aygVar.ac(obj);
            } else {
                obj = objR;
                aygVar = aygVar2;
            }
            aygVar.Y();
            amo.g(uifVar, bdq.B(bikVarC, (uiq) obj), zBooleanValue2, null, null, bdq.k(320612123, new nin(f, nhwVar, zBooleanValue), aycVarC), aycVarC, 1572864, 56);
            aycVarC = aycVarC;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new nic(nhwVar, f, bikVar, f2, i, 0);
        }
    }

    public static final void P(String str, mxm mxmVar, boolean z, float f, ayc aycVar, int i) {
        int i2;
        float f2;
        ayc aycVar2;
        mxmVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-451343838);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.z(mxmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            if (mxmVar.d()) {
                long j = nia.a;
                f2 = nia.e;
            } else {
                long j2 = nia.a;
                f2 = nia.e + nia.f;
            }
            aycVarC.u(50292198);
            bih bihVar = bik.c;
            aycVarC.u(-1633490746);
            int i4 = 0;
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((z3 | z2) || objR == ayb.a) {
                objR = new nij(f, mxmVar, i4);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarE = amd.e(byi.aG(bko.c(bihVar, (uiq) objR), f2), nia.c);
            if (!z) {
                aycVarC.u(1849434622);
                Object objR2 = aygVar.R();
                if (objR2 == ayb.a) {
                    objR2 = new dvj(19);
                    aygVar.ac(objR2);
                }
                aygVar.Y();
                int i5 = cbp.a;
                bikVarE = bikVarE.cM(new ClearAndSetSemanticsElement((uiq) objR2));
            }
            aygVar.Y();
            bie bieVar = bib.f;
            bsr bsrVarC = aku.c(bieVar, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarE);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            uiu uiuVar = bum.d;
            bbr.a(aycVarC, bsrVarC, uiuVar);
            uiu uiuVar2 = bum.c;
            bbr.a(aycVarC, bfkVarAg, uiuVar2);
            uiu uiuVar3 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar3);
            }
            uiu uiuVar4 = bum.b;
            bbr.a(aycVarC, bikVarV, uiuVar4);
            aky akyVar = aky.a;
            bik bikVarA = akyVar.a(byi.aH(byi.aR(bihVar, bay.O(aycVarC).f, aqa.a(100.0f)), 4.0f, 6.0f).cM(new SizeElement(40.0f, 0.0f, Float.NaN, 0.0f, true, 10)), mxmVar.d() ? bib.j : mxmVar == mxm.LANDSCAPE ? bib.k : bib.i);
            bsr bsrVarC2 = aku.c(bieVar, false);
            int iR2 = a.r(bay.N(aycVarC));
            bfk bfkVarAg2 = aygVar.ag();
            bik bikVarV2 = bay.v(aycVarC, bikVarA);
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC2, uiuVar);
            bbr.a(aycVarC, bfkVarAg2, uiuVar2);
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR2))) {
                Integer numValueOf2 = Integer.valueOf(iR2);
                aygVar.ac(numValueOf2);
                aycVarC.h(numValueOf2, uiuVar3);
            }
            bbr.a(aycVarC, bikVarV2, uiuVar4);
            bik bikVarA2 = akyVar.a(bihVar, bib.j);
            aycVarC.u(1849434622);
            Object objR3 = aygVar.R();
            if (objR3 == ayb.a) {
                objR3 = new dvj(20);
                aygVar.ac(objR3);
            }
            aygVar.Y();
            bik bikVarAg = clc.ag(cbp.b(bikVarA2, false, (uiq) objR3), "slider_label_text");
            cfa.a("google-sans-flex");
            aycVar2 = aycVarC;
            awt.b(str, bikVarAg, bay.O(aycVarC).g, 0L, byx.f(byx.g("google-sans-flex", new cfp(600), null, 12)), 0L, 0L, 0, false, 0, 0, new cdo(nia.a, null, null, new cdg(), 16252925), aycVar2, i2 & 14, 0, 65464);
            aycVar2.m();
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new nik(str, mxmVar, z, f, i, 0);
        }
    }

    public static final void Q(nhw nhwVar, float f, bik bikVar, float f2, ayc aycVar, int i) {
        int i2;
        long jE;
        long j;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1818211838);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nhwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.y(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
        } else {
            Object objA = byi.aa(nhwVar.e, aycVarC).a();
            objA.getClass();
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            Object objA2 = byi.aa(nhwVar.d, aycVarC).a();
            objA2.getClass();
            bbo bboVarA = abu.a(true != ((Boolean) objA2).booleanValue() ? 0.0f : 1.0f, null, null, aycVarC, 0, 30);
            if (zBooleanValue) {
                aycVarC.u(-1778177555);
                jE = bay.O(aycVarC).a;
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(-1778116485);
                jE = byx.e(R.color.slider_background_color, aycVarC);
                ((ayg) aycVarC).Y();
            }
            bbo bboVarA2 = abh.a(jE, aycVarC);
            if (zBooleanValue) {
                aycVarC.u(-1777944373);
                j = bay.O(aycVarC).b;
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(-1777881939);
                j = bay.O(aycVarC).a;
                ((ayg) aycVarC).Y();
            }
            bbo bboVarA3 = abh.a(j, aycVarC);
            uif uifVar = nhwVar.c;
            boolean z = ((Number) bboVarA.a()).floatValue() > 0.0f;
            bik bikVarAR = byi.aR(bdq.C(byi.aL(kk.j(bikVar, ((Number) bboVarA.a()).floatValue()), 0.0f, f2, 1), aqa.a), ((bkv) bboVarA2.a()).g, bll.a);
            long j2 = nia.a;
            amo.g(uifVar, byi.aG(amd.c(bikVarAR, nia.a(aycVarC)), nia.g), z, null, null, bdq.k(-1278362720, new nip(f, nhwVar, zBooleanValue, bboVarA3), aycVarC), aycVarC, 1572864, 56);
            aycVarC = aycVarC;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new nic(nhwVar, f, bikVar, f2, i, 2);
        }
    }

    public static final void R(String str, mxm mxmVar, boolean z, float f, ayc aycVar, int i) {
        String str2;
        int i2;
        float f2;
        ayc aycVar2;
        mxmVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1962599619);
        int i4 = 1;
        if (i3 == 0) {
            str2 = str;
            i2 = (true != aycVarC.B(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.z(mxmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            if (mxmVar.d()) {
                long j = nia.a;
                f2 = nia.d;
            } else {
                long j2 = nia.a;
                f2 = nia.d + nia.f;
            }
            aycVarC.u(-567570303);
            bih bihVar = bik.c;
            aycVarC.u(-1633490746);
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((z3 | z2) || objR == ayb.a) {
                objR = new nij(f, mxmVar, i4);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarE = amd.e(byi.aG(bko.c(bihVar, (uiq) objR), f2), nia.c);
            if (!z) {
                aycVarC.u(1849434622);
                Object objR2 = aygVar.R();
                if (objR2 == ayb.a) {
                    objR2 = new dvj(17);
                    aygVar.ac(objR2);
                }
                aygVar.Y();
                int i5 = cbp.a;
                bikVarE = bikVarE.cM(new ClearAndSetSemanticsElement((uiq) objR2));
            }
            aygVar.Y();
            bsr bsrVarC = aku.c(bib.f, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarE);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            aky akyVar = aky.a;
            float fDk = ((chq) aycVarC.e(bze.c)).dk(nia.b);
            bie bieVar = mxmVar.d() ? bib.j : mxmVar == mxm.LANDSCAPE ? bib.k : bib.i;
            int i6 = i2;
            bik bikVarA = akyVar.a(bihVar, bieVar);
            long jE = byx.e(R.color.text_border_color, aycVarC);
            cfa.a("google-sans-text");
            cfp cfpVar = cfp.g;
            cfd cfdVarF = byx.f(byx.g("google-sans-text", cfpVar, null, 12));
            long j3 = nia.a;
            int i7 = i6 & 14;
            awt.b(str2, bikVarA, jE, 0L, cfdVarF, 0L, 0L, 0, false, 0, 0, new cdo(j3, null, new bmy(fDk, 0.0f, 0, 1, 22), new cdg(), 16236541), aycVarC, i7, 0, 65464);
            bik bikVarA2 = akyVar.a(bihVar, bieVar);
            aycVarC.u(1849434622);
            Object objR3 = aygVar.R();
            if (objR3 == ayb.a) {
                objR3 = new dvj(18);
                aygVar.ac(objR3);
            }
            aygVar.Y();
            bik bikVarAg = clc.ag(cbp.b(bikVarA2, false, (uiq) objR3), "slider_label_text");
            cfa.a("google-sans-text");
            aycVar2 = aycVarC;
            awt.b(str, bikVarAg, bay.O(aycVarC).q, 0L, byx.f(byx.g("google-sans-text", cfpVar, null, 12)), 0L, 0L, 0, false, 0, 0, new cdo(j3, null, null, new cdg(), 16252925), aycVar2, i7, 0, 65464);
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new nik(str, mxmVar, z, f, i, 1);
        }
    }

    public static final void S(final float f, final int i, final bik bikVar, ayc aycVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(-929998290);
        if (i4 == 0) {
            i3 = (true != aycVarC.y(f) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.y(16.0f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(bikVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
        } else {
            long j = nia.a;
            aku.b(byi.aL(amd.e(amd.b(byi.aR(bdq.C(bikVar, aqa.a(32.0f)), bko.i(i), bll.a), 48.0f), f), 16.0f, 0.0f, 2), aycVarC, 0);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nim
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i5 = i;
                    int i6 = i2;
                    jsv.S(f2, i5, bikVar, (ayc) obj, bay.j(i6 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void T(final nhw nhwVar, final float f, bik bikVar, float f2, final boolean z, ayc aycVar, final int i) {
        int i2;
        float fA;
        final bik bikVar2;
        final float f3;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1477701447);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nhwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.y(f) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= true != aycVarC.C(z) ? 8192 : 16384;
        }
        if ((i4 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
            bikVar2 = bikVar;
            f3 = f2;
        } else {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                bikVar = bik.c;
                long j = nia.a;
                fA = (80.0f - nia.a(aycVarC)) / 2.0f;
            } else {
                aycVarC.r();
                fA = f2;
            }
            bik bikVar3 = bikVar;
            aycVarC.l();
            int i5 = i4 & 1022;
            if (z) {
                aycVarC.u(1211279915);
                O(nhwVar, f, bikVar3, fA, aycVarC, i5);
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(1211379177);
                Q(nhwVar, f, bikVar3, fA, aycVarC, i5);
                ((ayg) aycVarC).Y();
            }
            bikVar2 = bikVar3;
            f3 = fA;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nie
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    nhw nhwVar2 = nhwVar;
                    float f4 = f;
                    bik bikVar4 = bikVar2;
                    float f5 = f3;
                    jsv.T(nhwVar2, f4, bikVar4, f5, z, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void U(niz nizVar, nhy nhyVar, View view, gox goxVar) {
        float fB;
        if (nizVar == niz.d || nhyVar.l != 1) {
            view.performHapticFeedback(4);
        }
        int i = nhyVar.l;
        niy niyVarQ = goxVar.q();
        int i2 = i - 1;
        if (i2 != 1) {
            fB = i2 != 2 ? goxVar.o() : niyVarQ.c(ukj.x(niyVarQ.d(goxVar.n())));
        } else {
            float fN = goxVar.n();
            Iterator it = niyVarQ.c.iterator();
            float f = Float.MAX_VALUE;
            while (it.hasNext()) {
                float fIntValue = (((Number) it.next()).intValue() * niyVarQ.b) + (-niyVarQ.d);
                float fAbs = Math.abs(goxVar.n() - fIntValue);
                if (fAbs < f) {
                    fN = fIntValue;
                    f = fAbs;
                }
            }
            fB = niyVarQ.b(fN);
        }
        goxVar.t(fB, nizVar);
        nhyVar.i.a(nhyVar.k.a(Float.valueOf(fB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void V(final defpackage.nhy r26, final defpackage.mxm r27, final defpackage.mxm r28, final java.lang.String r29, final int r30, final defpackage.gox r31, final defpackage.nhw r32, final defpackage.nhw r33, final boolean r34, final boolean r35, defpackage.ayc r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.V(nhy, mxm, mxm, java.lang.String, int, gox, nhw, nhw, boolean, boolean, ayc, int, int):void");
    }

    public static final void W(nhy nhyVar, gox goxVar, int i, float f, boolean z, ayc aycVar, int i2) {
        nhy nhyVar2;
        int i3;
        ayc aycVar2;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(-1698520706);
        if (i4 == 0) {
            nhyVar2 = nhyVar;
            i3 = (true != aycVarC.D(nhyVar2) ? 2 : 4) | i2;
        } else {
            nhyVar2 = nhyVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.B(goxVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != aycVarC.y(f) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != aycVarC.C(z) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((74899 & i3) == 74898 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            aycVarC.u(-1620346248);
            long j = nia.a;
            float fB = nia.b(aycVarC);
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            bih bihVar = bik.c;
            bik bikVarI = amd.i(bihVar, null, 3);
            bsr bsrVarC = aku.c(bib.f, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarI);
            uif uifVar = bum.a;
            aycVarC.v();
            int i5 = i3;
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            S(fB, i, aky.a.a(bihVar, bib.g), aycVarC, ((i5 >> 3) & ScriptIntrinsicBLAS.TRANSPOSE) | 384);
            aycVar2 = aycVarC;
            X(nhyVar2, goxVar, f, fB, 16.0f, null, null, null, z, aycVar2, (i5 & 14) | 24576 | (i5 & ScriptIntrinsicBLAS.TRANSPOSE) | ((i5 >> 6) & 896) | (234881024 & (i5 << 9)), 736);
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new nid(nhyVar, goxVar, i, f, z, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0530 A[PHI: r18
      0x0530: PHI (r18v3 java.lang.Object) = (r18v2 java.lang.Object), (r18v9 java.lang.Object) binds: [B:211:0x051f, B:214:0x0525] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void X(final defpackage.nhy r42, final defpackage.gox r43, float r44, final float r45, final float r46, defpackage.azr r47, defpackage.azr r48, defpackage.azr r49, final boolean r50, defpackage.ayc r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.X(nhy, gox, float, float, float, azr, azr, azr, boolean, ayc, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void Y(float r10, defpackage.azr r11, defpackage.azr r12, defpackage.uif r13, defpackage.gox r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.Y(float, azr, azr, uif, gox):void");
    }

    private static final mxm Z(azr azrVar) {
        return (mxm) azrVar.a();
    }

    public static void a(String str, syu syuVar) {
        swf.i(syuVar, Throwable.class, new fym(str, 18), sxo.a);
    }

    public static void b() {
        if (jsx.a != null) {
            gzi gziVar = gzz.a;
        }
    }

    public static syu c(jub jubVar, jth jthVar, kfm kfmVar, boolean z, meu meuVar) {
        return jubVar.c(jthVar, kfmVar, z, meuVar);
    }

    public static final FileInputStream e(pos posVar) {
        return posVar.d();
    }

    public static final InputStream f(String str) {
        try {
            return new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            ((sgt) jmc.a.c().M(2836)).v("Could not read file: %s, perhaps it is not a panorama.", str);
            return null;
        }
    }

    public static int h(int i) {
        return i - 1;
    }

    public static rwc i(pfu pfuVar, peo peoVar, peo peoVar2, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, Set set) {
        if (peoVar == null) {
            return rvk.a;
        }
        scn scnVarH = scn.H(peoVar, peoVar2);
        rvk rvkVar = rvk.a;
        return qpt.cb(pfuVar, scnVarH, rwcVar, rwcVar2, rvkVar, rvkVar, rwcVar3, set);
    }

    public static int j(pao paoVar, boolean z) {
        int i;
        int i2 = 3;
        if (paoVar == pao.CLOCKWISE_0) {
            i = 3;
            i2 = 1;
        } else if (paoVar == pao.CLOCKWISE_90) {
            i = 1;
        } else {
            i2 = 4;
            i = 2;
            if (paoVar == pao.c) {
                i = 4;
                i2 = 2;
            }
        }
        return true != z ? i : i2;
    }

    public static boolean k(int i) {
        return i == 3 || i == 4;
    }

    public static final void l(poj pojVar) {
        pojVar.close();
    }

    public static final void m(String str, boolean z, List list) {
        if (z) {
            return;
        }
        list.add(str);
    }

    public static /* synthetic */ void n(kex kexVar) {
        kez kezVar = kexVar.b;
        kezVar.k.c();
        kezVar.n();
        kezVar.m();
        kezVar.l();
        kezVar.o.k(kez.class);
    }

    public static /* synthetic */ String o(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ", ");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ Set p(rwc rwcVar) {
        return rwcVar.h() ? new sfm((hzi) rwcVar.c()) : sfd.a;
    }

    public static /* synthetic */ Set q(rwc rwcVar, uem uemVar) {
        return rwcVar.h() ? new sfm((qqs) uemVar.a()) : sfd.a;
    }

    public static final void r(final int i, ltw ltwVar, long j, final cdo cdoVar, final long j2, ayc aycVar, final int i2, final int i3) {
        int i4;
        cdo cdoVar2;
        ltw ltwVar2;
        long j3;
        ayc aycVar2;
        final ltw ltwVar3;
        final long j4;
        int i5 = i3 & 1;
        ayc aycVarC = aycVar.c(1676390358);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != aycVarC.z(ltwVar == null ? -1 : ltwVar.ordinal()) ? 16 : 32;
        }
        int i7 = i4 | 384;
        if ((i2 & 3072) == 0) {
            cdoVar2 = cdoVar;
            i7 |= true != aycVarC.B(cdoVar2) ? 1024 : 2048;
        } else {
            cdoVar2 = cdoVar;
        }
        if ((i2 & 24576) == 0) {
            i7 |= true != aycVarC.A(j2) ? 8192 : 16384;
        }
        if ((i7 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
            j4 = j;
            aycVar2 = aycVarC;
            ltwVar3 = ltwVar;
        } else {
            int i8 = i7 << 3;
            int i9 = i7 >> 6;
            aycVarC.s();
            if ((i2 & 1) == 0 || aycVarC.E()) {
                ltwVar2 = i6 != 0 ? null : ltwVar;
                j3 = cid.a;
            } else {
                aycVarC.r();
                ltwVar2 = ltwVar;
                j3 = j;
            }
            aycVarC.l();
            int i10 = (i9 & 896) | (i8 & 7168);
            if (ltwVar2 != null) {
                aycVarC.u(-534332657);
                int iOrdinal = ltwVar2.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    aycVarC.u(-534231008);
                    int i11 = ltwVar2.h;
                    drp.b(((Resources) aycVarC.e(AndroidCompositionLocals_androidKt.c)).getQuantityString(i, i11, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)), null, j2, j3, null, 0L, null, 0L, 0, false, 0, 0, null, cdoVar2, aycVarC, i10, (i7 << 9) & 3670016, 65522);
                    ((ayg) aycVarC).Y();
                } else {
                    aycVarC.u(-533925503);
                    drp.b(clc.ae(i, aycVarC), null, j2, j3, null, 0L, null, 0L, 0, false, 0, 0, null, null, aycVarC, i10, 0, 131058);
                    ((ayg) aycVarC).Y();
                }
                ((ayg) aycVarC).Y();
                aycVar2 = aycVarC;
            } else {
                aycVarC.u(-533834921);
                aycVar2 = aycVarC;
                drp.b(clc.ae(i, aycVarC), null, j2, j3, null, 0L, null, 0L, 0, false, 0, 0, null, null, aycVar2, i10, 0, 131058);
                ((ayg) aycVar2).Y();
            }
            ltwVar3 = ltwVar2;
            j4 = j3;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nsb
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i12 = i;
                    ltw ltwVar4 = ltwVar3;
                    long j5 = j4;
                    cdo cdoVar3 = cdoVar;
                    jsv.r(i12, ltwVar4, j5, cdoVar3, j2, (ayc) obj, bay.j(i2 | 1), i3);
                    return ufg.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(defpackage.nrx r30, defpackage.nsk r31, defpackage.dme r32, int r33, defpackage.ayc r34, int r35) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.s(nrx, nsk, dme, int, ayc, int):void");
    }

    public static final void t(final int i, final int i2, final Integer num, nsk nskVar, final boolean z, bik bikVar, final ltw ltwVar, final dri driVar, final uif uifVar, ayc aycVar, final int i3) {
        int i4;
        bik bikVar2;
        dri driVar2;
        uif uifVar2;
        nsk nskVar2;
        bik bikVar3;
        long j;
        ayc aycVar2;
        int i5 = i3 & 6;
        ayc aycVarC = aycVar.c(-691356998);
        if (i5 == 0) {
            i4 = (true != aycVarC.z(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != aycVarC.z(i2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != aycVarC.B(num) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != aycVarC.z(nskVar.ordinal()) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != aycVarC.C(z) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            bikVar2 = bikVar;
            i4 |= true != aycVarC.B(bikVar2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            bikVar2 = bikVar;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != aycVarC.z(ltwVar == null ? -1 : ltwVar.ordinal()) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i3) == 0) {
            driVar2 = driVar;
            i4 |= true != aycVarC.D(driVar2) ? 4194304 : 8388608;
        } else {
            driVar2 = driVar;
        }
        if ((100663296 & i3) == 0) {
            uifVar2 = uifVar;
            i4 |= true != aycVarC.D(uifVar2) ? 33554432 : 67108864;
        } else {
            uifVar2 = uifVar;
        }
        if ((38347923 & i4) == 38347922 && aycVarC.G()) {
            aycVarC.r();
            nskVar2 = nskVar;
            aycVar2 = aycVarC;
        } else {
            bik bikVarCM = bikVar2.cM(amd.c);
            aycVarC.u(-1633490746);
            boolean z2 = (i4 & 7168) == 2048;
            boolean z3 = (57344 & i4) == 16384;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((z2 || z3) || objR == ayb.a) {
                nskVar2 = nskVar;
                objR = new nrz(nskVar2, z, 0);
                aygVar.ac(objR);
            } else {
                nskVar2 = nskVar;
            }
            aygVar.Y();
            bik bikVarB = cbp.b(bikVarCM, false, (uiq) objR);
            alv alvVar = dok.a;
            alv alvVar2 = dok.a;
            if (z) {
                aycVarC.u(-1846822620);
                bikVar3 = bikVarB;
                j = SharedLibraryVersion.h(aycVarC).c;
                aygVar.Y();
            } else {
                bikVar3 = bikVarB;
                aycVarC.u(-1846749212);
                j = SharedLibraryVersion.h(aycVarC).q;
                aygVar.Y();
            }
            long j2 = j;
            long j3 = bkv.f;
            doq doqVarH = SharedLibraryVersion.h(aycVarC);
            doj dojVar = doqVarH.E;
            if (dojVar == null) {
                dojVar = new doj(dor.b(doqVarH, 24), dor.b(doqVarH, 12), dor.b(doqVarH, 13), dor.b(doqVarH, 18), dor.a(dor.b(doqVarH, 12), 0.12f), dor.a(dor.b(doqVarH, 12), 0.38f), dor.a(dor.b(doqVarH, 12), 0.38f), dor.a(dor.b(doqVarH, 12), 0.38f));
                doqVarH.E = dojVar;
            }
            aycVar2 = aycVarC;
            dri driVar3 = driVar2;
            uif uifVar3 = uifVar2;
            bik bikVar4 = bikVar3;
            AmbientMode.AmbientCallback.n(uifVar3, bikVar4, bdq.k(973141935, new amj(num, 10), aycVarC), bdq.k(-1511573505, new nsf(i2), aycVarC), false, null, dojVar.c(j2, j3, j3, j3, j3, j3, j3, j3), alvVar2, driVar3, bdq.k(201173353, new nsg(i, ltwVar), aycVarC), aycVar2, ((i4 >> 24) & 14) | 221184, ((i4 >> 15) & 896) | 3072);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            final bik bikVar5 = bikVar2;
            final nsk nskVar3 = nskVar2;
            baiVarI.d = new uiu() { // from class: nsa
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    int i7 = i2;
                    Integer num2 = num;
                    nsk nskVar4 = nskVar3;
                    boolean z4 = z;
                    bik bikVar6 = bikVar5;
                    ltw ltwVar2 = ltwVar;
                    dri driVar4 = driVar;
                    jsv.t(i6, i7, num2, nskVar4, z4, bikVar6, ltwVar2, driVar4, uifVar, (ayc) obj, bay.j(i3 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void u(nrx nrxVar, nsk nskVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        uiu uiuVar2;
        nrxVar.getClass();
        nskVar.getClass();
        ayc aycVarC = aycVar.c(2005944182);
        if ((i & 6) == 0) {
            i2 = i | (true != aycVarC.D(nrxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.z(nskVar.ordinal()) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i3 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            uiuVar2 = uiuVar;
        } else {
            uiu uiuVar3 = nro.a;
            aycVarC.u(-727948371);
            int i4 = nskVar == nsk.a ? -1 : (Integer) byi.ab(nrxVar.u, 0, aycVarC).a();
            ((ayg) aycVarC).Y();
            AmbientMode.AmbientCallback.o(null, uiuVar3, 0L, 0L, bdq.k(-1470089019, new nsi(nrxVar, nskVar, i4), aycVarC), aycVarC, ((i3 >> 3) & ScriptIntrinsicBLAS.TRANSPOSE) | 24576, 13);
            uiuVar2 = uiuVar3;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc(nrxVar, nskVar, uiuVar2, i, 9);
        }
    }

    public static final void v(nrl nrlVar, ayc aycVar, int i) {
        int i2;
        nrlVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-4093490);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nrlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !aycVarC.G()) {
            throw null;
        }
        aycVarC.r();
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(nrlVar, i, 13);
        }
    }

    public static final void w(ayc aycVar, final int i) {
        int i2 = (i | 6) & 3;
        ayc aycVarC = aycVar.c(826755246);
        if (i2 == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            AmbientMode.AmbientCallback.o(null, null, 0L, 0L, bdq.k(-912084099, new arx(6), aycVarC), aycVarC, 24576, 15);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nrh
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jsv.w((ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void x(uiu uiuVar, ayc aycVar, int i) {
        int i2;
        uiu uiuVar2 = uiuVar;
        uiuVar2.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1410020290);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uiuVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            Context context = (Context) aycVarC.e(AndroidCompositionLocals_androidKt.b);
            doq doqVar = Settings.Global.getInt(context.getContentResolver(), "dynamic_color_theme_enabled", 0) == 1 ? new doq(SharedLibraryVersion.e(context, android.R.color.system_primary_fixed), SharedLibraryVersion.e(context, android.R.color.system_primary_fixed_dim), SharedLibraryVersion.e(context, android.R.color.system_primary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_on_primary_fixed), SharedLibraryVersion.e(context, android.R.color.system_on_primary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_secondary_fixed), SharedLibraryVersion.e(context, android.R.color.system_secondary_fixed_dim), SharedLibraryVersion.e(context, android.R.color.system_secondary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_on_secondary_fixed), SharedLibraryVersion.e(context, android.R.color.system_on_secondary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_tertiary_fixed), SharedLibraryVersion.e(context, android.R.color.system_tertiary_fixed_dim), SharedLibraryVersion.e(context, android.R.color.system_tertiary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_on_tertiary_fixed), SharedLibraryVersion.e(context, android.R.color.system_on_tertiary_container_dark), SharedLibraryVersion.e(context, android.R.color.system_surface_container_low_dark), SharedLibraryVersion.e(context, android.R.color.system_surface_container_dark), SharedLibraryVersion.e(context, android.R.color.system_surface_container_high_dark), SharedLibraryVersion.e(context, android.R.color.system_on_surface_dark), SharedLibraryVersion.e(context, android.R.color.system_on_surface_variant_dark), SharedLibraryVersion.e(context, android.R.color.system_outline_dark), SharedLibraryVersion.e(context, android.R.color.system_outline_variant_dark), SharedLibraryVersion.e(context, android.R.color.system_background_dark), SharedLibraryVersion.e(context, android.R.color.system_on_background_dark), SharedLibraryVersion.e(context, android.R.color.system_error_dark), AmbientMode.AmbientCallback.i(SharedLibraryVersion.e(context, android.R.color.system_error_container_dark), 68.0f), SharedLibraryVersion.e(context, android.R.color.system_error_container_dark), SharedLibraryVersion.e(context, android.R.color.system_on_error_dark), SharedLibraryVersion.e(context, android.R.color.system_on_error_container_dark)) : null;
            if (doqVar == null) {
                doqVar = rrg.a;
            }
            uiuVar2 = uiuVar;
            rrg.b(doqVar, null, null, uiuVar2, aycVarC, (i2 << 9) & 7168);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(uiuVar2, i, 10);
        }
    }

    public static npk z(npl nplVar, pdk pdkVar, peo peoVar, pdk pdkVar2) {
        poj pojVarE = pdkVar.e(peoVar);
        try {
            poj pojVarE2 = pdkVar2.e(peoVar);
            try {
                pojVarE.getClass();
                pojVarE2.getClass();
                npk npkVarA = nplVar.a(pojVarE, pojVarE2);
                pojVarE2.close();
                pojVarE.close();
                return npkVarA;
            } finally {
            }
        } catch (Throwable th) {
            if (pojVarE != null) {
                try {
                    pojVarE.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final synchronized jsi d() {
        throw new IllegalStateException("Requesting mash trimmer but no start point yet");
    }

    public jsv(char[] cArr) {
        new ArrayDeque();
    }

    public jsv(char[] cArr, byte[] bArr) {
        int i = sbp.d;
        sbp sbpVar = sex.a;
    }

    public static npk y(npl nplVar, poj pojVar, poj pojVar2) {
        qin qinVarD = nplVar.d();
        if (qinVarD != null) {
            HardwareBuffer hardwareBufferF = pojVar.f();
            try {
                HardwareBuffer hardwareBufferF2 = pojVar2.f();
                try {
                    hardwareBufferF.getClass();
                    EGLImage eGLImage = new EGLImage(hardwareBufferF);
                    try {
                        hardwareBufferF2.getClass();
                        EGLImage eGLImage2 = new EGLImage(hardwareBufferF2);
                        try {
                            qjn qjnVarB = qjn.b(qinVarD, eGLImage);
                            try {
                                qim qimVarB = qim.b(qinVarD, eGLImage2);
                                try {
                                    pojVar.d();
                                    npk npkVarS = nplVar.s(qjnVarB, qimVarB);
                                    qimVarB.close();
                                    qjnVarB.close();
                                    eGLImage2.close();
                                    eGLImage.close();
                                    hardwareBufferF2.close();
                                    hardwareBufferF.close();
                                    return npkVarS;
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (hardwareBufferF != null) {
                    try {
                        hardwareBufferF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new UnsupportedOperationException(PJGqOKsIpSdZ.fFTFsQnLiSq);
    }

    public jsv(byte[] bArr) {
        new ArrayList();
    }
}
