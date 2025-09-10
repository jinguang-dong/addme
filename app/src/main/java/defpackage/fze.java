package defpackage;

import android.media.AudioFormat;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.time.Duration;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fze implements fzz, gaa {
    public static final sgv a = sgv.g("fze");
    private static final Duration i = Duration.ofMillis(3000);
    private static final Duration j = Duration.ofMillis(700);
    public final syw b;
    public final syw c;
    public final Object d;
    public final szh e;
    public int f;
    public fzd g;
    public fzj h;
    private final fzy k;
    private final ByteBuffer l;
    private final our m;
    private final int n;
    private gab o;
    private fzh p;

    public fze(fzy fzyVar) {
        syw sywVarA = ske.A(ojl.bZ("BatAPipeInEx"));
        syw sywVarA2 = ske.A(ojl.bZ("BatAPipeOutEx"));
        szh szhVar = new szh();
        this.d = new Object();
        this.g = fzd.UNINITIALIZED;
        this.k = fzyVar;
        this.b = sywVarA;
        this.c = sywVarA2;
        this.e = szhVar;
        int iB = fzyVar.b();
        this.n = iB;
        this.l = ByteBuffer.allocate(iB);
        this.m = new our();
        fzyVar.f(new fzp(this, 1));
    }

    public static final void i(Runnable runnable, syw sywVar) {
        ske.W(sywVar.submit(runnable), new fzq(1), sxo.a);
    }

    private final void j(fzd fzdVar) {
        synchronized (this.d) {
            this.g = fzdVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    private final void k() {
        try {
            this.e.t(j.toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 610)).s("Failed to get the process completed.");
        }
    }

    @Override // defpackage.fzz
    public final gab a() {
        fzj fzjVar;
        synchronized (this.d) {
            rnt.O(this.g.equals(fzd.READY), "Cannot get output from %s", this.g);
            fzjVar = this.h;
        }
        return fzjVar;
    }

    @Override // defpackage.fzz
    public final gac b() {
        return this.k.c();
    }

    @Override // defpackage.gaa
    public final void c() {
        this.k.close();
        this.m.close();
        this.c.shutdown();
        this.b.shutdown();
        j(fzd.CLOSED);
    }

    @Override // defpackage.gaa
    public final void d() {
        this.o.getClass();
        synchronized (this.d) {
            rnt.O(this.g.equals(fzd.READY), "Cannot start from %s", this.g);
        }
        this.k.g();
        j(fzd.STARTED);
        i(new fxs(this, 15), this.b);
    }

    @Override // defpackage.gaa
    public final void e() {
        j(fzd.STOPPING);
        this.k.h();
        k();
        j(fzd.STOPPED);
    }

    @Override // defpackage.fzz
    public final void g(gab gabVar) {
        this.o = gabVar;
    }

    @Override // defpackage.fzz
    public final void h(fzh fzhVar) {
        this.p = fzhVar;
        fzy fzyVar = this.k;
        plx plxVar = fzhVar.a;
        fzyVar.d(plxVar);
        AudioFormat audioFormatD = plxVar.d();
        int sampleRate = audioFormatD.getSampleRate() * audioFormatD.getChannelCount() * oxf.ENCODING_PCM_16BIT.f * 8;
        int millis = (int) (((sampleRate / 8) * i.toMillis()) / 1000);
        this.f = millis;
        try {
            this.h = new fzj(sampleRate, millis);
            this.m.d(fzhVar.a(this));
            j(fzd.READY);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public final void f(int i2) {
        int i3 = i2 / this.n;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = this.d;
            synchronized (obj) {
                fzd fzdVar = this.g;
                fzd fzdVar2 = fzd.STARTED;
                if (!fzdVar.equals(fzdVar2)) {
                    return;
                }
                ByteBuffer byteBuffer = this.l;
                byteBuffer.clear();
                qaq qaqVarA = this.o.a(byteBuffer, byteBuffer.remaining());
                if (qaqVarA != null) {
                    synchronized (obj) {
                        if (!this.g.equals(fzdVar2)) {
                            ((sgt) a.c().M(604)).v(SHXc.vOM, this.g);
                            return;
                        }
                    }
                    this.k.j(qaqVarA);
                } else if (this.p.a.c() != 3) {
                    return;
                } else {
                    ((sgt) a.c().M(606)).s("Read buffer from audio stream, but the audio packet is null.");
                }
            }
        }
    }
}
