package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnv implements pon {
    private final joc a;
    private final jnm b;

    public jnv(joc jocVar, jnm jnmVar) {
        this.a = jocVar;
        this.b = jnmVar;
    }

    @Override // defpackage.pon
    public final void eS() {
        long jA = this.a.a();
        if (jA >= 0) {
            jnm jnmVar = this.b;
            long jConvert = TimeUnit.MICROSECONDS.convert(jA, TimeUnit.NANOSECONDS);
            if (jConvert < jnmVar.n) {
                ((sgt) jnm.a.b().M(2910)).A("Out of order timestamp %d came after %d", jConvert, jnmVar.n);
            }
            jnmVar.n = Math.max(jnmVar.n, jConvert);
            if (jnmVar.o.isEmpty()) {
                joo jooVar = jnmVar.s;
                long j = jnmVar.n - 1500000;
                synchronized (jooVar.c) {
                    long jMin = Long.MAX_VALUE;
                    for (jon jonVar : jooVar.g) {
                        if (!jonVar.c && !jonVar.f) {
                            jMin = Math.min(jMin, ((Long) jonVar.b.h()).longValue());
                        }
                    }
                    jooVar.d = Math.min(jMin, Math.max(j, jooVar.d));
                    jooVar.c();
                    jooVar.i.d(jooVar.d);
                    jooVar.j.d(jooVar.d);
                    jooVar.k.d(jooVar.d);
                }
            }
        }
    }
}
