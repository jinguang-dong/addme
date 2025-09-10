package defpackage;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Surface;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kas {
    public final MediaCodec c;
    public final Handler d;
    public final pbc e;
    public final Handler i;
    public Runnable j;
    final /* synthetic */ kat k;
    private Surface l;
    private qlv m;
    private qim p;
    private qkp q;
    private long s;
    private final float[] t;
    private final float[] u;
    private final float[] v;
    private final float[] w;
    private final pao x;
    private final boolean y;
    private final HandlerThread z;
    public final Deque a = new ArrayDeque();
    public final Deque b = new ArrayDeque();
    public final Deque f = new ArrayDeque();
    public boolean g = false;
    private boolean n = false;
    private boolean o = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    private final Set r = new HashSet();
    private Optional A = Optional.empty();

    public kas(kat katVar, MediaCodec mediaCodec, Handler handler, pao paoVar, boolean z) {
        this.k = katVar;
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.t = fArr;
        float[] fArr2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.u = fArr2;
        float[] fArr3 = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.v = fArr3;
        this.c = mediaCodec;
        this.d = handler;
        this.y = z;
        pbg pbgVar = new pbg(katVar.f, "codec " + katVar.b.getAndIncrement() + " ");
        this.e = pbgVar;
        this.x = paoVar;
        if (z) {
            this.w = lpa.p(paoVar) ? fArr2 : fArr3;
        } else {
            this.w = fArr;
        }
        HandlerThread handlerThread = new HandlerThread("codec " + katVar.b.get() + "-hb");
        this.z = handlerThread;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        pbgVar.b("created");
    }

    private final synchronized void e() {
        while (true) {
            Deque deque = this.f;
            if (!deque.isEmpty()) {
                poj pojVar = (poj) deque.removeFirst();
                this.e.b("Closing image at " + pojVar.d() + " after codec error");
                pojVar.close();
            }
        }
    }

    private final synchronized void f() {
        rnt.L(!this.o);
        qim qimVar = this.p;
        while (!this.n) {
            Deque deque = this.f;
            if (deque.isEmpty() || qimVar == null || this.m == null) {
                break;
            }
            poj pojVar = (poj) deque.removeFirst();
            j(pojVar);
            this.e.b("Sending image to encoder: " + pojVar.d());
            this.s = pojVar.d();
            pojVar.close();
            m();
        }
        if (this.n || !this.f.isEmpty() || !this.g || qimVar == null) {
            return;
        }
        if (this.k.h) {
            this.e.b("Wait Until CodecStarts and Send Hardware EOS");
            d(this.s);
        } else {
            this.e.b("Send Hardware EOS");
            k();
        }
        this.n = true;
        this.e.b(uCzt.TkamZeVPhEQaj);
    }

    private final synchronized void h() {
        if (this.o) {
            e();
        } else if (this.k.g) {
            f();
        } else {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[Catch: all -> 0x019c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:10:0x0028, B:13:0x003f, B:17:0x0045, B:21:0x004b, B:23:0x0053, B:25:0x006c, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:33:0x00bd, B:34:0x00e9, B:35:0x00ee, B:37:0x00f9, B:44:0x0109, B:45:0x010e, B:47:0x0119, B:48:0x0123, B:50:0x0127, B:51:0x0131, B:53:0x013f, B:54:0x015c, B:56:0x0185, B:57:0x018a, B:59:0x0190), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127 A[Catch: all -> 0x019c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:10:0x0028, B:13:0x003f, B:17:0x0045, B:21:0x004b, B:23:0x0053, B:25:0x006c, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:33:0x00bd, B:34:0x00e9, B:35:0x00ee, B:37:0x00f9, B:44:0x0109, B:45:0x010e, B:47:0x0119, B:48:0x0123, B:50:0x0127, B:51:0x0131, B:53:0x013f, B:54:0x015c, B:56:0x0185, B:57:0x018a, B:59:0x0190), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f A[Catch: all -> 0x019c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:10:0x0028, B:13:0x003f, B:17:0x0045, B:21:0x004b, B:23:0x0053, B:25:0x006c, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:33:0x00bd, B:34:0x00e9, B:35:0x00ee, B:37:0x00f9, B:44:0x0109, B:45:0x010e, B:47:0x0119, B:48:0x0123, B:50:0x0127, B:51:0x0131, B:53:0x013f, B:54:0x015c, B:56:0x0185, B:57:0x018a, B:59:0x0190), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185 A[Catch: all -> 0x019c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:10:0x0028, B:13:0x003f, B:17:0x0045, B:21:0x004b, B:23:0x0053, B:25:0x006c, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:33:0x00bd, B:34:0x00e9, B:35:0x00ee, B:37:0x00f9, B:44:0x0109, B:45:0x010e, B:47:0x0119, B:48:0x0123, B:50:0x0127, B:51:0x0131, B:53:0x013f, B:54:0x015c, B:56:0x0185, B:57:0x018a, B:59:0x0190), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190 A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:10:0x0028, B:13:0x003f, B:17:0x0045, B:21:0x004b, B:23:0x0053, B:25:0x006c, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:33:0x00bd, B:34:0x00e9, B:35:0x00ee, B:37:0x00f9, B:44:0x0109, B:45:0x010e, B:47:0x0119, B:48:0x0123, B:50:0x0127, B:51:0x0131, B:53:0x013f, B:54:0x015c, B:56:0x0185, B:57:0x018a, B:59:0x0190), top: B:67:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void i() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kas.i():void");
    }

    private final synchronized void j(poj pojVar) {
        qim qimVar = this.p;
        if (qimVar == null) {
            return;
        }
        long jD = pojVar.d();
        HardwareBuffer hardwareBufferF = pojVar.f();
        try {
            if (hardwareBufferF == null) {
                this.e.h("Attempting to encode image with no hardware buffer content. Skipping.");
                return;
            }
            EGLImage eGLImage = new EGLImage(hardwareBufferF);
            try {
                qin qinVar = this.k.j;
                qjn qjnVarB = qjn.b(qinVar, eGLImage);
                try {
                    qimVar.g(new itd(3), new kap(jD, 2));
                    qkp qkpVar = this.q;
                    if (qkpVar != null) {
                        qkpVar.b(qjnVarB, qimVar, this.w);
                    }
                    qpt.C(qinVar);
                    qjnVarB.close();
                    eGLImage.close();
                    hardwareBufferF.close();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final synchronized void k() {
        this.k.j.execute(new jxr(this, 13));
    }

    private final void l() {
        this.e.b("Stop Heart Beat Update.");
        this.i.removeCallbacks(this.j);
        this.A = Optional.empty();
        this.z.quitSafely();
    }

    private final void m() {
        this.A = Optional.of(Long.valueOf(Instant.now().plus(kat.a).toEpochMilli()));
    }

    public final synchronized jzf a(qfc qfcVar) {
        rnt.M(this.m == null, "Trying to add track twice");
        kaq kaqVar = new kaq(this, qfcVar);
        Handler handler = this.d;
        MediaCodec mediaCodec = this.c;
        mediaCodec.setCallback(kaqVar, handler);
        kat katVar = this.k;
        if (katVar.g) {
            MediaFormat mediaFormat = katVar.d;
            mediaFormat.setInteger("color-format", 2130708361);
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.l = mediaCodec.createInputSurface();
            qin qinVar = katVar.j;
            this.p = qim.c(qinVar, new qmq(this.l), new qfq(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
            this.q = new qkp(qinVar);
        } else {
            mediaCodec.configure(katVar.d, (Surface) null, (MediaCrypto) null, 1);
        }
        this.m = qfcVar;
        mediaCodec.start();
        jxr jxrVar = new jxr(this, 14);
        this.j = jxrVar;
        this.i.post(jxrVar);
        return new kar(this);
    }

    public final void b(Exception exc) {
        this.e.e("Error while encoding track", exc);
        synchronized (this) {
            qlv qlvVar = this.m;
            if (qlvVar != null) {
                qlvVar.close();
                this.m = null;
                this.o = true;
            }
        }
        e();
        this.c.release();
        AtomicInteger atomicInteger = this.k.c;
        atomicInteger.decrementAndGet();
        l();
        this.e.b("Released codec due to error; current active count: " + atomicInteger.get());
    }

    public final synchronized void c(String str) {
        this.e.b(a.bw(str, "update (", ")"));
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        try {
            h();
            i();
        } catch (IllegalStateException e) {
            b(e);
        }
        long jCurrentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis;
        this.e.b("update (" + str + ") takes: " + jCurrentThreadTimeMillis2 + " ms");
    }

    public final synchronized void d(long j) {
        qim qimVar = this.p;
        if (qimVar == null) {
            return;
        }
        if (this.h.get()) {
            k();
            return;
        }
        qimVar.g(new itd(2), new kap(j, 0));
        qpt.C(this.k.j);
        this.d.postDelayed(new hcv(this, j, 7), 10L);
    }

    private final synchronized void g() {
        rnt.L(!this.o);
        while (!this.n) {
            Deque deque = this.a;
            if (deque.isEmpty()) {
                break;
            }
            Deque deque2 = this.f;
            if (deque2.isEmpty() || this.m == null) {
                break;
            }
            int iIntValue = ((Integer) deque.removeFirst()).intValue();
            poj pojVar = (poj) deque2.removeFirst();
            MediaCodec mediaCodec = this.c;
            Image inputImage = mediaCodec.getInputImage(iIntValue);
            long jConvert = TimeUnit.MICROSECONDS.convert(pojVar.d(), TimeUnit.NANOSECONDS);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            pjc pjcVar = new pjc(inputImage);
            kat katVar = this.k;
            pao paoVar = this.x;
            if (!this.y) {
                katVar.e.a(pojVar, pjcVar);
            } else if (pojVar.c() == pjcVar.b && pojVar.b() == pjcVar.c) {
                pojVar.getClass();
                a.I(pojVar.a() == 35);
                System.currentTimeMillis();
                FrameUtilNative.mirrorYUV420888(((poi) pojVar.g().get(0)).getBuffer(), ((poi) pojVar.g().get(0)).getRowStride(), ((poi) pojVar.g().get(1)).getBuffer(), ((poi) pojVar.g().get(1)).getRowStride(), ((poi) pojVar.g().get(2)).getBuffer(), ((poi) pojVar.g().get(2)).getRowStride(), ((poi) pjcVar.k().get(0)).getBuffer(), ((poi) pjcVar.k().get(0)).getRowStride(), ((poi) pjcVar.k().get(1)).getBuffer(), ((poi) pjcVar.k().get(1)).getRowStride(), ((poi) pjcVar.k().get(2)).getBuffer(), ((poi) pjcVar.k().get(2)).getRowStride(), pojVar.c(), pojVar.b(), lpa.p(paoVar));
                System.currentTimeMillis();
            } else {
                katVar.e.a(pojVar, pjcVar);
                ocq.aq(pjcVar, paoVar);
            }
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            pbc pbcVar = this.e;
            pbcVar.b(MyBPCgKwEjJI.PCnNkwhioR + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos2, TimeUnit.NANOSECONDS) + "ms");
            pojVar.close();
            pbcVar.b(nWEkBGOQPWQp.QnvXVZjpqdqjB + pojVar.d());
            mediaCodec.queueInputBuffer(iIntValue, 0, katVar.i, jConvert, 0);
            m();
        }
        Deque deque3 = this.a;
        if (deque3.isEmpty() || !this.f.isEmpty() || !this.g || this.n) {
            return;
        }
        this.c.queueInputBuffer(((Integer) deque3.removeFirst()).intValue(), 0, 0, 0L, 4);
        this.e.b("Sending EOS (Software)");
        this.n = true;
    }
}
