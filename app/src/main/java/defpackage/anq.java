package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anq implements bsw {
    private boolean a;
    private final List b = new ArrayList();

    @Override // defpackage.bik
    public final /* synthetic */ boolean c(uiq uiqVar) {
        return bay.s(this, uiqVar);
    }

    @Override // defpackage.bik
    public final /* synthetic */ bik cM(bik bikVar) {
        return bay.t(this, bikVar);
    }

    @Override // defpackage.bik
    public final /* synthetic */ Object cN(Object obj, uiu uiuVar) {
        return bay.r(this, obj, uiuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.uhb r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.anp
            if (r0 == 0) goto L13
            r0 = r6
            anp r0 = (defpackage.anp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anp r0 = new anp
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            uka r0 = r0.d
            defpackage.rnt.aN(r6)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L6d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.rnt.aN(r6)
            boolean r6 = r5.a
            if (r6 != 0) goto L78
            uka r6 = new uka
            r6.<init>()
            r0.d = r6     // Catch: java.lang.Throwable -> L69
            r0.c = r3     // Catch: java.lang.Throwable -> L69
            uml r2 = new uml     // Catch: java.lang.Throwable -> L69
            uhb r0 = defpackage.ske.aE(r0)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L69
            r2.x()     // Catch: java.lang.Throwable -> L69
            r6.a = r2     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = r5.b     // Catch: java.lang.Throwable -> L69
            r0.add(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r2.i()     // Catch: java.lang.Throwable -> L69
            if (r0 == r1) goto L68
            r0 = r6
        L5d:
            java.util.List r5 = r5.b
            java.lang.Object r6 = r0.a
            defpackage.ukc.f(r5)
            r5.remove(r6)
            goto L78
        L68:
            return r1
        L69:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L6d:
            java.util.List r5 = r5.b
            java.lang.Object r0 = r0.a
            defpackage.ukc.f(r5)
            r5.remove(r0)
            throw r6
        L78:
            ufg r5 = defpackage.ufg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anq.d(uhb):java.lang.Object");
    }

    @Override // defpackage.bsw
    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uhb) list.get(i)).fW(ufg.a);
        }
        list.clear();
    }
}
