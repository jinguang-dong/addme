package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gay implements png, paq {
    public final ovx a;
    public final ovx b;
    private final owf c;
    private final fee d;
    private final Object e;
    private boolean f;
    private final ktx g;

    public gay(owf owfVar, ktx ktxVar, fee feeVar, fdq fdqVar) {
        owfVar.getClass();
        ktxVar.getClass();
        this.c = owfVar;
        this.g = ktxVar;
        this.d = feeVar;
        this.e = new Object();
        this.a = new ovx(0);
        this.b = new ovx(pao.CLOCKWISE_0);
        ktxVar.c(this);
        fdqVar.j().d(this);
        d(false);
    }

    private final void d(boolean z) {
        synchronized (this.e) {
            goi goiVar = (goi) this.c.dL();
            int iC = this.d.c(goiVar.a);
            goiVar.a();
            if (!z || !this.f) {
                this.a.a(Integer.valueOf(iC));
            }
            this.b.a(pao.b(iC));
        }
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        paoVar.getClass();
        d(true);
    }

    public final void b() {
        synchronized (this.e) {
            if (this.f) {
                return;
            }
            d(false);
            this.f = true;
        }
    }

    public final void c() {
        synchronized (this.e) {
            if (this.f) {
                d(false);
                this.f = false;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.g.h(this);
    }
}
