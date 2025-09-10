package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.android.apps.camera.ui.cuttlefish.CountdownSliderUi;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njn implements nkm {
    private final uem a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;
    private final Object e;

    public njn(gtm gtmVar, imi imiVar, uem uemVar, hbj hbjVar, int i) {
        this.b = i;
        this.c = gtmVar;
        this.d = imiVar;
        this.a = uemVar;
        this.e = hbjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mxl, paq] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, owf] */
    @Override // defpackage.nkm
    public final void a() {
        int i = this.b;
        if (i == 0) {
            uem uemVar = this.a;
            CountdownSliderUi countdownSliderUi = (CountdownSliderUi) ((ocq) ((mwq) uemVar.a()).b).c(R.id.cuttlefish_bone_slider);
            ?? r3 = this.d;
            mtm mtmVar = (mtm) r3;
            mtmVar.j = countdownSliderUi;
            mtmVar.i = ((Context) this.c).getResources();
            mtmVar.k = mtmVar.j.g();
            mtmVar.k.h();
            mtmVar.k.setAccessibilityDelegate(new mtl());
            TextView textViewF = mtmVar.j.f();
            TextView textViewC = mtmVar.j.c();
            TextView textViewE = mtmVar.j.e();
            TextView textViewB = mtmVar.j.b();
            textViewF.setTextColor(ojl.aO(mtmVar.j));
            textViewC.setTextColor(ojl.aO(mtmVar.j));
            textViewE.setTextColor(ojl.aO(mtmVar.j));
            textViewB.setTextColor(ojl.aO(mtmVar.j));
            mtmVar.o(textViewF);
            mtmVar.o(textViewC);
            mtmVar.o(textViewE);
            mtmVar.o(textViewB);
            mtmVar.k.i = new mth(mtmVar);
            mtmVar.b.d(new khc((Object) r3, 19));
            mtmVar.k.setOnSeekBarChangeListener(new mti(mtmVar));
            mtmVar.e = mtmVar.i.getString(R.string.off_pos_desc);
            mtmVar.f = mtmVar.i.getString(R.string.auto_pos_desc);
            mtmVar.g = mtmVar.i.getString(R.string.max_pos_desc);
            mtmVar.h = mtmVar.i.getString(R.string.astro_pos_desc);
            mtmVar.s(false);
            mtmVar.d.a(true);
            ((fdq) this.e).j().d(r3);
            ((MainActivityLayout) ((ocq) ((mwq) uemVar.a()).b).c(R.id.activity_root_view)).i(r3, mxk.TO_LEFT);
            return;
        }
        if (i == 1) {
            CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) ((ocq) ((mwq) this.a.a()).b).c(R.id.coach_hud);
            hbj hbjVar = (hbj) this.e;
            if (hbjVar.p(gyp.n) && cameraCoachHudView.d.h()) {
                ((gua) cameraCoachHudView.d.c()).j = true;
            }
            hbjVar.a(gyp.a).ifPresent(new ktp(cameraCoachHudView, 14));
            if (hbjVar.p(gyp.l) && cameraCoachHudView.b.h()) {
                ((guj) cameraCoachHudView.b.c()).i = true;
            }
            Object obj = this.c;
            Object obj2 = this.d;
            rwc rwcVarJ = rwc.j(cameraCoachHudView);
            gtm gtmVar = (gtm) obj;
            ?? r32 = gtmVar.e;
            gtn gtnVar = (gtn) r32;
            gtnVar.d = rwcVarJ;
            ktx ktxVar = gtnVar.e;
            fdq fdqVar = gtnVar.f;
            ktxVar.c(r32);
            fdqVar.j().d(new ffx((Object) r32, ktxVar, 6));
            fdqVar.j().d(new ffx((Object) r32, ktxVar, 7));
            if (gtnVar.d.h()) {
                ((CameraCoachHudView) gtnVar.d.c()).a = ktxVar.a().e;
            }
            fdqVar.j().d(gtnVar.a.dK(new fnb(r32, 9), out.a));
            gue gueVar = (gue) gtmVar.a;
            gueVar.g = rwc.j(obj2);
            gueVar.f = rwc.j(r32);
            gun gunVar = (gun) gtmVar.b;
            gunVar.c = rwc.j(obj2);
            gunVar.d = rwc.j(r32);
            ((guk) gtmVar.c).f = rwc.j(gtmVar.f);
            gtx gtxVar = (gtx) gtmVar.d;
            gtxVar.i = rwc.j(obj2);
            gtxVar.j = rwc.j(r32);
            return;
        }
        if (i == 2) {
            ocq ocqVar = (ocq) ((mwq) this.a.a()).b;
            ElapsedTimerView elapsedTimerView = (ElapsedTimerView) ocqVar.c(R.id.elapsed_timer_view);
            LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) ocqVar.c(R.id.long_press_elapsed_timer_view);
            if (((hbj) this.c).p(gzz.p)) {
                this.d.k(longPressElapsedTimeView);
            } else {
                this.d.k(elapsedTimerView);
            }
            this.e.k(elapsedTimerView);
            return;
        }
        if (i != 3) {
            ((fdq) this.c).j().d(this.d.dK(new njq((GridLinesUi) ((ocq) ((mwq) this.a.a()).b).c(R.id.grid_lines)), this.e));
            return;
        }
        rwc rwcVar = (rwc) this.d.a();
        if (rwcVar.h()) {
            Object obj3 = ((ngx) this.e).a().c;
            mxl mxlVar = (mxl) rwcVar.c();
            mxk mxkVar = mxk.DEVICE;
            MainActivityLayout mainActivityLayout = (MainActivityLayout) obj3;
            mainActivityLayout.i(mxlVar, mxkVar);
            mainActivityLayout.i(new njp(rwcVar), mxk.TO_RIGHT);
            ((iqj) rwcVar.c()).a();
            jgt jgtVar = (jgt) this.c;
            jgtVar.k((iqj) rwcVar.c());
            rwc rwcVar2 = (rwc) this.a.a();
            if (rwcVar2.h()) {
                mainActivityLayout.i((mxl) rwcVar2.c(), mxkVar);
                ipy ipyVar = (ipy) rwcVar2.c();
                rwc rwcVar3 = (rwc) ipyVar.f.a();
                if (rwcVar3.h()) {
                    ipyVar.h = (iqj) rwcVar3.c();
                    owf owfVar = ipyVar.c;
                    ipyVar.g = (nkw) owfVar.dL();
                    fdq fdqVar2 = ipyVar.k;
                    fdqVar2.j().d(ipyVar.a.dK(new pau() { // from class: ipx
                        @Override // defpackage.pau
                        public final void a(Object obj4) {
                        }
                    }, sxo.a));
                    our ourVarJ = fdqVar2.j();
                    ijl ijlVar = new ijl(ipyVar, 8);
                    out outVar = ipyVar.b;
                    ourVarJ.d(owfVar.dK(ijlVar, outVar));
                    fdqVar2.j().d(ipyVar.e.dK(new ijl(ipyVar, 9), outVar));
                    fdqVar2.j().d(ipyVar.d.dK(new ijl(ipyVar, 10), outVar));
                }
                jgtVar.k((ipy) rwcVar2.c());
            }
        }
    }

    public njn(jgt jgtVar, uem uemVar, uem uemVar2, uem uemVar3, int i) {
        this.b = i;
        this.c = jgtVar;
        this.d = uemVar;
        this.e = uemVar2;
        this.a = uemVar3;
    }

    public njn(mtm mtmVar, uem uemVar, Context context, fdq fdqVar, int i) {
        this.b = i;
        this.d = mtmVar;
        this.a = uemVar;
        this.c = context;
        this.e = fdqVar;
    }

    public njn(mua muaVar, mua muaVar2, uem uemVar, hbj hbjVar, int i) {
        this.b = i;
        this.e = muaVar;
        this.d = muaVar2;
        this.a = uemVar;
        this.c = hbjVar;
    }

    public njn(uem uemVar, fdq fdqVar, luj lujVar, out outVar, int i) {
        this.b = i;
        this.a = uemVar;
        this.c = fdqVar;
        this.d = lujVar.a(luf.d);
        this.e = outVar;
    }
}
