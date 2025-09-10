package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duy {
    public final List a;

    public duy(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.ao(getClass(), obj.getClass())) {
            return false;
        }
        return a.ao(this.a, ((duy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ske.ca(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
