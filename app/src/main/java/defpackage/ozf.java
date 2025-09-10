package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozf extends MediaCodec.Callback {
    final /* synthetic */ ozh a;

    public ozf(ozh ozhVar) {
        this.a = ozhVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        ozh ozhVar = this.a;
        String str = ozhVar.a;
        String str2 = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", str, Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e(str, str2);
            return;
        }
        ozhVar.k = true;
        ozhVar.h.e(null);
        Log.e(str, "Stopping recording due to: ".concat(String.valueOf(str2)), codecException);
        ozhVar.e.a(oyu.MEDIA_CODEC_ERROR_VIDEO);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.a.d(i);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ozh ozhVar = this.a;
        ozhVar.b(bufferInfo.presentationTimeUs);
        ozhVar.k(i, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.e(mediaFormat);
    }
}
