package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kit {
    public final Set a;

    public kit(Set set) {
        this.a = scn.F(set);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof kit) && Objects.equals(this.a, ((kit) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
