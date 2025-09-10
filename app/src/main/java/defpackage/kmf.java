package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmf implements kmk {
    final /* synthetic */ kmh a;
    private boolean b = false;
    private boolean c = false;
    private int d = 1;
    private int e = 0;
    private long f = -1;
    private final /* synthetic */ int g;

    public kmf(kmh kmhVar, int i) {
        this.g = i;
        this.a = kmhVar;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        if (this.g != 0) {
            this.a.b.execute(new kdx(this, 10));
        } else {
            this.a.b.execute(new kdx(this, 14));
        }
    }

    @Override // defpackage.kmk
    public final synchronized void b() {
        if (this.g != 0) {
            this.a.b.execute(new kdx(this, 12));
        } else {
            this.a.b.execute(new kdx(this, 15));
        }
    }

    public final synchronized void c() {
        if (this.g != 0) {
            if (this.a.c.get()) {
                synchronized (this) {
                    while (this.e < this.d) {
                        i();
                    }
                }
                return;
            }
            return;
        }
        if (this.a.c.get()) {
            synchronized (this) {
                while (this.e < this.d) {
                    i();
                }
            }
            return;
        }
        return;
    }

    public final void d() {
        if (this.g != 0) {
            if (this.b) {
                return;
            }
            kmh kmhVar = this.a;
            if (kmhVar.c.get()) {
                this.b = true;
                kmhVar.d.C();
                synchronized (this) {
                    long j = this.f;
                    if (j > 0) {
                        this.a.a.a.g(0.0f, j);
                    } else {
                        this.a.a.a.e(0.0f);
                    }
                }
                return;
            }
            return;
        }
        synchronized (this) {
            if (this.d == 0) {
                if (!this.b) {
                    kmh kmhVar2 = this.a;
                    if (kmhVar2.c.get()) {
                        this.b = true;
                        kmhVar2.g();
                    }
                }
                this.a.c.set(false);
                return;
            }
            if (this.b) {
                return;
            }
            kmh kmhVar3 = this.a;
            if (kmhVar3.c.get()) {
                this.b = true;
                kmhVar3.d.C();
                synchronized (this) {
                    long j2 = this.f;
                    if (j2 > 0) {
                        this.a.a.a.g(0.0f, j2);
                    } else {
                        this.a.a.a.f(0.0f, this.d);
                    }
                }
            }
        }
    }

    @Override // defpackage.kmk
    public final synchronized void e(int i) {
        if (this.g == 0) {
            this.d = i;
        } else {
            a.I(i > 0);
            this.d = i;
        }
    }

    @Override // defpackage.kmk
    public final synchronized void f(boolean z) {
        if (this.g != 0) {
            if (!z && this.c) {
                kmh kmhVar = this.a;
                kmhVar.a.a.c(this.f);
            }
            this.c = z;
            return;
        }
        if (!z && this.c) {
            kmh kmhVar2 = this.a;
            kmhVar2.a.a.c(this.f);
        }
        this.c = z;
    }

    @Override // defpackage.kmk
    public final synchronized void g(long j) {
        if (this.g != 0) {
            this.f = j;
        } else {
            this.f = j;
        }
    }

    @Override // defpackage.kmk
    public final void h() {
        if (this.g != 0) {
            this.a.b.execute(new kdx(this, 11));
        } else {
            this.a.b.execute(new kdx(this, 13));
        }
    }

    public final void i() {
        boolean z = true;
        if (this.g != 0) {
            d();
            if (this.a.c.get()) {
                synchronized (this) {
                    int i = this.e + 1;
                    this.e = i;
                    if (i > this.d) {
                        z = false;
                    }
                    rnt.L(z);
                    float f = this.e / this.d;
                    if (f == 1.0f) {
                        this.a.c.set(false);
                    }
                    long j = this.f;
                    if (j > 0) {
                        this.a.a.a.g(f, j);
                    } else {
                        this.a.a.a.e(f);
                    }
                }
                return;
            }
            return;
        }
        d();
        if (this.a.c.get()) {
            synchronized (this) {
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 > this.d) {
                    z = false;
                }
                rnt.L(z);
                float f2 = this.e / this.d;
                if (f2 == 1.0f) {
                    this.a.c.set(false);
                }
                long j2 = this.f;
                if (j2 > 0) {
                    this.a.a.a.g(f2, j2);
                } else {
                    this.a.a.a.f(f2, this.d - this.e);
                }
            }
        }
    }
}
