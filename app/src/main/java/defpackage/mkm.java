package defpackage;

import com.google.ar.core.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mkm implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mkm(jbk jbkVar, float f, long j, int i) {
        this.d = i;
        this.c = jbkVar;
        this.b = f;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            float f = this.b;
            jbk jbkVar = (jbk) this.c;
            jbm jbmVar = jbkVar.a;
            long j = this.a;
            ndj ndjVar = jbmVar.g;
            ndjVar.K((int) (100.0f * f), j, false);
            jbkVar.a(f);
            jbmVar.h.b();
            if (f == 1.0f) {
                ndjVar.s();
                jbmVar.J.c(R.raw.camera_shutter);
                return;
            }
            return;
        }
        mkr mkrVar = (mkr) this.c;
        if (mkrVar.k()) {
            float f2 = this.b;
            long j2 = this.a;
            long millis = (long) (TimeUnit.SECONDS.toMillis(j2) / f2);
            mkrVar.i.h(millis);
            mkrVar.w.E("/video_state_recording_output", millis);
            AtomicLong atomicLong = mkrVar.c;
            if (atomicLong.get() != j2) {
                mkrVar.l.aD();
                atomicLong.set(j2);
            }
        }
    }

    public /* synthetic */ mkm(mkr mkrVar, long j, float f, int i) {
        this.d = i;
        this.c = mkrVar;
        this.a = j;
        this.b = f;
    }
}
