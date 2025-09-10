package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dph implements uiu {
    public final /* synthetic */ uif a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ dph(bik bikVar, uif uifVar, boolean z, blp blpVar, avu avuVar, uiu uiuVar, int i, int i2) {
        this.h = i2;
        this.f = bikVar;
        this.a = uifVar;
        this.b = z;
        this.e = blpVar;
        this.d = avuVar;
        this.g = uiuVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [blp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            ?? r6 = this.g;
            Object obj3 = this.d;
            ?? r4 = this.e;
            boolean z = this.b;
            amo.h(this.f, this.a, z, r4, (avu) obj3, r6, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.c;
        ?? r5 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        boolean z2 = this.b;
        AmbientModeSupport.AmbientCallback.j(this.a, this.d, z2, (dpi) obj5, (dpf) obj4, r5, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }

    public /* synthetic */ dph(uif uifVar, bik bikVar, boolean z, dpi dpiVar, dpf dpfVar, uiv uivVar, int i, int i2) {
        this.h = i2;
        this.a = uifVar;
        this.d = bikVar;
        this.b = z;
        this.e = dpiVar;
        this.f = dpfVar;
        this.g = uivVar;
        this.c = i;
    }
}
