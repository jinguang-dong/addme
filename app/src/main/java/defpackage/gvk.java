package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvk {
    public final gyd a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public gvk() {
        this(gyd.a, 1.0f, 1.0f, 1.0f, 2.0f, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvk)) {
            return false;
        }
        gvk gvkVar = (gvk) obj;
        return a.ao(this.a, gvkVar.a) && Float.compare(this.b, gvkVar.b) == 0 && Float.compare(this.c, gvkVar.c) == 0 && Float.compare(this.d, gvkVar.d) == 0 && Float.compare(this.e, gvkVar.e) == 0 && this.f == gvkVar.f;
    }

    public final int hashCode() {
        int iJ;
        gyd gydVar = this.a;
        if (gydVar.C()) {
            iJ = gydVar.j();
        } else {
            int iJ2 = gydVar.aT;
            if (iJ2 == 0) {
                iJ2 = gydVar.j();
                gydVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return (((((((((iJ * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + a.o(this.f);
    }

    public final String toString() {
        return "ZoomUiConfig(targetConfig=" + this.a + ", defaultZoom=" + this.b + ", normalizationFactor=" + this.c + ", minZoom=" + this.d + ", maxZoom=" + this.e + ", reset=" + this.f + ")";
    }

    public gvk(gyd gydVar, float f, float f2, float f3, float f4, boolean z) {
        gydVar.getClass();
        this.a = gydVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }
}
