package defpackage;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jor implements jpa {
    private static final sgv b = sgv.g("jor");
    private static final float[] c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private final MediaFormat d;
    private qin g;
    private qlm h;
    private qth i;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(16);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final SparseArray f = new SparseArray();

    public jor(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        this.d = mediaFormat2;
        mediaFormat2.setInteger("color-format", 2135033992);
    }

    private final void h(long j, HardwareBuffer hardwareBuffer, MediaCodec.QueueRequest queueRequest) {
        long jConvert = TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS);
        queueRequest.setHardwareBuffer(hardwareBuffer);
        queueRequest.setPresentationTimeUs(jConvert);
        if (this.e.compareAndSet(true, false)) {
            queueRequest.setFlags(1);
            queueRequest.setIntegerParameter("request-sync", 0);
        }
    }

    @Override // defpackage.jpa
    public final int a() {
        return 35;
    }

    @Override // defpackage.jpa
    public final synchronized syu b() {
        SparseArray sparseArray;
        qlm qlmVar;
        int i = 0;
        while (true) {
            sparseArray = this.f;
            if (i >= sparseArray.size()) {
                break;
            }
            ((qky) sparseArray.valueAt(i)).close();
            i++;
        }
        sparseArray.clear();
        qlmVar = this.h;
        return qlmVar != null ? qlmVar.a() : syq.a;
    }

    @Override // defpackage.jpa
    public final synchronized void c(qfc qfcVar, qin qinVar, qlr qlrVar, Handler handler) {
        this.g = qinVar;
        qlm qlmVar = new qlm(new jpf(qfcVar));
        this.h = qlmVar;
        qln qlnVarC = qlmVar.c(this.d);
        qlnVarC.c = handler;
        qlnVarC.f = true;
        qlnVarC.a(new jpo(this, qlrVar, 1));
        this.i = qlnVarC.b();
        qlm qlmVar2 = this.h;
        if (qlmVar2 != null) {
            qlmVar2.b();
        } else {
            ((sgt) b.b().M(2978)).s("Direct Motion Encoder is null.");
        }
    }

    @Override // defpackage.jpa
    public final synchronized boolean d() {
        return this.i != null;
    }

    @Override // defpackage.jpa
    public final float[] e() {
        return c;
    }

    @Override // defpackage.jpa
    public final void f(poj pojVar) {
        try {
            HardwareBuffer hardwareBufferF = pojVar.f();
            try {
                qlj qljVar = (qlj) this.a.poll(5000L, TimeUnit.MILLISECONDS);
                if (qljVar == null || hardwareBufferF == null) {
                    if (qljVar != null) {
                        qljVar.close();
                    }
                    if (hardwareBufferF == null) {
                        return;
                    }
                } else {
                    try {
                        h(pojVar.d(), hardwareBufferF, (MediaCodec.QueueRequest) qljVar.b());
                        qljVar.close();
                    } finally {
                    }
                }
                hardwareBufferF.close();
            } finally {
            }
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.jpa
    public final synchronized void g(poj pojVar, joz jozVar) {
        qlj qljVar;
        qin qinVar = this.g;
        qinVar.getClass();
        HardwareBuffer hardwareBufferF = pojVar.f();
        if (hardwareBufferF == null) {
            return;
        }
        try {
            EGLImage eGLImage = new EGLImage(hardwareBufferF);
            try {
                try {
                    qljVar = (qlj) this.a.poll(5000L, TimeUnit.MILLISECONDS);
                } finally {
                }
            } catch (InterruptedException unused) {
                qljVar = null;
            }
            try {
                qjn qjnVarB = qjn.b(qinVar, eGLImage);
                if (qljVar != null) {
                    try {
                        int iA = qljVar.a();
                        int iC = pojVar.c();
                        int iB = pojVar.b();
                        SparseArray sparseArray = this.f;
                        qky qkyVar = (qky) sparseArray.get(iA);
                        qin qinVar2 = this.g;
                        qinVar2.getClass();
                        if (qkyVar == null) {
                            HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(iC, iB, 35, 1, 66048L);
                            EGLImage eGLImage2 = new EGLImage(hardwareBufferCreate);
                            qky qkyVar2 = new qky(qim.b(qinVar2, eGLImage2), eGLImage2, hardwareBufferCreate);
                            sparseArray.put(iA, qkyVar2);
                            qkyVar = qkyVar2;
                        }
                        jozVar.a(qjnVarB, qkyVar.a);
                        qpt.D(qjnVarB.b);
                        h(pojVar.d(), qkyVar.b, (MediaCodec.QueueRequest) qljVar.b());
                        qjnVarB.close();
                        qljVar.close();
                    } finally {
                    }
                } else {
                    qjnVarB.close();
                }
                eGLImage.close();
                hardwareBufferF.close();
            } finally {
            }
        } finally {
        }
    }
}
