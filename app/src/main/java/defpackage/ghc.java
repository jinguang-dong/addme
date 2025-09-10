package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ghc implements ggz {
    private static final sgv i = sgv.g("ghc");
    public final gau a;
    public final ghh b;
    public int d;
    public long e;
    public szh f;
    public syu g;
    public final ggo h;
    private final oup j;
    private final naw k;
    private final gnt l;
    public final ScheduledExecutorService c = ojl.cc("snapshot-taker");
    private boolean m = false;

    public ghc(gdi gdiVar, gav gavVar, naw nawVar, ggo ggoVar, gnt gntVar, ghh ghhVar) {
        this.j = gdiVar.b();
        this.k = nawVar;
        this.a = gavVar.a();
        this.h = ggoVar;
        this.l = gntVar;
        this.b = ghhVar;
    }

    @Override // defpackage.ggz
    public final syu a(lte lteVar) {
        this.d = 0;
        szh szhVar = new szh();
        this.f = szhVar;
        this.g = null;
        this.e = System.currentTimeMillis();
        c(lteVar, null);
        return szhVar;
    }

    @Override // defpackage.ggz
    public final syu b(pka pkaVar, pao paoVar) {
        return ske.L(new UnsupportedOperationException("Not implemented."));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    public final void c(final lte lteVar, Throwable th) {
        syu syuVar = this.g;
        if (syuVar != null) {
            syuVar.cancel(true);
        }
        if (this.m) {
            this.f.a(new IllegalStateException("Snapshot taker has been closed."));
            return;
        }
        final pka pkaVarA = this.l.a();
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 < 3) {
            this.j.execute(new Runnable() { // from class: gha
                @Override // java.lang.Runnable
                public final void run() {
                    syu syuVarL;
                    pfu pfuVar;
                    ghc ghcVar = this.a;
                    pao paoVar = (pao) ((ovx) ghcVar.a.t).d;
                    gce gceVar = ghcVar.h.b;
                    gceVar.getClass();
                    synchronized (((gcm) gceVar).c) {
                        if (((gcm) gceVar).m == null || (pfuVar = ((gcm) gceVar).R) == null || ((gcm) gceVar).w == null) {
                            syuVarL = ske.L(new IllegalStateException("Snapshot not available"));
                        } else {
                            pfuVar.m(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(paoVar.e));
                            szh szhVar = new szh();
                            pfu pfuVar2 = ((gcm) gceVar).R;
                            pfuVar2.getClass();
                            pdv pdvVar = ((gcm) gceVar).w;
                            pdvVar.getClass();
                            pdk pdkVarB = pfuVar2.b(pdvVar);
                            pdkVarB.j(new gcl((gcm) gceVar, szhVar, pdkVarB));
                            syuVarL = szhVar;
                        }
                    }
                    lte lteVar2 = lteVar;
                    pka pkaVar = pkaVarA;
                    ghcVar.g = ske.T(syuVarL, 1000L, TimeUnit.MILLISECONDS, ghcVar.c);
                    ske.W(ghcVar.g, new ghb(ghcVar, pkaVar, lteVar2), sxo.a);
                }
            });
            return;
        }
        ?? B = i.b();
        th.getClass();
        ((sgt) ((sgt) B.i(th)).M((char) 890)).s("Failed to take snapshot.");
        this.f.a(th);
        this.k.c(nau.SNAPSHOT_FAILURE);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.m = true;
        this.c.shutdown();
    }
}
