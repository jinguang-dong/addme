package defpackage;

import com.google.android.apps.camera.moments.api.GroupPhotoUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwf implements hpb {
    public final owq a;
    public final owf b;
    private final owq d;
    private final owq e;
    private final owf f;
    private final sbv g;
    private final ovx h;
    private final owf i;
    private final owf j;
    private final kan l;
    private final kgw m;
    private final hbj n;
    private boolean k = false;
    public boolean c = false;

    public hwf(owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, kan kanVar, hbj hbjVar, sbv sbvVar, kgw kgwVar, luj lujVar, ovx ovxVar, owf owfVar, owf owfVar2) {
        this.d = owqVar;
        this.e = owqVar2;
        this.a = owqVar3;
        this.f = owqVar4;
        this.l = kanVar;
        this.n = hbjVar;
        this.g = sbvVar;
        this.m = kgwVar;
        this.b = lujVar.a(luf.aO);
        gzi gziVar = gzq.a;
        this.h = ovxVar;
        this.i = owfVar;
        this.j = owfVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            owq r0 = r8.d
            java.lang.Object r1 = r0.dL()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            gzi r2 = defpackage.gzq.a
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r4
        L16:
            r2 = 0
            if (r1 == 0) goto L26
            kan r5 = r8.l
            int r5 = r5.a()
            if (r5 == 0) goto L25
            if (r5 == r3) goto L26
            r5 = r3
            goto L27
        L25:
            throw r2
        L26:
            r5 = r4
        L27:
            owq r6 = r8.e
            java.lang.Object r7 = r6.dL()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == r5) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.a(r5)
            r6.dL()
            r0.dL()
        L42:
            boolean r0 = r8.c
            if (r0 == 0) goto L57
            boolean r0 = r8.k
            if (r0 == 0) goto L57
            kan r0 = r8.l
            int r0 = r0.a()
            if (r0 == 0) goto L56
            if (r0 == r3) goto L57
            r0 = r3
            goto L58
        L56:
            throw r2
        L57:
            r0 = r4
        L58:
            if (r1 == 0) goto L88
            if (r0 != 0) goto L5d
            goto L88
        L5d:
            ovx r0 = r8.h
            java.lang.Object r0 = r0.d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L88
            owf r0 = r8.i
            java.lang.Object r0 = r0.dL()
            jjq r0 = (defpackage.jjq) r0
            j$.util.Optional r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
            owf r0 = r8.j
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L88
            goto L89
        L88:
            r3 = r4
        L89:
            owq r8 = r8.a
            java.lang.Object r0 = r8.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == r3) goto La1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r8.a(r0)
            r8.dL()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwf.b():void");
    }

    @Override // defpackage.hpb
    public final void ey(lnl lnlVar) {
        boolean z = false;
        if (((Integer) ((ovx) this.b).d).intValue() == 0) {
            this.e.a(false);
            this.a.a(false);
            return;
        }
        int iA = GroupPhotoUtils.a(lnlVar);
        owq owqVar = this.d;
        if (((Integer) owqVar.dL()).intValue() != iA) {
            owqVar.a(Integer.valueOf(iA));
        }
        lcy lcyVar = (lcy) this.g.get(lnlVar.b);
        boolean z2 = this.m.l() == pka.BACK;
        if (z2 && lcyVar == lcy.WIDE) {
            z = true;
        }
        if ((lcyVar != lcy.LOGICAL || !z2) && this.k != z && !((Boolean) this.f.dL()).booleanValue()) {
            this.k = z;
        }
        b();
    }
}
