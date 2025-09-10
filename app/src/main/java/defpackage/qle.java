package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qle implements qlj {
    public long a = 0;
    public final /* synthetic */ ByteBuffer b;
    final /* synthetic */ int c;
    final /* synthetic */ qli d;

    public qle(qli qliVar, ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        this.c = i;
        this.d = qliVar;
    }

    @Override // defpackage.qlj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.qlj
    public final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.qlj, java.lang.AutoCloseable
    public final void close() {
        qli qliVar = this.d;
        synchronized (qliVar) {
            if (qliVar.k.remove(this)) {
                try {
                    qliVar.a.queueInputBuffer(this.c, 0, this.b.position(), this.a, 0);
                } catch (MediaCodec.CodecException e) {
                    qli qliVar2 = this.d;
                    qliVar2.j.onError(qliVar2.a, e);
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception caught while attempting to queue input buffer.", th);
                }
            } else {
                Log.w("AsynchMediaCodec", "Trying to submit input buffer for timestamp " + this.a + " but it has been closed already (... or the codec was stopped)");
            }
        }
    }
}
