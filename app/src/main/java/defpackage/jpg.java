package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpg implements qfc {
    private final qfc a;

    public jpg(qfc qfcVar) {
        this.a = qfcVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.a(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & Integer.MIN_VALUE) != 0) {
            long j = bufferInfo.presentationTimeUs;
        } else {
            this.a.b(byteBuffer, bufferInfo);
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
