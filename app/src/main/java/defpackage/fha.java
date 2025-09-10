package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import com.google.android.apps.camera.aizoom.animation.AiZoomPreviewUserEducationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fha extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public long a;
    final /* synthetic */ AiZoomPreviewUserEducationView b;

    public fha(AiZoomPreviewUserEducationView aiZoomPreviewUserEducationView) {
        this.b = aiZoomPreviewUserEducationView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        if (jElapsedRealtime > 9000) {
            AiZoomPreviewUserEducationView aiZoomPreviewUserEducationView = this.b;
            aiZoomPreviewUserEducationView.a.l();
            valueAnimator.end();
            aiZoomPreviewUserEducationView.a();
            return;
        }
        AiZoomPreviewUserEducationView aiZoomPreviewUserEducationView2 = this.b;
        if (jElapsedRealtime < 170) {
            float f = (jElapsedRealtime / 170.0f) * 255.0f;
            owq owqVar = aiZoomPreviewUserEducationView2.c;
            leo leoVar = new leo((fhi) owqVar.dL());
            leoVar.e((int) f);
            owqVar.a(leoVar.d());
        } else if (jElapsedRealtime > 8920) {
            owq owqVar2 = aiZoomPreviewUserEducationView2.c;
            leo leoVar2 = new leo((fhi) owqVar2.dL());
            leoVar2.e((int) ((1.0f - ((jElapsedRealtime - 8920) / 80.0f)) * 255.0f));
            owqVar2.a(leoVar2.d());
        } else {
            owq owqVar3 = aiZoomPreviewUserEducationView2.c;
            leo leoVar3 = new leo((fhi) owqVar3.dL());
            leoVar3.e(255);
            owqVar3.a(leoVar3.d());
        }
        owq owqVar4 = aiZoomPreviewUserEducationView2.c;
        leo leoVar4 = new leo((fhi) owqVar4.dL());
        leoVar4.f(true);
        owqVar4.a(leoVar4.d());
        aiZoomPreviewUserEducationView2.a.setAlpha(((fhi) aiZoomPreviewUserEducationView2.c.dL()).c);
        aiZoomPreviewUserEducationView2.invalidate();
    }
}
