package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mio extends MediaCodec.Callback {
    final /* synthetic */ mky a;
    final /* synthetic */ miq b;
    final /* synthetic */ hbj c;

    public mio(miq miqVar, hbj hbjVar, mky mkyVar) {
        this.c = hbjVar;
        this.a = mkyVar;
        this.b = miqVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException.isTransient()) {
            ((sgt) miq.a.b().M(4803)).I("Failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        } else {
            ((sgt) ((sgt) miq.a.b().i(codecException)).M(4804)).I("Stopping recording due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        miq miqVar = this.b;
        synchronized (miqVar.h) {
            oxd oxdVar = miqVar.p;
            oxdVar.getClass();
            oyn oynVar = oxdVar.a;
            oynVar.getClass();
            oynVar.j(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mkv mkvVar;
        miq miqVar = this.b;
        synchronized (miqVar.h) {
            oxd oxdVar = miqVar.p;
            oxdVar.getClass();
            oyn oynVar = oxdVar.a;
            oynVar.getClass();
            gzi gziVar = haw.a;
            oynVar.i(bufferInfo.presentationTimeUs);
            oynVar.m(i, bufferInfo);
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0 && (mkvVar = miqVar.n) != null) {
                mkvVar.a(miqVar.e.incrementAndGet(), this.a.e);
            }
            if (miqVar.m != null) {
                AtomicLong atomicLong = miqVar.e;
                if (atomicLong.get() >= 2) {
                    ((sgt) miq.a.c().M(4805)).u("At least %d frames are encoded. ", atomicLong.get());
                    szh szhVar = miqVar.m;
                    szhVar.getClass();
                    szhVar.e(null);
                    miqVar.m = null;
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        miq miqVar = this.b;
        synchronized (miqVar.h) {
            oxd oxdVar = miqVar.p;
            oxdVar.getClass();
            oyn oynVar = oxdVar.a;
            oynVar.getClass();
            oynVar.k(mediaCodec.getOutputFormat());
        }
    }
}
