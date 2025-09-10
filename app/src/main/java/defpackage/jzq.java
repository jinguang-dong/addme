package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzq {
    public final AtomicReference a = new AtomicReference(kbl.TOPSHOT_MODE);
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final owf f;
    private final rwc g;
    private final kno h;
    private final kan i;

    public jzq(kan kanVar, hyd hydVar, int i, int i2, int i3, owf owfVar, rwc rwcVar, kno knoVar) {
        this.i = kanVar;
        this.b = hydVar.a;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = owfVar;
        this.g = rwcVar;
        this.h = knoVar;
    }

    public final int a() {
        return ((Integer) ((owf) ((rwg) this.g).a).dL()).intValue() + 2;
    }

    public final int b() {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == kbl.GROUPSHOT_MODE) {
            return this.h.a();
        }
        kan kanVar = this.i;
        int i = 2;
        if (kanVar.a() == 2) {
            i = this.d;
        } else if (kanVar.a() == 1) {
            i = 0;
        } else if (((Integer) this.f.dL()).intValue() == idz.NONE.ordinal()) {
            i = this.c;
        }
        if (atomicReference.get() == kbl.LONGSHOT_MODE) {
            i += this.e;
        }
        return Math.max(this.b - i, 1);
    }
}
