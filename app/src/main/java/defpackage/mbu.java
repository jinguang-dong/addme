package defpackage;

import android.media.MicrophoneDirection;
import java.nio.ByteBuffer;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mbu implements fzy {
    public static final /* synthetic */ int d = 0;
    private static final sgv e = sgv.g("mbu");
    private static final Integer f = 500;
    public final Timer a;
    public boolean b = false;
    public fzx c;
    private final gaf g;
    private final mci h;
    private final int i;
    private final int j;
    private final our k;

    public mbu(mci mciVar, int i, int i2, gaf gafVar, Timer timer) {
        this.h = mciVar;
        this.j = i;
        this.i = i2;
        this.g = gafVar;
        our ourVar = new our();
        this.k = ourVar;
        this.a = timer;
        ourVar.d(mciVar.a(new mbt(this)));
    }

    public final void a(byte[] bArr) {
        int length;
        if (this.c == null || (length = bArr.length) == 0) {
            return;
        }
        this.c.b(new qaq(new qkz(ByteBuffer.wrap(bArr), length, this.g.a(length))));
    }

    @Override // defpackage.fzy
    public final int b() {
        int iY = ske.Y(((this.j * this.i) * this.h.b().toMillis()) / 1000);
        rnt.M(iY > 0, "Insufficient sample number per buffer");
        return iY * oxf.ENCODING_PCM_16BIT.f;
    }

    @Override // defpackage.fzy
    public final gac c() {
        return gac.SPEECH_ENHANCEMENT;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.k.close();
    }

    @Override // defpackage.fzy
    public final void f(fzx fzxVar) {
        this.c = fzxVar;
    }

    @Override // defpackage.fzy
    public final void g() {
        mbs mbsVar = new mbs(this);
        f.intValue();
        this.a.schedule(mbsVar, 500L);
    }

    @Override // defpackage.fzy
    public final void h() {
        this.h.c();
    }

    @Override // defpackage.fzy
    public final int i() {
        return 1;
    }

    @Override // defpackage.fzy
    public final void j(qaq qaqVar) {
        if (this.h.j(qaqVar.t())) {
            this.g.b(qaqVar.s(), qaqVar.r());
        } else {
            if (!this.b) {
                ((sgt) e.c().M(4644)).u("Audio (%d) isn't provided due to invalid state.", qaqVar.s());
                return;
            }
            ((sgt) e.c().M(4645)).u("Audio (%d) isn't enhanced.", qaqVar.s());
            this.g.b(qaqVar.s(), qaqVar.r());
            a(qaqVar.t().array());
        }
    }

    @Override // defpackage.fzy
    public final void d(MicrophoneDirection microphoneDirection) {
    }
}
