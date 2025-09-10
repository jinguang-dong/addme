package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ray implements rau {
    public final Context a;
    private final und b;
    private final cru c;

    public ray(Context context, und undVar) {
        undVar.getClass();
        this.a = context;
        this.b = undVar;
        tpc tpcVarM = rba.a.m();
        tpcVarM.getClass();
        rba rbaVarAf = qpt.af(tpcVarM);
        tow towVar = tow.a;
        tra traVar = tra.a;
        byz byzVar = new byz((tqr) rbaVarAf, tow.a);
        this.c = new cru(new cry(byzVar, new aks(11), new dus(this, 15)), ske.bj(new utv(ufw.a, (uhb) null, 1)), new pfl(new aks(20), (byte[]) null), undVar);
    }

    @Override // defpackage.rau
    public final Object a(raz razVar, uhb uhbVar) {
        Object objG = this.c.g(new raw(razVar, (uhb) null, 0), uhbVar);
        return objG == uhi.a ? objG : ufg.a;
    }

    @Override // defpackage.rau
    public final Object b(uhb uhbVar) {
        Object objG = this.c.g(new cre((uhb) null, 2, (char[]) null), uhbVar);
        return objG == uhi.a ? objG : ufg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rax
            if (r0 == 0) goto L13
            r0 = r5
            rax r0 = (defpackage.rax) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rax r0 = new rax
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r5)
            cru r4 = r4.c
            r0.c = r3
            urk r4 = r4.c
            java.lang.Object r5 = defpackage.ung.D(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            rba r5 = (defpackage.rba) r5
            tpw r4 = r5.b
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ray.c(uhb):java.lang.Object");
    }
}
