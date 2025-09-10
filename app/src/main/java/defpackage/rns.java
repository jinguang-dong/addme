package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rns extends rnt {
    public rns() {
        super(null);
    }

    @Override // defpackage.rnt
    public final void a(rok rokVar, float f, float f2) {
        float f3 = f2 * f;
        rokVar.f(f3, 180.0f, 90.0f);
        double d = f3;
        rokVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
