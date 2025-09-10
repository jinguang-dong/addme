package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfb implements qfc {
    final /* synthetic */ szh a;
    final /* synthetic */ qlv b;

    public qfb(szh szhVar, qlv qlvVar) {
        this.a = szhVar;
        this.b = qlvVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.f(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.b.b(byteBuffer, bufferInfo);
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
