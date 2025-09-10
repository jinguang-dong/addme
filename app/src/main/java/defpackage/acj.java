package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acj implements abv {
    private final Object a;
    private final ace b;
    private final ace c;
    private final ace d;
    private final Object e;
    private final long f;
    private final aeb g;
    private final byz h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, uiq] */
    public acj(ocq ocqVar, byz byzVar, Object obj, ace aceVar) {
        aeb aebVarAH = ocqVar.aH();
        this.g = aebVarAH;
        this.h = byzVar;
        this.a = obj;
        ace aceVar2 = (ace) byzVar.a.a(obj);
        this.b = aceVar2;
        this.c = byi.bc(aceVar);
        this.e = byzVar.b.a(aebVarAH.a(aceVar2, aceVar));
        if (aebVarAH.b == null) {
            aebVarAH.b = aceVar2.c();
        }
        ace aceVar3 = aebVarAH.b;
        if (aceVar3 == null) {
            ujp.c("velocityVector");
            aceVar3 = null;
        }
        int iB = aceVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            ocq ocqVar2 = aebVarAH.c;
            aceVar2.a(i);
            jMax = Math.max(jMax, ((long) (Math.exp(((abd) ocqVar2.a).a(aceVar.a(i)) / (abe.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f = jMax;
        ace aceVarBc = byi.bc(this.g.b(jMax, this.b, aceVar));
        this.d = aceVarBc;
        int iB2 = aceVarBc.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            ace aceVar4 = this.d;
            aceVar4.e(i2, ukc.m(aceVar4.a(i2), 0.0f, 0.0f));
        }
    }

    @Override // defpackage.abv
    public final long a() {
        return this.f;
    }

    @Override // defpackage.abv
    public final ace b(long j) {
        return !byi.bh(this, j) ? this.g.b(j, this.b, this.c) : this.d;
    }

    @Override // defpackage.abv
    public final Object c() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, uiq] */
    @Override // defpackage.abv
    public final Object d(long j) {
        if (byi.bh(this, j)) {
            return this.e;
        }
        byz byzVar = this.h;
        aeb aebVar = this.g;
        ace aceVar = this.b;
        ace aceVar2 = this.c;
        if (aebVar.a == null) {
            aebVar.a = aceVar.c();
        }
        ace aceVar3 = aebVar.a;
        ace aceVar4 = null;
        if (aceVar3 == null) {
            ujp.c("valueVector");
            aceVar3 = null;
        }
        int iB = aceVar3.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar5 = aebVar.a;
            if (aceVar5 == null) {
                ujp.c("valueVector");
                aceVar5 = null;
            }
            ocq ocqVar = aebVar.c;
            float fA = aceVar.a(i);
            abc abcVarB = ((abd) ocqVar.a).b(aceVar2.a(i));
            long j2 = abcVarB.c;
            float f = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
            float fSignum = abcVarB.b * Math.signum(abcVarB.a);
            int i2 = aag.a;
            aceVar5.e(i, fA + (fSignum * aag.a(f).a));
        }
        ace aceVar6 = aebVar.a;
        if (aceVar6 == null) {
            ujp.c("valueVector");
        } else {
            aceVar4 = aceVar6;
        }
        return byzVar.b.a(aceVar4);
    }

    @Override // defpackage.abv
    public final /* synthetic */ boolean e(long j) {
        return byi.bh(this, j);
    }

    @Override // defpackage.abv
    public final byz g() {
        return this.h;
    }

    @Override // defpackage.abv
    public final void f() {
    }
}
