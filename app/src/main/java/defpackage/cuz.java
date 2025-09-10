package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuz {
    public final yi a;
    public final yi b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        new cuz(new uev(fValueOf, fValueOf), new uev(fValueOf2, fValueOf2));
    }

    public cuz(uev... uevVarArr) {
        uevVarArr.getClass();
        int length = uevVarArr.length;
        this.a = new yi(length);
        this.b = new yi(length);
        for (int i = 0; i < uevVarArr.length; i++) {
            this.a.c(((Number) uevVarArr[i].a).floatValue());
            this.b.c(((Number) uevVarArr[i].b).floatValue());
        }
        cpo.g(this.a);
        cpo.g(this.b);
    }

    public final float a(float f) {
        return cpo.e(this.a, this.b, f);
    }
}
