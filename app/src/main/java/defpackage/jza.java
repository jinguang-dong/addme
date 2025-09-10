package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jza implements jyv {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ MediaCodec b;
    final /* synthetic */ int c;

    public jza(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.a = bufferInfo;
        this.b = mediaCodec;
        this.c = i;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.releaseOutputBuffer(this.c, false);
    }
}
