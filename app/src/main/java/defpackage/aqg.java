package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aqg implements uiu {
    public final /* synthetic */ bik a;
    public final /* synthetic */ cdo b;
    public final /* synthetic */ uiq c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    private final /* synthetic */ int l;

    public /* synthetic */ aqg(ccm ccmVar, bik bikVar, cdo cdoVar, uiq uiqVar, int i, boolean z, int i2, int i3, Map map, int i4, int i5, int i6) {
        this.l = i6;
        this.k = ccmVar;
        this.a = bikVar;
        this.b = cdoVar;
        this.c = uiqVar;
        this.f = i;
        this.e = z;
        this.g = i2;
        this.h = i3;
        this.j = map;
        this.i = i4;
        this.d = i5;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [bkx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.l != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.i;
            int i2 = this.d;
            ?? r9 = this.j;
            int i3 = this.h;
            int i4 = this.g;
            boolean z = this.e;
            int i5 = this.f;
            uiq uiqVar = this.c;
            cdo cdoVar = this.b;
            bay.ab((ccm) this.k, this.a, cdoVar, uiqVar, i5, z, i4, i3, r9, aycVar, bay.j(i | 1), bay.j(i2));
            return ufg.a;
        }
        ((Integer) obj2).intValue();
        int iJ = bay.j(this.h | 1);
        int i6 = this.i;
        ?? r8 = this.k;
        int i7 = this.g;
        int i8 = this.f;
        boolean z2 = this.e;
        int i9 = this.d;
        uiq uiqVar2 = this.c;
        cdo cdoVar2 = this.b;
        bik bikVar = this.a;
        bay.aa((String) this.j, bikVar, cdoVar2, uiqVar2, i9, z2, i8, i7, r8, (ayc) obj, iJ, i6);
        return ufg.a;
    }

    public /* synthetic */ aqg(String str, bik bikVar, cdo cdoVar, uiq uiqVar, int i, boolean z, int i2, int i3, bkx bkxVar, int i4, int i5, int i6) {
        this.l = i6;
        this.j = str;
        this.a = bikVar;
        this.b = cdoVar;
        this.c = uiqVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.k = bkxVar;
        this.h = i4;
        this.i = i5;
    }
}
