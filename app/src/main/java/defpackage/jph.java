package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jph implements qfc {
    final /* synthetic */ szh a;
    final /* synthetic */ qfc b;
    final /* synthetic */ jpj c;

    public jph(jpj jpjVar, szh szhVar, qfc qfcVar) {
        this.a = szhVar;
        this.b = qfcVar;
        this.c = jpjVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.f(syuVar);
        this.b.a(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.b.b(byteBuffer, bufferInfo);
        szh szhVar = this.a;
        if (!szhVar.isDone()) {
            ((sgt) jpj.a.c().M(2998)).s("Configured format not yet available for packet; stats might be inaccurate");
            return;
        }
        if (szhVar.isCancelled()) {
            return;
        }
        try {
            MediaFormat mediaFormat = (MediaFormat) ske.U(szhVar);
            jsv.b();
            if (qsp.v(mediaFormat.getString("mime"))) {
                jpi jpiVar = this.c.b;
                synchronized (jpiVar) {
                    if (jpiVar.b == 0) {
                        jpiVar.c = Long.MAX_VALUE;
                    }
                    if ((bufferInfo.flags & 1) != 0) {
                        jpiVar.a++;
                    }
                    jpiVar.b++;
                    jpiVar.c = Math.min(bufferInfo.presentationTimeUs, jpiVar.c);
                    jpiVar.d = Math.max(bufferInfo.presentationTimeUs, jpiVar.d);
                }
            }
        } catch (ExecutionException e) {
            throw new AssertionError("... we just checked for isDone.", e);
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
