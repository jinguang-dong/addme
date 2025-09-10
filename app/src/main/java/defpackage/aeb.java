package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeb {
    public ace a;
    public ace b;
    public final ocq c;
    private ace d;

    public aeb(ocq ocqVar) {
        this.c = ocqVar;
    }

    public final ace a(ace aceVar, ace aceVar2) {
        if (this.d == null) {
            this.d = aceVar.c();
        }
        ace aceVar3 = this.d;
        if (aceVar3 == null) {
            ujp.c("targetVector");
            aceVar3 = null;
        }
        int iB = aceVar3.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar4 = this.d;
            if (aceVar4 == null) {
                ujp.c("targetVector");
                aceVar4 = null;
            }
            ocq ocqVar = this.c;
            float fA = aceVar.a(i);
            float fA2 = aceVar2.a(i);
            double dA = ((abd) ocqVar.a).a(fA2);
            double d = abe.a;
            aceVar4.e(i, fA + (((float) (r6.a * r6.b * Math.exp((d / ((-1.0d) + d)) * dA))) * Math.signum(fA2)));
        }
        ace aceVar5 = this.d;
        if (aceVar5 != null) {
            return aceVar5;
        }
        ujp.c("targetVector");
        return null;
    }

    public final ace b(long j, ace aceVar, ace aceVar2) {
        if (this.b == null) {
            this.b = aceVar.c();
        }
        ace aceVar3 = this.b;
        if (aceVar3 == null) {
            ujp.c("velocityVector");
            aceVar3 = null;
        }
        int iB = aceVar3.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar4 = this.b;
            if (aceVar4 == null) {
                ujp.c("velocityVector");
                aceVar4 = null;
            }
            ocq ocqVar = this.c;
            aceVar.a(i);
            abc abcVarB = ((abd) ocqVar.a).b(aceVar2.a(i));
            long j2 = abcVarB.c;
            float f = j2;
            float f2 = j2 > 0 ? (j / 1000000) / f : 1.0f;
            int i2 = aag.a;
            aceVar4.e(i, (((aag.a(f2).b * Math.signum(abcVarB.a)) * abcVarB.b) / f) * 1000.0f);
        }
        ace aceVar5 = this.b;
        if (aceVar5 != null) {
            return aceVar5;
        }
        ujp.c("velocityVector");
        return null;
    }
}
