package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.WearableControllerProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aor implements uiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ aor(int i, dlh dlhVar, dky dkyVar, uiv uivVar, int i2, int i3) {
        this.f = i3;
        this.b = i;
        this.a = dlhVar;
        this.d = dkyVar;
        this.e = uivVar;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uiv] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            ?? r3 = this.e;
            Object obj3 = this.d;
            byi.ao(this.a, this.b, (aos) obj3, r3, aycVar, bay.j(i2 | 1));
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i3 = this.c;
            Object obj4 = this.e;
            int i4 = this.b;
            byi.as((amt) this.d, this.a, i4, obj4, aycVar2, bay.j(i3 | 1));
            return ufg.a;
        }
        if (i == 2) {
            ayc aycVar3 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i5 = this.c;
            ?? r32 = this.e;
            Object obj5 = this.d;
            AmbientLifecycleObserverKt.g(this.b, (dlh) this.a, (dky) obj5, r32, aycVar3, bay.j(i5 | 1));
            return ufg.a;
        }
        if (i != 3) {
            ayc aycVar4 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i6 = this.c;
            int i7 = this.b;
            Object obj6 = this.d;
            jsv.s((nrx) this.a, (nsk) this.e, (dme) obj6, i7, aycVar4, bay.j(i6 | 1));
            return ufg.a;
        }
        ayc aycVar5 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i8 = this.c;
        Object obj7 = this.e;
        int i9 = this.b;
        WearableControllerProvider.b((dlm) this.d, this.a, i9, obj7, aycVar5, bay.j(i8 | 1));
        return ufg.a;
    }

    public /* synthetic */ aor(Object obj, int i, aos aosVar, uiu uiuVar, int i2, int i3) {
        this.f = i3;
        this.a = obj;
        this.b = i;
        this.d = aosVar;
        this.e = uiuVar;
        this.c = i2;
    }

    public /* synthetic */ aor(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        this.f = i3;
        this.d = obj;
        this.a = obj2;
        this.b = i;
        this.e = obj3;
        this.c = i2;
    }

    public /* synthetic */ aor(nrx nrxVar, nsk nskVar, dme dmeVar, int i, int i2, int i3) {
        this.f = i3;
        this.a = nrxVar;
        this.e = nskVar;
        this.d = dmeVar;
        this.b = i;
        this.c = i2;
    }
}
