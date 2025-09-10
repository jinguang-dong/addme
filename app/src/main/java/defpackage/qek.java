package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qek implements qfc {
    public final int a;
    public int b = -1;
    public final /* synthetic */ qel c;

    public qek(qel qelVar, int i) {
        this.c = qelVar;
        this.a = i;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        syuVar.c(new pev(this, syuVar, 10), this.c.e);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.c.e.execute(new qej(this, byteBuffer, bufferInfo, 0));
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.c.e.execute(new oze(this, 13));
    }
}
