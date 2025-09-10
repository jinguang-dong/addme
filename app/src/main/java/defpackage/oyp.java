package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyp extends MediaCodec.Callback {
    public final /* synthetic */ oys a;

    public oyp(oys oysVar) {
        this.a = oysVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String str = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "AudioEncoder", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e("AudioEncoder", str);
            return;
        }
        oys oysVar = this.a;
        oysVar.x = true;
        Log.e("AudioEncoder", "Stopping recording due to: ".concat(String.valueOf(str)), codecException);
        oysVar.e(new ooc(this, 14), oysVar.c);
        sbp sbpVar = oysVar.k;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((oyx) sbpVar.get(i)).a(oyu.MEDIA_CODEC_ERROR_AUDIO);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        ByteBuffer inputBuffer;
        oys oysVar = this.a;
        if (oysVar.E.isDone()) {
            return;
        }
        if (!oysVar.m) {
            oys oysVar2 = this.a;
            oysVar2.e(new ng(this, mediaCodec, i, 16), oysVar2.b);
            return;
        }
        if (oysVar.g.c() != 3) {
            return;
        }
        if (i < 0) {
            Log.e("AudioEncoder", a.bE(i, "Index", " is invalid"));
            return;
        }
        synchronized (oysVar.e) {
            Future future = oysVar.z;
            if (future != null && !future.isDone()) {
                if (oysVar.B == -1) {
                    oysVar.B = i;
                    return;
                }
                int iLimit = 0;
                if (oysVar.A != -1 && SystemClock.elapsedRealtime() - oysVar.A > 50 && (inputBuffer = mediaCodec.getInputBuffer(i)) != null && inputBuffer.limit() > 0) {
                    byte[] bArr = oysVar.C;
                    if (bArr == null || bArr.length != inputBuffer.limit()) {
                        oysVar.C = new byte[inputBuffer.limit()];
                    }
                    byte[] bArr2 = oysVar.C;
                    bArr2.getClass();
                    inputBuffer.put(bArr2);
                    inputBuffer.position(0);
                    iLimit = inputBuffer.limit();
                    oysVar.o += 25000;
                    oysVar.A += 25;
                }
                int i2 = iLimit;
                mediaCodec.queueInputBuffer(i, 0, i2, oysVar.o, 0);
                if (i2 == 0) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            }
            oysVar.z = oysVar.d.submit(new ng(oysVar, mediaCodec, i, 15));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        oys oysVar = this.a;
        if (oysVar.E.isDone()) {
            return;
        }
        oysVar.e(new ng(this, i, bufferInfo, 17), oysVar.c);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        oys oysVar = this.a;
        if (oysVar.y.getAndSet(true)) {
            throw new IllegalStateException("format changed twice");
        }
        if (oysVar.E.isDone()) {
            return;
        }
        oysVar.e(new nzq(oysVar, mediaFormat, 17), oysVar.a);
    }
}
