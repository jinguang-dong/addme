package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bai {
    public int a;
    public baj b;
    public axq c;
    public uiu d;
    public int e;
    public zm f;
    public zu g;

    public bai(baj bajVar) {
        this.b = bajVar;
    }

    public static final boolean p(ayv ayvVar, zu zuVar) {
        ayvVar.getClass();
        bbi bbiVar = ayvVar.b;
        if (bbiVar == null) {
            bbiVar = bap.c;
        }
        return !bbiVar.a(ayvVar.e().e, zuVar.a(ayvVar));
    }

    public final void a() {
        baj bajVar = this.b;
        if (bajVar != null) {
            bajVar.c(this, null);
        }
    }

    public final void b() {
        baj bajVar = this.b;
        if (bajVar != null) {
            bajVar.b();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void c(boolean z) {
        this.a = z ? this.a | 4 : this.a & (-5);
    }

    public final void d(boolean z) {
        this.a = z ? this.a | 8 : this.a & (-9);
    }

    public final void e(boolean z) {
        this.a = z ? this.a | 32 : this.a & (-33);
    }

    public final void f(boolean z) {
        this.a = z ? this.a | 512 : this.a & (-513);
    }

    public final void g(boolean z) {
        this.a = z ? this.a | 16 : this.a & (-17);
    }

    public final void h(int i) {
        this.e = i;
        g(false);
    }

    public final boolean i() {
        return (this.a & 128) != 0;
    }

    public final boolean j() {
        return (this.a & 16) != 0;
    }

    public final boolean k() {
        return (this.a & 1) != 0;
    }

    public final boolean l() {
        axq axqVar;
        return (this.b == null || (axqVar = this.c) == null || !axqVar.a()) ? false : true;
    }

    public final boolean m() {
        return this.g != null;
    }

    public final void n() {
        this.a |= 1;
    }

    public final int o(Object obj) {
        baj bajVar = this.b;
        if (bajVar != null) {
            return bajVar.c(this, obj);
        }
        return 1;
    }
}
