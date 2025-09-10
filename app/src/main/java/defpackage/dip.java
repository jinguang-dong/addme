package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dip extends kk {
    public int a;
    public int b;
    public final dio c;
    public int d;
    public boolean e;
    public AmbientLifecycleObserver.AmbientLifecycleCallback.CC f;
    private final ViewPager2 g;
    private final RecyclerView h;
    private final LinearLayoutManager i;
    private int j;
    private boolean k;
    private boolean l;

    public dip(ViewPager2 viewPager2) {
        this.g = viewPager2;
        RecyclerView recyclerView = viewPager2.e;
        this.h = recyclerView;
        this.i = (LinearLayoutManager) recyclerView.m;
        this.c = new dio();
        u();
    }

    private final void t(int i, float f, int i2) {
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = this.f;
        if (cc != null) {
            cc.b(i, f, i2);
        }
    }

    private final void u() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.j = -1;
        this.d = -1;
        this.k = false;
        this.l = false;
        this.e = false;
    }

    private final boolean v() {
        return this.a == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // defpackage.kk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.support.v7.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.l = r5
            r4.r()
            boolean r0 = r4.k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r4.k = r2
            if (r7 > 0) goto L1f
            if (r7 != 0) goto L29
            if (r6 < 0) goto L16
            r6 = r2
            goto L17
        L16:
            r6 = r5
        L17:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.g
            boolean r7 = r7.g()
            if (r6 != r7) goto L29
        L1f:
            dio r6 = r4.c
            int r7 = r6.c
            if (r7 == 0) goto L29
            int r6 = r6.a
            int r6 = r6 + r5
            goto L2d
        L29:
            dio r6 = r4.c
            int r6 = r6.a
        L2d:
            r4.d = r6
            int r7 = r4.j
            if (r7 == r6) goto L45
            r4.p(r6)
            goto L45
        L37:
            int r6 = r4.a
            if (r6 != 0) goto L45
            dio r6 = r4.c
            int r6 = r6.a
            if (r6 != r1) goto L42
            r6 = r2
        L42:
            r4.p(r6)
        L45:
            dio r6 = r4.c
            int r7 = r6.a
            if (r7 != r1) goto L4c
            r7 = r2
        L4c:
            float r0 = r6.b
            int r3 = r6.c
            r4.t(r7, r0, r3)
            int r7 = r6.a
            int r0 = r4.d
            if (r7 == r0) goto L5b
            if (r0 != r1) goto L69
        L5b:
            int r6 = r6.c
            if (r6 != 0) goto L69
            int r6 = r4.b
            if (r6 == r5) goto L69
            r4.q(r2)
            r4.u()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dip.a(android.support.v7.widget.RecyclerView, int, int):void");
    }

    @Override // defpackage.kk
    public final void c(RecyclerView recyclerView, int i) {
        if (!(this.a == 1 && this.b == 1) && i == 1) {
            this.a = 1;
            int i2 = this.d;
            if (i2 != -1) {
                this.j = i2;
                this.d = -1;
            } else if (this.j == -1) {
                this.j = this.i.I();
            }
            q(1);
            return;
        }
        if (v() && i == 2) {
            if (this.l) {
                q(2);
                this.k = true;
                return;
            }
            return;
        }
        if (v() && i == 0) {
            r();
            if (this.l) {
                dio dioVar = this.c;
                if (dioVar.c == 0) {
                    int i3 = this.j;
                    int i4 = dioVar.a;
                    if (i3 != i4) {
                        p(i4);
                    }
                }
            } else {
                int i5 = this.c.a;
                if (i5 != -1) {
                    t(i5, 0.0f, 0);
                }
            }
            q(0);
            u();
        }
        if (this.a == 2 && i == 0 && this.e) {
            r();
            dio dioVar2 = this.c;
            if (dioVar2.c == 0) {
                int i6 = this.d;
                int i7 = dioVar2.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    p(i7);
                }
                q(0);
                u();
            }
        }
    }

    public final void p(int i) {
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = this.f;
        if (cc != null) {
            cc.c(i);
        }
    }

    public final void q(int i) {
        if ((this.a == 3 && this.b == 0) || this.b == i) {
            return;
        }
        this.b = i;
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = this.f;
        if (cc != null) {
            cc.a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dip.r():void");
    }

    public final boolean s() {
        return this.b == 0;
    }
}
