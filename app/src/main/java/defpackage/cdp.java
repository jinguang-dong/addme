package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdp implements cci {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdp) && a.ao(this.a, ((cdp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
