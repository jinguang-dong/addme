package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee implements ady {
    private final int a;
    private final int b;
    private final ack c;
    private final aea d;

    public aee(int i, int i2, ack ackVar) {
        this.a = i;
        this.b = i2;
        this.c = ackVar;
        this.d = new aea(new acq(i, i2, ackVar));
    }

    @Override // defpackage.adv
    public final /* synthetic */ long a(ace aceVar, ace aceVar2, ace aceVar3) {
        return byi.aT(this);
    }

    @Override // defpackage.adv
    public final /* synthetic */ ace b(ace aceVar, ace aceVar2, ace aceVar3) {
        return byi.aU(this, aceVar, aceVar2, aceVar3);
    }

    @Override // defpackage.adv
    public final ace c(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        return this.d.c(j, aceVar, aceVar2, aceVar3);
    }

    @Override // defpackage.adv
    public final ace d(long j, ace aceVar, ace aceVar2, ace aceVar3) {
        return this.d.d(j, aceVar, aceVar2, aceVar3);
    }

    @Override // defpackage.ady
    public final int e() {
        return this.b;
    }

    @Override // defpackage.ady
    public final int f() {
        return this.a;
    }

    public aee() {
        this(300, 0, acm.a);
    }
}
