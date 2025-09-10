package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ghp implements ghq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ghq
    public final void a(gho ghoVar, gho ghoVar2, boolean z) {
        int i = this.b;
        if (i == 0) {
            if (ghr.b(ghoVar, ghoVar2)) {
                return;
            }
            ojl.ce().execute(new gbh(this.a, ghoVar2, 10, null));
            return;
        }
        if (i != 1) {
            Object obj = this.a;
            jxp jxpVar = (jxp) obj;
            if (jxpVar.q.k(nkw.VIDEO)) {
                jxpVar.H(ghoVar2, true);
            }
            if (ghr.b(ghoVar, ghoVar2)) {
                jxpVar.c.execute(new juc(obj, 17));
                return;
            }
            return;
        }
        boolean zEquals = ghoVar.equals(gho.LOCKED);
        Object obj2 = this.a;
        if (zEquals && ghoVar2.equals(gho.DEFAULT) && !z) {
            ((fxy) obj2).F++;
        }
        ((fxy) obj2).C.add(ghoVar2);
    }
}
