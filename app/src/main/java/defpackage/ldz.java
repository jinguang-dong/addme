package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldz implements paq {
    final Map a = new HashMap();
    final /* synthetic */ lea b;
    final lgw c;

    public ldz(lea leaVar) {
        this.b = leaVar;
        this.c = ((lgu) leaVar.b).b();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        ldw ldwVar = new ldw(2);
        Map map = this.a;
        Map.EL.forEach(map, ldwVar);
        map.clear();
    }
}
