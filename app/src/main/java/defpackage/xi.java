package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class xi {
    public final Object a;

    public static final boolean a(Object obj) {
        return !(obj instanceof qp);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xi) && a.ao(this.a, ((xi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.a + ')';
    }
}
