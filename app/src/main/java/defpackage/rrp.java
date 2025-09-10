package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrp {
    public final szh c;
    public final syh d;
    private final Executor f;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public rrp(sxh sxhVar, Executor executor) {
        sxo sxoVar = sxo.a;
        this.f = new szg(sxoVar);
        szh szhVar = new szh();
        this.c = szhVar;
        syh syhVar = new syh(sxhVar, executor, 1);
        this.d = syhVar;
        szhVar.c(syhVar, sxoVar);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final syu c() {
        AtomicLong atomicLong;
        long j;
        int iA;
        szh szhVar = this.c;
        if (szhVar.isDone()) {
            return szhVar;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            iA = a(j);
        } while (!atomicLong.compareAndSet(j, b(iA, ((int) j) + 1)));
        final szh szhVar2 = new szh();
        syu syuVar = (syu) this.e.getAndSet(szhVar2);
        szhVar2.f(syuVar == null ? ske.R(rsx.b(new qce(this, iA, 2)), sxo.a) : swf.j(syuVar, Throwable.class, rsx.c(new rrl(this, iA, 0)), this.f));
        final rrn rrnVar = new rrn(this, iA);
        szhVar2.c(new Runnable() { // from class: rrm
            @Override // java.lang.Runnable
            public final void run() {
                rrn rrnVar2 = rrnVar;
                szh szhVar3 = szhVar2;
                try {
                    Object objU = ske.U(szhVar3);
                    szh szhVar4 = this.a.c;
                    szhVar4.e(objU);
                    rrnVar2.f(szhVar4);
                } catch (Throwable unused) {
                    rrnVar2.f(szhVar3);
                }
            }
        }, sxo.a);
        return rrnVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sxh] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu d(int i) {
        AtomicReference atomicReference;
        rro rroVar;
        AtomicLong atomicLong = this.a;
        if (a(atomicLong.get()) > i) {
            return ske.K();
        }
        rro rroVar2 = new rro(i);
        do {
            atomicReference = this.b;
            rroVar = (rro) atomicReference.get();
            if (rroVar != null && rroVar.a > i) {
                return ske.K();
            }
        } while (!a.v(atomicReference, rroVar, rroVar2));
        if (a(atomicLong.get()) > i) {
            rroVar2.cancel(true);
            a.v(atomicReference, rroVar2, null);
            return rroVar2;
        }
        syh syhVar = this.d;
        ?? r0 = syhVar.a;
        ?? r6 = syhVar.b;
        if (r0 == 0 || r6 == 0) {
            rroVar2.f(this.c);
            return rroVar2;
        }
        rroVar2.f(ske.R(rsx.b(r0), r6));
        return rroVar2;
    }
}
