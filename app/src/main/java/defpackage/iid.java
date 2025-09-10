package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iid implements ibk {
    public static final sgv b = sgv.g("iid");
    public final ihy c;
    public final boolean e;
    public final icp g;
    public final tzj h;
    public final kgw i;
    public final luj j;
    public final hqw k;
    public final hbj l;
    private final rwc m;
    public final AtomicLong d = new AtomicLong(0);
    public final Map f = new HashMap();

    public iid(rwc rwcVar, kgw kgwVar, ihy ihyVar, hbj hbjVar, luj lujVar, boolean z, icp icpVar, hqw hqwVar, tzj tzjVar) {
        this.m = rwcVar;
        this.i = kgwVar;
        this.c = ihyVar;
        this.l = hbjVar;
        this.j = lujVar;
        this.e = z;
        this.g = icpVar;
        this.k = hqwVar;
        this.h = tzjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kmm] */
    @Override // defpackage.klf
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final iic b(gga ggaVar) {
        ?? r2 = ggaVar.b;
        String strW = r2.w();
        Map map = this.f;
        iic iicVar = (iic) map.get(strW);
        if (iicVar != null) {
            return iicVar;
        }
        iic iicVar2 = new iic(this, r2, ggaVar.c, this.m, UUID.randomUUID(), ((lsb) r2).c);
        map.put(strW, iicVar2);
        return iicVar2;
    }

    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        return b(ggaVar);
    }

    @Override // defpackage.ibi
    /* renamed from: c */
    public final ibl b(gga ggaVar) {
        return b(ggaVar);
    }

    @Override // defpackage.ibi
    public final ibl d(gga ggaVar, iea ieaVar) {
        return b(ggaVar);
    }
}
