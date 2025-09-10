package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cev {
    public final Object a;

    public /* synthetic */ cev(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cev) && a.ao(this.a, ((cev) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
