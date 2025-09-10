package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwz implements Serializable, rww {
    private static final long serialVersionUID = 0;
    public final Object a;

    public rwz(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rwz) {
            return a.K(this.a, ((rwz) obj).a);
        }
        return false;
    }

    @Override // defpackage.rww
    public final Object fr() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + String.valueOf(this.a) + ")";
    }
}
