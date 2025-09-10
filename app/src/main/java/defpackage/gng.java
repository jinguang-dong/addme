package defpackage;

import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gng implements jjv {
    private final gli a;
    private final gln b;

    public gng(gli gliVar, gln glnVar) {
        this.a = gliVar;
        this.b = glnVar;
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        return new fgp(3);
    }

    @Override // defpackage.jjv
    public final void d() {
        this.a.f(true);
        gln glnVar = this.b;
        RecordSpeedSlider recordSpeedSlider = glnVar.i;
        if (recordSpeedSlider != null) {
            recordSpeedSlider.e();
        }
        AmbientModeSupport.AmbientController ambientController = glnVar.w;
        if (ambientController != null) {
            ((gli) ambientController.a).e.c();
        }
    }

    @Override // defpackage.jjv
    public final void e() {
        View childAt;
        gln glnVar = this.b;
        RecordSpeedSlider recordSpeedSlider = glnVar.i;
        if (recordSpeedSlider == null || !recordSpeedSlider.isEnabled() || (childAt = glnVar.i.getChildAt(glnVar.n)) == null || childAt.getVisibility() != 0) {
            return;
        }
        glnVar.i.g(glnVar.n);
    }

    @Override // defpackage.jjv
    public final void g() {
        gln glnVar = this.b;
        RecordSpeedSlider recordSpeedSlider = glnVar.i;
        if (recordSpeedSlider != null) {
            recordSpeedSlider.i();
        }
        AmbientModeSupport.AmbientController ambientController = glnVar.w;
        if (ambientController != null) {
            mzb mzbVar = ((gli) ambientController.a).e;
            mzbVar.c();
            mzbVar.f();
        }
        this.a.h(true);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }

    @Override // defpackage.jjv
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
