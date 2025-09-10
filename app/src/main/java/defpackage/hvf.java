package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvf {
    public final double a;
    public final double b;
    public final double c;

    public hvf(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvf)) {
            return false;
        }
        hvf hvfVar = (hvf) obj;
        return Double.compare(this.a, hvfVar.a) == 0 && Double.compare(this.b, hvfVar.b) == 0 && Double.compare(this.c, hvfVar.c) == 0;
    }

    public final int hashCode() {
        return (((jea.j(this.a) * 31) + jea.j(this.b)) * 31) + jea.j(this.c);
    }

    public final String toString() {
        return "DevicePose(rollDegrees=" + this.a + ", headingDegrees=" + this.b + ", tiltDegrees=" + this.c + ")";
    }
}
