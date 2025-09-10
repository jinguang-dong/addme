package defpackage;

import androidx.wear.ambient.WearableControllerProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dqm implements uiu {
    public final /* synthetic */ uiv a;
    public final /* synthetic */ bik b;
    public final /* synthetic */ alv c;
    public final /* synthetic */ uiv d;
    public final /* synthetic */ float e;
    public final /* synthetic */ afy f;
    public final /* synthetic */ uiw g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ dqm(Object obj, uiv uivVar, bik bikVar, alv alvVar, uiv uivVar2, float f, afy afyVar, uiw uiwVar, int i, int i2) {
        this.j = i2;
        this.i = obj;
        this.a = uivVar;
        this.b = bikVar;
        this.c = alvVar;
        this.d = uivVar2;
        this.e = f;
        this.f = afyVar;
        this.g = uiwVar;
        this.h = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dkf, java.lang.Object] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.j != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.h;
            uiw uiwVar = this.g;
            afy afyVar = this.f;
            float f = this.e;
            uiv uivVar = this.d;
            alv alvVar = this.c;
            bik bikVar = this.b;
            WearableControllerProvider.h(this.i, this.a, bikVar, alvVar, uivVar, f, afyVar, uiwVar, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.h;
        uiw uiwVar2 = this.g;
        afy afyVar2 = this.f;
        float f2 = this.e;
        uiv uivVar2 = this.d;
        alv alvVar2 = this.c;
        bik bikVar2 = this.b;
        WearableControllerProvider.j((dlh) this.i, this.a, bikVar2, alvVar2, uivVar2, f2, afyVar2, uiwVar2, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }
}
