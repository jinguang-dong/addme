package defpackage;

import android.app.Activity;
import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwy {
    public static final void a(Activity activity) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new cwz());
    }

    public static cxm b(cxp cxpVar, ukx ukxVar, cxy cxyVar) {
        return cxpVar.b(ske.av(ukxVar), cxyVar);
    }

    public static cxm c(cxp cxpVar, Class cls) {
        return cxpVar.a(cls);
    }

    public static final Object d(dco dcoVar, uhb uhbVar) {
        int i = dei.a;
        if (!dcoVar.q()) {
            return ((uvc) dcoVar.i()).a;
        }
        und undVar = null;
        if (((dcw) uhbVar.q().get(dcw.a)) != null) {
            throw null;
        }
        und undVar2 = dcoVar.b;
        if (undVar2 == null) {
            ujp.c("coroutineScope");
        } else {
            undVar = undVar2;
        }
        return ((uvc) undVar).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.dco r17, boolean r18, defpackage.uiq r19, defpackage.uhb r20) throws java.lang.Throwable {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = defpackage.dei.a
            boolean r4 = r3 instanceof defpackage.def
            if (r4 == 0) goto L1d
            r4 = r3
            def r4 = (defpackage.def) r4
            int r5 = r4.d
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.d = r5
            goto L22
        L1d:
            def r4 = new def
            r4.<init>(r3)
        L22:
            java.lang.Object r3 = r4.c
            uhi r5 = defpackage.uhi.a
            int r6 = r4.d
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L53
            if (r6 == r9) goto L4f
            if (r6 == r8) goto L40
            if (r6 != r7) goto L38
            defpackage.rnt.aN(r3)
            return r3
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            boolean r0 = r4.b
            boolean r0 = r4.a
            asj r1 = r4.f
            androidx.work.impl.WorkDatabase_Impl r2 = r4.e
            defpackage.rnt.aN(r3)
            r14 = r0
            r15 = r1
            r13 = r2
            goto L92
        L4f:
            defpackage.rnt.aN(r3)
            return r3
        L53:
            defpackage.rnt.aN(r3)
            boolean r3 = r0.q()
            if (r3 == 0) goto L77
            boolean r3 = r0.s()
            if (r3 == 0) goto L77
            boolean r3 = r0.r()
            if (r3 == 0) goto L77
            deh r3 = new deh
            r3.<init>(r1, r0, r10, r2)
            r4.d = r9
            java.lang.Object r0 = r0.v(r3, r4)
            if (r0 != r5) goto L76
            goto La8
        L76:
            return r0
        L77:
            r3 = r0
            androidx.work.impl.WorkDatabase_Impl r3 = (androidx.work.impl.WorkDatabase_Impl) r3
            r4.e = r3
            r3 = r2
            asj r3 = (defpackage.asj) r3
            r4.f = r3
            r4.a = r1
            r3 = 0
            r4.b = r3
            r4.d = r8
            java.lang.Object r3 = d(r0, r4)
            if (r3 != r5) goto L8f
            goto La8
        L8f:
            r13 = r0
            r14 = r1
            r15 = r2
        L92:
            uhf r3 = (defpackage.uhf) r3
            dee r11 = new dee
            r12 = 0
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r4.e = r10
            r4.f = r10
            r4.d = r7
            java.lang.Object r0 = defpackage.ung.s(r3, r11, r4)
            if (r0 != r5) goto La9
        La8:
            return r5
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwy.e(dco, boolean, uiq, uhb):java.lang.Object");
    }

    public static final Cursor f(dco dcoVar, dfg dfgVar) {
        int i = dei.a;
        dfgVar.getClass();
        dcoVar.j();
        dcoVar.k();
        return dcoVar.e().b().a(dfgVar);
    }

    public static final Object g(uiu uiuVar) {
        Thread.interrupted();
        return ukc.B(new dea(uiuVar, (uhb) null, 1));
    }
}
