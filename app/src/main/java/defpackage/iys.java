package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iys implements fqe {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iys(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fqe
    public final void a() {
        if (this.b != 0) {
            fqy fqyVar = (fqy) this.a;
            if (fqyVar.z) {
                fqyVar.d.m();
                return;
            }
            return;
        }
        iyu iyuVar = (iyu) this.a;
        mdy mdyVar = iyuVar.O;
        mdyVar.getClass();
        mdyVar.K(iyuVar.f());
    }

    @Override // defpackage.fqe
    public final void b() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((fqy) obj).z = true;
            return;
        }
        mdy mdyVar = ((iyu) obj).O;
        mdyVar.getClass();
        mdyVar.K(ssc.FILMSTRIP);
    }
}
