package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezu implements ezp, ezn {
    public volatile ezn a;
    public volatile ezn b;
    private final ezp c;
    private final Object d;
    private ezo e;
    private ezo f;
    private boolean g;

    public ezu(Object obj, ezp ezpVar) {
        ezo ezoVar = ezo.CLEARED;
        this.e = ezoVar;
        this.f = ezoVar;
        this.d = obj;
        this.c = ezpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ezp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ezp
    public final ezp a() {
        ?? A;
        synchronized (this.d) {
            ezp ezpVar = this.c;
            this = this;
            if (ezpVar != null) {
                A = ezpVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ezn
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != ezo.SUCCESS) {
                    ezo ezoVar = this.f;
                    ezo ezoVar2 = ezo.RUNNING;
                    if (ezoVar != ezoVar2) {
                        this.f = ezoVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    ezo ezoVar3 = this.e;
                    ezo ezoVar4 = ezo.RUNNING;
                    if (ezoVar3 != ezoVar4) {
                        this.e = ezoVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.ezn
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            ezo ezoVar = ezo.CLEARED;
            this.e = ezoVar;
            this.f = ezoVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.ezp
    public final void d(ezn eznVar) {
        synchronized (this.d) {
            if (!eznVar.equals(this.a)) {
                this.f = ezo.FAILED;
                return;
            }
            this.e = ezo.FAILED;
            ezp ezpVar = this.c;
            if (ezpVar != null) {
                ezpVar.d(this);
            }
        }
    }

    @Override // defpackage.ezp
    public final void e(ezn eznVar) {
        synchronized (this.d) {
            if (eznVar.equals(this.b)) {
                this.f = ezo.SUCCESS;
                return;
            }
            this.e = ezo.SUCCESS;
            ezp ezpVar = this.c;
            if (ezpVar != null) {
                ezpVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.ezn
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = ezo.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = ezo.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.ezp
    public final boolean g(ezn eznVar) {
        boolean z;
        synchronized (this.d) {
            ezp ezpVar = this.c;
            z = false;
            if ((ezpVar == null || ezpVar.g(this)) && eznVar.equals(this.a) && this.e != ezo.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ezp
    public final boolean h(ezn eznVar) {
        boolean z;
        synchronized (this.d) {
            ezp ezpVar = this.c;
            z = false;
            if ((ezpVar == null || ezpVar.h(this)) && eznVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ezp
    public final boolean i(ezn eznVar) {
        boolean z;
        synchronized (this.d) {
            ezp ezpVar = this.c;
            z = false;
            if ((ezpVar == null || ezpVar.i(this)) && (eznVar.equals(this.a) || this.e != ezo.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ezp, defpackage.ezn
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ezo.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ezo.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean m(ezn eznVar) {
        if (eznVar instanceof ezu) {
            ezu ezuVar = (ezu) eznVar;
            if (this.a != null ? this.a.m(ezuVar.a) : ezuVar.a == null) {
                if (this.b == null) {
                    if (ezuVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(ezuVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ezn
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ezo.RUNNING;
        }
        return z;
    }
}
