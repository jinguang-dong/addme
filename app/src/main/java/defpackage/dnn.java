package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnn extends uht implements uiu {
    float a;
    int b;
    final /* synthetic */ uif c;
    final /* synthetic */ dno d;
    final /* synthetic */ uiq e;
    final /* synthetic */ AmbientDelegate f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnn(uif uifVar, dno dnoVar, AmbientDelegate ambientDelegate, uiq uiqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = uifVar;
        this.d = dnoVar;
        this.f = ambientDelegate;
        this.e = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnn) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        float f;
        uiq uiqVar;
        uhi uhiVar = uhi.a;
        if (this.b != 0) {
            f = this.a;
            uiqVar = (uiq) this.g;
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            aim aimVar = (aim) this.g;
            this.c.a();
            dno dnoVar = this.d;
            float f2 = dnoVar.e;
            float f3 = dnoVar.c;
            float fM = ukc.m(f2, -f3, f3);
            AmbientDelegate ambientDelegate = this.f;
            uiq uiqVar2 = this.e;
            this.g = uiqVar2;
            this.a = fM;
            this.b = 1;
            obj = ambientDelegate.o(aimVar, fM, dnoVar.f, dnoVar.a, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
            f = fM;
            uiqVar = uiqVar2;
        }
        float fFloatValue = f - ((Number) obj).floatValue();
        if (fFloatValue != 0.0f) {
            uiqVar.a(new Float(fFloatValue));
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dnn dnnVar = new dnn(this.c, this.d, this.f, this.e, uhbVar);
        dnnVar.g = obj;
        return dnnVar;
    }
}
