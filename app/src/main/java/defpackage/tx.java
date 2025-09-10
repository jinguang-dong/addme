package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tx implements ty {
    public final rj a;

    public tx(rj rjVar) {
        this.a = rjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx) && a.ao(this.a, ((tx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ')';
    }
}
