package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmm extends pmo {
    private final uem a;
    private int c = 0;
    private Map b = new HashMap();

    public pmm(uem uemVar) {
        this.a = uemVar;
    }

    @Override // defpackage.pmo
    public final void a(Object obj, pmr pmrVar) {
        synchronized (this) {
            pmx pmxVar = (pmx) this.b.get(pmrVar);
            if (pmxVar == null) {
                pmxVar = (pmx) this.a.a();
                this.b.put(pmrVar, pmxVar);
            }
            pmxVar.a(obj);
            this.c++;
        }
    }

    @Override // defpackage.pmo
    public final void b(sxy sxyVar, pmv pmvVar) {
        synchronized (this) {
            if (this.c == 0) {
                return;
            }
            Map map = this.b;
            this.b = new HashMap();
            this.c = 0;
            sxyVar.c(pmvVar);
            for (Map.Entry entry : map.entrySet()) {
                ((pmx) entry.getValue()).b(sxyVar, ((pmr) entry.getKey()).b);
            }
        }
    }
}
