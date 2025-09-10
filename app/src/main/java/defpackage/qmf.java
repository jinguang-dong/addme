package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmf extends qmk {
    public final ByteBuffer a;

    public qmf(ByteBuffer byteBuffer, qhg qhgVar) {
        super(qhgVar);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Native ByteBuffers must be direct, and allocated with allocateDirect()!");
        }
        this.a = byteBuffer;
        byteBuffer.position();
    }

    public final String toString() {
        return "NativeBuffer[type=ByteBuffer, layout=" + this.b.toString() + ", buffer=" + String.valueOf(this.a) + "]";
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
