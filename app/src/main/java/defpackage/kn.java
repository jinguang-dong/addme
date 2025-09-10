package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kn {
    public rnu l = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 120;
    public long j = 250;
    public long k = 250;

    public static final km r(lg lgVar) {
        km kmVar = new km();
        kmVar.a(lgVar);
        return kmVar;
    }

    public static void s(lg lgVar) {
        int i = lgVar.j;
        if (!lgVar.s() && (i & 4) == 0) {
            int i2 = lgVar.d;
            lgVar.a();
        }
    }

    public abstract void b(lg lgVar);

    public abstract void c();

    public abstract void d();

    public boolean g(lg lgVar, List list) {
        throw null;
    }

    public abstract boolean h();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.lg r10) {
        /*
            r9 = this;
            rnu r9 = r9.l
            if (r9 == 0) goto L97
            r0 = 1
            r10.m(r0)
            lg r1 = r10.h
            r2 = 0
            if (r1 == 0) goto L13
            lg r1 = r10.i
            if (r1 != 0) goto L13
            r10.h = r2
        L13:
            r10.i = r2
            int r1 = r10.j
            r1 = r1 & 16
            if (r1 == 0) goto L1d
            goto L97
        L1d:
            android.view.View r1 = r10.a
            java.lang.Object r2 = r9.a
            android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
            r2.ag()
            iv r3 = r2.g
            int r4 = r3.c
            r5 = 0
            if (r4 != r0) goto L3b
            android.view.View r0 = r3.d
            if (r0 != r1) goto L33
        L31:
            r0 = r5
            goto L66
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r9.<init>(r10)
            throw r9
        L3b:
            r6 = 2
            if (r4 == r6) goto L8f
            r3.c = r6     // Catch: java.lang.Throwable -> L8b
            rnu r4 = r3.e     // Catch: java.lang.Throwable -> L8b
            int r6 = r4.x(r1)     // Catch: java.lang.Throwable -> L8b
            r7 = -1
            if (r6 != r7) goto L4f
            r3.l(r1)     // Catch: java.lang.Throwable -> L8b
            r3.c = r5
            goto L66
        L4f:
            iu r7 = r3.a     // Catch: java.lang.Throwable -> L8b
            boolean r8 = r7.f(r6)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L63
            r7.g(r6)     // Catch: java.lang.Throwable -> L8b
            r3.l(r1)     // Catch: java.lang.Throwable -> L8b
            r4.A(r6)     // Catch: java.lang.Throwable -> L8b
            r3.c = r5
            goto L66
        L63:
            r3.c = r5
            goto L31
        L66:
            if (r0 == 0) goto L74
            lg r1 = android.support.v7.widget.RecyclerView.i(r1)
            kv r3 = r2.e
            r3.m(r1)
            r3.k(r1)
        L74:
            r1 = r0 ^ 1
            r2.ah(r1)
            if (r0 != 0) goto L97
            boolean r0 = r10.w()
            if (r0 == 0) goto L97
            java.lang.Object r9 = r9.a
            android.view.View r10 = r10.a
            android.support.v7.widget.RecyclerView r9 = (android.support.v7.widget.RecyclerView) r9
            r9.removeDetachedView(r10, r5)
            return
        L8b:
            r9 = move-exception
            r3.c = r5
            throw r9
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r9.<init>(r10)
            throw r9
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.k(lg):void");
    }

    public final void l() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kl) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public abstract boolean m(lg lgVar, km kmVar, km kmVar2);

    public abstract boolean n(lg lgVar, lg lgVar2, km kmVar, km kmVar2);

    public abstract boolean o(lg lgVar, km kmVar, km kmVar2);

    public abstract boolean p(lg lgVar, km kmVar, km kmVar2);

    public boolean q(lg lgVar) {
        throw null;
    }
}
