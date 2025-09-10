package defpackage;

import android.media.AudioFormat;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import j$.time.Duration;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fzs implements ply, gae {
    public static final sgv a = sgv.g("fzs");
    private static final Duration h = Duration.ofMillis(3000);
    private static final Duration i = Duration.ofMillis(1000);
    private static final Duration j = Duration.ofMillis(700);
    public final syw b;
    public final syw c;
    public final Object d;
    public final szh e;
    public int f;
    public fzj g;
    private final fzy k;
    private final ByteBuffer l;
    private final int m;
    private plx n;
    private fzr o;
    private final fzf p;

    public fzs(fzy fzyVar, fzf fzfVar) {
        syw sywVarA = ske.A(ojl.bZ("AProcInput"));
        syw sywVarA2 = ske.A(ojl.bZ("AProcOutput"));
        this.d = new Object();
        this.e = new szh();
        this.o = fzr.UNINITIALIZED;
        this.k = fzyVar;
        this.p = fzfVar;
        this.b = sywVarA;
        this.c = sywVarA2;
        int iB = fzyVar.b();
        this.m = iB;
        this.l = ByteBuffer.allocate(iB);
        ((mbu) fzyVar).c = new fzp(this, 0);
    }

    public static final void e(Runnable runnable, syw sywVar) {
        ske.W(sywVar.submit(runnable), new fzq(0), sxo.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    private final void f() {
        try {
            this.e.t(j.toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 633)).s("Failed to get the process completed.");
        }
    }

    @Override // defpackage.ply
    public final plx a(plx plxVar) {
        this.n = plxVar;
        AudioFormat audioFormatD = plxVar.d();
        int sampleRate = audioFormatD.getSampleRate() * audioFormatD.getChannelCount() * oxf.ENCODING_PCM_16BIT.f * 8;
        int millis = (int) (((sampleRate / 8) * h.toMillis()) / 1000);
        this.f = millis;
        try {
            this.g = new fzj(sampleRate, millis);
            this.p.g = Duration.ofNanos((this.m * 8000000000L) / sampleRate);
            synchronized (this.d) {
                this.o = fzr.READY;
            }
            return new fzo(plxVar, this, this.g);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // defpackage.gae
    public final void b() {
        synchronized (this.d) {
            fzr fzrVar = this.o;
            rnt.O(fzrVar == fzr.READY, "Cannot start from %s", fzrVar);
            this.n.e();
            this.k.g();
            fzf fzfVar = this.p;
            synchronized (fzfVar.c) {
                fzfVar.d = 0;
                fzfVar.f = 0L;
                fzfVar.e = 0;
                fzfVar.h = 0L;
                fzfVar.b.set(true);
            }
            e(new fxs(this, 17), this.b);
            this.o = fzr.STARTED;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            fzr fzrVar = this.o;
            fzr fzrVar2 = fzr.CLOSED;
            if (fzrVar != fzrVar2) {
                c();
                this.n.close();
                this.k.close();
                this.o = fzrVar2;
            }
        }
    }

    public final void d(int i2) {
        int i3 = i2 / this.m;
        for (int i4 = 0; i4 < i3; i4++) {
            synchronized (this.d) {
                if (this.o != fzr.STARTED) {
                    return;
                }
                ByteBuffer byteBuffer = this.l;
                byteBuffer.clear();
                qaq qaqVarG = this.n.g(byteBuffer, byteBuffer.remaining());
                if (qaqVarG != null) {
                    this.k.j(qaqVarG);
                    fzf fzfVar = this.p;
                    long jS = qaqVarG.s();
                    synchronized (fzfVar.c) {
                        fzfVar.f++;
                        if (!fzfVar.b.compareAndSet(true, false)) {
                            Duration durationOfNanos = Duration.ofNanos(jS - fzfVar.h);
                            int nanos = (int) (durationOfNanos.minus(Duration.ofNanos((long) (fzfVar.g.toNanos() * 0.2f))).toNanos() / fzfVar.g.toNanos());
                            if (nanos > 0) {
                                fzfVar.e += nanos;
                                ((sgt) fzf.a.c().M(611)).H("Audio packet timestamp: %d. Expected frame duration: %d ns. Elapsed time: %d ns. Possible frame loss counts: %d", Long.valueOf(jS), Long.valueOf(fzfVar.g.toNanos()), Long.valueOf(durationOfNanos.toNanos()), Integer.valueOf(nanos));
                            }
                            if (nanos > fzfVar.d) {
                                fzfVar.d = nanos;
                            }
                        }
                    }
                    fzfVar.h = jS;
                } else if (this.n.c() != 3) {
                    return;
                } else {
                    ((sgt) a.c().M(628)).s("Read buffer from audio stream, but the audio packet is null.");
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [sgt, shi] */
    @Override // defpackage.gae
    public final void c() {
        synchronized (this.d) {
            if (this.o != fzr.STARTED) {
                return;
            }
            this.o = fzr.STOPPING;
            this.n.f();
            this.k.h();
            f();
            syw sywVar = this.c;
            sywVar.shutdown();
            syw sywVar2 = this.b;
            sywVar2.shutdown();
            try {
                Duration duration = i;
                sywVar.awaitTermination(duration.toMillis(), TimeUnit.MILLISECONDS);
                sywVar2.awaitTermination(duration.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 629)).s(UvOvSgfD.iVezcPimbsAM);
            }
            synchronized (this.d) {
                this.o = fzr.e;
            }
        }
    }
}
