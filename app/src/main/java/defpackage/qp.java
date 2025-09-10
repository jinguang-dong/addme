package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class qp {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof qp) && this.a == ((qp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "OutputStatus(value=" + this.a + ')';
    }
}
