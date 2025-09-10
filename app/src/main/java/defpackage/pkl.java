package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkl implements poq {
    final /* synthetic */ pkn a;
    private final poq b;

    public pkl(pkn pknVar, poq poqVar) {
        this.a = pknVar;
        this.b = poqVar;
    }

    @Override // defpackage.poq
    public final void a(poo pooVar) {
        pkk pkkVar;
        pkn pknVar = this.a;
        synchronized (pknVar.b) {
            if (pknVar.e) {
                pkkVar = null;
            } else {
                Map map = pknVar.f;
                if (map.get(pooVar) != null) {
                    pkkVar = (pkk) map.get(pooVar);
                } else {
                    map.put(pooVar, new pkk(pknVar, pooVar));
                    pkkVar = (pkk) map.get(pooVar);
                }
            }
        }
        if (pkkVar == null) {
            this.a.a();
        } else {
            this.b.a(pkkVar);
        }
    }
}
