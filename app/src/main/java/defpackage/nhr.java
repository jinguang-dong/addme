package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nhr implements mzu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable, nhu] */
    @Override // defpackage.mzu
    public final void a(nkw nkwVar) {
        int i = this.b;
        ?? r1 = this.a;
        if (i != 0) {
            r1.a(nkwVar);
        } else {
            r1.run();
        }
    }
}
