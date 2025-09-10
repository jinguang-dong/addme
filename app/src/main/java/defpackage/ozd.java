package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ozd implements oyi {
    private static final Long e = 10000L;
    public long c;
    private final sgv f;
    private final oyj g;
    private final rwc h;
    private final owq i;
    private final double j;
    private final oxp k;
    private paq p;
    private long q;
    private final AtomicLong l = new AtomicLong(0);
    public final AtomicLong a = new AtomicLong(0);
    private final oyw m = new oyw();
    private final szh n = new szh();
    private rwc o = rvk.a;
    private int r = 0;
    private boolean s = false;
    private final Queue t = new ArrayDeque(1000);
    public final Queue b = new ArrayDeque();
    public final Object d = new Object();
    private ozc u = ozc.READY;

    public ozd(oyj oyjVar, rwc rwcVar, owq owqVar, oxp oxpVar, sgv sgvVar) {
        this.g = oyjVar;
        this.h = rwcVar;
        this.i = owqVar;
        this.j = oxpVar.a() / oxpVar.c();
        this.k = oxpVar;
        this.f = sgvVar;
    }

    private final long d(long j) {
        return (long) (j * this.j);
    }

    @Override // defpackage.oyi
    public final void b(oyh oyhVar, long j) {
        synchronized (this.d) {
            if (!this.o.h()) {
                ((sgt) this.f.c().M(5614)).s("No metadata track found ; dropping metadata packet.");
                return;
            }
            rwc rwcVar = this.h;
            if (rwcVar.h()) {
                AtomicLong atomicLong = this.l;
                atomicLong.set(j);
                Object objC = rwcVar.c();
                oym oymVar = oym.FRAME_METADATA;
                if (!((oyx) objC).g(oymVar)) {
                    ((oyx) rwcVar.c()).e(oymVar, atomicLong);
                }
            }
            long jD = d(j);
            long j2 = this.q;
            if (j2 != 0 && jD > j2) {
                this.n.e(null);
                return;
            }
            Queue queue = this.t;
            if (queue.size() < 1000) {
                oyw oywVar = this.m;
                if (!oywVar.d(j)) {
                    queue.offer(new tae(oyhVar, d(oywVar.a(j))));
                    c();
                }
            } else {
                ((sgt) this.f.c().M(5613)).s("Video frame timestamp is very off. Possibly no metadata is written.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oyh] */
    public final void c() {
        synchronized (this.d) {
            if (!this.o.h()) {
                ((sgt) this.f.b().M(5625)).s("Can't write metadata. Metadata track is absent.");
                return;
            }
            while (true) {
                Queue queue = this.b;
                if (!queue.isEmpty()) {
                    Queue queue2 = this.t;
                    if (queue2.isEmpty()) {
                        break;
                    }
                    long jLongValue = ((Long) queue.peek()).longValue();
                    tae taeVar = (tae) queue2.peek();
                    long j = taeVar.b;
                    long j2 = jLongValue - j;
                    Long l = e;
                    l.longValue();
                    if (j2 > 10000) {
                        queue2.poll();
                        ((sgt) this.f.c().M(5624)).A("Found one metadata (%d) that doesn't match with current video frame (%d)", j, jLongValue);
                    } else {
                        long jAbs = Math.abs(j - jLongValue);
                        l.longValue();
                        if (jAbs <= 10000) {
                            queue2.poll();
                            queue.poll();
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(taeVar.a.a());
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            bufferInfo.size = byteBufferWrap.remaining();
                            bufferInfo.offset = 0;
                            bufferInfo.presentationTimeUs = jLongValue;
                            if (this.k.d == oxh.FPS_30) {
                                int i = bufferInfo.size;
                            }
                            this.g.n(byteBufferWrap, bufferInfo, ((Integer) this.o.c()).intValue());
                            this.r = 0;
                            this.c++;
                        } else {
                            queue.poll();
                            rwc rwcVar = this.h;
                            if (rwcVar.h()) {
                                ((oyx) rwcVar.c()).a(oyu.METADATA_NOT_FOUND);
                            }
                            int i2 = this.r + 1;
                            this.r = i2;
                            if (i2 >= 11 && rwcVar.h() && !this.s) {
                                this.s = true;
                                ((oyx) rwcVar.c()).a(oyu.CONSECUTIVE_MISSED_METADATA);
                            }
                            ((sgt) this.f.c().M(5622)).u("No metadata found for video frame: %d", jLongValue);
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }

    @Override // defpackage.oyi
    public final void i(long j) {
        synchronized (this.d) {
            if (this.u != ozc.STARTED) {
                ((sgt) this.f.b().M(5617)).s("It is not recording now");
            } else {
                this.u = ozc.PAUSED;
                this.m.c(j);
            }
        }
    }

    @Override // defpackage.oyi
    public final void j() {
        synchronized (this.d) {
            ozc ozcVar = this.u;
            ozc ozcVar2 = ozc.CLOSED;
            if (ozcVar == ozcVar2) {
                return;
            }
            paq paqVar = this.p;
            if (paqVar != null) {
                paqVar.close();
            }
            this.u = ozcVar2;
        }
    }

    @Override // defpackage.oyi
    public final void k(long j) {
        synchronized (this.d) {
            if (this.u != ozc.PAUSED) {
                ((sgt) this.f.b().M(5619)).s("It is not paused now");
            } else {
                this.u = ozc.STARTED;
                this.m.b(j);
            }
        }
    }

    @Override // defpackage.oyi
    public final void l() {
        synchronized (this.d) {
            if (this.u != ozc.READY) {
                ((sgt) this.f.b().M(5620)).v("illegal state as %s", this.u);
                return;
            }
            owq owqVar = this.i;
            jxn jxnVar = new jxn(this, 3);
            sxo sxoVar = sxo.a;
            this.p = owqVar.dK(jxnVar, sxoVar);
            this.n.c(new oze(this, 1), sxoVar);
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", a());
            oyj oyjVar = this.g;
            this.o = oyjVar.b(mediaFormat);
            oyjVar.l();
            this.u = ozc.STARTED;
        }
    }

    @Override // defpackage.oyi
    public final void m(long j) {
        synchronized (this.d) {
            ozc ozcVar = this.u;
            if (ozcVar == ozc.STARTED || ozcVar == ozc.PAUSED) {
                if (ozcVar == ozc.PAUSED) {
                    this.m.b(j);
                }
                this.q = d(j - this.m.a);
                this.u = ozc.STOPPED;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
