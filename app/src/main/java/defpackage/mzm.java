package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzm {
    private boolean d;
    private final naa e;
    private final WindowManager f;
    private final Context g;
    private int h;
    private float b = 0.0f;
    private float c = 0.0f;
    public boolean a = true;

    public mzm(naa naaVar, WindowManager windowManager, Context context) {
        this.e = naaVar;
        this.f = windowManager;
        this.g = context;
    }

    private final void e(boolean z, mxj mxjVar) {
        if (Math.abs(this.b) <= nlj.b(80.0f) && Math.abs(this.c) <= 3.0f) {
            a();
            return;
        }
        int iH = this.b > 0.0f ? 2 : 1;
        if (this.d) {
            return;
        }
        boolean zF = f(z, mxjVar);
        if (!zF) {
            int rotation = this.f.getDefaultDisplay().getRotation();
            if ((!g(mxjVar) && rotation == 3) || (g(mxjVar) && rotation == 1)) {
                iH = h(iH);
            }
            iH = h(iH);
        }
        if (this.e.z(iH, zF)) {
            this.d = true;
            a();
        }
    }

    private final boolean f(boolean z, mxj mxjVar) {
        if (g(mxjVar)) {
            return !z;
        }
        return z != nlj.i(this.f.getDefaultDisplay(), this.g).d();
    }

    private static final boolean g(mxj mxjVar) {
        return mxjVar.equals(mxj.TABLET_LAYOUT);
    }

    private static int h(int i) {
        return i == 2 ? 1 : 2;
    }

    public final void a() {
        this.h = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.e.j();
    }

    public final void b(boolean z, mxj mxjVar) {
        if (this.a || !f(z, mxjVar)) {
            e(z, mxjVar);
            this.d = false;
        }
    }

    public final void c(float f) {
        if (this.f.getDefaultDisplay().getRotation() == 1) {
            f = -f;
        }
        this.c = f / 1000.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3.e.p() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(float r4, boolean r5, defpackage.mxj r6) {
        /*
            r3 = this;
            boolean r0 = r3.f(r5, r6)
            boolean r1 = r3.a
            if (r1 != 0) goto Lb
            if (r0 != 0) goto L5d
            r0 = 0
        Lb:
            r1 = 1
            if (r5 == 0) goto L1b
            android.view.WindowManager r2 = r3.f
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            if (r2 != r1) goto L1b
            float r4 = -r4
        L1b:
            float r2 = r3.b
            float r2 = r2 + r4
            r3.b = r2
            int r4 = r3.h
            int r4 = r4 + r1
            r3.h = r4
            r1 = 2
            if (r4 > r1) goto L29
            goto L5d
        L29:
            if (r0 == 0) goto L4b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            naa r0 = r3.e
            boolean r0 = r0.q()
            if (r0 != 0) goto L47
        L38:
            float r2 = r3.b
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L4b
            naa r4 = r3.e
            boolean r4 = r4.p()
            if (r4 != 0) goto L47
            goto L4b
        L47:
            r3.a()
            return
        L4b:
            float r4 = java.lang.Math.abs(r2)
            r0 = 1117782016(0x42a00000, float:80.0)
            int r0 = defpackage.nlj.b(r0)
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L5d
            r3.e(r5, r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzm.d(float, boolean, mxj):void");
    }
}
