package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jie implements sxi {
    private final /* synthetic */ int a;

    public /* synthetic */ jie(int i) {
        this.a = i;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = this.a;
        if (i == 0) {
            jic jicVar = (jic) obj;
            return jicVar != null ? jicVar.a() : ske.M(null);
        }
        if (i == 1) {
            return ske.L((Throwable) obj);
        }
        if (i == 2) {
            throw new IllegalStateException("Error updating preview surfaceview", (Throwable) obj);
        }
        if (i == 3) {
            List list = (List) obj;
            list.getClass();
            return ske.M(null);
        }
        if (i != 4) {
            oep oepVar = (oep) obj;
            throw new qya(oepVar.a(), oepVar.getMessage(), oepVar);
        }
        List<pdo> list2 = (List) obj;
        if (list2 == null || list2.isEmpty()) {
            return ske.L(new IllegalStateException("Null or empty frame results for keys."));
        }
        pdo pdoVar = (pdo) list2.get(0);
        for (pdo pdoVar2 : list2) {
            if (pdoVar2.c > -1) {
                pdoVar = pdoVar2;
            }
        }
        return ske.M(pdoVar);
    }
}
