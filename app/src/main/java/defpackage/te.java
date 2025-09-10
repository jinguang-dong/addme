package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class te extends byi {
    public final ta a;

    public te(ta taVar) {
        super((char[]) null);
        this.a = taVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te) && a.ao(this.a, ((te) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.a + ')';
    }
}
