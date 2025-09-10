package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dsp implements uiu {
    public final /* synthetic */ bne a;
    public final /* synthetic */ String b;
    public final /* synthetic */ bik c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ dsp(bne bneVar, String str, bik bikVar, long j, int i, int i2) {
        this.f = i2;
        this.a = bneVar;
        this.b = str;
        this.c = bikVar;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.e;
            long j = this.d;
            bik bikVar = this.c;
            AmbientModeSupport.AmbientCallback.h(this.a, this.b, bikVar, j, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.e;
        long j2 = this.d;
        bik bikVar2 = this.c;
        dsq.a(this.a, this.b, bikVar2, j2, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }
}
