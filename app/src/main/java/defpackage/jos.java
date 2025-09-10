package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jos implements qfc {
    private final qfc a;
    private volatile boolean b = false;

    public jos(qfc qfcVar) {
        this.a = qfcVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.a(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.b = true;
        }
        if (this.b) {
            this.a.b(byteBuffer, bufferInfo);
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
