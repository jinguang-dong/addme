package defpackage;

import android.os.SystemClock;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkp extends riz {
    final /* synthetic */ View a;
    final /* synthetic */ jkq b;

    public jkp(jkq jkqVar, View view) {
        this.a = view;
        this.b = jkqVar;
    }

    @Override // defpackage.riz
    public final void a(View view, float f) {
        this.b.f.setAlpha(Math.max(f, 0.0f));
    }

    @Override // defpackage.riz
    public final void b(View view, int i) {
        if (i == 3) {
            this.b.h = SystemClock.uptimeMillis();
            return;
        }
        if (i == 4 || i == 5) {
            this.a.setVisibility(4);
            jkq jkqVar = this.b;
            jkqVar.c.a(false);
            tpc tpcVarM = snz.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            snz snzVar = (snz) tpcVarM.b;
            snzVar.c = 25;
            snzVar.b |= 1;
            long jUptimeMillis = SystemClock.uptimeMillis() - jkqVar.h;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            mdy mdyVar = jkqVar.k;
            snz snzVar2 = (snz) tpcVarM.b;
            snzVar2.b |= 2;
            snzVar2.d = jUptimeMillis;
            mdyVar.h((snz) tpcVarM.l());
            jkqVar.h = 0L;
        }
    }
}
