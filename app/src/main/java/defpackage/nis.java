package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nis implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nis(aih aihVar, uka ukaVar, ujx ujxVar, aji ajiVar, ujw ujwVar, int i) {
        this.f = i;
        this.e = aihVar;
        this.d = ukaVar;
        this.c = ujxVar;
        this.a = ajiVar;
        this.b = ujwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [azr, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.f == 0) {
            float fFloatValue = ((Float) obj).floatValue();
            ?? r0 = this.a;
            if (r0 != 0) {
                r0.b(true);
            }
            jsv.Y(fFloatValue, this.b, this.c, new jkc(this.e, 10), (gox) this.d);
            return ufg.a;
        }
        float fFloatValue2 = ((Float) obj).floatValue();
        aih aihVar = (aih) this.e;
        aia aiaVarF = aih.f(aihVar.c);
        if (aiaVarF != null) {
            Object obj2 = this.b;
            Object obj3 = this.a;
            Object obj4 = this.c;
            Object obj5 = this.d;
            aihVar.d(aiaVarF);
            uka ukaVar = (uka) obj5;
            ukaVar.a = ((aia) ukaVar.a).a(aiaVarF);
            aji ajiVar = (aji) obj3;
            ((ujx) obj4).a = ajiVar.b(ajiVar.d(((aia) ukaVar.a).a));
            ((ujw) obj2).a = !e.t(r8 - fFloatValue2);
        }
        return Boolean.valueOf(aiaVarF != null);
    }

    public /* synthetic */ nis(azr azrVar, azr azrVar2, azr azrVar3, gox goxVar, View view, int i) {
        this.f = i;
        this.a = azrVar;
        this.b = azrVar2;
        this.c = azrVar3;
        this.d = goxVar;
        this.e = view;
    }
}
