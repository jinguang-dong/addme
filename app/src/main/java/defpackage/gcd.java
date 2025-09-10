package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcd {
    public final boolean a;
    public final kbk b;

    public gcd(boolean z, kbk kbkVar) {
        this.a = z;
        this.b = kbkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcd)) {
            return false;
        }
        gcd gcdVar = (gcd) obj;
        return this.a == gcdVar.a && a.ao(this.b, gcdVar.b);
    }

    public final int hashCode() {
        kbk kbkVar = this.b;
        return (a.o(this.a) * 31) + (kbkVar == null ? 0 : kbkVar.hashCode());
    }

    public final String toString() {
        return "RecordingStopResult(success=" + this.a + ", artifacts=" + this.b + ")";
    }
}
