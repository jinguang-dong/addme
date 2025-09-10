package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.aizoom.animation.AiZoomPreviewUserEducationView;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njm implements nkm {
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public njm(Object obj, uem uemVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = uemVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, owf] */
    @Override // defpackage.nkm
    public final void a() {
        switch (this.b) {
            case 0:
                AiZoomPreviewUserEducationView aiZoomPreviewUserEducationView = (AiZoomPreviewUserEducationView) ((ocq) ((mwq) this.a.a()).b).c(R.id.boba_pearl_drag_edu_animation_view);
                hrj hrjVar = (hrj) this.c;
                hrjVar.b = aiZoomPreviewUserEducationView;
                aiZoomPreviewUserEducationView.setVisibility(8);
                aiZoomPreviewUserEducationView.c = hrjVar.a;
                aiZoomPreviewUserEducationView.d = hrjVar.c;
                ((fdq) hrjVar.d).j().d(hrjVar.f.dK(new fbo(aiZoomPreviewUserEducationView, 20), hrjVar.e));
                break;
            case 1:
                ocq ocqVar = (ocq) ((mwq) this.c.a()).b;
                View view = (View) ocqVar.c(R.id.camera_app_root);
                view.post(new iff(this, view, ocqVar, (MainActivityLayout) ocqVar.c(R.id.activity_root_view), 5));
                break;
            case 2:
                rwc rwcVar = (rwc) this.a;
                if (rwcVar.h()) {
                    ftv ftvVar = (ftv) rwcVar.c();
                    Context context = (Context) this.c;
                    ftvVar.l = context;
                    nao naoVar = new nao();
                    naoVar.e = context.getResources().getString(R.string.catshark_on_chip);
                    naoVar.h = context;
                    naoVar.j = 2;
                    naoVar.a = true;
                    ftvVar.m = naoVar.a();
                    break;
                }
                break;
            case 3:
                AutoTimerIndicatorView autoTimerIndicatorView = (AutoTimerIndicatorView) ((ocq) ((mwq) this.a.a()).b).c(R.id.autotimer_indicator_view);
                Object obj = this.c;
                khb khbVar = (khb) obj;
                khbVar.e = autoTimerIndicatorView;
                ((fdq) khbVar.d).j().d(khbVar.c.dK(new fnb(obj, 4), khbVar.a));
                break;
            case 4:
                CaptureFrameUi captureFrameUi = (CaptureFrameUi) ((ocq) ((mwq) this.a.a()).b).c(R.id.capture_frame);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                mny mnyVar = (mny) this.c;
                mnyVar.a = valueAnimatorOfFloat;
                mnyVar.a.setDuration(200L);
                mnyVar.a.setInterpolator(new LinearInterpolator());
                mnyVar.a.addUpdateListener(new ncx(mnyVar, captureFrameUi, 1));
                mnyVar.a.addListener(new mnx(mnyVar, captureFrameUi));
                break;
            case 5:
                ngw ngwVarA = ((ngx) this.a).a();
                ViewStub viewStub = (ViewStub) ((ocq) ngwVarA.j).c(R.id.help_ui_cinematic_pan);
                ?? r12 = this.c;
                ((muu) r12).b = viewStub;
                ((MainActivityLayout) ngwVarA.c).h(r12);
                break;
            case 6:
                ngw ngwVarA2 = ((ngx) this.a).a();
                ViewStub viewStub2 = (ViewStub) ((ocq) ngwVarA2.j).c(R.id.help_ui_cinematic);
                ?? r122 = this.c;
                ((muu) r122).b = viewStub2;
                ((MainActivityLayout) ngwVarA2.c).h(r122);
                break;
            case 7:
                ngw ngwVarA3 = ((ngx) this.a).a();
                ViewStub viewStub3 = (ViewStub) ((ocq) ngwVarA3.j).c(R.id.help_ui_zoom_slider);
                ?? r123 = this.c;
                ((muu) r123).b = viewStub3;
                ((MainActivityLayout) ngwVarA3.c).h(r123);
                break;
            case 8:
                ((lmx) this.c).d((ProgressOverlay) ((ocq) ((mwq) this.a.a()).b).c(R.id.progress_overlay));
                break;
            case 9:
                ngw ngwVarA4 = ((ngx) this.a).a();
                Object obj2 = ngwVarA4.h;
                ?? r124 = this.c;
                krn krnVar = (krn) r124;
                krnVar.k = (TimerWidget) obj2;
                sba sbaVar = new sba();
                sbaVar.d(sbc.b(ksa.TIMER_ZERO_SECONDS, ltw.OFF, ksa.TIMER_THREE_SECONDS, ltw.THREE, ksa.TIMER_TEN_SECONDS, ltw.TEN));
                if (krnVar.f) {
                    sbaVar.c(ksa.TIMER_FIVE_SECONDS, ltw.FIVE);
                }
                krnVar.i = sbaVar.b();
                krnVar.b.d(owl.a(krnVar.c, krnVar.d, krnVar.e, krnVar.g, krnVar.h).dK(new ksq(r124, 1), krnVar.a));
                ((MainActivityLayout) ngwVarA4.c).h(r124);
                break;
            default:
                ngw ngwVarA5 = ((ngx) this.a).a();
                ViewStub viewStub4 = (ViewStub) ((ocq) ngwVarA5.j).c(R.id.help_ui_video_night_sight);
                ?? r1 = this.c;
                ((muu) r1).b = viewStub4;
                ((MainActivityLayout) ngwVarA5.c).h(r1);
                break;
        }
    }

    public njm(muu muuVar, uem uemVar, int i) {
        this.b = i;
        this.c = muuVar;
        this.a = uemVar;
    }

    public njm(rwc rwcVar, Context context, int i) {
        this.b = i;
        this.a = rwcVar;
        this.c = context;
    }

    public njm(uem uemVar, krn krnVar, int i) {
        this.b = i;
        this.a = uemVar;
        this.c = krnVar;
    }
}
