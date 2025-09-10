package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imt implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public imt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        return b();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, tzx] */
    public final owq b() {
        if (this.a == 0) {
            return ((iso) this.b).a;
        }
        luj lujVar = (luj) this.b.a();
        lujVar.getClass();
        return new krp(lujVar.a(luf.N), true, false, ksa.SERENGETI_MODE_ALTERNATE, true, ksa.SERENGETI_MODE_DEFAULT);
    }
}
