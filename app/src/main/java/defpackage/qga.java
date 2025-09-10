package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qga implements qgj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qga(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, qgf] */
    @Override // defpackage.qgj
    public final qgf a(Object obj, Executor executor) {
        int i = this.b;
        if (i == 0) {
            return ((qaq) this.a).m().a(executor, new qfk(obj, 1));
        }
        ?? r2 = this.a;
        return i != 1 ? r2 : ((qaq) r2).m().a(executor, new qfk(obj, 1));
    }
}
