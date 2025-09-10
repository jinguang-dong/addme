package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkg implements rvu {
    final /* synthetic */ List a;
    final /* synthetic */ kkh b;

    public kkg(kkh kkhVar, List list) {
        this.a = list;
        this.b = kkhVar;
    }

    @Override // defpackage.rvu
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        int iIntValue = num.intValue();
        List list = this.a;
        rnt.S(iIntValue, list.size());
        Long l = (Long) list.get(num.intValue());
        long jLongValue = l.longValue();
        hbp hbpVar = this.b.a;
        synchronized (hbpVar.b) {
            klc klcVarG = hbpVar.g(jLongValue);
            rnt.M(!klcVarG.f.h(), "Base frame already selected!");
            klcVarG.f = rwc.j(l);
        }
        return num;
    }
}
