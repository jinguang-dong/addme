package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qls implements qlv {
    private final qlv a;

    public qls(qlv qlvVar) {
        this.a = qlvVar;
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        qth qthVarA = qth.a(byteBuffer, bufferInfo);
        Object obj = qthVarA.a;
        this.a.b((ByteBuffer) obj, (MediaCodec.BufferInfo) qthVarA.b);
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
