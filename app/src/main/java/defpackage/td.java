package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class td extends byi {
    public final pk a;

    public td(pk pkVar) {
        super((char[]) null);
        this.a = pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td) && a.ao(this.a, ((td) obj).a);
    }

    public final int hashCode() {
        pk pkVar = this.a;
        if (pkVar == null) {
            return 0;
        }
        return pkVar.a;
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.a + ')';
    }
}
