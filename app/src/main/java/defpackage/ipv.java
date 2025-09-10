package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipv {
    public final gnt a;
    public final owf b;
    public final owf c;
    public final owf d;
    private final out e;
    private paq f;

    public ipv(owf owfVar, owf owfVar2, owf owfVar3, gnt gntVar, out outVar) {
        this.c = owfVar;
        this.b = owfVar2;
        this.d = owfVar3;
        this.a = gntVar;
        this.e = outVar;
    }

    public final void a(Runnable runnable, Runnable runnable2, our ourVar) {
        paq paqVar = this.f;
        if (paqVar != null) {
            paqVar.close();
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        paq paqVarDK = this.c.dK(new ipu(this, atomicBoolean, runnable2, atomicBoolean2, runnable), this.e);
        this.f = paqVarDK;
        ourVar.d(paqVarDK);
        ourVar.d(new hku(this, atomicBoolean, atomicBoolean2, 2));
    }
}
