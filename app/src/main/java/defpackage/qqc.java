package defpackage;

import android.os.health.TimerStat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqc extends qqa {
    public static final qqc a = new qqc();

    private qqc() {
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr a(String str, Object obj) {
        return qpt.q(str, (TimerStat) obj);
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr b(tqr tqrVar, tqr tqrVar2) {
        return qpt.p((uxw) tqrVar, (uxw) tqrVar2);
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ String c(tqr tqrVar) {
        uxw uxwVar = (uxw) tqrVar;
        uxr uxrVar = uxwVar.e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if ((uxrVar.b & 2) != 0) {
            uxr uxrVar2 = uxwVar.e;
            if (uxrVar2 == null) {
                uxrVar2 = uxr.a;
            }
            return uxrVar2.d;
        }
        uxr uxrVar3 = uxwVar.e;
        if (uxrVar3 == null) {
            uxrVar3 = uxr.a;
        }
        return Long.toHexString(uxrVar3.c);
    }
}
