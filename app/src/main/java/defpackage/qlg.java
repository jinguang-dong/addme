package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlg implements AutoCloseable {
    final /* synthetic */ MediaCodec a;
    public final /* synthetic */ ByteBuffer b;
    public final /* synthetic */ MediaCodec.BufferInfo c;
    final /* synthetic */ MediaCodec.LinearBlock d;
    final /* synthetic */ int e;
    final /* synthetic */ qli f;

    public qlg(qli qliVar, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaCodec.LinearBlock linearBlock, int i) {
        this.a = mediaCodec;
        this.b = byteBuffer;
        this.c = bufferInfo;
        this.d = linearBlock;
        this.e = i;
        this.f = qliVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        qli qliVar = this.f;
        synchronized (qliVar) {
            if (qliVar.l.remove(this) && !qliVar.e.isDone()) {
                MediaCodec.LinearBlock linearBlock = this.d;
                if (linearBlock != null) {
                    linearBlock.recycle();
                }
                try {
                    this.a.releaseOutputBuffer(this.e, false);
                    qli qliVar2 = this.f;
                    qlr qlrVar = qliVar2.o;
                    MediaCodec.BufferInfo bufferInfo = this.c;
                    qlrVar.a(bufferInfo.presentationTimeUs);
                    qliVar2.c(bufferInfo);
                    return;
                } catch (MediaCodec.CodecException e) {
                    qli qliVar3 = this.f;
                    qliVar3.j.onError(qliVar3.a, e);
                    return;
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th);
                    return;
                }
            }
            Log.w("AsynchMediaCodec", "Trying to close output buffer at timestamp " + this.c.presentationTimeUs + " but it has been closed or the codec has been stopped already");
        }
    }
}
