package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class joi implements qfc {
    private final qfc a;
    private final szh b;

    public joi(qfc qfcVar, szh szhVar) {
        this.a = qfcVar;
        this.b = szhVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.a.a(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.a.b(byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.b.e(Long.valueOf(bufferInfo.presentationTimeUs));
            }
        } catch (CancellationException unused) {
            this.b.cancel(false);
        } catch (Throwable th) {
            this.b.cancel(false);
            throw th;
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
            szh szhVar = this.b;
            if (szhVar.isDone()) {
                return;
            }
            szhVar.e(null);
        } catch (CancellationException unused) {
            this.b.cancel(false);
        } catch (Throwable th) {
            this.b.cancel(false);
            throw th;
        }
    }
}
