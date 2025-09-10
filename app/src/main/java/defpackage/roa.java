package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roa extends rnt {
    public roa() {
        super(null);
    }

    @Override // defpackage.rnt
    public final void a(rok rokVar, float f, float f2) {
        float f3 = f2 * f;
        rokVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        rog rogVar = new rog(0.0f, 0.0f, f4, f4);
        rogVar.e = 180.0f;
        rogVar.f = 90.0f;
        rokVar.f.add(rogVar);
        rokVar.b(new roj(), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        rokVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        rokVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
