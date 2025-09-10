package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hll implements hlc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hll(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [hlv, java.lang.Object] */
    @Override // defpackage.hlc
    public final void a(pdk pdkVar, peo peoVar) {
        if (this.b != 0) {
            pdkVar.j(new hlp(pdkVar, this.a));
            return;
        }
        Iterator it = ((hls) this.a).b.iterator();
        while (it.hasNext()) {
            ((hlc) it.next()).a(pdkVar, peoVar);
        }
    }
}
