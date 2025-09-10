package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class awb implements uiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ awb(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar, int i, int i2) {
        this.g = i2;
        this.b = avpVar;
        this.c = awhVar;
        this.d = awoVar;
        this.e = awuVar;
        this.f = uiuVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [awh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r3v7, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v8, types: [awh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i2 = this.a;
            ?? r4 = this.f;
            Object obj3 = this.e;
            Object obj4 = this.d;
            awd.a((avp) this.b, this.c, (awo) obj4, (awu) obj3, r4, aycVar, bay.j(i2 | 1));
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i3 = this.a;
            ?? r42 = this.f;
            Object obj5 = this.e;
            Object obj6 = this.d;
            awd.b((avp) this.b, this.c, (awo) obj6, (awu) obj5, r42, aycVar2, bay.j(i3 | 1));
            return ufg.a;
        }
        if (i == 2) {
            ayc aycVar3 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i4 = this.a;
            Object obj7 = this.d;
            Object obj8 = this.c;
            Object obj9 = this.e;
            ((djv) this.f).c((cfd) this.b, (cfp) obj9, (cfj) obj8, (cfk) obj7, aycVar3, bay.j(i4 | 1));
            return ufg.a;
        }
        if (i == 3) {
            ayc aycVar4 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i5 = this.a;
            Object obj10 = this.b;
            ?? r3 = this.c;
            AmbientLifecycleObserverKt.j((String) this.e, (dob) this.d, this.f, r3, (bie) obj10, aycVar4, bay.j(i5 | 1));
            return ufg.a;
        }
        if (i == 4) {
            ayc aycVar5 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i6 = this.a;
            ?? r43 = this.f;
            Object obj11 = this.c;
            Object obj12 = this.d;
            SharedLibraryVersion.k((doq) this.b, (drv) this.e, (drf) obj12, (ebn) obj11, r43, aycVar5, bay.j(i6 | 1));
            return ufg.a;
        }
        if (i != 5) {
            ayc aycVar6 = (ayc) obj;
            ((Integer) obj2).intValue();
            int i7 = this.a;
            ?? r7 = this.f;
            Object obj13 = this.e;
            Object obj14 = this.d;
            qpt.ar((avp) this.b, this.c, (awo) obj14, (awu) obj13, r7, aycVar6, bay.j(i7 | 1));
            return ufg.a;
        }
        ayc aycVar7 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i8 = this.a;
        ?? r44 = this.f;
        Object obj15 = this.e;
        Object obj16 = this.d;
        prh.i((avp) this.b, this.c, (awo) obj16, (awu) obj15, r44, aycVar7, bay.j(i8 | 1));
        return ufg.a;
    }

    public /* synthetic */ awb(djv djvVar, cfd cfdVar, cfp cfpVar, cfj cfjVar, cfk cfkVar, int i, int i2) {
        this.g = i2;
        this.f = djvVar;
        this.b = cfdVar;
        this.e = cfpVar;
        this.c = cfjVar;
        this.d = cfkVar;
        this.a = i;
    }

    public /* synthetic */ awb(doq doqVar, drv drvVar, drf drfVar, ebn ebnVar, uiu uiuVar, int i, int i2) {
        this.g = i2;
        this.b = doqVar;
        this.e = drvVar;
        this.d = drfVar;
        this.c = ebnVar;
        this.f = uiuVar;
        this.a = i;
    }

    public /* synthetic */ awb(String str, dob dobVar, uif uifVar, bik bikVar, bie bieVar, int i, int i2) {
        this.g = i2;
        this.e = str;
        this.d = dobVar;
        this.f = uifVar;
        this.c = bikVar;
        this.b = bieVar;
        this.a = i;
    }
}
