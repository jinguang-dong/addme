package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoa {
    public final und a;
    public final azr b;
    public long c;
    public long d;
    public bmz e;
    public final abr f;
    public final abr g;
    public final azr h;
    public long i;
    private final azr j;
    private final azr k;
    private final azr l;
    private final byz m;

    public aoa(und undVar, byz byzVar) {
        this.a = undVar;
        this.m = byzVar;
        bap bapVar = bap.c;
        this.j = new azz(false, bapVar);
        this.k = new azz(false, bapVar);
        this.l = new azz(false, bapVar);
        this.b = new azz(false, bapVar);
        this.c = 9223372034707292159L;
        long j = 0;
        this.d = 0L;
        Object obj = null;
        this.e = byzVar != null ? byzVar.j() : null;
        int i = 12;
        this.f = new abr(new chy(j), adu.g, obj, i);
        this.g = new abr(Float.valueOf(1.0f), adu.a, obj, i);
        this.h = new azz(new chy(j), bapVar);
        this.i = 9223372034707292159L;
    }

    public final void a() {
        bmz bmzVar = this.e;
        c();
        if (d()) {
            if (bmzVar != null) {
                bmzVar.h(1.0f);
            }
            ukc.C(this.a, null, 0, new vf(this, (uhb) null, 13), 3);
        }
    }

    public final void b() {
        byz byzVar;
        if (e()) {
            f();
            ukc.C(this.a, null, 0, new vf(this, (uhb) null, 15, (char[]) null), 3);
        }
        if (c()) {
            this.k.b(false);
            ukc.C(this.a, null, 0, new vf(this, (uhb) null, 16, (short[]) null), 3);
        }
        if (d()) {
            this.l.b(false);
            ukc.C(this.a, null, 0, new vf(this, (uhb) null, 17, (int[]) null), 3);
        }
        g();
        this.c = 9223372034707292159L;
        bmz bmzVar = this.e;
        if (bmzVar != null && (byzVar = this.m) != null) {
            byzVar.k(bmzVar);
        }
        this.e = null;
    }

    public final boolean c() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final void f() {
        this.j.b(false);
    }

    public final void g() {
        this.h.b(new chy(0L));
    }
}
