package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eii implements eip {
    public final List a;

    public eii(List list) {
        this.a = list;
    }

    @Override // defpackage.eip
    public final ehd a() {
        List list = this.a;
        return ((elo) list.get(0)).e() ? new ehn(list) : new ehm(list);
    }

    @Override // defpackage.eip
    public final List b() {
        return this.a;
    }

    @Override // defpackage.eip
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((elo) list.get(0)).e();
    }
}
