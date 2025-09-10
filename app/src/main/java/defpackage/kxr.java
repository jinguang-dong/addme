package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kxr implements ltb {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ syu c;
    final /* synthetic */ kxl d;
    final /* synthetic */ kwt e;
    final /* synthetic */ gga f;

    public kxr(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, syu syuVar, kxl kxlVar, kwt kwtVar, gga ggaVar) {
        this.a = atomicBoolean;
        this.b = atomicBoolean2;
        this.c = syuVar;
        this.d = kxlVar;
        this.e = kwtVar;
        this.f = ggaVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kml] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:30:0x0071). Please report as a decompilation issue!!! */
    @Override // defpackage.ltb
    public final void b() {
        Object obj;
        this.a.set(true);
        if (this.b.get()) {
            this.c.cancel(true);
        } else {
            kxl kxlVar = this.d;
            kxlVar.c = true;
            kwp kwpVar = kxlVar.d;
            if (kwpVar != null && kxlVar.b.l() && (obj = kwpVar.b) != null) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                tpc tpcVar = (tpc) obj;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                sno snoVar = (sno) tpcVar.b;
                sno snoVar2 = sno.a;
                snoVar.b |= 2;
                snoVar.d = jElapsedRealtimeNanos;
            }
            try {
                pfz pfzVar = kxlVar.e;
                if (pfzVar != null) {
                    pfzVar.d();
                } else {
                    ((sgt) kxl.a.b().M(3592)).s("FrameServerSession not provided. Failed to abort capture.");
                }
            } catch (pco e) {
                ((sgt) ((sgt) kxl.a.b().i(e)).M((char) 3593)).s("Failed to abort capture.");
            }
        }
        tpc tpcVar2 = this.e.a;
        if (tpcVar2 != null) {
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            if (!tpcVar2.b.C()) {
                tpcVar2.o();
            }
            sse sseVar = (sse) tpcVar2.b;
            sse sseVar2 = sse.a;
            sseVar.b |= 4;
            sseVar.e = jElapsedRealtimeNanos2;
        }
        this.f.a.f();
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void c(jjb jjbVar) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void f(rwc rwcVar) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void d(boolean z, boolean z2) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void i(int i, int i2) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void j(int i, int i2) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void g(int i, int i2, Throwable th) {
    }

    @Override // defpackage.ltb
    public final /* synthetic */ void h(int i, int i2, Throwable th) {
    }
}
