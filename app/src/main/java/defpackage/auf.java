package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auf extends uht implements uiu {
    int a;
    final /* synthetic */ aus b;
    final /* synthetic */ Map c;
    final /* synthetic */ ata d;
    final /* synthetic */ chq e;
    final /* synthetic */ uiu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auf(aus ausVar, Map map, ata ataVar, chq chqVar, uiu uiuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ausVar;
        this.c = map;
        this.d = ataVar;
        this.e = chqVar;
        this.f = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auf) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            aus ausVar = this.b;
            final Map map = this.c;
            Map mapG = ausVar.g();
            ausVar.d.b(map);
            ausVar.i.b(this.d);
            final uiu uiuVar = this.f;
            final chq chqVar = this.e;
            ausVar.h.b(new uiu() { // from class: aue
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    Float f = (Float) obj2;
                    float fFloatValue = f.floatValue();
                    Float f2 = (Float) obj3;
                    float fFloatValue2 = f2.floatValue();
                    Map map2 = map;
                    return Float.valueOf(((auw) uiuVar.a(ske.bb(map2, f), ske.bb(map2, f2))).a(chqVar, fFloatValue, fFloatValue2));
                }
            });
            ausVar.m.i(chqVar.dk(125.0f));
            this.a = 1;
            if (ausVar.e(mapG, map, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new auf(this.b, this.c, this.d, this.e, this.f, uhbVar);
    }
}
