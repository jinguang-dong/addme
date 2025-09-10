package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpe implements qlv {
    final /* synthetic */ jpf a;

    public jpe(jpf jpfVar) {
        this.a = jpfVar;
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.a.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        jpf jpfVar = this.a;
        jpfVar.a.close();
        jpfVar.b.e(new Object());
    }
}
