package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkk implements alv {
    private final alv a;
    private final float b;

    public dkk(alv alvVar, float f) {
        this.a = alvVar;
        this.b = f;
    }

    @Override // defpackage.alv
    public final float a() {
        return ((alw) this.a).b + this.b;
    }

    @Override // defpackage.alv
    public final float b(cib cibVar) {
        return this.a.b(cibVar);
    }

    @Override // defpackage.alv
    public final float c(cib cibVar) {
        return this.a.c(cibVar);
    }

    @Override // defpackage.alv
    public final float d() {
        return ((alw) this.a).a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dkk dkkVar = (dkk) obj;
        return a.ao(this.a, dkkVar.a) && cht.b(this.b, dkkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "CombinedPaddingValuesImpl(contentPadding=" + this.a + ", extraPadding=" + ((Object) cht.a(this.b)) + ')';
    }
}
