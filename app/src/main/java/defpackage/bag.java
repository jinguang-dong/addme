package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bag {
    public final ayp a;
    public final boolean b;
    public final bbi c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public bag(ayp aypVar, Object obj, boolean z, bbi bbiVar, boolean z2) {
        this.a = aypVar;
        this.b = z;
        this.c = bbiVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        ayi.g("Unexpected form of a provided value");
        throw new uer();
    }
}
