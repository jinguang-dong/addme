package defpackage;

import androidx.wear.ambient.WearableControllerProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dqk implements uiu {
    public final /* synthetic */ bik a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ dqk(bik bikVar, dkf dkfVar, alv alvVar, uiv uivVar, afy afyVar, uiw uiwVar, int i, int i2) {
        this.h = i2;
        this.a = bikVar;
        this.c = dkfVar;
        this.d = alvVar;
        this.e = uivVar;
        this.f = afyVar;
        this.g = uiwVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r2v0, types: [alv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [blp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r3v4, types: [dkf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [afy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [alv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [alv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uiw] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r6v4, types: [afy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, uiw] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i2 = this.b;
            ?? r5 = this.g;
            ?? r4 = this.f;
            ?? r3 = this.e;
            ?? r2 = this.d;
            WearableControllerProvider.i((dme) this.c, this.a, r2, r3, r4, r5, aycVar, bay.j(i2 | 1));
            return ufg.a;
        }
        if (i != 1) {
            ayc aycVar2 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i3 = this.b;
            ?? r7 = this.g;
            ?? r6 = this.f;
            ?? r52 = this.e;
            ?? r42 = this.d;
            WearableControllerProvider.g(this.a, this.c, r42, r52, r6, r7, aycVar2, bay.j(i3 | 1));
            return ufg.a;
        }
        ayc aycVar3 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i4 = this.b;
        ?? r53 = this.g;
        ?? r43 = this.f;
        Object obj3 = this.d;
        ?? r22 = this.c;
        acv.h(this.e, this.a, r22, (asb) obj3, r43, r53, aycVar3, bay.j(i4 | 1));
        return ufg.a;
    }

    public /* synthetic */ dqk(dme dmeVar, bik bikVar, alv alvVar, uiv uivVar, afy afyVar, uiw uiwVar, int i, int i2) {
        this.h = i2;
        this.c = dmeVar;
        this.a = bikVar;
        this.d = alvVar;
        this.e = uivVar;
        this.f = afyVar;
        this.g = uiwVar;
        this.b = i;
    }

    public /* synthetic */ dqk(uif uifVar, bik bikVar, blp blpVar, asb asbVar, alv alvVar, uiv uivVar, int i, int i2) {
        this.h = i2;
        this.e = uifVar;
        this.a = bikVar;
        this.c = blpVar;
        this.d = asbVar;
        this.f = alvVar;
        this.g = uivVar;
        this.b = i;
    }
}
