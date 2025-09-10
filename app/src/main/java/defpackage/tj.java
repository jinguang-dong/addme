package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tj {
    public final sz a;
    public final wi b;
    public final sr c;

    public tj(sz szVar, wi wiVar, sr srVar) {
        this.a = szVar;
        this.b = wiVar;
        this.c = srVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return a.ao(this.a, tjVar.a) && a.ao(this.b, tjVar.b) && a.ao(this.c, tjVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
