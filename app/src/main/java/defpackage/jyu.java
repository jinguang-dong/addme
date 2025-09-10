package defpackage;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.libraries.oliveoil.gl.EGLImage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jyu implements jyw {
    private static final sgv b = sgv.g("jyu");
    public final qim a;
    private final MediaCodec c;
    private final qin d;
    private final qkp e;
    private final Surface f;
    private boolean g = false;

    public jyu(MediaCodec mediaCodec, MediaFormat mediaFormat, qin qinVar, qkp qkpVar) {
        if (pnq.b().a) {
            ((sgt) b.c().M(3172)).s("Using GL-based image encoder on emulator can cause individual frames to fail to encode. Consider using a retryingEncoder wrapper.");
        }
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        mediaFormat2.setInteger("latency", 1);
        mediaCodec.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
        Surface surfaceCreateInputSurface = mediaCodec.createInputSurface();
        this.f = surfaceCreateInputSurface;
        qim qimVarC = qim.c(qinVar, new qmq(surfaceCreateInputSurface), new qfq(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
        try {
            mediaCodec.start();
            this.d = qinVar;
            this.c = mediaCodec;
            this.a = qimVarC;
            this.e = qkpVar;
        } catch (RuntimeException e) {
            this.f.release();
            throw e;
        }
    }

    @Override // defpackage.jyw
    public final synchronized jyv a(poj pojVar, ejt ejtVar) {
        jza jzaVar;
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.c.setParameters(bundle);
        HardwareBuffer hardwareBufferF = pojVar.f();
        final long j = ((jzd) pojVar).a;
        Object obj = ejtVar.a;
        try {
            if (hardwareBufferF == null) {
                ((sgt) b.c().M(3176)).s("Incoming image missing HardwareBuffer.");
            } else {
                EGLImage eGLImage = new EGLImage(hardwareBufferF);
                try {
                    qin qinVar = this.d;
                    qjn qjnVarB = qjn.b(qinVar, eGLImage);
                    try {
                        qinVar.execute(new Runnable() { // from class: jyt
                            @Override // java.lang.Runnable
                            public final void run() {
                                qjy qjyVar = (qjy) this.a.a.h();
                                EGLExt.eglPresentationTimeANDROID(qjyVar.f(), qjyVar.g(), j);
                            }
                        });
                        this.e.b(qjnVarB, this.a, (float[]) obj);
                        qpt.C(qinVar);
                        qjnVarB.close();
                        eGLImage.close();
                        hardwareBufferF.close();
                    } finally {
                    }
                } finally {
                }
            }
            this.g = true;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                MediaCodec mediaCodec = this.c;
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000000L);
                if (iDequeueOutputBuffer >= 0) {
                    if ((bufferInfo.flags & 2) != 0) {
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } else {
                        jzaVar = new jza(bufferInfo, mediaCodec, iDequeueOutputBuffer);
                        if ((1 & jzaVar.a.flags) == 0) {
                            jzaVar.close();
                            throw new IllegalStateException("Requested key-frame from codec, but codec did not provide it!");
                        }
                    }
                } else {
                    if (iDequeueOutputBuffer == -1) {
                        throw new IllegalStateException("Timed out waiting for encoder output!");
                    }
                    if (iDequeueOutputBuffer != -2) {
                        continue;
                    } else {
                        int integer = mediaCodec.getOutputFormat().getInteger("latency", -42);
                        if (integer > 0) {
                            if (integer != 1) {
                                throw new IllegalStateException(a.bE(integer, "Media codec does not support low latency mode, and hence cannot be used for frame-by-frame encoding. Codec returned a latency of ", ". Please choose a different codec!"));
                            }
                        } else if (integer == -42) {
                            ((sgt) b.c().M(3173)).s("Media codec does not specify latency, and may ignore latency key. This could cause ad-hoc encoding to fail.");
                        }
                    }
                }
            }
        } finally {
        }
        return jzaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        ((defpackage.sgt) defpackage.jyu.b.b().M(3174)).s("Timed out waiting for encoder to close!");
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void close() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.g     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L45
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            android.media.MediaCodec r1 = r4.c     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            r1.signalEndOfInputStream()     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
        Lf:
            r2 = 5000000(0x4c4b40, double:2.470328E-317)
            int r2 = r1.dequeueOutputBuffer(r0, r2)     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            int r3 = r0.flags     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            r3 = r3 & 4
            if (r3 == 0) goto L1d
            goto L42
        L1d:
            r3 = -1
            if (r2 != r3) goto Lf
            sgv r0 = defpackage.jyu.b     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            shi r0 = r0.b()     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            r1 = 3174(0xc66, float:4.448E-42)
            shi r0 = r0.M(r1)     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            java.lang.String r1 = "Timed out waiting for encoder to close!"
            r0.s(r1)     // Catch: java.lang.IllegalStateException -> L34 java.lang.Throwable -> L5b
            goto L42
        L34:
            r0 = move-exception
            sgv r1 = defpackage.jyu.b     // Catch: java.lang.Throwable -> L5b
            shi r1 = r1.b()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "Error signaling end of input stream to encoder. Encoder is already closed."
            r3 = 3175(0xc67, float:4.449E-42)
            defpackage.mn.c(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L5b
        L42:
            r0 = 0
            r4.g = r0     // Catch: java.lang.Throwable -> L5b
        L45:
            qim r0 = r4.a     // Catch: java.lang.Throwable -> L5b
            r0.close()     // Catch: java.lang.Throwable -> L5b
            qkp r0 = r4.e     // Catch: java.lang.Throwable -> L5b
            r0.close()     // Catch: java.lang.Throwable -> L5b
            android.media.MediaCodec r0 = r4.c     // Catch: java.lang.Throwable -> L5b
            r0.release()     // Catch: java.lang.Throwable -> L5b
            android.view.Surface r0 = r4.f     // Catch: java.lang.Throwable -> L5b
            r0.release()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r4)
            return
        L5b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyu.close():void");
    }
}
