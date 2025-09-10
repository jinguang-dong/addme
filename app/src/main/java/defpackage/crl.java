package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crl implements url {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public crl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [cnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [cnh, java.lang.Object] */
    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) {
        int i = this.b;
        if (i == 0) {
            cru cruVar = (cru) this.a;
            if (cruVar.g.q() instanceof cse) {
                return ufg.a;
            }
            Object objD = cruVar.d(true, uhbVar);
            return objD != uhi.a ? ufg.a : objD;
        }
        if (i != 1) {
            if (i != 2) {
                this.a.accept((dtp) obj);
                return ufg.a;
            }
            this.a.accept((dtp) obj);
            return ufg.a;
        }
        akb akbVar = (akb) obj;
        if (akbVar instanceof ajz) {
            ((bgz) this.a).add(akbVar);
        } else if (akbVar instanceof aka) {
            ((bgz) this.a).remove(((aka) akbVar).a);
        } else if (akbVar instanceof ajx) {
            ((bgz) this.a).add(akbVar);
        } else if (akbVar instanceof ajy) {
            ((bgz) this.a).remove(((ajy) akbVar).a);
        } else if (akbVar instanceof akd) {
            ((bgz) this.a).add(akbVar);
        } else if (akbVar instanceof ake) {
            ((bgz) this.a).remove(((ake) akbVar).a);
        } else if (akbVar instanceof akc) {
            ((bgz) this.a).remove(((akc) akbVar).a);
        }
        return ufg.a;
    }
}
