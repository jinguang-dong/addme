package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdv implements paq {
    public final oyn a;
    public final List b;
    public final ltu c;
    public final ltg d;
    public final ltv e;
    private final AtomicBoolean f;

    public gdv(oyn oynVar, gbt gbtVar, ltu ltuVar, ltv ltvVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f = new AtomicBoolean(false);
        this.a = oynVar;
        this.c = ltuVar;
        this.d = ((gbr) gbtVar).a.a();
        this.e = ltvVar;
        arrayList.add(gbtVar);
    }

    public final boolean a() {
        return this.f.get();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.f.compareAndSet(false, true)) {
            this.a.close();
            Collection.EL.stream(this.b).forEach(new fkj(14));
        }
    }
}
