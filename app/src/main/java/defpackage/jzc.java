package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jzc implements jyv {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ jyv b;

    public jzc(MediaCodec.BufferInfo bufferInfo, jyv jyvVar) {
        this.a = bufferInfo;
        this.b = jyvVar;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
