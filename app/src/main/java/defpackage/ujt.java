package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujt implements ujh {
    private final Class a;

    public ujt(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.ujh
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ujt) && a.ao(this.a, ((ujt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
