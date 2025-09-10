package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ror implements Handler.Callback {
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r7 = r8.what
            r0 = 4
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L71
            if (r7 == r2) goto La
            return r1
        La:
            java.lang.Object r7 = r8.obj
            row r7 = (defpackage.row) r7
            int r8 = r8.arg1
            boolean r8 = r7.i()
            if (r8 == 0) goto L6d
            rov r8 = r7.j
            int r3 = r8.getVisibility()
            if (r3 != 0) goto L6d
            int r8 = r8.c
            if (r8 != r2) goto L3e
            r8 = 2
            float[] r8 = new float[r8]
            r8 = {x00bc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = r7.c(r8)
            int r0 = r7.d
            long r0 = (long) r0
            r8.setDuration(r0)
            ron r0 = new ron
            r0.<init>(r7)
            r8.addListener(r0)
            r8.start()
            goto L70
        L3e:
            android.animation.ValueAnimator r8 = new android.animation.ValueAnimator
            r8.<init>()
            int r3 = r7.b()
            int[] r1 = new int[]{r1, r3}
            r8.setIntValues(r1)
            android.animation.TimeInterpolator r1 = r7.f
            r8.setInterpolator(r1)
            int r1 = r7.e
            long r3 = (long) r1
            r8.setDuration(r3)
            roq r1 = new roq
            r1.<init>(r7)
            r8.addListener(r1)
            roo r1 = new roo
            r1.<init>(r7, r0)
            r8.addUpdateListener(r1)
            r8.start()
            goto L70
        L6d:
            r7.j()
        L70:
            return r2
        L71:
            java.lang.Object r7 = r8.obj
            row r7 = (defpackage.row) r7
            rov r8 = r7.j
            android.view.ViewParent r3 = r8.getParent()
            if (r3 != 0) goto Laf
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            boolean r4 = r3 instanceof defpackage.clf
            if (r4 == 0) goto La0
            clf r3 = (defpackage.clf) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r4 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r4.<init>()
            scf r5 = r4.g
            androidx.wear.ambient.AmbientMode$AmbientController r6 = r7.s
            r5.a = r6
            androidx.wear.ambient.AmbientMode$AmbientController r5 = new androidx.wear.ambient.AmbientMode$AmbientController
            r5.<init>(r7)
            r4.f = r5
            r3.b(r4)
            r4 = 80
            r3.g = r4
        La0:
            android.view.ViewGroup r3 = r7.h
            r8.g = r2
            r3.addView(r8)
            r8.g = r1
            r7.h()
            r8.setVisibility(r0)
        Laf:
            boolean r8 = r8.isLaidOut()
            if (r8 == 0) goto Lb9
            r7.g()
            goto Lbb
        Lb9:
            r7.q = r2
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ror.handleMessage(android.os.Message):boolean");
    }
}
