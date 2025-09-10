package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apy implements apv {
    private final float a;

    public apy(float f) {
        this.a = f;
    }

    @Override // defpackage.apv
    public final float a(long j, chq chqVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apy) && Float.compare(this.a, ((apy) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
