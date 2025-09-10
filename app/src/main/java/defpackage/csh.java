package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csh {
    public List b;
    final /* synthetic */ cru c;
    private final uxa d = new uxa();
    public final umr a = new umr();

    public csh(cru cruVar, List list) {
        this.c = cruVar;
        this.b = ske.bN(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.csg
            if (r0 == 0) goto L13
            r0 = r6
            csg r0 = (defpackage.csg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csg r0 = new csg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            uxa r0 = r0.d
            defpackage.rnt.aN(r6)     // Catch: java.lang.Throwable -> L2c
            goto L70
        L2c:
            r5 = move-exception
            goto L7f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            uxa r2 = r0.d
            defpackage.rnt.aN(r6)
            r6 = r2
            goto L57
        L3d:
            defpackage.rnt.aN(r6)
            umr r6 = r5.a
            boolean r6 = r6.v()
            if (r6 == 0) goto L4b
            ufg r5 = defpackage.ufg.a
            return r5
        L4b:
            uxa r6 = r5.d
            r0.d = r6
            r0.c = r4
            java.lang.Object r2 = r6.b(r0)
            if (r2 == r1) goto L83
        L57:
            umr r2 = r5.a     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r2.v()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L65
            ufg r5 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L7d
            r6.d()
            return r5
        L65:
            r0.d = r6     // Catch: java.lang.Throwable -> L7d
            r0.c = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L7d
            if (r0 == r1) goto L83
            r0 = r6
        L70:
            umr r5 = r5.a     // Catch: java.lang.Throwable -> L2c
            ufg r6 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L2c
            r5.O(r6)     // Catch: java.lang.Throwable -> L2c
            r0.d()
            ufg r5 = defpackage.ufg.a
            return r5
        L7d:
            r5 = move-exception
            r0 = r6
        L7f:
            r0.d()
            throw r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csh.a(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object b(defpackage.uhb r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cqz
            if (r0 == 0) goto L13
            r0 = r7
            cqz r0 = (defpackage.cqz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cqz r0 = new cqz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.rnt.aN(r7)
            goto L66
        L36:
            defpackage.rnt.aN(r7)
            java.util.List r7 = r6.b
            if (r7 == 0) goto L5b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L44
            goto L5b
        L44:
            cru r7 = r6.c
            tdy r2 = r7.k()
            crc r4 = new crc
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.b = r3
            java.lang.Object r7 = r2.k(r4, r0)
            if (r7 == r1) goto L72
        L58:
            cqu r7 = (defpackage.cqu) r7
            goto L68
        L5b:
            cru r7 = r6.c
            r0.b = r4
            r2 = 0
            java.lang.Object r7 = r7.f(r2, r0)
            if (r7 == r1) goto L72
        L66:
            cqu r7 = (defpackage.cqu) r7
        L68:
            cru r6 = r6.c
            pfl r6 = r6.g
            r6.r(r7)
            ufg r6 = defpackage.ufg.a
            return r6
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csh.b(uhb):java.lang.Object");
    }

    public csh() {
    }
}
