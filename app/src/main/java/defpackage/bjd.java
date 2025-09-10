package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjd {
    public final int a;
    public final int b;
    public final ejs c;
    private final long d;

    public bjd(int i, long j, int i2, ejs ejsVar) {
        this.a = i;
        this.d = j;
        this.b = i2;
        this.c = ejsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjd)) {
            return false;
        }
        bjd bjdVar = (bjd) obj;
        return this.a == bjdVar.a && this.d == bjdVar.d && this.b == bjdVar.b && a.ao(this.c, bjdVar.c);
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        ejs ejsVar = this.c;
        return (((((this.a * 31) + a.r(this.d)) * 31) + i) * 31) + (ejsVar == null ? 0 : ejsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((Object) (this.b != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
