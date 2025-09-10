package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iql {
    public final boolean a;

    public iql(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iql) && this.a == ((iql) obj).a;
    }

    public final int hashCode() {
        return a.o(this.a);
    }

    public final String toString() {
        return "SaturnFlipDecision(shouldFlipFrontCameraDisplay=" + this.a + ")";
    }
}
