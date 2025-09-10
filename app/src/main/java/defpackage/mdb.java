package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdb {
    int a = 1;
    private final mdd b;
    private mdd c;
    private final boolean d;

    public mdb(mdd mddVar, boolean z) {
        this.c = mddVar;
        this.b = mddVar;
        this.d = z;
    }

    public final mdd a() {
        if (this.a != 2) {
            return null;
        }
        return this.c;
    }

    public final void b() {
        rnt.L(this.a == 3);
        this.c = this.b;
    }

    public final void c() {
        if (this.a == 3) {
            if (!this.d) {
                this.c = this.b;
            }
            this.a = 2;
            mdd mddVar = this.c;
            rnt.x(mddVar);
            mddVar.a();
        }
    }

    public final void d() {
        if (this.a == 2) {
            mdd mddVar = this.c;
            rnt.x(mddVar);
            mddVar.b();
            this.a = 3;
        }
    }

    public final void e() {
        mdd mddVar = this.c;
        mddVar.getClass();
        mddVar.b();
        this.c = null;
    }

    public final void f() {
        this.a = 3;
    }

    public final void g(mdd mddVar) {
        mddVar.getClass();
        rnt.M(this.c == null, "Setting new state without first exiting current state");
        if (this.a == 1) {
            this.a = 2;
        }
        this.c = mddVar;
        mddVar.a();
    }
}
