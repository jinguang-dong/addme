package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nic implements uiu {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nic(bik bikVar, float f, float f2, uiq uiqVar, int i, int i2) {
        this.f = i2;
        this.e = bikVar;
        this.a = f;
        this.b = f2;
        this.d = uiqVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, uif] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            float f = this.b;
            ?? r2 = this.e;
            jsv.O((nhw) this.d, this.a, r2, f, aycVar, bay.j(i2 | 1));
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i3 = this.c;
            ?? r3 = this.d;
            float f2 = this.b;
            AmbientMode.AmbientCallback.c(this.e, this.a, f2, r3, aycVar2, bay.j(i3 | 1));
            return ufg.a;
        }
        if (i != 2) {
            ayc aycVar3 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i4 = this.c;
            float f3 = this.b;
            float f4 = this.a;
            jsv.L((nhx) this.e, this.d, f4, f3, aycVar3, bay.j(i4 | 1));
            return ufg.a;
        }
        ayc aycVar4 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        float f5 = this.b;
        ?? r22 = this.e;
        jsv.Q((nhw) this.d, this.a, r22, f5, aycVar4, bay.j(i5 | 1));
        return ufg.a;
    }

    public /* synthetic */ nic(nhw nhwVar, float f, bik bikVar, float f2, int i, int i2) {
        this.f = i2;
        this.d = nhwVar;
        this.a = f;
        this.e = bikVar;
        this.b = f2;
        this.c = i;
    }

    public /* synthetic */ nic(nhx nhxVar, uif uifVar, float f, float f2, int i, int i2) {
        this.f = i2;
        this.e = nhxVar;
        this.d = uifVar;
        this.a = f;
        this.b = f2;
        this.c = i;
    }
}
