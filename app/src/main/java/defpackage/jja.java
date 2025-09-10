package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jja {
    public ltf a;
    public srw b;
    public Float c;
    private boolean d;
    private boolean e;
    private jjq f;
    private lkk g;
    private boolean h;
    private byte i;

    public final jjb a() {
        ltf ltfVar;
        jjq jjqVar;
        lkk lkkVar;
        if (this.i != 7 || (ltfVar = this.a) == null || (jjqVar = this.f) == null || (lkkVar = this.g) == null) {
            throw new IllegalStateException();
        }
        return new jjb(ltfVar, this.b, this.c, this.d, this.e, jjqVar, lkkVar, this.h);
    }

    public final void b(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 1);
    }

    public final void c(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 2);
    }

    public final void d(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 4);
    }

    public final void e(lkk lkkVar) {
        lkkVar.getClass();
        this.g = lkkVar;
    }

    public final void f(jjq jjqVar) {
        jjqVar.getClass();
        this.f = jjqVar;
    }
}
