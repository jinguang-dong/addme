package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adf implements abv {
    public final Object a;
    public final Object b;
    private final adv c;
    private final ace d;
    private final ace e;
    private final ace f;
    private long g;
    private ace h;
    private final byz i;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, uiq] */
    public adf(aby abyVar, byz byzVar, Object obj, Object obj2, ace aceVar) {
        this.c = abyVar.a(byzVar);
        this.i = byzVar;
        this.a = obj2;
        this.b = obj;
        this.d = (ace) byzVar.a.a(obj);
        this.e = (ace) byzVar.a.a(obj2);
        this.f = aceVar != null ? byi.bc(aceVar) : ((ace) byzVar.a.a(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.abv
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.abv
    public final ace b(long j) {
        if (!byi.bh(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        ace aceVar = this.h;
        if (aceVar != null) {
            return aceVar;
        }
        ace aceVarB = this.c.b(this.d, this.e, this.f);
        this.h = aceVarB;
        return aceVarB;
    }

    @Override // defpackage.abv
    public final Object c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, uiq] */
    @Override // defpackage.abv
    public final Object d(long j) {
        if (byi.bh(this, j)) {
            return this.a;
        }
        ace aceVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = aceVarC.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(aceVarC.a(i))) {
                acv.b("AnimationVector cannot contain a NaN. " + aceVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.b.a(aceVarC);
    }

    @Override // defpackage.abv
    public final /* synthetic */ boolean e(long j) {
        return byi.bh(this, j);
    }

    @Override // defpackage.abv
    public final byz g() {
        return this.i;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    @Override // defpackage.abv
    public final void f() {
    }
}
