package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqk {
    public final boolean a;
    public final boolean b;

    public iqk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqk)) {
            return false;
        }
        iqk iqkVar = (iqk) obj;
        return this.a == iqkVar.a && this.b == iqkVar.b;
    }

    public final int hashCode() {
        return (a.o(this.a) * 31) + a.o(this.b);
    }

    public final String toString() {
        return "JupiterFlipDecision(shouldFlipWearScreenshot=" + this.a + ", shouldFlipRearCameraDisplay=" + this.b + ")";
    }
}
