package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joq implements qfc {
    public final pbc a;
    private final szh g = new szh();
    public final HashMap b = new HashMap();
    private final List h = new ArrayList();
    public long c = 0;
    public long d = -1;
    private long i = 0;
    public long e = 0;
    public boolean f = false;

    public joq(pbc pbcVar, String str) {
        this.a = pbcVar.a("CCTrack".concat(str));
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.g.f(syuVar);
    }

    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.g("writesampledata <" + bufferInfo.presentationTimeUs + ">");
        qth qthVarA = qth.a(byteBuffer, bufferInfo);
        synchronized (this) {
            this.c = ((MediaCodec.BufferInfo) qthVarA.b).presentationTimeUs;
            long j = this.e;
            this.e = 1 + j;
            this.b.put(Long.valueOf(j), qthVarA);
            for (jop jopVar : this.h) {
                if (bufferInfo.presentationTimeUs >= jopVar.a && bufferInfo.presentationTimeUs <= jopVar.b) {
                    jopVar.c(qthVarA, j);
                }
                jopVar.b();
            }
        }
    }

    public final synchronized void c() {
        szh szhVar = this.g;
        String string = szhVar.isDone() ? szhVar.isCancelled() ? "CANCELLED" : ((MediaFormat) ske.V(szhVar)).getString("mime") : "WAITING";
        pbc pbcVar = this.a;
        Locale locale = Locale.US;
        HashMap map = this.b;
        pbcVar.b(String.format(locale, "mime %s, %d entries, span: <%s> - <%s> available to %d", string, Integer.valueOf(map.size()), map.isEmpty() ? "n/a" : map.get(Long.valueOf(this.d + 1)), map.isEmpty() ? "n/a" : map.get(Long.valueOf(this.e - 1)), Long.valueOf(this.c)));
        for (jop jopVar : this.h) {
            pbcVar.b(String.format(Locale.US, clFzVRcygwbq.HOp, Long.valueOf(jopVar.c), Long.valueOf(jopVar.b), true != jopVar.e ? "NO" : "YES", true != jopVar.d ? "NO" : "YES"));
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((jop) it.next()).b();
        }
    }

    public final synchronized void d(long j) {
        while (true) {
            long j2 = this.d + 1;
            if (j2 == this.e) {
                break;
            }
            HashMap map = this.b;
            Long lValueOf = Long.valueOf(j2);
            qth qthVar = (qth) map.get(lValueOf);
            qthVar.getClass();
            Object obj = qthVar.b;
            if (((MediaCodec.BufferInfo) obj).presentationTimeUs > j) {
                break;
            }
            map.remove(lValueOf);
            this.i = ((MediaCodec.BufferInfo) obj).presentationTimeUs;
            this.d++;
        }
        ArrayList arrayList = new ArrayList();
        List<jop> list = this.h;
        for (jop jopVar : list) {
            if (jopVar.e) {
                arrayList.add(jopVar);
            }
        }
        list.removeAll(arrayList);
    }

    public final synchronized jop e(qfc qfcVar, long j) {
        jop jopVar;
        rnt.M(j >= this.i, "Requesting packets that were dropped already");
        jopVar = new jop(this, qfcVar, j);
        qfcVar.a(this.g);
        this.h.add(jopVar);
        return jopVar;
    }
}
