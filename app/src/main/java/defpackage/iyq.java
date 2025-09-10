package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyq implements may {
    public final /* synthetic */ iyu a;

    public iyq(iyu iyuVar) {
        this.a = iyuVar;
    }

    @Override // defpackage.may
    public final void a() {
        iyu iyuVar = this.a;
        if (iyuVar.x) {
            iyuVar.x = false;
            iyuVar.d.post(new iyz(iyuVar, 1));
        }
        iyuVar.d.post(new ivi(this, 13));
    }

    @Override // defpackage.may
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void e() {
    }
}
