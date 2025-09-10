package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface qlv extends AutoCloseable {
    void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    @Override // java.lang.AutoCloseable
    void close();
}
