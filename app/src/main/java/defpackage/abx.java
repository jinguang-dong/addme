package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abx {
    public final Object a;
    public final long b;
    public final azr c;
    public ace d;
    public long e;
    public long f;
    public final byz g;
    private final uif h;
    private final azr i;

    public abx(Object obj, byz byzVar, ace aceVar, long j, Object obj2, long j2, uif uifVar) {
        this.g = byzVar;
        this.a = obj2;
        this.b = j2;
        this.h = uifVar;
        bap bapVar = bap.c;
        this.c = new azz(obj, bapVar);
        this.d = byi.bc(aceVar);
        this.e = j;
        this.f = Long.MIN_VALUE;
        this.i = new azz(true, bapVar);
    }

    public final Object a() {
        return this.c.a();
    }

    public final void b() {
        d();
        this.h.a();
    }

    public final boolean c() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final void d() {
        this.i.b(false);
    }
}
