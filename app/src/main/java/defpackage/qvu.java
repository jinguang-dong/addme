package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvu {
    static final qvv a = new qvs(uyz.a, true);
    private final Random b;
    private final swb c;
    private final qvh d;

    public qvu(Random random, qvh qvhVar, swb swbVar) {
        this.b = random;
        this.c = swbVar;
        this.d = qvhVar;
    }

    public final qvv a(uyz uyzVar) {
        int iAw = a.aw(uyzVar.d);
        if (iAw == 0) {
            iAw = 1;
        }
        int i = iAw - 1;
        if (i == 1) {
            return new qvs(uyzVar, uyzVar.c == 1000);
        }
        if (i == 3) {
            return new qvs(uyzVar, this.b.nextDouble() * 1000.0d < ((double) uyzVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                uyzVar = uyz.a;
            }
            return new qvs(uyzVar, true);
        }
        Random random = this.b;
        qvh qvhVar = this.d;
        qvhVar.getClass();
        return new qvt(uyzVar, random, qvhVar, this.c);
    }
}
