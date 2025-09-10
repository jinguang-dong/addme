package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mzg implements cwr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mzg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [azr, java.lang.Object] */
    @Override // defpackage.cwr
    public final void b(Object obj) {
        if (this.b != 0) {
            this.a.b(obj);
            return;
        }
        ((mzk) this.a).h((nkx) obj, Optional.empty(), false);
    }
}
