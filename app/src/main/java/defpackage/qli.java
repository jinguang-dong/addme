package defpackage;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qli {
    public final MediaCodec a;
    public final Surface c;
    public final qlh j;
    public final boolean m;
    private final boolean p;
    public final Set k = new HashSet();
    public final Set l = new HashSet();
    public volatile qmb n = qmb.a;
    public volatile qlr o = qlr.c;
    public final Deque d = new ConcurrentLinkedDeque();
    public final AtomicInteger b = new AtomicInteger(3);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final szh e = new szh();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public qli(MediaCodec mediaCodec, MediaFormat mediaFormat, rvu rvuVar, boolean z, Handler handler, boolean z2) {
        this.a = mediaCodec;
        this.m = z2;
        this.p = z;
        qlh qlhVar = new qlh(this);
        this.j = qlhVar;
        if (handler == null) {
            mediaCodec.setCallback(qlhVar);
        } else {
            mediaCodec.setCallback(qlhVar, handler);
        }
        k(mediaCodec, mediaFormat, z2);
        this.c = rvuVar == null ? null : (Surface) rvuVar.apply(mediaCodec);
    }

    private final int h() {
        synchronized (this) {
            Deque deque = this.d;
            if (deque.isEmpty()) {
                return -1;
            }
            return ((Integer) deque.removeFirst()).intValue();
        }
    }

    private final void i() {
        this.d.clear();
        this.k.clear();
        this.l.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: all -> 0x004a, TryCatch #2 {, blocks: (B:3:0x0001, B:12:0x0023, B:13:0x0026, B:15:0x002e, B:17:0x0039, B:19:0x003d, B:20:0x0040, B:21:0x0048, B:8:0x0011, B:11:0x001c, B:5:0x000a), top: B:26:0x0001, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.i     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L26
            android.media.MediaCodec r0 = r2.a     // Catch: java.lang.Throwable -> L10 android.media.MediaCodec.CodecException -> L19
            r0.stop()     // Catch: java.lang.Throwable -> L10 android.media.MediaCodec.CodecException -> L19
            goto L23
        L10:
            r3 = move-exception
            java.lang.String r0 = "AsynchMediaCodec"
            java.lang.String r1 = "Exception while trying to stop codec"
            android.util.Log.e(r0, r1, r3)     // Catch: java.lang.Throwable -> L4a
            goto L23
        L19:
            r0 = move-exception
            if (r3 == 0) goto L23
            qlh r3 = r2.j     // Catch: java.lang.Throwable -> L4a
            android.media.MediaCodec r1 = r2.a     // Catch: java.lang.Throwable -> L4a
            r3.onError(r1, r0)     // Catch: java.lang.Throwable -> L4a
        L23:
            r2.i()     // Catch: java.lang.Throwable -> L4a
        L26:
            szh r3 = r2.e     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r3.isDone()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L48
            android.media.MediaCodec r0 = r2.a     // Catch: java.lang.Throwable -> L4a
            boolean r1 = defpackage.qia.a     // Catch: java.lang.Throwable -> L4a
            r0.release()     // Catch: java.lang.Throwable -> L4a
            android.view.Surface r0 = r2.c     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L40
            boolean r1 = r2.p     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L40
            r0.release()     // Catch: java.lang.Throwable -> L4a
        L40:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L4a
            r3.e(r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qli.j(boolean):void");
    }

    private static void k(MediaCodec mediaCodec, MediaFormat mediaFormat, boolean z) {
        boolean zIsEncoder = mediaCodec.getCodecInfo().isEncoder();
        int i = zIsEncoder;
        if (z) {
            rnt.M(true, "Block mode requires Android R");
            i = (zIsEncoder ? 1 : 0) | 2;
        }
        try {
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, i);
        } catch (MediaCodec.CodecException e) {
            Log.w("AsynchMediaCodec", "Error while configuring codec: ".concat(String.valueOf(e.getDiagnosticInfo())), e);
            throw e;
        }
    }

    public final qlj a() {
        rnt.M(!this.m, "nextByteBuffer() called on codec in block mode");
        if (this.c != null) {
            throw new AssertionError("MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
        }
        int iH = h();
        if (iH < 0) {
            return null;
        }
        try {
            ByteBuffer inputBuffer = this.a.getInputBuffer(iH);
            if (inputBuffer == null) {
                return null;
            }
            qle qleVar = new qle(this, inputBuffer, iH);
            synchronized (this) {
                this.k.add(qleVar);
            }
            return qleVar;
        } catch (MediaCodec.CodecException e) {
            this.j.onError(this.a, e);
            return null;
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Error occurred while trying to fetch input buffer", th);
            return null;
        }
    }

    public final qlj b() {
        rnt.M(this.m, "nextRequest() requires codec configured in block mode");
        int iH = h();
        if (iH < 0) {
            return null;
        }
        try {
            return new qlf(this, this.a.getQueueRequest(iH), iH);
        } catch (MediaCodec.CodecException e) {
            this.j.onError(this.a, e);
            return null;
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Exception occurred in getQueueRequest", th);
            return null;
        }
    }

    public final void c(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            i();
            this.b.set(3);
            AtomicBoolean atomicBoolean = this.g;
            if (atomicBoolean.get()) {
                this.o.d(2);
            } else {
                this.o.d(1);
            }
            if (atomicBoolean.getAndSet(false)) {
                d();
            }
        }
    }

    public final void d() {
        j(true);
    }

    public final void e() {
        j(false);
    }

    public final synchronized void f() {
        if (this.c == null && !this.m) {
            int iH = h();
            if (iH >= 0) {
                g(iH);
                return;
            } else {
                if (this.b.get() == 1) {
                    this.f.set(true);
                    return;
                }
                return;
            }
        }
        g(0);
    }

    public final void g(int i) {
        this.b.set(2);
        if (this.c != null) {
            try {
                this.a.signalEndOfInputStream();
                return;
            } catch (MediaCodec.CodecException e) {
                this.j.onError(this.a, e);
                return;
            } catch (IllegalArgumentException e2) {
                Log.e("AsynchMediaCodec", "IllegalArgumentException occurred while trying to signal an EOS".concat(String.valueOf(e2.getMessage())));
                return;
            } catch (Throwable th) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", th);
                return;
            }
        }
        try {
            if (this.m) {
                MediaCodec mediaCodec = this.a;
                MediaFormat inputFormat = mediaCodec.getInputFormat();
                HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(inputFormat.getInteger("width"), inputFormat.getInteger("height"), 35, 1, 65536L);
                try {
                    mediaCodec.getQueueRequest(i).setHardwareBuffer(hardwareBufferCreate).setPresentationTimeUs(0L).setFlags(4).queue();
                    if (hardwareBufferCreate != null) {
                        hardwareBufferCreate.close();
                    }
                } finally {
                }
            } else {
                this.a.queueInputBuffer(i, 0, 0, 0L, 4);
            }
        } catch (MediaCodec.CodecException e3) {
            this.j.onError(this.a, e3);
        } catch (IllegalArgumentException e4) {
            Log.e("AsynchMediaCodec", "IllegalArgumentException occurred while trying to signal an EOS with null input surface".concat(String.valueOf(e4.getMessage())));
        } catch (Throwable th2) {
            Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS with null input surface", th2);
        }
        this.k.clear();
    }
}
