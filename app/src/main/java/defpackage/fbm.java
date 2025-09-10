package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbm {
    public long a = 0;
    public boolean b;
    private final owf c;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owf] */
    public fbm(gox goxVar, fqg fqgVar) {
        ?? r3 = goxVar.c;
        this.c = r3;
        this.b = ((Boolean) ((ovx) r3).d).booleanValue();
        fqgVar.b.d(r3.dK(new fbo(this, 1), sxo.a));
    }

    public final boolean a() {
        return ((Boolean) ((ovx) this.c).d).booleanValue() || System.currentTimeMillis() - this.a < 3000;
    }
}
