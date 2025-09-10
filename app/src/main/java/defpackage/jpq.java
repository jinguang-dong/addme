package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jpq implements qfc {
    final /* synthetic */ qfc a;
    final /* synthetic */ jpr b;

    public jpq(jpr jprVar, qfc qfcVar) {
        this.a = qfcVar;
        this.b = jprVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.a(syuVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lss] */
    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.b(byteBuffer, bufferInfo);
        sgv sgvVar = jnm.a;
        this.b.a.a.ab();
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
