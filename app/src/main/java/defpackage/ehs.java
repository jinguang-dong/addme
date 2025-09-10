package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehs extends ehk {
    public ehs(List list) {
        super(list);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        Object obj;
        elq elqVar = this.d;
        if (elqVar == null) {
            return (f != 1.0f || (obj = eloVar.c) == null) ? (ehx) eloVar.b : (ehx) obj;
        }
        float f2 = eloVar.g;
        Float f3 = eloVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        ehx ehxVar = (ehx) eloVar.b;
        Object obj2 = eloVar.c;
        return (ehx) elqVar.b(f2, fFloatValue, ehxVar, obj2 == null ? ehxVar : (ehx) obj2, f, b(), this.c);
    }
}
