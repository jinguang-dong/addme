package defpackage;

import android.media.AudioFormat;
import j$.time.Duration;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzu implements gab, gaa {
    public static final sgv a = sgv.g("fzu");
    private static final Duration g = Duration.ofMillis(3000);
    private static final Duration h = Duration.ofMillis(25);
    public final plx b;
    public final ByteBuffer c;
    public final Object d;
    public final fzj e;
    public int f;
    private final syw i;

    public fzu(plx plxVar) {
        syw sywVarA = ske.A(ojl.bZ("APipeSrcEx"));
        this.d = new Object();
        this.f = 1;
        this.b = plxVar;
        this.i = sywVarA;
        AudioFormat audioFormatD = plxVar.d();
        try {
            this.e = new fzj(audioFormatD.getSampleRate() * audioFormatD.getChannelCount() * oxf.ENCODING_PCM_16BIT.f * 8, (int) (((r2 / 8) * g.toMillis()) / 1000));
            int iY = ske.Y(((plxVar.d().getSampleRate() * plxVar.d().getChannelCount()) * h.toMillis()) / 1000);
            rnt.M(iY > 0, "Insufficient sample number per buffer");
            this.c = ByteBuffer.allocate(iY * oxf.ENCODING_PCM_16BIT.f);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private final void b(int i) {
        synchronized (this.d) {
            this.f = i;
        }
    }

    @Override // defpackage.gab
    public final qaq a(ByteBuffer byteBuffer, int i) {
        return this.e.a(byteBuffer, i);
    }

    @Override // defpackage.gaa
    public final void c() {
        this.b.close();
        this.i.shutdown();
        b(4);
    }

    @Override // defpackage.gaa
    public final void d() {
        this.b.e();
        ske.W(this.i.submit(new Runnable() { // from class: fzt
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
            
                return;
             */
            /* JADX WARN: Type inference failed for: r1v6, types: [sgt, shi] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r6 = this;
                L0:
                    fzu r0 = r6.a
                    java.lang.Object r1 = r0.d
                    monitor-enter(r1)
                    int r2 = r0.f     // Catch: java.lang.Throwable -> L64
                    r3 = 0
                    if (r2 == 0) goto L63
                    r4 = 3
                    if (r2 == r4) goto L61
                    r5 = 4
                    if (r2 != r5) goto L11
                    goto L61
                L11:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
                    monitor-enter(r1)
                    int r2 = r0.f     // Catch: java.lang.Throwable -> L5e
                    if (r2 == 0) goto L5d
                    r3 = 2
                    if (r2 == r3) goto L1c
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                    goto L0
                L1c:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                    java.nio.ByteBuffer r1 = r0.c
                    r1.clear()
                    plx r2 = r0.b
                    int r3 = r1.remaining()
                    qaq r1 = r2.g(r1, r3)
                    if (r1 != 0) goto L48
                    int r0 = r2.c()
                    if (r0 != r4) goto L0
                    sgv r0 = defpackage.fzu.a
                    shi r0 = r0.c()
                    r1 = 640(0x280, float:8.97E-43)
                    shi r0 = r0.M(r1)
                    sgt r0 = (defpackage.sgt) r0
                    java.lang.String r1 = "Read buffer from audio stream, but the audio packet is null."
                    r0.s(r1)
                    goto L0
                L48:
                    fzj r0 = r0.e     // Catch: java.io.IOException -> L4e
                    r0.b(r1)     // Catch: java.io.IOException -> L4e
                    goto L0
                L4e:
                    r0 = move-exception
                    sgv r1 = defpackage.fzu.a
                    shi r1 = r1.b()
                    java.lang.String r2 = "Failed to write to piped audio buffer."
                    r3 = 638(0x27e, float:8.94E-43)
                    defpackage.mn.c(r2, r3, r1, r0)
                    goto L0
                L5d:
                    throw r3     // Catch: java.lang.Throwable -> L5e
                L5e:
                    r6 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                    throw r6
                L61:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
                    return
                L63:
                    throw r3     // Catch: java.lang.Throwable -> L64
                L64:
                    r6 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fzt.run():void");
            }
        }), new fzq(2), sxo.a);
        b(2);
    }

    @Override // defpackage.gaa
    public final void e() {
        this.b.f();
        b(3);
    }
}
