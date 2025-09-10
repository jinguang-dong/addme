package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.googlex.gcam.lasagna.LasagnaNativeProcessorJni;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivt {
    public static final sgv a = sgv.g("ivt");
    public final Object b = new Object();
    public final LasagnaNativeProcessorJni c = new LasagnaNativeProcessorJni();
    public long d = 0;

    public final synchronized void a(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.abortShot(j, i);
        } else {
            ((sgt) a.c().M(2391)).s("abortShot(): processor hasn't been initialized.");
        }
    }

    public final synchronized void b() {
        synchronized (this.b) {
            long j = this.d;
            if (j != 0) {
                this.c.delete(j);
                this.d = 0L;
            } else {
                ((sgt) a.c().M(2395)).s("Calling close() on an already closed processor.");
            }
        }
    }

    public final synchronized void c(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.endShot(j, i);
        } else {
            ((sgt) a.c().M(2397)).s("endShot(): processor hasn't been initialized.");
        }
    }

    public final synchronized void d(int i, int i2, tbu tbuVar, String str, long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator, LasagnaCallbacks lasagnaCallbacks, boolean z, int i3, long j2, long j3, int i4, long j4, long j5) {
        synchronized (this.b) {
            long jCreate = this.c.create(i, i2, tbuVar.e, str, j, interleavedU8ClientAllocator, lasagnaCallbacks, z, i3, j2, j3, i4, j4, j5);
            this.d = jCreate;
            rnt.L(jCreate != 0);
        }
    }

    public final synchronized void e() {
        long j = this.d;
        if (j != 0) {
            this.c.printDiagnosticsToLog(j);
        } else {
            ((sgt) a.c().M(2398)).s("printDiagnostics(): processor hasn't been initialized.");
        }
    }

    public final synchronized boolean f(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.beginShot(j, i);
            return true;
        }
        ((sgt) a.c().M(2394)).s(GAQqzWiWWcYOgy.HXWcZ);
        return false;
    }

    public final synchronized boolean g(int i, thv thvVar, DebugParams debugParams) {
        long j = this.d;
        if (j != 0) {
            this.c.processZslBurst(j, i, thvVar.a(), debugParams != null ? DebugParams.a(debugParams) : 0L);
            return true;
        }
        ((sgt) a.c().M(2400)).s("processZslBurst(): processor hasn't been initialized.");
        return false;
    }

    public final synchronized void h(int i, tht thtVar) {
        long j = this.d;
        if (j != 0) {
            this.c.processPslFrame(j, i, RawWriteView.e(thtVar.a), FrameMetadata.c(thtVar.b), thtVar.c.a, thtVar.d);
        } else {
            ((sgt) a.c().M(2399)).s(HHdu.YJGZjjpkihVvzG);
        }
    }

    public final synchronized boolean i(StaticMetadata staticMetadata, int i, float f, int i2, boolean z) {
        long j = this.d;
        if (j != 0) {
            this.c.setOptions(j, StaticMetadata.c(staticMetadata), i, false, false, f, i2, z, false);
            return true;
        }
        ((sgt) a.c().M(2401)).s("setOptions(): processor hasn't been initialized.");
        return false;
    }
}
