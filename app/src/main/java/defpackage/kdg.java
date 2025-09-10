package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.camera.ui.widget.ReviewImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdg implements lst {
    final /* synthetic */ kdh a;

    public kdg(kdh kdhVar) {
        this.a = kdhVar;
    }

    @Override // defpackage.lst
    public final void e(long j) {
        kdh kdhVar = this.a;
        if (kdhVar.d || !kdhVar.e) {
            return;
        }
        kdhVar.d = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(kdhVar.h, 0);
        valueAnimatorOfInt.addUpdateListener(new cot(kdhVar, 9, null));
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
    }

    @Override // defpackage.lst
    public final void g(ltd ltdVar, Bitmap bitmap, int i) {
        kdh kdhVar = this.a;
        if (kdhVar.e) {
            int i2 = (kdhVar.f - i) + kdhVar.g;
            kdhVar.d = true;
            ReviewImageView reviewImageView = kdhVar.a;
            iob iobVar = kdhVar.c;
            bitmap.getClass();
            reviewImageView.b(iobVar.a(bitmap, i2));
        }
    }

    @Override // defpackage.lst
    public final /* synthetic */ void b(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void d(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void n(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
    }
}
