package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class err extends WeakReference {
    final eqi a;
    final boolean b;
    esw c;

    public err(eqi eqiVar, esq esqVar, ReferenceQueue referenceQueue) {
        super(esqVar, referenceQueue);
        eoz.k(eqiVar);
        this.a = eqiVar;
        this.c = null;
        this.b = esqVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
