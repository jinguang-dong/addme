package defpackage;

import android.content.res.Resources;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fll extends flg {
    final /* synthetic */ fln a;

    public fll(fln flnVar) {
        this.a = flnVar;
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.l = false;
        fjz fjzVar = flnVar.f;
        fjzVar.h();
        ndj ndjVar = flnVar.e;
        ndjVar.N();
        ndjVar.az(ltw.OFF);
        ocq ocqVar = flnVar.p;
        if (ocqVar.ai("enter_mode_first_time_edu_shown") != 0) {
            fjzVar.o(1, fln.b);
        } else if (fjzVar.t()) {
            ocqVar.ak("enter_mode_first_time_edu_shown");
        }
        h();
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void b() {
        Duration duration = fln.a;
    }

    public void h() {
    }
}
