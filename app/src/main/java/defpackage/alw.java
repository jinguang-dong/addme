package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alw implements alv {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public alw(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            amo.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.alv
    public final float a() {
        return this.b;
    }

    @Override // defpackage.alv
    public final float b(cib cibVar) {
        return cibVar == cib.a ? this.c : this.d;
    }

    @Override // defpackage.alv
    public final float c(cib cibVar) {
        return cibVar == cib.a ? this.d : this.c;
    }

    @Override // defpackage.alv
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alw)) {
            return false;
        }
        alw alwVar = (alw) obj;
        return cht.b(this.c, alwVar.c) && cht.b(this.a, alwVar.a) && cht.b(this.d, alwVar.d) && cht.b(this.b, alwVar.b);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) cht.a(this.c)) + ", top=" + ((Object) cht.a(this.a)) + ", end=" + ((Object) cht.a(this.d)) + ", bottom=" + ((Object) cht.a(this.b)) + ')';
    }
}
