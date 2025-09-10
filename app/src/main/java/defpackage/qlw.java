package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlw implements qlv {
    public final syu a;
    public final szh b = new szh();
    public final szh c;
    public final szh d;
    public final szh e;
    public final ConcurrentLinkedDeque f;
    public MediaMuxer g;
    private final szh h;
    private final qlz i;
    private final Object j;
    private long k;

    public qlw(syu syuVar, qlz qlzVar) {
        szh szhVar = new szh();
        this.c = szhVar;
        this.h = new szh();
        this.d = new szh();
        this.e = new szh();
        this.f = new ConcurrentLinkedDeque();
        this.j = new Object();
        this.k = 0L;
        this.i = qlzVar;
        this.a = syuVar;
        syuVar.c(new oze(this, 20), qlzVar);
        szhVar.c(new oze(this, 20), qlzVar);
    }

    private static boolean c(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) && mediaFormat.getInteger(str) > 0;
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.i.execute(new pev(this, qth.b(byteBuffer, bufferInfo), 12, null));
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        this.i.execute(new qly(this, 1));
    }

    public final void a() {
        try {
            synchronized (this.j) {
                syu syuVar = this.a;
                if (syuVar.isDone() && !syuVar.isCancelled()) {
                    boolean zC = c((MediaFormat) ske.U(syuVar), IQwwK.vYhioPwZ);
                    szh szhVar = this.h;
                    if (!szhVar.isDone()) {
                        if (zC) {
                            while (true) {
                                ConcurrentLinkedDeque concurrentLinkedDeque = this.f;
                                if (concurrentLinkedDeque.isEmpty() || (((MediaCodec.BufferInfo) ((qth) concurrentLinkedDeque.getFirst()).b).flags & 1) != 0) {
                                    break;
                                } else {
                                    concurrentLinkedDeque.removeFirst();
                                }
                            }
                        }
                        ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f;
                        if (!concurrentLinkedDeque2.isEmpty()) {
                            szhVar.e(Long.valueOf(((MediaCodec.BufferInfo) ((qth) concurrentLinkedDeque2.getFirst()).b).presentationTimeUs));
                        }
                    }
                }
                szh szhVar2 = this.b;
                if (!szhVar2.isDone()) {
                    boolean zIsCancelled = syuVar.isCancelled();
                    boolean z = syuVar.isDone() && !this.h.isDone() && this.d.isDone();
                    szh szhVar3 = this.h;
                    boolean z2 = !szhVar3.isDone() && this.f.isEmpty() && this.d.isDone();
                    if (z || z2 || zIsCancelled) {
                        szhVar2.e(false);
                        this.e.e(null);
                    } else if (syuVar.isDone() && !syuVar.isCancelled() && szhVar3.isDone()) {
                        szhVar2.e(true);
                    }
                }
                szh szhVar4 = this.c;
                if (szhVar4.isDone() && syuVar.isDone() && !syuVar.isCancelled()) {
                    while (true) {
                        qth qthVar = (qth) this.f.pollFirst();
                        if (qthVar == null) {
                            break;
                        }
                        int iIntValue = ((Integer) ske.U(szhVar4)).intValue();
                        MediaMuxer mediaMuxer = this.g;
                        Object obj = qthVar.b;
                        long j = ((MediaCodec.BufferInfo) obj).presentationTimeUs;
                        long j2 = this.k;
                        if (c((MediaFormat) ske.U(syuVar), "oo.muxer.force_sequential")) {
                            if (j < j2) {
                                ((MediaCodec.BufferInfo) obj).presentationTimeUs = this.k;
                            }
                            this.k = ((MediaCodec.BufferInfo) obj).presentationTimeUs + 100;
                        }
                        try {
                            if (((MediaCodec.BufferInfo) obj).size != 0) {
                                mediaMuxer.writeSampleData(iIntValue, (ByteBuffer) qthVar.a, (MediaCodec.BufferInfo) obj);
                            }
                        } catch (Throwable th) {
                            Log.w(OPuAVreQM.NbNVgSw, mPfBwqXsnpXI.CvavTmXxdTNyj, th);
                            this.e.a(th);
                        }
                    }
                    rnt.L(this.f.isEmpty());
                    if (this.d.isDone()) {
                        this.e.e(null);
                    }
                }
            }
        } catch (Exception e) {
            Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", e);
            this.e.a(e);
        }
    }
}
