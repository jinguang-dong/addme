package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.ar.core.ImageMetadata;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qei implements pop {
    public static final sgv a = sgv.g("qei");
    private static final sbp g = sbp.r(1024, 10240, 102400, Integer.valueOf(ImageMetadata.SHADING_MODE), 5242880, 10485760, 20971520);
    public final pop b;
    private final Executor h;
    private final Runnable i;
    private final boolean j;
    private final boolean k;
    private final pmc l;
    public final Object c = new Object();
    public Throwable d = null;
    public final Object e = new Object();
    public final HashMap f = new HashMap();
    private int m = 0;

    public qei(pop popVar, ExecutorService executorService, boolean z) {
        this.b = popVar;
        this.h = new qeh(this, new szg(executorService));
        executorService.getClass();
        this.i = new oze(executorService, 10);
        this.j = true;
        this.k = z;
        this.l = z ? new pmc(100) : null;
    }

    private final void j() {
        synchronized (this.c) {
            Throwable th = this.d;
            this.d = null;
            if (th != null) {
                throw new qen(th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    private final void m() {
        final szh szhVar = new szh();
        this.h.execute(new Runnable() { // from class: qee
            @Override // java.lang.Runnable
            public final void run() {
                sgv sgvVar = qei.a;
                szhVar.e(new Object());
            }
        });
        try {
            szhVar.t(60L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5674)).s("Waiting for muxer interrupted / timed out");
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.pop
    public final int a(MediaFormat mediaFormat) {
        int i;
        synchronized (this.e) {
            i = this.m;
            this.m = i + 1;
            this.f.put(Integer.valueOf(i), Integer.valueOf(this.b.a(mediaFormat)));
        }
        return i;
    }

    @Override // defpackage.pop
    public final void b(String str, Object obj) {
        this.h.execute(new qej(this, str, obj, 1));
        j();
    }

    @Override // defpackage.pop
    public final void c() {
        this.h.execute(new oze(this.b, 8));
        m();
        if (this.j) {
            this.i.run();
        }
        j();
    }

    @Override // defpackage.pop
    public final void d(final float f, final float f2) {
        this.h.execute(new Runnable() { // from class: qeg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d(f, f2);
            }
        });
        j();
    }

    @Override // defpackage.pop
    public final void e(int i) {
        this.h.execute(new mzp(this, i, 6));
        j();
    }

    @Override // defpackage.pop
    public final synchronized void f(final long j, final long j2) throws Throwable {
        try {
            try {
                this.h.execute(new Runnable() { // from class: qef
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b.f(j, j2);
                    }
                });
                j();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.pop
    public final void g() {
        this.h.execute(new ndk(17));
        j();
    }

    @Override // defpackage.pop
    public final void h() {
        this.h.execute(new oze(this.b, 9));
        m();
        j();
    }

    @Override // defpackage.pop
    public final boolean k() {
        return true;
    }

    @Override // defpackage.pop
    public final boolean l() {
        return true;
    }

    @Override // defpackage.pop
    public final void i(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBufferAllocateDirect;
        j();
        pmk pmkVarC = null;
        if (this.k) {
            int i2 = bufferInfo.size;
            sbp sbpVar = g;
            int i3 = ((sex) sbpVar).c;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    int iIntValue = ((Integer) sbpVar.get(i4)).intValue();
                    i4++;
                    if (i2 <= iIntValue) {
                        i2 = iIntValue;
                        break;
                    }
                } else {
                    ((sgt) a.c().M(5673)).t(PNlJufQ.qEmcdmsKVlsmJ, i2);
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (sbpVar.contains(numValueOf)) {
                pmkVarC = this.l.c(numValueOf);
                byteBufferAllocateDirect = (ByteBuffer) pmkVarC.a();
            } else {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
            }
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        }
        pmk pmkVar = pmkVarC;
        ByteBuffer byteBuffer2 = byteBufferAllocateDirect;
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.h.execute(new hts(this, i, byteBuffer2, bufferInfo2, pmkVar, 4));
    }
}
