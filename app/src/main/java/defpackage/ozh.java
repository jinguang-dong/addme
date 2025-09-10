package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozh implements paq {
    private final oyw B;
    private MediaCodec.Callback C;
    private long D;
    public final String a;
    public final MediaCodec c;
    public final Surface d;
    public final oyx e;
    public final int f;
    public final Range g;
    public final HandlerThread i;
    public final boolean j;
    public int l;
    private final boolean n;
    private final oyj o;
    private final pbn p;
    private final double q;
    private final owq r;
    private final owq s;
    private final Handler t;
    private final boolean u;
    private boolean v;
    private final oxp w;
    private final oyt x;
    public final Object b = new Object();
    private final Object m = new Object();
    public final szh h = new szh();
    private final ArrayDeque y = new ArrayDeque();
    private final ArrayDeque z = new ArrayDeque();
    private final ArrayDeque A = new ArrayDeque();
    private volatile long E = Long.MAX_VALUE;
    private final AtomicLong F = new AtomicLong(0);
    private final AtomicLong G = new AtomicLong(0);
    private final AtomicLong H = new AtomicLong(0);
    private final AtomicLong I = new AtomicLong(0);
    private volatile boolean J = false;
    private volatile boolean K = false;
    private volatile boolean L = false;
    public volatile boolean k = false;
    private final AtomicBoolean M = new AtomicBoolean(false);

    public ozh(oxp oxpVar, oyc oycVar, int i, int i2, int i3, oyj oyjVar, rwc rwcVar, rwc rwcVar2, oyx oyxVar, pbn pbnVar, owq owqVar, owq owqVar2, boolean z, oyt oytVar, rwc rwcVar3) throws oxr {
        this.C = new ozf(this);
        String strConcat = "VideoEncoder".concat((String) rwcVar3.e(""));
        this.a = strConcat;
        this.w = oxpVar;
        this.e = oyxVar;
        this.r = owqVar;
        this.s = owqVar2;
        this.x = oytVar;
        this.u = z;
        this.q = oxpVar.a() / oxpVar.c();
        this.B = new oyw();
        oxt oxtVarB = oxt.b(oxpVar.e);
        String str = oxtVarB.f;
        oxj oxjVar = oxpVar.b;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, oxjVar.c().a, oxjVar.c().b);
        mediaFormatCreateVideoFormat.setInteger("color-format", oycVar.d);
        mediaFormatCreateVideoFormat.setInteger("bitrate", oxpVar.b());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", oxpVar.c());
        mediaFormatCreateVideoFormat.setInteger("capture-rate", oxpVar.a());
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", oxpVar.h);
        mediaFormatCreateVideoFormat.setInteger("color-standard", i);
        mediaFormatCreateVideoFormat.setInteger("color-range", i2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        mediaFormatCreateVideoFormat.setInteger("create-input-buffers-suspended", 1);
        int i4 = oxpVar.f;
        if (i4 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i4);
        }
        int i5 = oxpVar.g;
        if (i5 != -1) {
            mediaFormatCreateVideoFormat.setInteger("level", i5);
        }
        oxh oxhVar = oxpVar.d;
        if (oxhVar.g()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", oxhVar.k);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        rwc rwcVar4 = oxpVar.i;
        if (rwcVar4.h()) {
            ((Integer) rwcVar4.c()).intValue();
            mediaFormatCreateVideoFormat.setInteger("video-qp-max", 22);
        }
        rwc rwcVar5 = oxpVar.j;
        if (rwcVar5.h()) {
            ((Integer) rwcVar5.c()).intValue();
            mediaFormatCreateVideoFormat.setInteger("video-qp-min", 0);
        }
        String.valueOf(mediaFormatCreateVideoFormat);
        pbnVar.f(cdVQ.Rkd);
        MediaCodec mediaCodecQ = nwj.q(oxtVarB);
        this.c = mediaCodecQ;
        mediaCodecQ.getClass();
        HandlerThread handlerThread = new HandlerThread(strConcat);
        this.i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.t = handler;
        if (rwcVar2.h()) {
            this.C = (MediaCodec.Callback) rwcVar2.c();
            this.j = true;
        } else {
            this.j = false;
        }
        mediaCodecQ.setCallback(this.C, handler);
        mediaCodecQ.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, z ? 3 : 1);
        this.n = rwcVar.h();
        if (rwcVar.h()) {
            Surface surface = (Surface) rwcVar.c();
            this.d = surface;
            mediaCodecQ.setInputSurface(surface);
        } else if (oycVar != oyc.SURFACE || z) {
            this.d = null;
        } else {
            this.d = mediaCodecQ.createInputSurface();
        }
        if (z) {
            rnt.M(this.d == null, "Surface can't be used in block model.");
        }
        this.o = oyjVar;
        this.p = pbnVar;
        this.f = oxpVar.b();
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecQ.getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities();
        Range<Integer> bitrateRange = videoCapabilities != null ? videoCapabilities.getBitrateRange() : null;
        bitrateRange.getClass();
        this.g = bitrateRange;
        pbnVar.g();
        this.l = 1;
    }

    private final long l(long j) {
        return (long) (j / this.q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.m
            monitor-enter(r0)
        L3:
            java.util.ArrayDeque r1 = r8.y     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L69
            java.util.ArrayDeque r2 = r8.z     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r3 != 0) goto L69
            boolean r3 = r8.v     // Catch: java.lang.Throwable -> L6b
            if (r3 != 0) goto L69
            java.lang.Object r3 = r8.b     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L6b
            int r4 = r8.l     // Catch: java.lang.Throwable -> L66
            r5 = 6
            if (r4 == r5) goto L63
            r5 = 5
            if (r4 != r5) goto L23
            goto L63
        L23:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L66
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> L66
            ozg r2 = (defpackage.ozg) r2     // Catch: java.lang.Throwable -> L66
            android.hardware.HardwareBuffer r4 = r2.a     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L5c
            int r5 = r2.c     // Catch: java.lang.Throwable -> L66
            boolean r6 = r8.J     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L3f
            r5 = r5 | 4
        L3f:
            r6 = r5 & 4
            if (r6 == 0) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            r8.v = r6     // Catch: java.lang.Throwable -> L66
            android.media.MediaCodec r6 = r8.c     // Catch: java.lang.Throwable -> L66
            android.media.MediaCodec$QueueRequest r1 = r6.getQueueRequest(r1)     // Catch: java.lang.Throwable -> L66
            r1.setHardwareBuffer(r4)     // Catch: java.lang.Throwable -> L66
            long r6 = r2.b     // Catch: java.lang.Throwable -> L66
            r1.setPresentationTimeUs(r6)     // Catch: java.lang.Throwable -> L66
            r1.setFlags(r5)     // Catch: java.lang.Throwable -> L66
            r1.queue()     // Catch: java.lang.Throwable -> L66
        L5c:
            java.util.ArrayDeque r1 = r8.A     // Catch: java.lang.Throwable -> L66
            r1.addLast(r2)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            goto L3
        L63:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L66:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            throw r8     // Catch: java.lang.Throwable -> L6b
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozh.m():void");
    }

    private final void n() {
        this.t.post(new oze(this, 2));
        try {
            this.i.join();
        } catch (InterruptedException unused) {
        }
    }

    public final rwc a() {
        AtomicLong atomicLong = this.G;
        long j = atomicLong.get();
        AtomicLong atomicLong2 = this.I;
        if (j > atomicLong2.get()) {
            return rwc.j(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l(atomicLong.get() - atomicLong2.get()))));
        }
        Log.w(this.a, String.format("Invalid recording time, start: %d, end: %d", Long.valueOf(atomicLong2.get()), Long.valueOf(atomicLong.get())));
        return rvk.a;
    }

    public final void b(long j) {
        synchronized (this.m) {
            while (true) {
                ArrayDeque arrayDeque = this.A;
                if (arrayDeque.isEmpty() || ((ozg) arrayDeque.peekFirst()).b > j) {
                    break;
                } else {
                    ((ozg) arrayDeque.removeFirst()).a();
                }
            }
        }
    }

    public final void c(poj pojVar, long j, boolean z) {
        synchronized (this.b) {
            if (this.l == 6) {
                return;
            }
            synchronized (this.m) {
                oyw oywVar = this.B;
                if (oywVar.d(j)) {
                    pojVar.close();
                } else {
                    this.z.addLast(new ozg(pojVar, oywVar.a(j), true != z ? 0 : 4));
                    m();
                }
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() throws TimeoutException {
        i(SystemClock.uptimeMillis() * 1000);
        synchronized (this.b) {
            if (this.l != 6) {
                this.l = 6;
                synchronized (this.m) {
                    while (true) {
                        ArrayDeque arrayDeque = this.z;
                        if (arrayDeque.isEmpty()) {
                            break;
                        } else {
                            ((ozg) arrayDeque.removeFirst()).a();
                        }
                    }
                }
                b(Long.MAX_VALUE);
                this.c.release();
                if (this.i.isAlive()) {
                    n();
                }
                Surface surface = this.d;
                if (surface != null && !this.n) {
                    surface.release();
                }
                SystemClock.uptimeMillis();
            }
        }
    }

    public final void d(int i) {
        if (this.u) {
            synchronized (this.m) {
                this.y.add(Integer.valueOf(i));
            }
            m();
        }
    }

    public final void e(MediaFormat mediaFormat) {
        mediaFormat.setInteger("time-lapse-enable", 1);
        mediaFormat.setInteger("time-lapse-fps", this.w.a());
        String.valueOf(mediaFormat);
        if (this.M.getAndSet(true)) {
            throw new IllegalStateException("format changed twice");
        }
        oyj oyjVar = this.o;
        oyjVar.f(mediaFormat);
        oyjVar.l();
    }

    public final void f(long j) {
        synchronized (this.b) {
            if (this.l != 2) {
                Log.e(this.a, "VideoEncoder is not recording now");
                return;
            }
            String.format("Paused recording at %d ", Long.valueOf(j));
            this.B.c(j);
            if (this.d != null && !this.j) {
                Bundle bundle = new Bundle();
                bundle.putInt("drop-input-frames", 1);
                bundle.putLong("drop-start-time-us", j);
                this.c.setParameters(bundle);
            }
            this.l = 3;
        }
    }

    public final void g(long j) {
        synchronized (this.b) {
            if (this.l != 3) {
                Log.e(this.a, "It is not recording now");
                return;
            }
            String.format("Resumed recording at %d", Long.valueOf(j));
            oyw oywVar = this.B;
            oywVar.b(j);
            if (this.d != null && !this.j) {
                Bundle bundle = new Bundle();
                bundle.putInt("drop-input-frames", 0);
                bundle.putLong("drop-start-time-us", j);
                bundle.putLong("time-offset-us", -oywVar.a);
                this.c.setParameters(bundle);
            }
            this.l = 2;
        }
    }

    public final void h() {
        synchronized (this.b) {
            int i = this.l;
            if (i != 1 && i != 3) {
                Log.e(this.a, "illegal state as " + prh.R(i));
                return;
            }
            if (this.k) {
                close();
                this.e.a(oyu.MEDIA_CODEC_ERROR_VIDEO);
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            MediaCodec mediaCodec = this.c;
            mediaCodec.start();
            Bundle bundle = new Bundle();
            bundle.putInt("drop-input-frames", 0);
            bundle.putLong("drop-start-time-us", jUptimeMillis);
            mediaCodec.setParameters(bundle);
            this.l = 2;
        }
    }

    public final void i(long j) throws TimeoutException {
        boolean z;
        Object obj = this.b;
        synchronized (obj) {
            int i = this.l;
            if (i == 2) {
                z = false;
            } else {
                if (i != 3) {
                    return;
                }
                this.B.b(j);
                z = true;
            }
            this.l = 4;
            this.E = (long) ((j - this.B.a) * this.q);
            pbn pbnVar = this.p;
            pbnVar.f(String.valueOf(this.a).concat("#stop"));
            Surface surface = this.d;
            if (surface != null) {
                if (z && !this.J) {
                    this.c.signalEndOfInputStream();
                }
                if (!surface.isValid()) {
                    this.h.e(null);
                }
            } else if (!this.u) {
                synchronized (obj) {
                    int i2 = this.l;
                    if (i2 != 3 && i2 != 2) {
                        throw new IllegalStateException("encoding is not yet started.");
                    }
                    MediaCodec mediaCodec = this.c;
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        mediaCodec.getInputBuffer(iDequeueInputBuffer).clear();
                        mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
                    }
                }
            }
            if (!this.j) {
                this.x.a(2, this.E, this.G, this.h);
            }
            this.F.get();
            this.t.post(new oze(this, 0));
            n();
            pbnVar.g();
        }
    }

    public final void j() throws TimeoutException {
        this.J = true;
        synchronized (this.b) {
            int i = this.l;
            if ((i == 2 || i == 3) && this.K && this.d != null) {
                this.c.signalEndOfInputStream();
            }
        }
        i(SystemClock.uptimeMillis() * 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x0143, TryCatch #1 {, blocks: (B:4:0x0009, B:10:0x0015, B:65:0x013a, B:66:0x013f, B:11:0x0022, B:13:0x0027, B:15:0x0033, B:18:0x0048, B:22:0x0053, B:24:0x005b, B:25:0x0062, B:27:0x0066, B:29:0x006e, B:31:0x0076, B:34:0x0084, B:38:0x009a, B:40:0x00af, B:41:0x00bb, B:43:0x00dd, B:45:0x00e1, B:46:0x00e4, B:50:0x0102, B:51:0x0108, B:37:0x0089, B:53:0x0111, B:54:0x0114, B:56:0x0121, B:64:0x0135, B:58:0x0127, B:60:0x012d, B:62:0x0131, B:21:0x0051, B:17:0x0040, B:68:0x0141), top: B:75:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r21, android.media.MediaCodec.BufferInfo r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozh.k(int, android.media.MediaCodec$BufferInfo):void");
    }
}
