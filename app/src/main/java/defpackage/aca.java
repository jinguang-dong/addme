package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca extends ace {
    public float a;

    public aca(float f) {
        this.a = f;
    }

    @Override // defpackage.ace
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.ace
    public final int b() {
        return 1;
    }

    @Override // defpackage.ace
    public final /* synthetic */ ace c() {
        return new aca(0.0f);
    }

    @Override // defpackage.ace
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.ace
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aca) && ((aca) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
