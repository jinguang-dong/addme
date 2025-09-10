package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ufh implements Serializable, ues {
    private uif a;
    private Object b = ufd.a;

    public ufh(uif uifVar) {
        this.a = uifVar;
    }

    private final Object writeReplace() {
        return new ueq(a());
    }

    @Override // defpackage.ues
    public final Object a() {
        if (this.b == ufd.a) {
            uif uifVar = this.a;
            uifVar.getClass();
            this.b = uifVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.ues
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.b != ufd.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
