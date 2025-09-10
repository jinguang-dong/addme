package defpackage;

import j$.util.Map;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kct implements kcx {
    private final kcy a;
    private final Map b;
    private final fuf c;

    public kct(kcy kcyVar, Map map, fuf fufVar) {
        this.a = kcyVar;
        this.b = map;
        this.c = fufVar;
    }

    @Override // defpackage.kcx
    public final pas a(oxj oxjVar) {
        return this.a.a(oxjVar);
    }

    @Override // defpackage.kcx
    public final peq b(oxj oxjVar, pjr pjrVar) {
        return this.a.b(oxjVar, pjrVar);
    }

    @Override // defpackage.kcx
    public final Map c(oxj oxjVar, pjr pjrVar, boolean z) {
        EnumMap enumMap = new EnumMap(lcz.class);
        if (z && this.c.a(nkw.TIME_LAPSE)) {
            Map.EL.forEach(this.b, new glv(enumMap, 3));
        }
        enumMap.putAll(this.a.c(oxjVar, pjrVar, z));
        return enumMap;
    }
}
