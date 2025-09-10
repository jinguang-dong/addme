package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwf implements Serializable, rwe {
    private static final long serialVersionUID = 0;
    private final Class a;

    public rwf(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.rwe
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rwf)) {
            return false;
        }
        Class cls = ((rwf) obj).a;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
