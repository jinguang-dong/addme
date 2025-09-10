package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.cuttlefish.CountdownSliderUi;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.views.CutoutBar;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iff implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ iff(CameraActivityTiming cameraActivityTiming, hbj hbjVar, cxb cxbVar, rwc rwcVar, int i) {
        this.e = i;
        this.b = cameraActivityTiming;
        this.d = hbjVar;
        this.c = cxbVar;
        this.a = rwcVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r10v1, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mho] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        rwc rwcVarJ;
        int i = 1;
        switch (this.e) {
            case 0:
                ((fqg) this.d).b.d(this.a.d(this.b));
                this.c.a();
                break;
            case 1:
                CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.b;
                long permissionStartupTaskTimeEndNs = 0;
                if (cameraActivityTiming.getShutterButtonFirstEnabledNs() == 0 || cameraActivityTiming.getFirstPreviewFrameRenderedNs() == 0) {
                    rwcVarJ = rvk.a;
                } else {
                    long shutterButtonFirstEnabledNs = cameraActivityTiming.getShutterButtonFirstEnabledNs() - cameraActivityTiming.getActivityOnCreateStartNs();
                    long firstPreviewFrameRenderedNs = cameraActivityTiming.getFirstPreviewFrameRenderedNs() - cameraActivityTiming.getActivityOnCreateStartNs();
                    if (cameraActivityTiming.getPermissionStartupTaskTimeStartNs() != 0 && cameraActivityTiming.getPermissionStartupTaskTimeEndNs() != 0) {
                        permissionStartupTaskTimeEndNs = cameraActivityTiming.getPermissionStartupTaskTimeEndNs() - cameraActivityTiming.getPermissionStartupTaskTimeStartNs();
                    }
                    rwcVarJ = rwc.j(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(Math.max(shutterButtonFirstEnabledNs, firstPreviewFrameRenderedNs) - permissionStartupTaskTimeEndNs)));
                }
                hbj hbjVar = (hbj) this.d;
                int iIntValue = ((Integer) hbjVar.a(gzo.q).get()).intValue();
                int iIntValue2 = ((Integer) hbjVar.a(gzo.o).get()).intValue();
                if (!cameraActivityTiming.f() && rwcVarJ.h()) {
                    rwcVarJ.c();
                    if (((Long) rwcVarJ.c()).longValue() >= iIntValue2) {
                        cxb.I();
                    }
                    if (!hbjVar.p(gzo.aO) && !Build.TYPE.equals("user")) {
                        rwc rwcVar = (rwc) this.a;
                        if (rwcVar.h() && ((Long) rwcVarJ.c()).longValue() >= iIntValue) {
                            ((hgb) rwcVar.c()).a();
                            break;
                        }
                    }
                }
                break;
            case 2:
                this.d.execute(new gts((uem) this.b, (uem) this.a, (Executor) this.c, 4));
                break;
            case 3:
                ?? r0 = this.d;
                r0.f("MVCaptureCommand.Warmup");
                this.c.a();
                this.b.a();
                this.a.a();
                r0.g();
                break;
            case 4:
                ((our) this.c).d(this.b.dK(new leg(this.d, this.a, 3), sxo.a));
                break;
            case 5:
                if (nlj.k((View) this.d)) {
                    Object obj = this.b;
                    Object obj2 = this.a;
                    Object obj3 = this.c;
                    ocq ocqVar = (ocq) obj2;
                    CutoutBar cutoutBar = (CutoutBar) ocqVar.c(R.id.cutout_bar);
                    FrontLensIndicatorOverlay frontLensIndicatorOverlay = (FrontLensIndicatorOverlay) ocqVar.c(R.id.front_lens_indicator_overlay);
                    ?? r10 = ((njm) obj3).a;
                    lqg lqgVar = (lqg) r10.a();
                    lqgVar.g = cutoutBar;
                    lqgVar.h = frontLensIndicatorOverlay;
                    fdq fdqVar = lqgVar.j;
                    fdqVar.j().d(lqgVar.e.dK(new ksq(lqgVar, 20), lqgVar.c));
                    fdqVar.j().d(lqgVar.f.dK(new lqn(lqgVar, i), sxo.a));
                    MainActivityLayout mainActivityLayout = (MainActivityLayout) obj;
                    mainActivityLayout.k(cutoutBar);
                    mainActivityLayout.k(frontLensIndicatorOverlay);
                    mainActivityLayout.h((mxl) r10.a());
                    break;
                }
                break;
            case 6:
                ?? r02 = this.c;
                ((lwz) r02.a()).h(((pjo) this.b.a()).l().equals(pka.FRONT));
                ((lwz) r02.a()).l(owb.a(owl.h((owf) this.a.a(), new leb(11))));
                ((lwz) r02.a()).f(owb.a(owl.h(((luj) this.d).a(luf.x), new leb(12))));
                break;
            case 7:
                rwc rwcVar2 = (rwc) this.a;
                peo peoVar = (peo) rwcVar2.c();
                pfu pfuVar = (pfu) this.b;
                pdn pdnVarC = pfuVar.c(pfuVar.d(peoVar), 3);
                pdnVarC.l(new lxn(this.d, rwcVar2, 0));
                ((our) this.c).d(pdnVarC);
                break;
            case 8:
                mxm mxmVar = (mxm) this.a;
                float fAM = qpt.aM(mxmVar);
                View view = (View) this.d;
                view.setRotation(fAM);
                CountdownSliderUi countdownSliderUi = (CountdownSliderUi) this.b;
                boolean z = countdownSliderUi.e;
                Object obj4 = this.c;
                if (z) {
                    TextView textView = (TextView) obj4;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    if (layoutParams != null) {
                        if (countdownSliderUi.b.d()) {
                            layoutParams.gravity = 81;
                        } else if (countdownSliderUi.b == mxm.LANDSCAPE) {
                            layoutParams.gravity = 8388693;
                        } else {
                            layoutParams.gravity = 8388691;
                        }
                        textView.setLayoutParams(layoutParams);
                    }
                } else if (countdownSliderUi.b.d()) {
                    ((TextView) obj4).setGravity(81);
                } else if (countdownSliderUi.b == mxm.LANDSCAPE) {
                    ((TextView) obj4).setGravity(8388693);
                } else {
                    ((TextView) obj4).setGravity(8388691);
                }
                if (mxmVar.d()) {
                    view.setTranslationY(0.0f);
                } else if (countdownSliderUi.e) {
                    view.setTranslationY(countdownSliderUi.getResources().getDimensionPixelSize(R.dimen.slider_center_text_rotated_elevation_freeway));
                } else {
                    view.setTranslationY(countdownSliderUi.getResources().getDimensionPixelSize(R.dimen.slider_center_text_rotated_elevation));
                }
                CountdownSliderUi.q(view, true, 100L).start();
                break;
            default:
                ((sgt) ((sgt) qxu.a.a((Level) this.b).i((Throwable) this.c)).M(5799)).J((String) this.d, (Object[]) this.a);
                break;
        }
    }

    public /* synthetic */ iff(CountdownSliderUi countdownSliderUi, View view, mxm mxmVar, TextView textView, int i) {
        this.e = i;
        this.b = countdownSliderUi;
        this.d = view;
        this.a = mxmVar;
        this.c = textView;
    }

    public /* synthetic */ iff(fqg fqgVar, mhq mhqVar, mho mhoVar, idy idyVar, int i) {
        this.e = i;
        this.d = fqgVar;
        this.a = mhqVar;
        this.b = mhoVar;
        this.c = idyVar;
    }

    public /* synthetic */ iff(Executor executor, uem uemVar, uem uemVar2, Executor executor2, int i) {
        this.e = i;
        this.d = executor;
        this.b = uemVar;
        this.a = uemVar2;
        this.c = executor2;
    }

    public /* synthetic */ iff(Level level, Throwable th, String str, Object[] objArr, int i) {
        this.e = i;
        this.b = level;
        this.c = th;
        this.d = str;
        this.a = objArr;
    }

    public /* synthetic */ iff(njm njmVar, View view, ocq ocqVar, MainActivityLayout mainActivityLayout, int i) {
        this.e = i;
        this.c = njmVar;
        this.d = view;
        this.a = ocqVar;
        this.b = mainActivityLayout;
    }

    public /* synthetic */ iff(our ourVar, owf owfVar, kuj kujVar, ojl ojlVar, int i) {
        this.e = i;
        this.c = ourVar;
        this.b = owfVar;
        this.d = kujVar;
        this.a = ojlVar;
    }

    public /* synthetic */ iff(pbn pbnVar, tzj tzjVar, tzj tzjVar2, tzj tzjVar3, int i) {
        this.e = i;
        this.d = pbnVar;
        this.c = tzjVar;
        this.b = tzjVar2;
        this.a = tzjVar3;
    }

    public /* synthetic */ iff(pfu pfuVar, rwc rwcVar, pit pitVar, our ourVar, int i) {
        this.e = i;
        this.b = pfuVar;
        this.a = rwcVar;
        this.d = pitVar;
        this.c = ourVar;
    }

    public /* synthetic */ iff(tzj tzjVar, tzj tzjVar2, tzj tzjVar3, luj lujVar, int i) {
        this.e = i;
        this.c = tzjVar;
        this.b = tzjVar2;
        this.a = tzjVar3;
        this.d = lujVar;
    }
}
