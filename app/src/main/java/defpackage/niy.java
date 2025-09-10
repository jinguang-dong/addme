package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niy {
    public final int a;
    public final float b;
    public final Set c;
    public final float d;

    public niy() {
        this((byte[]) null);
    }

    public final float a(float f) {
        return (-this.d) * ukc.m(f, 0.0f, 1.0f);
    }

    public final float b(float f) {
        return Math.abs(ukc.m((-f) / this.d, 0.0f, 1.0f));
    }

    public final float c(float f) {
        return b(ukc.m((-f) * this.b, -this.d, 0.0f));
    }

    public final float d(float f) {
        return Math.abs(ukc.m((-f) / this.b, 0.0f, this.a - 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niy)) {
            return false;
        }
        niy niyVar = (niy) obj;
        return this.a == niyVar.a && Float.compare(this.b, niyVar.b) == 0 && a.ao(this.c, niyVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LayoutInfo(numTickMarks=" + this.a + ", tickMarkSpacing=" + this.b + ", primaryTickIndices=" + this.c + ")";
    }

    public niy(int i, float f, Set set) {
        this.a = i;
        this.b = f;
        this.c = set;
        if (i < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = (i - 1) * f;
    }

    public /* synthetic */ niy(byte[] bArr) {
        this(2, 16.0f, ufy.a);
    }

    public niy(nhy nhyVar) {
        this(nhyVar.a, nhyVar.c, nhyVar.b);
    }
}
