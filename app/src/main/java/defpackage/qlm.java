package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlm {
    public final qlt b;
    private final szh g = new szh();
    private final szh h = new szh();
    private final szh i = new szh();
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    private boolean c = false;
    private boolean d = false;
    private volatile rwc e = rvk.a;
    private final Object f = new Object();

    public qlm(qlt qltVar) {
        this.b = qltVar;
    }

    public final synchronized syu a() {
        if (!this.d) {
            return ske.M(true);
        }
        if (!this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Object obj = ((qth) it.next()).b;
                if (!((qli) obj).g.getAndSet(true)) {
                    int i = ((qli) obj).b.get();
                    if (i == 1) {
                        ((qli) obj).f();
                    } else if (i == 3 || i == 4) {
                        ((qli) obj).d();
                    }
                }
                ske.N(((qli) obj).e);
            }
        }
        this.c = true;
        szh szhVar = new szh();
        ske.W(this.b.a(), new qll(szhVar), sxo.a);
        return szhVar;
    }

    public final synchronized void b() {
        Object obj;
        if (this.d) {
            throw new IllegalStateException("MediaEncoder already started.");
        }
        synchronized (this.f) {
            this.g.e(null);
            this.h.e(null);
        }
        this.i.e(null);
        this.b.b();
        for (qth qthVar : this.a) {
            int i = 0;
            MediaCodec.CodecException th = null;
            while (true) {
                obj = qthVar.b;
                if (i > 3) {
                    break;
                }
                try {
                    ((qli) obj).a.start();
                    ((qli) obj).i.set(true);
                    ((qli) obj).b.set(1);
                    ((qli) obj).o.c();
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    Log.e("AsynchMediaCodec", "Exception occurred while trying to start codec", th);
                    if (i < 3) {
                        Log.w("AsynchMediaCodec", "Trying to start codec again.");
                    }
                    i++;
                }
            }
            if (th != null) {
                Log.e("AsynchMediaCodec", "Failed to start codec", th);
                ((qli) obj).j.onError(((qli) obj).a, th instanceof MediaCodec.CodecException ? th : null);
                if (!(th instanceof RuntimeException)) {
                    throw new IllegalStateException(th);
                }
                throw th;
            }
        }
        this.d = true;
    }

    public final qln c(final MediaFormat mediaFormat) {
        final szh szhVar = new szh();
        qln qlnVar = new qln(mediaFormat, this.b.c(new qaq(szhVar)));
        rvu rvuVar = new rvu() { // from class: qlk
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, syu] */
            @Override // defpackage.rvu
            public final Object apply(Object obj) {
                qth qthVar = (qth) obj;
                this.a.a.add(qthVar);
                szhVar.f(swz.i(qthVar.a, new qcj(mediaFormat, 3), sxo.a));
                return qthVar;
            }
        };
        synchronized (qlnVar.a) {
            qlnVar.b = new rvw(rvuVar, qlnVar.b);
        }
        return qlnVar;
    }
}
