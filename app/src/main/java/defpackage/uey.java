package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uey implements Serializable, ues {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uey.class, Object.class, "c");
    private volatile uif b;
    private volatile Object c = ufd.a;

    public uey(uif uifVar) {
        this.b = uifVar;
    }

    private final Object writeReplace() {
        return new ueq(a());
    }

    @Override // defpackage.ues
    public final Object a() {
        Object obj = this.c;
        ufd ufdVar = ufd.a;
        if (obj != ufdVar) {
            return obj;
        }
        uif uifVar = this.b;
        if (uifVar != null) {
            Object objA = uifVar.a();
            if (a.G(a, this, ufdVar, objA)) {
                this.b = null;
                return objA;
            }
        }
        return this.c;
    }

    @Override // defpackage.ues
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.c != ufd.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
