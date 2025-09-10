package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esq implements esw {
    public final boolean a;
    private final esw b;
    private final eqi c;
    private int d;
    private boolean e;
    private final ree f;

    public esq(esw eswVar, boolean z, eqi eqiVar, ree reeVar) {
        eoz.k(eswVar);
        this.b = eswVar;
        this.a = z;
        this.c = eqiVar;
        eoz.k(reeVar);
        this.f = reeVar;
    }

    @Override // defpackage.esw
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.esw
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.esw
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.d++;
    }

    @Override // defpackage.esw
    public final synchronized void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.e = true;
        this.b.e();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [etx, java.lang.Object] */
    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.d = i;
        }
        if (i == 0) {
            ree reeVar = this.f;
            eqi eqiVar = this.c;
            ((ers) reeVar.d).d(eqiVar);
            if (this.a) {
                reeVar.c.d(eqiVar, this);
            } else {
                ((nyt) reeVar.f).a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        esw eswVar;
        eqi eqiVar;
        eswVar = this.b;
        eqiVar = this.c;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f.toString() + ", key=" + String.valueOf(eqiVar) + ", acquired=" + this.d + ", isRecycled=" + this.e + ", resource=" + eswVar.toString() + "}";
    }
}
