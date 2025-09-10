package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni.NativeFlareRemoval;
import com.google.android.apps.camera.jni.mallopt.Mallopt;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hzo implements mcw {
    public static final sgv a = sgv.g("hzo");
    public final uem b;
    public final pbn c;
    public final rwc d;
    public final rwc e;
    public final Context f;
    public final NativeFlareRemoval g;
    public final hbj h;
    private final syu i;
    private final Executor j;

    public hzo(uem uemVar, hbj hbjVar, pbn pbnVar, rwc rwcVar, rwc rwcVar2, NativeFlareRemoval nativeFlareRemoval, syu syuVar, Executor executor, Context context) {
        this.b = uemVar;
        this.h = hbjVar;
        this.c = pbnVar;
        this.d = rwcVar;
        this.e = rwcVar2;
        this.g = nativeFlareRemoval;
        this.i = syuVar;
        this.j = executor;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ojl.ck(this.i, new paf() { // from class: hzn
            @Override // defpackage.paf
            public final void a(Object obj) {
                hzo hzoVar = this.a;
                pbn pbnVar = hzoVar.c;
                pbnVar.f("HdrPlusPrewarm");
                hbj hbjVar = hzoVar.h;
                if (hbjVar.p(gzo.O) && !Mallopt.setOptions(256, 33554432)) {
                    ((sgt) hzo.a.c().M(1742)).s("Failed to set mallopt options.");
                }
                pbnVar.f("gcamdeps");
                ins.b();
                pbnVar.g();
                pbnVar.f("gcam");
                hzoVar.b.a();
                pbnVar.g();
                rwc rwcVar = hzoVar.d;
                if (rwcVar.h()) {
                    rwc rwcVar2 = hzoVar.e;
                    if (((loq) rwcVar.c()).g()) {
                        pbnVar.f("segmenter");
                        ((lge) ((rwg) rwcVar2).a).b();
                        pbnVar.g();
                    }
                    pbnVar.f("rectiface");
                    ((loq) rwcVar.c()).e();
                    pbnVar.g();
                }
                pbm pbmVar = new pbm(pbnVar, "decepticon");
                try {
                    if (hbjVar.p(gyz.b)) {
                        String strF = hbjVar.f(gyz.c);
                        strF.getClass();
                        String strF2 = hbjVar.f(gyz.d);
                        strF2.getClass();
                        String strF3 = hbjVar.f(gyz.e);
                        strF3.getClass();
                        try {
                            Context context = hzoVar.f;
                            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(strF);
                            try {
                                AssetFileDescriptor assetFileDescriptorOpenFd2 = context.getAssets().openFd(strF2);
                                try {
                                    assetFileDescriptorOpenFd2 = context.getAssets().openFd(strF3);
                                    try {
                                        smk smkVar = new smk();
                                        try {
                                            tpc tpcVarM = iig.a.m();
                                            iij iijVar = iij.a;
                                            tpc tpcVarM2 = iijVar.m();
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            iij iijVar2 = (iij) tpcVarM2.b;
                                            iijVar2.c = 1;
                                            iijVar2.b |= 1;
                                            long fd = assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd();
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            iij iijVar3 = (iij) tpcVarM2.b;
                                            iijVar3.b |= 2;
                                            iijVar3.d = fd;
                                            long startOffset = assetFileDescriptorOpenFd.getStartOffset();
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            iij iijVar4 = (iij) tpcVarM2.b;
                                            iijVar4.b |= 4;
                                            iijVar4.e = startOffset;
                                            long length = assetFileDescriptorOpenFd.getLength();
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            iij iijVar5 = (iij) tpcVarM2.b;
                                            iijVar5.b |= 8;
                                            iijVar5.f = length;
                                            iij iijVar6 = (iij) tpcVarM2.l();
                                            tpc tpcVarM3 = iijVar.m();
                                            if (!tpcVarM3.b.C()) {
                                                tpcVarM3.o();
                                            }
                                            iij iijVar7 = (iij) tpcVarM3.b;
                                            iijVar7.c = 2;
                                            iijVar7.b |= 1;
                                            long fd2 = assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd();
                                            if (!tpcVarM3.b.C()) {
                                                tpcVarM3.o();
                                            }
                                            iij iijVar8 = (iij) tpcVarM3.b;
                                            iijVar8.b |= 2;
                                            iijVar8.d = fd2;
                                            long startOffset2 = assetFileDescriptorOpenFd2.getStartOffset();
                                            if (!tpcVarM3.b.C()) {
                                                tpcVarM3.o();
                                            }
                                            iij iijVar9 = (iij) tpcVarM3.b;
                                            iijVar9.b |= 4;
                                            iijVar9.e = startOffset2;
                                            long length2 = assetFileDescriptorOpenFd2.getLength();
                                            if (!tpcVarM3.b.C()) {
                                                tpcVarM3.o();
                                            }
                                            iij iijVar10 = (iij) tpcVarM3.b;
                                            iijVar10.b |= 8;
                                            iijVar10.f = length2;
                                            iij iijVar11 = (iij) tpcVarM3.l();
                                            tpc tpcVarM4 = iijVar.m();
                                            if (!tpcVarM4.b.C()) {
                                                tpcVarM4.o();
                                            }
                                            iij iijVar12 = (iij) tpcVarM4.b;
                                            iijVar12.c = 3;
                                            iijVar12.b |= 1;
                                            long fd3 = assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd();
                                            if (!tpcVarM4.b.C()) {
                                                tpcVarM4.o();
                                            }
                                            iij iijVar13 = (iij) tpcVarM4.b;
                                            iijVar13.b |= 2;
                                            iijVar13.d = fd3;
                                            long startOffset3 = assetFileDescriptorOpenFd2.getStartOffset();
                                            if (!tpcVarM4.b.C()) {
                                                tpcVarM4.o();
                                            }
                                            iij iijVar14 = (iij) tpcVarM4.b;
                                            iijVar14.b |= 4;
                                            iijVar14.e = startOffset3;
                                            long length3 = assetFileDescriptorOpenFd2.getLength();
                                            if (!tpcVarM4.b.C()) {
                                                tpcVarM4.o();
                                            }
                                            iij iijVar15 = (iij) tpcVarM4.b;
                                            iijVar15.b |= 8;
                                            iijVar15.f = length3;
                                            iij iijVar16 = (iij) tpcVarM4.l();
                                            tpcVarM.z(iijVar6);
                                            tpcVarM.z(iijVar11);
                                            tpcVarM.z(iijVar16);
                                            tpc tpcVarM5 = tyz.a.m();
                                            String str = Build.MANUFACTURER;
                                            if (!tpcVarM5.b.C()) {
                                                tpcVarM5.o();
                                            }
                                            tyz tyzVar = (tyz) tpcVarM5.b;
                                            str.getClass();
                                            tyzVar.b |= 2;
                                            tyzVar.d = str;
                                            String str2 = Build.DEVICE;
                                            if (!tpcVarM5.b.C()) {
                                                tpcVarM5.o();
                                            }
                                            tyz tyzVar2 = (tyz) tpcVarM5.b;
                                            str2.getClass();
                                            tyzVar2.b |= 4;
                                            tyzVar2.e = str2;
                                            tpc tpcVarM6 = tza.a.m();
                                            if (!tpcVarM6.b.C()) {
                                                tpcVarM6.o();
                                            }
                                            tza tzaVar = (tza) tpcVarM6.b;
                                            tzaVar.b |= 32;
                                            tzaVar.c = false;
                                            int iIntValue = ((Integer) hbjVar.a(gyz.a).get()).intValue();
                                            if (!tpcVarM6.b.C()) {
                                                tpcVarM6.o();
                                            }
                                            tph tphVar = tpcVarM6.b;
                                            tza tzaVar2 = (tza) tphVar;
                                            tzaVar2.b |= 2048;
                                            tzaVar2.e = iIntValue;
                                            if (!tphVar.C()) {
                                                tpcVarM6.o();
                                            }
                                            tza tzaVar3 = (tza) tpcVarM6.b;
                                            tzaVar3.b |= 128;
                                            tzaVar3.d = false;
                                            tza tzaVar4 = (tza) tpcVarM6.l();
                                            if (!tpcVarM5.b.C()) {
                                                tpcVarM5.o();
                                            }
                                            tyz tyzVar3 = (tyz) tpcVarM5.b;
                                            tzaVar4.getClass();
                                            tyzVar3.c = tzaVar4;
                                            tyzVar3.b |= 1;
                                            if (!tpcVarM.b.C()) {
                                                tpcVarM.o();
                                            }
                                            iig iigVar = (iig) tpcVarM.b;
                                            tyz tyzVar4 = (tyz) tpcVarM5.l();
                                            tyzVar4.getClass();
                                            iigVar.d = tyzVar4;
                                            iigVar.b |= 1;
                                            hzoVar.g.b((iig) tpcVarM.l());
                                            smkVar.close();
                                            if (assetFileDescriptorOpenFd2 != null) {
                                                assetFileDescriptorOpenFd2.close();
                                            }
                                            if (assetFileDescriptorOpenFd2 != null) {
                                                assetFileDescriptorOpenFd2.close();
                                            }
                                            if (assetFileDescriptorOpenFd != null) {
                                                assetFileDescriptorOpenFd.close();
                                            }
                                        } finally {
                                        }
                                    } finally {
                                        if (assetFileDescriptorOpenFd2 == null) {
                                            throw th;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd2.close();
                                            throw th;
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (assetFileDescriptorOpenFd2 != null) {
                                        try {
                                            assetFileDescriptorOpenFd2.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                if (assetFileDescriptorOpenFd == null) {
                                    throw th4;
                                }
                                try {
                                    assetFileDescriptorOpenFd.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (IOException e) {
                            throw new IllegalStateException("Unable to open Flare Removal model asset file", e);
                        } catch (RuntimeException e2) {
                            throw new IllegalStateException(qcjAcSmlN.GQjRze, e2);
                        }
                    }
                    pbmVar.close();
                    hzoVar.c.g();
                } finally {
                }
            }
        }, this.j);
    }
}
