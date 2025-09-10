package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jzb implements jyv {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ MediaFormat b;
    final /* synthetic */ ByteBuffer c;

    public jzb(MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, ByteBuffer byteBuffer) {
        this.a = bufferInfo;
        this.b = mediaFormat;
        this.c = byteBuffer;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
