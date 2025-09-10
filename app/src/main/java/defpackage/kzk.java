package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kzk implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kzk(kzl kzlVar, Map map, pfu pfuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, int i) {
        this.f = i;
        this.a = kzlVar;
        this.b = map;
        this.e = pfuVar;
        this.c = scheduledExecutorService;
        this.d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Throwable {
        if (this.f != 0) {
            boolean zBooleanValue = ((Boolean) this.b.dL()).booleanValue();
            Object obj2 = this.c;
            Object obj3 = this.a;
            qpt.ct(zBooleanValue, this.d, (krj) this.e, (imi) obj3, (rwc) obj2);
            return;
        }
        String str = (String) obj;
        ?? r7 = this.d;
        ?? r6 = this.c;
        Object obj4 = this.e;
        ((kzl) this.a).s(this.b, (pfu) obj4, r6, r7, str);
    }

    public /* synthetic */ kzk(owf owfVar, owq owqVar, krj krjVar, imi imiVar, rwc rwcVar, int i) {
        this.f = i;
        this.b = owfVar;
        this.d = owqVar;
        this.e = krjVar;
        this.a = imiVar;
        this.c = rwcVar;
    }
}
