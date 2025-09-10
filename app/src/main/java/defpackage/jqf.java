package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jqf implements job {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jqf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uem] */
    @Override // defpackage.job
    public final void d(long j) {
        int i = this.b;
        if (i == 0) {
            ((jnv) this.a.a()).eS();
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            ((jpp) this.a).b();
        } else if (i != 3) {
            ((mwp) this.a).eS();
        } else {
            ((lzp) ((lzr) this.a).b().c()).eS();
        }
    }
}
