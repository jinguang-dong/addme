package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dxs extends uht implements uiw {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public dxs(uhb uhbVar) {
        super(4, uhbVar);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            dwj.b();
            Log.e(dxu.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(j * 30000, dxu.b);
            this.a = 1;
            if (ung.e(jMin, this) == uhiVar) {
                return uhiVar;
            }
        }
        return true;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        dxs dxsVar = new dxs((uhb) obj4);
        dxsVar.b = (Throwable) obj2;
        dxsVar.c = jLongValue;
        return dxsVar.b(ufg.a);
    }
}
