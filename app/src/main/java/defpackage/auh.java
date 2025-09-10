package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auh implements uiv {
    final /* synthetic */ Map a;
    final /* synthetic */ aus b;
    final /* synthetic */ ata c;
    final /* synthetic */ uiu d;
    final /* synthetic */ aii e;
    final /* synthetic */ boolean f;
    final /* synthetic */ ocq g;

    public auh(Map map, aus ausVar, ata ataVar, uiu uiuVar, aii aiiVar, boolean z, ocq ocqVar) {
        this.a = map;
        this.b = ausVar;
        this.c = ataVar;
        this.d = uiuVar;
        this.e = aiiVar;
        this.f = z;
        this.g = ocqVar;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        ((Number) obj3).intValue();
        aycVar.u(43594985);
        Map map = this.a;
        if (map.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        if (ske.bI(map.values()).size() != map.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        chq chqVar = (chq) aycVar.e(bze.c);
        aus ausVar = this.b;
        if (ausVar.g().isEmpty()) {
            Float fU = bay.U(map, ausVar.c());
            if (fU == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            ausVar.j.i(fU.floatValue());
            ausVar.l.i(fU.floatValue());
        }
        boolean zB = aycVar.B(ausVar) | aycVar.D(map);
        ata ataVar = this.c;
        boolean zB2 = zB | aycVar.B(ataVar);
        uiu uiuVar = this.d;
        boolean zB3 = zB2 | aycVar.B(uiuVar) | aycVar.B(chqVar) | aycVar.y(125.0f);
        Object objF = aycVar.f();
        if (zB3 || objF == ayb.a) {
            Object aufVar = new auf(ausVar, map, ataVar, chqVar, uiuVar, null);
            aycVar.w(aufVar);
            objF = aufVar;
        }
        azb.e(map, ausVar, (uiu) objF, aycVar);
        boolean zK = ausVar.k();
        got gotVar = ausVar.n;
        aii aiiVar = this.e;
        boolean z = this.f;
        ocq ocqVar = this.g;
        boolean zB4 = aycVar.B(ausVar);
        Object objF2 = aycVar.f();
        if (zB4 || objF2 == ayb.a) {
            objF2 = new aug(ausVar, null);
            aycVar.w(objF2);
        }
        DraggableElement draggableElement = new DraggableElement(gotVar, aiiVar, z, ocqVar, zK, ahp.a, (uiv) objF2);
        aycVar.n();
        return draggableElement;
    }
}
