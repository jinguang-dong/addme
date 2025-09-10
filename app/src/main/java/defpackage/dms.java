package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dms implements uiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ dms(Object obj, bik bikVar, dqt dqtVar, aby abyVar, int i, int i2) {
        this.f = i2;
        this.b = obj;
        this.d = bikVar;
        this.e = dqtVar;
        this.c = abyVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i2 = this.a;
            ?? r3 = this.e;
            Object obj3 = this.d;
            AmbientLifecycleObserver.AmbientLifecycleCallback.CC.k(this.b, this.c, (AmbientDelegate) obj3, r3, aycVar, bay.j(i2 | 1));
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i3 = this.a;
            ?? r32 = this.e;
            Object obj4 = this.c;
            byi.aq(this.b, this.d, (aov) obj4, r32, aycVar2, bay.j(i3 | 1));
            return ufg.a;
        }
        if (i == 2) {
            ayc aycVar3 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i4 = this.a;
            ?? r33 = this.c;
            Object obj5 = this.e;
            drc.e((dlh) this.b, this.d, (dqt) obj5, r33, aycVar3, bay.j(i4 | 1));
            return ufg.a;
        }
        if (i == 3) {
            ayc aycVar4 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i5 = this.a;
            ?? r34 = this.c;
            Object obj6 = this.e;
            drc.f((dme) this.b, this.d, (dqt) obj6, r34, aycVar4, bay.j(i5 | 1));
            return ufg.a;
        }
        if (i != 4) {
            ayc aycVar5 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i6 = this.a;
            ?? r6 = this.e;
            Object obj7 = this.b;
            rrg.b((doq) this.c, (ebn) this.d, (drv) obj7, r6, aycVar5, bay.j(i6 | 1));
            return ufg.a;
        }
        ayc aycVar6 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i7 = this.a;
        ?? r35 = this.e;
        Object obj8 = this.b;
        qpt.at((avp) this.c, (awo) this.d, (awu) obj8, r35, aycVar6, bay.j(i7 | 1));
        return ufg.a;
    }

    public /* synthetic */ dms(Object obj, Object obj2, Object obj3, uiu uiuVar, int i, int i2) {
        this.f = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = uiuVar;
        this.a = i;
    }

    public /* synthetic */ dms(uif uifVar, bik bikVar, AmbientDelegate ambientDelegate, uiu uiuVar, int i, int i2) {
        this.f = i2;
        this.b = uifVar;
        this.c = bikVar;
        this.d = ambientDelegate;
        this.e = uiuVar;
        this.a = i;
    }

    public /* synthetic */ dms(uif uifVar, bik bikVar, aov aovVar, uiu uiuVar, int i, int i2) {
        this.f = i2;
        this.b = uifVar;
        this.d = bikVar;
        this.c = aovVar;
        this.e = uiuVar;
        this.a = i;
    }
}
