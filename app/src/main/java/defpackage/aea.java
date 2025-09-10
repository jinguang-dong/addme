package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aea implements adv {
    private final acf a;
    private ace b;
    private ace c;
    private ace d;

    public aea(acf acfVar) {
        this.a = acfVar;
    }

    @Override // defpackage.adv
    public final long a(ace aceVar, ace aceVar2, ace aceVar3) {
        int iB = aceVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.a(i).e(aceVar.a(i), aceVar2.a(i), aceVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.adv
    public final ace b(ace aceVar, ace aceVar2, ace aceVar3) {
        if (this.d == null) {
            this.d = aceVar3.c();
        }
        ace aceVar4 = this.d;
        if (aceVar4 == null) {
            ujp.c("endVelocityVector");
            aceVar4 = null;
        }
        int iB = aceVar4.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar5 = this.d;
            if (aceVar5 == null) {
                ujp.c("endVelocityVector");
                aceVar5 = null;
            }
            aceVar5.e(i, this.a.a(i).b(aceVar.a(i), aceVar2.a(i), aceVar3.a(i)));
        }
        ace aceVar6 = this.d;
        if (aceVar6 != null) {
            return aceVar6;
        }
        ujp.c("endVelocityVector");
        return null;
    }

    @Override // defpackage.adv
    public final ace c(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        if (this.b == null) {
            this.b = aceVar.c();
        }
        ace aceVar4 = this.b;
        if (aceVar4 == null) {
            ujp.c("valueVector");
            aceVar4 = null;
        }
        int iB = aceVar4.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar5 = this.b;
            if (aceVar5 == null) {
                ujp.c("valueVector");
                aceVar5 = null;
            }
            aceVar5.e(i, this.a.a(i).c(j, aceVar.a(i), aceVar2.a(i), aceVar3.a(i)));
        }
        ace aceVar6 = this.b;
        if (aceVar6 != null) {
            return aceVar6;
        }
        ujp.c("valueVector");
        return null;
    }

    @Override // defpackage.adv
    public final ace d(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        if (this.c == null) {
            this.c = aceVar3.c();
        }
        ace aceVar4 = this.c;
        if (aceVar4 == null) {
            ujp.c("velocityVector");
            aceVar4 = null;
        }
        int iB = aceVar4.b();
        for (int i = 0; i < iB; i++) {
            ace aceVar5 = this.c;
            if (aceVar5 == null) {
                ujp.c("velocityVector");
                aceVar5 = null;
            }
            aceVar5.e(i, this.a.a(i).d(j, aceVar.a(i), aceVar2.a(i), aceVar3.a(i)));
        }
        ace aceVar6 = this.c;
        if (aceVar6 != null) {
            return aceVar6;
        }
        ujp.c("velocityVector");
        return null;
    }

    public aea(aco acoVar) {
        this(new adz(acoVar));
    }
}
