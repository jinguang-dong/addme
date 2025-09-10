package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bdf {
    public final int b;
    public final int c;

    public bdf(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar);

    protected axq b(bdi bdiVar) {
        return null;
    }

    public final String toString() {
        int i = ukb.a;
        String strC = new uji(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ bdf(int i, int i2, int i3) {
        this(1 == (i3 & 1) ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
