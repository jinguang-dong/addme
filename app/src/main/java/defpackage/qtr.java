package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qtr implements sxh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qtr(qrt qrtVar, AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = qrtVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.sxh
    public final syu a() {
        if (this.d != 0) {
            if (((AtomicInteger) this.c).getAndDecrement() <= 0) {
                return syq.a;
            }
            int i = this.a;
            qrt qrtVar = (qrt) this.b;
            return qrtVar.n(i, (qrf) qrtVar.b.a());
        }
        final qtu qtuVar = (qtu) this.b;
        qtk qtkVar = (qtk) qtuVar.c.a();
        if ((true != qtkVar.c() ? -1L : 1000L) == -1) {
            return syq.a;
        }
        Object obj = this.c;
        final int i2 = this.a;
        syu syuVarM = ske.M(null);
        rwc rwcVar = qtkVar.a;
        syn synVarV = syn.v(syuVarM);
        qpl qplVar = new qpl(5);
        syx syxVar = qtuVar.a;
        final String str = (String) obj;
        final long j = 1000;
        return swz.j(swf.i(synVarV, RuntimeException.class, qplVar, syxVar), new sxi() { // from class: qtt
            @Override // defpackage.sxi
            public final syu a(Object obj2) {
                ActivityManager.MemoryInfo memoryInfo;
                qtw qtwVar;
                uyd uydVar = (uyd) obj2;
                tpc tpcVarM = uzu.a.m();
                qtu qtuVar2 = qtuVar;
                int iMyPid = Process.myPid();
                qtx qtxVar = qtuVar2.e;
                rww rwwVarY = rnt.y(new nxi(qtxVar, 13));
                Object objA = qtxVar.a.a();
                rcc.b();
                if (((qtk) objA).b) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    Context context = qtxVar.b;
                    if (qpm.a == null) {
                        synchronized (qpm.class) {
                            if (qpm.a == null) {
                                Object systemService = context.getSystemService("activity");
                                systemService.getClass();
                                qpm.a = (ActivityManager) systemService;
                            }
                        }
                    }
                    qpm.a.getMemoryInfo(memoryInfo);
                } else {
                    memoryInfo = null;
                }
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    try {
                        File file = ((Boolean) qtxVar.c.a()).booleanValue() ? new File(a.bE(iMyPid, "/proc/", "/status")) : new File("/proc/self/status");
                        Charset charsetDefaultCharset = Charset.defaultCharset();
                        charsetDefaultCharset.getClass();
                        String str2 = new String(smm.a(file), charsetDefaultCharset);
                        if (str2.isEmpty()) {
                            ((sgt) qnj.a.c().M(5760)).s("Null or empty proc status");
                            qtwVar = null;
                        } else {
                            qtwVar = new qtw();
                            qtwVar.f = qtx.b(qtw.a, str2);
                            qtwVar.g = qtx.b(qtw.b, str2);
                            qtwVar.h = qtx.b(qtw.c, str2);
                            qtwVar.i = qtx.b(qtw.d, str2);
                            qtwVar.j = qtx.b(qtw.e, str2);
                        }
                    } catch (IOException e) {
                        ((sgt) ((sgt) qnj.a.c().i(e)).M(5757)).s("Error reading proc status");
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        qtwVar = null;
                    }
                    tpc tpcVarM2 = uyi.a.m();
                    tpc tpcVarM3 = uyh.a.m();
                    tpc tpcVarM4 = uyf.a.m();
                    if (memoryInfo != null) {
                        long j2 = memoryInfo.availMem >> 10;
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        uyf uyfVar = (uyf) tpcVarM4.b;
                        uyfVar.b |= 131072;
                        uyfVar.c = (int) j2;
                        long j3 = memoryInfo.totalMem >> 20;
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        int i3 = (int) j3;
                        uyf uyfVar2 = (uyf) tpcVarM4.b;
                        uyfVar2.b |= 262144;
                        uyfVar2.d = i3;
                    }
                    if (qtwVar != null) {
                        Long l = qtwVar.f;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            if (!tpcVarM4.b.C()) {
                                tpcVarM4.o();
                            }
                            uyf uyfVar3 = (uyf) tpcVarM4.b;
                            uyfVar3.b |= ImageMetadata.LENS_APERTURE;
                            uyfVar3.e = jLongValue;
                        }
                        Long l2 = qtwVar.g;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            if (!tpcVarM4.b.C()) {
                                tpcVarM4.o();
                            }
                            uyf uyfVar4 = (uyf) tpcVarM4.b;
                            uyfVar4.b |= ImageMetadata.SHADING_MODE;
                            uyfVar4.f = jLongValue2;
                        }
                        Long l3 = qtwVar.h;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            if (!tpcVarM4.b.C()) {
                                tpcVarM4.o();
                            }
                            uyf uyfVar5 = (uyf) tpcVarM4.b;
                            uyfVar5.b |= 2097152;
                            uyfVar5.g = jLongValue3;
                        }
                        Long l4 = qtwVar.i;
                        if (l4 != null) {
                            long jLongValue4 = l4.longValue();
                            if (!tpcVarM4.b.C()) {
                                tpcVarM4.o();
                            }
                            uyf uyfVar6 = (uyf) tpcVarM4.b;
                            uyfVar6.b |= 4194304;
                            uyfVar6.h = jLongValue4;
                        }
                        Long l5 = qtwVar.j;
                        if (l5 != null) {
                            long jLongValue5 = l5.longValue();
                            if (!tpcVarM4.b.C()) {
                                tpcVarM4.o();
                            }
                            uyf uyfVar7 = (uyf) tpcVarM4.b;
                            uyfVar7.b |= 8388608;
                            uyfVar7.i = jLongValue5;
                        }
                    }
                    uyf uyfVar8 = (uyf) tpcVarM4.l();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    uyh uyhVar = (uyh) tpcVarM3.b;
                    uyfVar8.getClass();
                    uyhVar.c = uyfVar8;
                    uyhVar.b |= 1;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    uyi uyiVar = (uyi) tpcVarM2.b;
                    uyh uyhVar2 = (uyh) tpcVarM3.l();
                    uyhVar2.getClass();
                    uyiVar.c = uyhVar2;
                    uyiVar.b |= 1;
                    tpc tpcVarM5 = uyy.a.m();
                    uyx uyxVarB = sjp.b(((lat) qtxVar.d.b).u(rwwVarY), (qpn) rwwVarY.fr());
                    if (!tpcVarM5.b.C()) {
                        tpcVarM5.o();
                    }
                    uyy uyyVar = (uyy) tpcVarM5.b;
                    uyxVarB.getClass();
                    uyyVar.c = uyxVarB;
                    uyyVar.b |= 1;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    uyi uyiVar2 = (uyi) tpcVarM2.b;
                    uyy uyyVar2 = (uyy) tpcVarM5.l();
                    uyyVar2.getClass();
                    uyiVar2.d = uyyVar2;
                    uyiVar2.b |= 2;
                    tpc tpcVarM6 = uyg.a.m();
                    Context context2 = qtxVar.b;
                    ActivityManager activityManager = qpm.a;
                    Object systemService2 = context2.getSystemService("power");
                    systemService2.getClass();
                    boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                    if (!tpcVarM6.b.C()) {
                        tpcVarM6.o();
                    }
                    uyg uygVar = (uyg) tpcVarM6.b;
                    uygVar.b |= 1;
                    uygVar.c = zIsInteractive;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    uyi uyiVar3 = (uyi) tpcVarM2.b;
                    uyg uygVar2 = (uyg) tpcVarM6.l();
                    uygVar2.getClass();
                    uyiVar3.f = uygVar2;
                    uyiVar3.b |= 8;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    String str3 = str;
                    int i4 = i2;
                    tph tphVar = tpcVarM2.b;
                    uyi uyiVar4 = (uyi) tphVar;
                    uyiVar4.e = i4 - 1;
                    uyiVar4.b |= 4;
                    if (str3 != null) {
                        if (!tphVar.C()) {
                            tpcVarM2.o();
                        }
                        uyi uyiVar5 = (uyi) tpcVarM2.b;
                        uyiVar5.b |= 16;
                        uyiVar5.g = str3;
                    }
                    uyi uyiVar6 = (uyi) tpcVarM2.l();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    long j4 = j;
                    uzu uzuVar = (uzu) tpcVarM.b;
                    uyiVar6.getClass();
                    uzuVar.f = uyiVar6;
                    uzuVar.b |= 8;
                    uzu uzuVar2 = (uzu) tpcVarM.l();
                    qql qqlVarA = qqm.a();
                    qqlVarA.a = null;
                    qqlVarA.c(true);
                    qqlVarA.d = Long.valueOf(j4);
                    qqlVarA.f(uzuVar2);
                    qqlVarA.b = uydVar;
                    qqlVarA.d(true);
                    return qtuVar2.d.b(qqlVarA.a());
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
        }, syxVar);
    }

    public /* synthetic */ qtr(qtu qtuVar, int i, String str, int i2) {
        this.d = i2;
        this.b = qtuVar;
        this.a = i;
        this.c = str;
    }
}
