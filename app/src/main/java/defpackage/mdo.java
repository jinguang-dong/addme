package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mdo implements mdm {
    public boolean B;
    public sse C;
    public srk D;
    public spf E;
    public sti F;
    public stf G;
    public jjd H;
    public final syu I;
    protected final mdy J;
    public tpc K;
    private Long M;
    private boolean N;
    public ExifInterface l;
    protected List m;
    public jiz n;
    public srw p;
    public spy q;
    public sno r;
    public snr s;
    public sqa t;
    public sqc u;
    public spx v;
    public spn w;
    public sum x;
    public ssb z;
    public static final sgv a = sgv.g("mdo");
    private static final Duration L = Duration.ofMillis(500);
    public long b = 0;
    public boolean c = false;
    protected boolean d = false;
    public boolean e = false;
    protected boolean f = false;
    public final AtomicInteger g = new AtomicInteger(0);
    public final szh h = new szh();
    public final List i = new ArrayList();
    public Duration j = null;
    public Integer k = null;
    public mdq o = null;
    public boolean y = false;
    public final szh A = new szh();

    public mdo(mdy mdyVar, iug iugVar) {
        this.J = mdyVar;
        this.I = iugVar.a(iuh.b);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    public static Object g(Future future, Instant instant) {
        try {
            return ((swn) future).t(Duration.between(Instant.now(), instant).toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 4709)).s("Error retrieving Gcam stats.");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    private final snp i(long j) {
        if (!this.y) {
            return null;
        }
        try {
            Long l = (Long) this.A.t(2500L, TimeUnit.MILLISECONDS);
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue() - j;
            tpc tpcVarM = snp.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            snp snpVar = (snp) tpcVarM.b;
            snpVar.b |= 1;
            snpVar.c = jLongValue;
            return (snp) tpcVarM.l();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 4705)).s("Error retrieving kepler meta.");
            return null;
        }
    }

    @Override // defpackage.mdm
    public final mdq a() {
        return this.o;
    }

    @Override // defpackage.mdm
    public final Long b() {
        mdq mdqVar = this.o;
        if (mdqVar == null) {
            return null;
        }
        return Long.valueOf(mdqVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    @Override // defpackage.mdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.pnx r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdo.c(pnx, boolean):void");
    }

    @Override // defpackage.mdm
    public final void d(long j) {
        mdq mdqVar = this.o;
        if (mdqVar != null) {
            mdqVar.d = SystemClock.elapsedRealtimeNanos();
        }
        this.M = Long.valueOf(j);
    }

    @Override // defpackage.mdm
    public final void e(long j) {
        h(1, j);
    }

    @Override // defpackage.mdm
    public final void f() {
        this.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:6:0x0018, B:8:0x0020, B:10:0x0028, B:12:0x0038, B:13:0x003b, B:15:0x0043, B:23:0x006a, B:25:0x0072, B:26:0x0075, B:28:0x0081, B:29:0x0087, B:30:0x0092, B:16:0x004b, B:17:0x004c, B:19:0x0058, B:20:0x005b, B:22:0x0063, B:32:0x0094), top: B:374:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r49, long r50) {
        /*
            Method dump skipped, instructions count: 2380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdo.h(int, long):void");
    }
}
