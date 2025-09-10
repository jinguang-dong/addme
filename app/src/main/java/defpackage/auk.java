package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auk implements url {
    final /* synthetic */ aus a;
    final /* synthetic */ float b;

    public auk(aus ausVar, float f) {
        this.a = ausVar;
        this.b = f;
    }

    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) throws Throwable {
        aus ausVar = this.a;
        Map map = (Map) obj;
        Float fU = bay.U(map, ausVar.c());
        fU.getClass();
        float fFloatValue = fU.floatValue();
        Object obj2 = map.get(new Float(bay.T(ausVar.j.a().floatValue(), fFloatValue, map.keySet(), ausVar.h(), this.b, ausVar.m.e())));
        if (obj2 == null || !((Boolean) ausVar.b.a(obj2)).booleanValue()) {
            Object objA = ausVar.a(fFloatValue, ausVar.a, uhbVar);
            if (objA == uhi.a) {
                return objA;
            }
        } else {
            Object objB = ausVar.b(obj2, ausVar.a, uhbVar);
            if (objB == uhi.a) {
                return objB;
            }
        }
        return ufg.a;
    }
}
