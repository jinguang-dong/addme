package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rob {
    public rnr a;
    public rnr b;
    public rnr c;
    public rnr d;
    public rnt e;
    public rnt f;
    public rnt g;
    public rnt h;
    public rnt i;
    public rnt j;
    public rnt k;
    public rnt l;

    public rob() {
        this.i = new roa();
        this.j = new roa();
        this.k = new roa();
        this.l = new roa();
        this.a = new rno(0.0f);
        this.b = new rno(0.0f);
        this.c = new rno(0.0f);
        this.d = new rno(0.0f);
        this.e = new rnt();
        this.f = new rnt();
        this.g = new rnt();
        this.h = new rnt();
    }

    private static void f(rnt rntVar) {
        if (rntVar instanceof roa) {
        } else if (rntVar instanceof rns) {
        }
    }

    public final void a(float f) {
        this.a = new rno(f);
        this.b = new rno(f);
        this.c = new rno(f);
        this.d = new rno(f);
    }

    public final void b(rnt rntVar) {
        this.l = rntVar;
        f(rntVar);
    }

    public final void c(rnt rntVar) {
        this.k = rntVar;
        f(rntVar);
    }

    public final void d(rnt rntVar) {
        this.i = rntVar;
        f(rntVar);
    }

    public final void e(rnt rntVar) {
        this.j = rntVar;
        f(rntVar);
    }

    public rob(roc rocVar) {
        this.i = new roa();
        this.j = new roa();
        this.k = new roa();
        this.l = new roa();
        this.a = new rno(0.0f);
        this.b = new rno(0.0f);
        this.c = new rno(0.0f);
        this.d = new rno(0.0f);
        this.e = new rnt();
        this.f = new rnt();
        this.g = new rnt();
        this.h = new rnt();
        this.i = rocVar.j;
        this.j = rocVar.k;
        this.k = rocVar.l;
        this.l = rocVar.m;
        this.a = rocVar.b;
        this.b = rocVar.c;
        this.c = rocVar.d;
        this.d = rocVar.e;
        this.e = rocVar.f;
        this.f = rocVar.g;
        this.g = rocVar.h;
        this.h = rocVar.i;
    }
}
