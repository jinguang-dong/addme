package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ui extends byi {
    public final rj a;

    public ui(rj rjVar) {
        super((char[]) null);
        this.a = rjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui) && a.ao(this.a, ((ui) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.a + ')';
    }
}
