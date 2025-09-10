package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kaq extends MediaCodec.Callback {
    final /* synthetic */ qfc a;
    final /* synthetic */ kas b;

    public kaq(kas kasVar, qfc qfcVar) {
        this.a = qfcVar;
        this.b = kasVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        kas kasVar = this.b;
        kasVar.h.set(true);
        kasVar.b(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        kas kasVar = this.b;
        kasVar.h.set(true);
        kasVar.a.addLast(Integer.valueOf(i));
        kasVar.c("onInputBufferAvailable");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        kas kasVar = this.b;
        kasVar.h.set(true);
        kasVar.e.b("Codec Output Buffer: ts = " + bufferInfo.presentationTimeUs + ", index = " + i);
        kasVar.b.addLast(Pair.create(Integer.valueOf(i), bufferInfo));
        kasVar.c("onOutputBufferAvailable");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.b.h.set(true);
        this.a.a(ske.M(mediaFormat));
    }
}
