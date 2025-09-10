package defpackage;

import android.media.MediaCodec;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qlf implements qlj {
    final /* synthetic */ MediaCodec.QueueRequest a;
    final /* synthetic */ int b;
    final /* synthetic */ qli c;

    public qlf(qli qliVar, MediaCodec.QueueRequest queueRequest, int i) {
        this.a = queueRequest;
        this.b = i;
        this.c = qliVar;
    }

    @Override // defpackage.qlj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qlj
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.qlj, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.queue();
        } catch (MediaCodec.CodecException e) {
            qli qliVar = this.c;
            qliVar.j.onError(qliVar.a, e);
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Exception occurred while trying to queue a request", th);
        }
    }
}
