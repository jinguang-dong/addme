package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apx implements apv {
    private final float a;

    public apx(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            akg.b("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.apv
    public final float a(long j, chq chqVar) {
        return bki.a(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apx) && Float.compare(this.a, ((apx) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
