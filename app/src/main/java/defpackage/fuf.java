package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuf {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final owf e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public fuf(owf owfVar, hbj hbjVar) {
        this.a = hbjVar.p(hac.z);
        this.f = hbjVar.p(hac.A);
        this.b = hbjVar.p(hac.G);
        this.c = hbjVar.p(gzs.ae);
        this.d = ((Float) hbjVar.e(gzs.af).orElse(Float.valueOf(-11.5f))).floatValue();
        boolean z = false;
        if (hbjVar.p(haw.n) && hbjVar.p(haw.p)) {
            z = true;
        }
        this.g = z;
        this.h = hbjVar.p(gzp.l);
        this.e = owfVar;
    }

    public final boolean a(nkw nkwVar) {
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 6 ? iOrdinal != 11 ? iOrdinal == 17 && this.a && this.h : this.a && this.g : this.a && this.f : this.a;
    }

    public final boolean b(nkw nkwVar) {
        return this.a && nkwVar != nkw.IMAGE_INTENT;
    }
}
