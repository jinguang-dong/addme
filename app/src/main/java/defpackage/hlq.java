package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlq implements hld {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hlq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hld
    public final void b() {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((hls) this.a).a.iterator();
        while (it.hasNext()) {
            ((hld) it.next()).b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hld
    public final void d(pjo pjoVar, fee feeVar) {
        if (this.b != 0) {
            ((hlu) this.a).b(pjoVar, feeVar);
            return;
        }
        Iterator it = ((hls) this.a).a.iterator();
        while (it.hasNext()) {
            ((hld) it.next()).d(pjoVar, feeVar);
        }
    }

    @Override // defpackage.hld
    public final /* synthetic */ void c(pjo pjoVar) {
    }
}
