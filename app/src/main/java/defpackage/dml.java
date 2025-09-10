package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dml {
    public final int a;
    public final azr b;
    public long c;
    public int d;
    public long e;
    public bmz f;
    public final abr g;
    public final abr h;
    private final und i;
    private final azr j;
    private final azr k;
    private final azr l;
    private final azr m;
    private final byz n;

    public dml(und undVar, byz byzVar, int i) {
        this.i = undVar;
        this.n = byzVar;
        this.a = i;
        bap bapVar = bap.c;
        this.j = new azz(false, bapVar);
        this.k = new azz(false, bapVar);
        this.l = new azz(false, bapVar);
        this.b = new azz(false, bapVar);
        this.c = 9223372034707292159L;
        long j = 0;
        this.e = 0L;
        Object obj = null;
        this.f = byzVar != null ? byzVar.j() : null;
        int i2 = 12;
        this.g = new abr(new chy(j), adu.g, obj, i2);
        this.h = new abr(Float.valueOf(1.0f), adu.a, obj, i2);
        this.m = new azz(new chy(j), bapVar);
    }

    public final long a() {
        return ((chy) this.m.a()).a;
    }

    public final void b() {
        bmz bmzVar = this.f;
        d();
        if (e()) {
            if (bmzVar != null) {
                bmzVar.h(1.0f);
            }
            ukc.C(this.i, null, 0, new crd(this, (uhb) null, 8), 3);
        }
    }

    public final void c() {
        byz byzVar;
        azr azrVar = this.j;
        if (((Boolean) azrVar.a()).booleanValue()) {
            azrVar.b(false);
            ukc.C(this.i, null, 0, new crd(this, (uhb) null, 9, (byte[]) null), 3);
        }
        if (d()) {
            this.k.b(false);
            ukc.C(this.i, null, 0, new crd(this, (uhb) null, 10, (char[]) null), 3);
        }
        if (e()) {
            this.l.b(false);
            ukc.C(this.i, null, 0, new crd(this, (uhb) null, 11, (short[]) null), 3);
        }
        this.m.b(new chy(0L));
        this.c = 9223372034707292159L;
        bmz bmzVar = this.f;
        if (bmzVar != null && (byzVar = this.n) != null) {
            byzVar.k(bmzVar);
        }
        this.f = null;
    }

    public final boolean d() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.l.a()).booleanValue();
    }
}
