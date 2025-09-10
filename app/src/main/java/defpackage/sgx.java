package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sgx extends shl {
    public sgx(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.shl
    public final /* bridge */ /* synthetic */ void b(Object obj, shk shkVar) {
        skl sklVar = (skl) obj;
        if (sklVar == null) {
            return;
        }
        skh skhVar = new skh((ski) sklVar.c.d);
        while (skhVar.hasNext()) {
            Map.Entry entry = (Map.Entry) skhVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                shkVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    shkVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
