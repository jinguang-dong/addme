package defpackage;

import java.io.IOException;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkb extends tiv {
    private final tiv a;
    private final tjr b;

    public tkb(tiv tivVar, tjr tjrVar) {
        this.a = tivVar;
        this.b = tjrVar;
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        Collection collection = (Collection) this.b.a();
        tmlVar.l();
        while (tmlVar.r()) {
            collection.add(this.a.a(tmlVar));
        }
        tmlVar.n();
        return collection;
    }
}
