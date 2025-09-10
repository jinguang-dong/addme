package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tki extends tiv {
    private final tiv a;
    private final tiv b;
    private final tjr c;

    public tki(tiv tivVar, tiv tivVar2, tjr tjrVar) {
        this.a = tivVar;
        this.b = tivVar2;
        this.c = tjrVar;
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        int i;
        int iT = tmlVar.t();
        if (iT == 9) {
            tmlVar.p();
            return null;
        }
        Map map = (Map) this.c.a();
        if (iT == 1) {
            tmlVar.l();
            while (tmlVar.r()) {
                tmlVar.l();
                Object objA = this.a.a(tmlVar);
                if (map.put(objA, this.b.a(tmlVar)) != null) {
                    throw new tis("duplicate key: ".concat(String.valueOf(String.valueOf(objA))));
                }
                tmlVar.n();
            }
            tmlVar.n();
            return map;
        }
        tmlVar.m();
        while (tmlVar.r()) {
            thu thuVar = thu.a;
            int iB = tmlVar.c;
            if (iB == 0) {
                iB = tmlVar.b();
            }
            if (iB == 13) {
                i = 9;
            } else if (iB == 12) {
                i = 8;
            } else {
                if (iB != 14) {
                    throw tmlVar.d("a name");
                }
                i = 10;
            }
            tmlVar.c = i;
            Object objA2 = this.a.a(tmlVar);
            if (map.put(objA2, this.b.a(tmlVar)) != null) {
                throw new tis("duplicate key: ".concat(String.valueOf(String.valueOf(objA2))));
            }
        }
        tmlVar.o();
        return map;
    }
}
