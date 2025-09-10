package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hew implements her {
    public final dco a;
    public final dcb b = new heu();
    public final dbz c = new hev();

    public hew(dco dcoVar) {
        this.a = dcoVar;
    }

    @Override // defpackage.her
    public final int a(long j, long j2) {
        return ((Integer) dei.a(this.a, false, true, new het(j2, j, 0))).intValue();
    }

    @Override // defpackage.her
    public final hez b(long j) {
        return (hez) dei.a(this.a, true, false, new hes(j, 0));
    }

    @Override // defpackage.her
    public final void c(hez hezVar) {
        dei.a(this.a, false, true, new dql(this, hezVar, 13, null));
    }
}
