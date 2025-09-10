package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tw implements ty {
    public final pk a;

    public tw(pk pkVar) {
        this.a = pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw) && a.ao(this.a, ((tw) obj).a);
    }

    public final int hashCode() {
        pk pkVar = this.a;
        if (pkVar == null) {
            return 0;
        }
        return pkVar.a;
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
