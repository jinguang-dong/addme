package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lro implements syf {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public lro(iwb iwbVar, pbp pbpVar, ivq ivqVar, int i) {
        this.d = i;
        this.b = pbpVar;
        this.c = ivqVar;
        this.a = iwbVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.d == 0) {
            ((sgt) ((sgt) lrp.a.b().i(th)).M(4347)).v("Failed to get MediaStoreRecord for %s, skipping.", this.a);
            Object obj = this.c;
            obj.getClass();
            ((frm) obj).a();
            return;
        }
        this.b.a();
        ivq ivqVar = (ivq) this.c;
        iwb.k(ivqVar, "Error processing primary shot", th);
        if (th instanceof hhq) {
            ivqVar.e();
        }
        ((iwb) this.a).h(ivqVar.b, rwc.j(th));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lst] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lss] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        if (this.d != 0) {
            Boolean bool = (Boolean) obj;
            this.b.a();
            if (bool == null || !bool.booleanValue()) {
                iwb.k((ivq) this.c, "Error processing primary shot", new IllegalStateException("Processing success state was not valid."));
            }
            Object obj2 = this.a;
            Object obj3 = this.c;
            iwb iwbVar = (iwb) obj2;
            iwbVar.h(((ivq) obj3).b, rvk.a);
            return;
        }
        lsy lsyVar = (lsy) obj;
        if (lsyVar == null) {
            ((sgt) lrp.a.b().M(4348)).v("Failed to get MediaStoreRecord for %s, skipping.", this.a);
            return;
        }
        ?? r0 = this.b;
        ?? r1 = this.a;
        ltd ltdVarL = r1.l();
        ltdVarL.getClass();
        r0.i(ltdVarL, lsyVar, r1.n());
        r1.l().getClass();
        r1.a();
        Object obj4 = this.c;
        obj4.getClass();
        ((frm) obj4).a();
    }

    public lro(lss lssVar, lst lstVar, frm frmVar, int i) {
        this.d = i;
        this.a = lssVar;
        this.b = lstVar;
        this.c = frmVar;
    }
}
