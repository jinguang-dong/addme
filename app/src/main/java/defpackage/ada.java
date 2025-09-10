package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ada implements adv {
    private final adv a;
    private final long b;

    public ada(adv advVar, long j) {
        this.a = advVar;
        this.b = j;
    }

    @Override // defpackage.adv
    public final long a(ace aceVar, ace aceVar2, ace aceVar3) {
        return this.a.a(aceVar, aceVar2, aceVar3) + this.b;
    }

    @Override // defpackage.adv
    public final /* synthetic */ ace b(ace aceVar, ace aceVar2, ace aceVar3) {
        return byi.aU(this, aceVar, aceVar2, aceVar3);
    }

    @Override // defpackage.adv
    public final ace c(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        long j2 = this.b;
        return j < j2 ? aceVar : this.a.c(j - j2, aceVar, aceVar2, aceVar3);
    }

    @Override // defpackage.adv
    public final ace d(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        long j2 = this.b;
        return j < j2 ? aceVar3 : this.a.d(j - j2, aceVar, aceVar2, aceVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ada)) {
            return false;
        }
        ada adaVar = (ada) obj;
        return adaVar.b == this.b && a.ao(adaVar.a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.r(this.b);
    }
}
