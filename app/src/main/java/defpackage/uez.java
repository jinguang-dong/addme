package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uez implements Serializable, ues {
    private uif a;
    private volatile Object b = ufd.a;
    private final Object c = this;

    public /* synthetic */ uez(uif uifVar) {
        this.a = uifVar;
    }

    private final Object writeReplace() {
        return new ueq(a());
    }

    @Override // defpackage.ues
    public final Object a() {
        Object objA;
        Object obj = this.b;
        ufd ufdVar = ufd.a;
        if (obj != ufdVar) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == ufdVar) {
                uif uifVar = this.a;
                uifVar.getClass();
                objA = uifVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    @Override // defpackage.ues
    public final boolean b() {
        return this.b != ufd.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
