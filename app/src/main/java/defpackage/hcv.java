package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hcv implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hcv(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    public /* synthetic */ hcv(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j;
        switch (this.c) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis() + 15000;
                ?? r2 = this.b;
                while (true) {
                    j = this.a;
                    if (System.currentTimeMillis() < jCurrentTimeMillis && qia.a(j) != 0) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            ((sgt) ((sgt) hcw.a.c().i(e)).M((char) 1175)).s("Thread interrupted. Wrapping up... ");
                        }
                    }
                }
                r2.shutdown();
                boolean z = qia.a;
                int iA = qia.a(j);
                ArrayList arrayList = new ArrayList();
                Map map = qia.b;
                synchronized (map) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (((qhz) entry.getValue()).a <= j) {
                            arrayList.add(entry.getKey());
                        }
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    qia.b.remove(arrayList.get(i));
                }
                if (iA > 0) {
                    throw new rxd(String.format("Leaks detected: %d objects counted.", Integer.valueOf(iA)));
                }
                return;
            case 1:
                ((gdk) this.b).a.a.i(this.a);
                return;
            case 2:
                ((hgi) this.b).a.e(this.a);
                return;
            case 3:
                ((sgt) ivz.a.c().M(2435)).u("Couldn't submit frame %s.", this.a);
                ((tht) this.b).d.run();
                return;
            case 4:
                long j2 = this.a;
                Object obj = this.b;
                ((jms) obj).e.post(new hcv(obj, j2, 5));
                return;
            case 5:
                jms jmsVar = (jms) this.b;
                ((nqp) jmsVar.i.a()).n();
                jmsVar.b.i(System.currentTimeMillis() - this.a);
                return;
            case 6:
                long j3 = this.a;
                sgv sgvVar = jnm.a;
                jnl jnlVar = (jnl) this.b;
                szh szhVar = jnlVar.h;
                if (szhVar.isDone()) {
                    ((sgt) jnm.a.c().M(2872)).B("Trying to correct timestamp to %d but it was already set as %d", j3, ske.V(szhVar));
                    return;
                } else {
                    long j4 = jnlVar.e;
                    szhVar.e(Long.valueOf(j3));
                    return;
                }
            case 7:
                ((kas) this.b).d(this.a);
                return;
            case 8:
                long j5 = this.a;
                Object obj2 = this.b;
                try {
                    try {
                        pbn pbnVar = ((kpk) obj2).h;
                        pbnVar.f("waitUntilFrame");
                        khl khlVar = ((kpk) obj2).d;
                        long nanos = TimeUnit.MILLISECONDS.toNanos(165L);
                        ReentrantLock reentrantLock = khlVar.a;
                        reentrantLock.lock();
                        while (khlVar.c < j5 && nanos > 0) {
                            try {
                                nanos = khlVar.b.awaitNanos(nanos);
                            } catch (Throwable th) {
                                khlVar.a.unlock();
                                throw th;
                            }
                        }
                        reentrantLock.unlock();
                        if (nanos <= 0) {
                            ((sgt) kpk.a.b().M(3362)).u("Timeout waiting for frame %d", j5);
                        }
                        pbnVar.g();
                        return;
                    } catch (InterruptedException e2) {
                        ((sgt) ((sgt) kpk.a.b().i(e2)).M(3363)).u(YyLACfm.RQgzehDLIOjNN, j5);
                        Thread.currentThread().interrupt();
                        ((kpk) obj2).h.g();
                        return;
                    }
                } catch (Throwable th2) {
                    ((kpk) obj2).h.g();
                    throw th2;
                }
            case 9:
                long j6 = this.a;
                Object obj3 = this.b;
                ((ntf) obj3).k.d("/cuttleface_remaining_time_second", rup.w(j6));
                return;
            default:
                long j7 = this.a;
                Object obj4 = this.b;
                ((ntf) obj4).k.d("/night_sight_shooting_duration_ms", rup.w(j7));
                return;
        }
    }
}
