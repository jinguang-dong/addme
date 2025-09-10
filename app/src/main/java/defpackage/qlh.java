package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlh extends MediaCodec.Callback {
    final /* synthetic */ qli a;

    public qlh(qli qliVar) {
        this.a = qliVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException != null && codecException.isTransient()) {
            Log.w("AsynchMediaCodec", "Transient error occurred while processing data.", codecException);
        } else if (codecException == null || !codecException.isRecoverable()) {
            if (codecException != null) {
                Log.e("AsynchMediaCodec", "Unrecoverable error occurred while encoding data.", codecException);
                this.a.e.a(codecException);
            } else {
                Log.e("AsynchMediaCodec", "Unrecoverable error occurred while starting encoder or encoding.");
                qli qliVar = this.a;
                qliVar.e.a(new IllegalStateException("Codec error"));
            }
            this.a.e();
        } else {
            Log.w("AsynchMediaCodec", "Recoverable error occurred while encoding data.", codecException);
            qli qliVar2 = this.a;
            qliVar2.e.a(codecException);
            qliVar2.e();
        }
        qli qliVar3 = this.a;
        qliVar3.b.set(3);
        qliVar3.o.d(3);
        qliVar3.g.getAndSet(false);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        qli qliVar = this.a;
        synchronized (qliVar) {
            if (qliVar.e.isDone()) {
                return;
            }
            if (qliVar.f.getAndSet(false)) {
                qliVar.g(i);
            } else {
                qliVar.d.addLast(Integer.valueOf(i));
                qliVar.o.e(qliVar);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        MediaCodec mediaCodec2;
        MediaCodec.CodecException codecException;
        MediaCodec.LinearBlock linearBlock;
        qli qliVar = this.a;
        synchronized (qliVar) {
            if (qliVar.e.isDone()) {
                return;
            }
            boolean z2 = qliVar.h.get();
            int i2 = bufferInfo.flags & 2;
            try {
                if (bufferInfo.size > 0 && !z2 && i2 == 0 && (!(z = qliVar.m) || (bufferInfo.flags & 4) == 0)) {
                    qliVar.o.b(bufferInfo);
                    try {
                        try {
                            qmb qmbVar = qliVar.n;
                            if (z) {
                                try {
                                    linearBlock = mediaCodec.getOutputFrame(i).getLinearBlock();
                                } catch (MediaCodec.CodecException e) {
                                    codecException = e;
                                    mediaCodec2 = mediaCodec;
                                    this.a.j.onError(mediaCodec2, codecException);
                                    return;
                                }
                            } else {
                                linearBlock = null;
                            }
                            MediaCodec.LinearBlock linearBlock2 = linearBlock;
                            mediaCodec2 = mediaCodec;
                            try {
                                qlg qlgVar = new qlg(qliVar, mediaCodec2, linearBlock2 != null ? linearBlock2.map() : mediaCodec.getOutputBuffer(i), bufferInfo, linearBlock2, i);
                                synchronized (qliVar) {
                                    qliVar.l.add(qlgVar);
                                    qmbVar.a(qlgVar);
                                }
                            } catch (MediaCodec.CodecException e2) {
                                e = e2;
                                codecException = e;
                                this.a.j.onError(mediaCodec2, codecException);
                                return;
                            }
                        } catch (MediaCodec.CodecException e3) {
                            e = e3;
                            mediaCodec2 = mediaCodec;
                        }
                    } catch (Throwable th) {
                        Log.e("AsynchMediaCodec", "Exception occurred while trying construct media data", th);
                        return;
                    }
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.a.c(bufferInfo);
            } catch (MediaCodec.CodecException e4) {
                this.a.j.onError(mediaCodec, e4);
            } catch (Throwable th2) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th2);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.n.b(mediaFormat);
    }
}
