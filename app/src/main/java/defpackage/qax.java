package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qax implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public qax(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i == 0) {
            return new prh();
        }
        if (i == 1) {
            Object obj = ((qav) this.b).b;
            obj.getClass();
            return obj;
        }
        if (i == 2) {
            rwc rwcVar = ((qav) this.b).a;
            return rwcVar.h() ? rwcVar.c() : new pwt() { // from class: qau
                @Override // defpackage.pwt
                public final void a() {
                }
            };
        }
        if (i == 3) {
            return new rqs(((jdg) this.b).b());
        }
        if (i != 4) {
            return new rtl(((jdg) this.b).b());
        }
        tdy tdyVar = (tdy) this.b.a();
        tdyVar.getClass();
        return tdyVar;
    }
}
