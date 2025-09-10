package defpackage;

import android.transition.Transition;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ax extends ar {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ax(defpackage.dg r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r8.getClass()
            r7.<init>(r8)
            int r0 = r8.h
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 2
            if (r0 != r4) goto L29
            if (r9 == 0) goto L22
            bm r9 = r8.a
            bi r1 = r9.S
            if (r1 != 0) goto L17
            goto L31
        L17:
            java.lang.Object r1 = r1.l
            java.lang.Object r5 = defpackage.bm.e
            if (r1 != r5) goto L3e
            java.lang.Object r1 = r9.getExitTransition()
            goto L3e
        L22:
            bm r9 = r8.a
            java.lang.Object r9 = r9.getEnterTransition()
            goto L46
        L29:
            if (r9 == 0) goto L40
            bm r9 = r8.a
            bi r1 = r9.S
            if (r1 != 0) goto L33
        L31:
            r1 = r2
            goto L3e
        L33:
            java.lang.Object r1 = r1.j
            java.lang.Object r5 = defpackage.bm.e
            if (r1 != r5) goto L3e
            java.lang.Object r9 = r9.getEnterTransition()
            r1 = r9
        L3e:
            r9 = r3
            goto L49
        L40:
            bm r9 = r8.a
            java.lang.Object r9 = r9.getExitTransition()
        L46:
            r6 = r1
            r1 = r9
            r9 = r6
        L49:
            r7.b = r1
            if (r0 != r4) goto L6e
            if (r9 == 0) goto L5f
            bm r0 = r8.a
            bi r0 = r0.S
            if (r0 == 0) goto L6e
            java.lang.Boolean r0 = r0.o
            if (r0 != 0) goto L5a
            goto L6e
        L5a:
            boolean r3 = r0.booleanValue()
            goto L6e
        L5f:
            bm r0 = r8.a
            bi r0 = r0.S
            if (r0 == 0) goto L6e
            java.lang.Boolean r0 = r0.p
            if (r0 != 0) goto L6a
            goto L6e
        L6a:
            boolean r3 = r0.booleanValue()
        L6e:
            r7.c = r3
            if (r10 == 0) goto L85
            bm r8 = r8.a
            if (r9 == 0) goto L81
            bi r9 = r8.S
            if (r9 != 0) goto L7b
            goto L85
        L7b:
            java.lang.Object r2 = r9.n
            java.lang.Object r9 = defpackage.bm.e
            if (r2 != r9) goto L85
        L81:
            java.lang.Object r2 = r8.getSharedElementEnterTransition()
        L85:
            r7.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax.<init>(dg, boolean, boolean):void");
    }

    public final boolean c() {
        return this.d != null;
    }

    private final cy d(Object obj) {
        if (obj == null) {
            return null;
        }
        cy cyVar = cr.a;
        if (obj instanceof Transition) {
            return cyVar;
        }
        cy cyVar2 = cr.b;
        if (cyVar2 != null && cyVar2.m(obj)) {
            return cyVar2;
        }
        throw new IllegalArgumentException(mPfBwqXsnpXI.tRutQBZHNY + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final cy a() {
        Object obj = this.d;
        Object obj2 = this.b;
        cy cyVarD = d(obj2);
        cy cyVarD2 = d(obj);
        if (cyVarD == null || cyVarD2 == null || cyVarD == cyVarD2) {
            return cyVarD == null ? cyVarD2 : cyVarD;
        }
        throw new IllegalArgumentException(INRGuObcrHjSQz.EvwKpjZvi + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }
}
