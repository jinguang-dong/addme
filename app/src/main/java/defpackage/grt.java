package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grt implements grx {
    private final int a;
    private final Object[] b;
    private final iso c;

    public grt(iso isoVar, int i, Object... objArr) {
        this.c = isoVar;
        this.a = i;
        this.b = objArr;
    }

    @Override // defpackage.grx
    public final void b() {
        this.c.s(this.a, this.b);
    }
}
