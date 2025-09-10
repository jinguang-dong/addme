package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tkp extends tiv {
    private final tks a;

    public tkp(tks tksVar) {
        this.a = tksVar;
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        Object objC = c();
        Map map = this.a.b;
        try {
            tmlVar.m();
            while (tmlVar.r()) {
                tkq tkqVar = (tkq) map.get(tmlVar.h());
                if (tkqVar == null) {
                    tmlVar.q();
                } else {
                    e(objC, tmlVar, tkqVar);
                }
            }
            tmlVar.o();
            return d(objC);
        } catch (IllegalAccessException e) {
            throw tmf.b(e);
        } catch (IllegalStateException e2) {
            throw new tis(e2);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, tml tmlVar, tkq tkqVar);
}
