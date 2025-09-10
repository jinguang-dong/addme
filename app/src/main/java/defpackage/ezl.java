package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezl implements ezp, ezn {
    public volatile ezn a;
    public volatile ezn b;
    private final Object c;
    private final ezp d;
    private ezo e;
    private ezo f;

    public ezl(Object obj, ezp ezpVar) {
        ezo ezoVar = ezo.CLEARED;
        this.e = ezoVar;
        this.f = ezoVar;
        this.c = obj;
        this.d = ezpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ezp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ezp
    public final ezp a() {
        ?? A;
        synchronized (this.c) {
            ezp ezpVar = this.d;
            this = this;
            if (ezpVar != null) {
                A = ezpVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ezn
    public final void b() {
        synchronized (this.c) {
            ezo ezoVar = this.e;
            ezo ezoVar2 = ezo.RUNNING;
            if (ezoVar != ezoVar2) {
                this.e = ezoVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.ezn
    public final void c() {
        synchronized (this.c) {
            ezo ezoVar = ezo.CLEARED;
            this.e = ezoVar;
            this.a.c();
            if (this.f != ezoVar) {
                this.f = ezoVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.ezp
    public final void d(ezn eznVar) {
        synchronized (this.c) {
            if (eznVar.equals(this.b)) {
                this.f = ezo.FAILED;
                ezp ezpVar = this.d;
                if (ezpVar != null) {
                    ezpVar.d(this);
                }
                return;
            }
            this.e = ezo.FAILED;
            ezo ezoVar = this.f;
            ezo ezoVar2 = ezo.RUNNING;
            if (ezoVar != ezoVar2) {
                this.f = ezoVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.ezp
    public final void e(ezn eznVar) {
        synchronized (this.c) {
            if (eznVar.equals(this.a)) {
                this.e = ezo.SUCCESS;
            } else if (eznVar.equals(this.b)) {
                this.f = ezo.SUCCESS;
            }
            ezp ezpVar = this.d;
            if (ezpVar != null) {
                ezpVar.e(this);
            }
        }
    }

    @Override // defpackage.ezn
    public final void f() {
        synchronized (this.c) {
            ezo ezoVar = this.e;
            ezo ezoVar2 = ezo.RUNNING;
            if (ezoVar == ezoVar2) {
                this.e = ezo.PAUSED;
                this.a.f();
            }
            if (this.f == ezoVar2) {
                this.f = ezo.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.ezp
    public final boolean g(ezn eznVar) {
        boolean z;
        synchronized (this.c) {
            ezp ezpVar = this.d;
            z = false;
            if ((ezpVar == null || ezpVar.g(this)) && eznVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ezp
    public final boolean h(ezn eznVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            ezp ezpVar = this.d;
            z = false;
            if (ezpVar == null || ezpVar.h(this)) {
                ezo ezoVar = this.e;
                ezo ezoVar2 = ezo.FAILED;
                if (ezoVar == ezoVar2) {
                    if (eznVar.equals(this.b)) {
                        ezo ezoVar3 = this.f;
                        if (ezoVar3 != ezo.SUCCESS) {
                            if (ezoVar3 == ezoVar2) {
                                z = true;
                            }
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = false;
                    }
                }
                zEquals = eznVar.equals(this.a);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.ezp
    public final boolean i(ezn eznVar) {
        boolean z;
        synchronized (this.c) {
            ezp ezpVar = this.d;
            z = true;
            if (ezpVar != null && !ezpVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ezp, defpackage.ezn
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            ezo ezoVar = this.e;
            ezo ezoVar2 = ezo.CLEARED;
            z = false;
            if (ezoVar == ezoVar2 && this.f == ezoVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            ezo ezoVar = this.e;
            ezo ezoVar2 = ezo.SUCCESS;
            z = true;
            if (ezoVar != ezoVar2 && this.f != ezoVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean m(ezn eznVar) {
        if (eznVar instanceof ezl) {
            ezl ezlVar = (ezl) eznVar;
            if (this.a.m(ezlVar.a) && this.b.m(ezlVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ezn
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            ezo ezoVar = this.e;
            ezo ezoVar2 = ezo.RUNNING;
            z = true;
            if (ezoVar != ezoVar2 && this.f != ezoVar2) {
                z = false;
            }
        }
        return z;
    }
}
