package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jou implements qfc {
    public final int a;
    public final /* synthetic */ jov b;
    private final qfc c;
    private final AtomicInteger d = new AtomicInteger(0);

    public jou(jov jovVar, qfc qfcVar, int i) {
        this.b = jovVar;
        this.c = qfcVar;
        this.a = i;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        ske.W(syuVar, new jcb(this, 2), sxo.a);
        this.c.a(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.c.b(byteBuffer, bufferInfo);
        if (this.d.incrementAndGet() % 10 == 1) {
            gzi gziVar = gzo.a;
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.d.get();
        this.c.close();
    }
}
