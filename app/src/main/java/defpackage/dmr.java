package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmr implements btu {
    private final zm a;
    private final tdy b;

    public dmr(tdy tdyVar) {
        this.b = tdyVar;
        int i = zn.a;
        this.a = new zm((byte[]) null);
    }

    @Override // defpackage.btu
    public final void a(btt bttVar) {
        zm zmVar = this.a;
        zmVar.e();
        for (Object obj : bttVar) {
            Object objI = this.b.i(obj);
            int iC = zmVar.c(objI, 0);
            if (iC == 7) {
                bttVar.remove(obj);
            } else {
                zmVar.g(objI, iC + 1);
            }
        }
    }

    @Override // defpackage.btu
    public final boolean b(Object obj, Object obj2) {
        tdy tdyVar = this.b;
        return a.ao(tdyVar.i(obj), tdyVar.i(obj2));
    }
}
