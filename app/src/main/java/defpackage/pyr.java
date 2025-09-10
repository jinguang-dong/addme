package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyr implements sxi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ pyr(pun punVar, clm clmVar, String str, clr clrVar, int i, int i2) {
        this.f = i2;
        this.e = punVar;
        this.d = clmVar;
        this.b = str;
        this.c = clrVar;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        if (this.f == 0) {
            if (((Boolean) obj).booleanValue() || this.a == 4) {
                return syq.a;
            }
            Object obj2 = this.e;
            Object obj3 = this.d;
            Object obj4 = this.c;
            pvc pvcVar = (pvc) obj4;
            return ((pzb) this.b).s(pvcVar, (pva) obj3, (pvp) obj2, pvcVar.l);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj5 = this.e;
        if (zBooleanValue && ((pun) obj5).k == 2) {
            int i = this.a;
            Object obj6 = this.c;
            ?? r2 = this.b;
            clm clmVar = (clm) this.d;
            clmVar.n = "status";
            clmVar.e(r2);
            clmVar.i(R.drawable.stat_sys_download);
            clmVar.g(true);
            clmVar.h(0, 0, false);
            ((clr) obj6).a(i, clmVar.a());
        }
        rwc rwcVar = ((pun) obj5).h;
        if (rwcVar.h()) {
            rwcVar.c();
            int i2 = qbu.a;
        }
        return syq.a;
    }

    public /* synthetic */ pyr(pzb pzbVar, int i, pvc pvcVar, pva pvaVar, pvp pvpVar, int i2) {
        this.f = i2;
        this.b = pzbVar;
        this.a = i;
        this.c = pvcVar;
        this.d = pvaVar;
        this.e = pvpVar;
    }
}
