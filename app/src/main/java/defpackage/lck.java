package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lck implements uem {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lck(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, uem] */
    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            return (peq) ((rwc) this.a).c();
        }
        if (i == 1) {
            return (Runnable) this.a.a();
        }
        ?? r2 = this.a;
        return i != 2 ? (qvf) r2.a() : ((nnz) r2).a;
    }
}
