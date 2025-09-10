package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mkd extends BroadcastReceiver {
    final /* synthetic */ mkr a;
    final /* synthetic */ mke b;

    public mkd(mke mkeVar, mkr mkrVar) {
        this.a = mkrVar;
        this.b = mkeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mke mkeVar = this.b;
        if (mkeVar.q == null) {
            return;
        }
        int intExtra = intent.getIntExtra("level", 0);
        boolean z = ((long) intExtra) <= 5;
        this.a.d.set(z);
        if (!z) {
            mkr mkrVar = (mkr) mkeVar.q.b;
            mkrVar.f(false);
            if (mkrVar.l()) {
                mkrVar.b();
                return;
            }
            return;
        }
        ((sgt) mke.a.c().M(4883)).t("Low battery level: %d", intExtra);
        oge ogeVar = mkeVar.q;
        if (((mjl) ogeVar.a).k(8)) {
            Object obj = ogeVar.b;
            nao naoVar = new nao();
            naoVar.j = 12;
            naoVar.a = false;
            mkr mkrVar2 = (mkr) obj;
            Context context2 = mkrVar2.g;
            naoVar.h = context2;
            naoVar.e = context2.getResources().getString(R.string.vid_chip_low_battery_stop);
            mkrVar2.B.a(naoVar.a());
        }
        mkr mkrVar3 = (mkr) ogeVar.b;
        mkrVar3.a();
        mkrVar3.f(true);
    }
}
