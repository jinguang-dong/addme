package defpackage;

import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rwc implements Serializable {
    private static final long serialVersionUID = 0;

    public static rwc i(Object obj) {
        return obj == null ? rvk.a : new rwg(obj);
    }

    public static rwc j(Object obj) {
        obj.getClass();
        return new rwg(obj);
    }

    public abstract rwc a(rwc rwcVar);

    public abstract rwc b(rvu rvuVar);

    public abstract Object c();

    public abstract Object d(rww rwwVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract Set g();

    public abstract boolean h();

    public abstract int hashCode();

    public abstract String toString();
}
