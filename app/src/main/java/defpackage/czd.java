package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czd implements cyu {
    public final int a;

    public czd(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180) {
            if (i == 270) {
                i = 270;
            } else {
                z = false;
            }
        }
        coi.w(z, "Unsupported orientation");
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czd) && this.a == ((czd) obj).a;
    }

    public final int hashCode() {
        return this.a + 527;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
