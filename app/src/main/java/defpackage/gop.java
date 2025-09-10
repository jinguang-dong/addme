package defpackage;

import android.os.Process;
import android.util.StatsEvent;
import android.util.StatsLog;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gop implements jhh, jgl, jgm {
    public static final sgv a = sgv.g("gop");
    public final CameraFatalErrorTrackerDatabase b;
    public final rww c;
    public final mdy d;
    public final got e;
    private final Executor f;
    private final out g;
    private final rww i;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Map j = new HashMap();

    public gop(CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor, mdy mdyVar, out outVar, hbj hbjVar, got gotVar) {
        this.b = cameraFatalErrorTrackerDatabase;
        this.f = executor;
        this.d = mdyVar;
        this.g = outVar;
        this.c = new fvq(hbjVar, 2);
        this.i = new fvq(hbjVar, 3);
        this.e = gotVar;
    }

    public static long a(long j, long j2) {
        return TimeUnit.MILLISECONDS.toDays(j - j2);
    }

    @Override // defpackage.jgl
    public final void b() {
        this.h.set(false);
    }

    @Override // defpackage.jgm
    public final void c() {
        this.h.set(true);
    }

    final void d(String str, boolean z) {
        boolean z2 = false;
        if (z) {
            if (Boolean.TRUE.equals(this.i.fr())) {
                z2 = true;
            }
        }
        this.g.c(new emz(z2, str, 5));
    }

    public final void e(pbw pbwVar) {
        if (pbw.d(pbwVar)) {
            this.f.execute(new gon(this, pbwVar, System.currentTimeMillis(), 0));
        } else {
            d("Fatal error", this.h.get());
        }
    }

    public final synchronized void f(final pjr pjrVar, pbw pbwVar, final boolean z) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!pbw.e(pbwVar)) {
                d("Fatal error", this.h.get());
                return;
            }
            Map map = this.j;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) Map.EL.getOrDefault(map, pjrVar, 0L)).longValue();
            final long j = jLongValue != 0 ? jCurrentTimeMillis - jLongValue : 0L;
            map.put(pjrVar, 0L);
            this.f.execute(new Runnable() { // from class: goo
                @Override // java.lang.Runnable
                public final void run() {
                    gop gopVar = this.a;
                    gopVar.e.b();
                    CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = gopVar.b;
                    gox goxVarX = cameraFatalErrorTrackerDatabase.x();
                    Object obj = goxVarX.a;
                    String str = pjrVar.a;
                    gow gowVar = (gow) dei.a((dco) obj, false, true, new dql(goxVarX, str, 10, null));
                    long j2 = gowVar.f;
                    long j3 = jCurrentTimeMillis;
                    if (gop.a(j3, j2) >= ((Integer) gopVar.c.fr()).intValue()) {
                        gowVar = new gow(str);
                    }
                    boolean z2 = z;
                    if (!z2 && gowVar.g == 0) {
                        gowVar.b++;
                    } else if (!z2 && gowVar.g > 0) {
                        gowVar.c++;
                    } else if (z2 && gowVar.g == 0) {
                        gowVar.d++;
                    } else if (z2 && gowVar.g > 0) {
                        gowVar.e++;
                    }
                    long j4 = j;
                    gowVar.f = j3;
                    cameraFatalErrorTrackerDatabase.x().a(gowVar);
                    String str2 = gowVar.a;
                    int i = gowVar.b;
                    int i2 = gowVar.c;
                    int i3 = gowVar.d;
                    int i4 = gowVar.e;
                    long j5 = gowVar.f;
                    int i5 = gowVar.g;
                    mdy mdyVar = gopVar.d;
                    tpc tpcVarM = sqb.a.m();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    sqb sqbVar = (sqb) tphVar;
                    str2.getClass();
                    sqbVar.b |= 1;
                    sqbVar.c = str2;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar2 = tpcVarM.b;
                    sqb sqbVar2 = (sqb) tphVar2;
                    sqbVar2.b |= 2;
                    sqbVar2.d = i;
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar3 = tpcVarM.b;
                    sqb sqbVar3 = (sqb) tphVar3;
                    sqbVar3.b |= 4;
                    sqbVar3.e = i2;
                    if (!tphVar3.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar4 = tpcVarM.b;
                    sqb sqbVar4 = (sqb) tphVar4;
                    sqbVar4.b |= 8;
                    sqbVar4.f = i3;
                    if (!tphVar4.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar5 = tpcVarM.b;
                    sqb sqbVar5 = (sqb) tphVar5;
                    sqbVar5.b |= 16;
                    sqbVar5.g = i4;
                    if (!tphVar5.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar6 = tpcVarM.b;
                    sqb sqbVar6 = (sqb) tphVar6;
                    sqbVar6.b |= 32;
                    sqbVar6.h = i5;
                    if (!tphVar6.C()) {
                        tpcVarM.o();
                    }
                    sqb sqbVar7 = (sqb) tpcVarM.b;
                    sqbVar7.b |= 64;
                    sqbVar7.i = j4;
                    tpc tpcVarM2 = sod.a.m();
                    soc socVar = soc.CAMERA_FATAL_ERROR_COUNTS_EVENT;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sod sodVar = (sod) tpcVarM2.b;
                    sodVar.f = socVar.aJ;
                    sodVar.b |= 1;
                    tpc tpcVarM3 = sof.a.m();
                    sqb sqbVar8 = (sqb) tpcVarM.l();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    sof sofVar = (sof) tpcVarM3.b;
                    sqbVar8.getClass();
                    sofVar.c = sqbVar8;
                    sofVar.b |= 1;
                    sof sofVar2 = (sof) tpcVarM3.l();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sod sodVar2 = (sod) tpcVarM2.b;
                    sofVar2.getClass();
                    sodVar2.Y = sofVar2;
                    sodVar2.c |= 1073741824;
                    mdyVar.I(tpcVarM2);
                    gopVar.d("Suspected camera device error", true);
                    int iMyUid = Process.myUid();
                    StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
                    builderNewBuilder.setAtomId(211500);
                    builderNewBuilder.writeInt(1);
                    builderNewBuilder.writeInt(iMyUid);
                    builderNewBuilder.usePooledBuffer();
                    StatsLog.write(builderNewBuilder.build());
                }
            });
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void g(pjr pjrVar) {
        this.j.put(pjrVar, Long.valueOf(System.currentTimeMillis()));
        this.f.execute(new cmc(this, pjrVar, 8, null));
    }

    public final synchronized void h(pjr pjrVar) {
        this.j.put(pjrVar, 0L);
        this.f.execute(new gbh(this, pjrVar, 12));
    }

    public final void i() {
        this.f.execute(new fnf(this, 9));
    }
}
