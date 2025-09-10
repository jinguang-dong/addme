package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzo extends cpo {
    public final int a;

    public dzo(int i) {
        super(null);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzo) && this.a == ((dzo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
