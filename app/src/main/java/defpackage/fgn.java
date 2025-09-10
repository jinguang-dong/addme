package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final float e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public fgn(hbj hbjVar) {
        Optional optionalE = hbjVar.e(gyh.a);
        Float fValueOf = Float.valueOf(1.0f);
        this.d = ((Float) optionalE.orElse(fValueOf)).floatValue();
        this.e = ((Float) hbjVar.e(gyh.b).orElse(fValueOf)).floatValue();
        this.a = hbjVar.p(gzo.aa);
        this.b = hbjVar.p(gyh.c);
        this.f = hbjVar.p(gyh.h);
        this.g = hbjVar.p(gyh.g);
        this.c = hbjVar.o(gyh.i);
        this.h = hbjVar.o(gyh.j);
        this.i = hbjVar.p(gyh.d);
        this.j = hbjVar.p(gyh.e);
        this.k = hbjVar.p(gyh.f);
    }

    public final boolean a() {
        return this.b && this.f;
    }

    public final boolean b() {
        return c();
    }

    public final boolean c() {
        return this.b && this.g;
    }

    public final boolean d(nkw nkwVar) {
        if (!this.b) {
            return false;
        }
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        if (iOrdinal == 1) {
            return f();
        }
        if (iOrdinal == 10) {
            return this.k;
        }
        if (iOrdinal == 15 || iOrdinal == 16) {
            return e();
        }
        return false;
    }

    public final boolean e() {
        return this.b && this.j;
    }

    public final boolean f() {
        return this.b && this.i;
    }

    public final boolean g() {
        return this.b && this.h;
    }
}
