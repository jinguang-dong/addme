package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dno {
    public final ajd a;
    public uol b = new umr();
    public final float c;
    public long d;
    public float e;
    public final apg f;
    public final ejs g;
    private final long h;
    private final long i;
    private float j;
    private final float k;
    private long l;

    public dno(ajd ajdVar, apg apgVar, long j, ViewConfiguration viewConfiguration, int i, long j2) {
        this.a = ajdVar;
        this.f = apgVar;
        this.h = j;
        this.i = j + j;
        ejs ejsVar = new ejs((byte[]) null);
        this.g = ejsVar;
        this.k = viewConfiguration.getScaledMinimumFlingVelocity(i, 26, 4194304);
        this.c = viewConfiguration.getScaledMaximumFlingVelocity(i, 26, 4194304);
        ((bqn) ejsVar.a).d();
        ((bqn) ejsVar.a).c(j2, 0.0f);
        this.d = j2;
        this.j = 0.0f;
    }

    public final void a() {
        if (this.b.t()) {
            this.b.s(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r11.b(r12, r4, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uif r11, androidx.wear.ambient.AmbientDelegate r12, defpackage.uiq r13, defpackage.uhb r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.dnm
            if (r0 == 0) goto L13
            r0 = r14
            dnm r0 = (defpackage.dnm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnm r0 = new dnm
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.rnt.aN(r14)
            goto Lb0
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            bgx r13 = r0.e
            androidx.wear.ambient.AmbientDelegate r12 = r0.f
            dlc r11 = r0.d
            defpackage.rnt.aN(r14)
        L3c:
            r5 = r11
            r7 = r12
            r8 = r13
            goto L7e
        L40:
            defpackage.rnt.aN(r14)
            ejs r14 = r10.g
            java.lang.Object r14 = r14.a
            bqn r14 = (defpackage.bqn) r14
            float r14 = r14.a()
            float r2 = java.lang.Math.abs(r14)
            float r5 = r10.j
            float r5 = java.lang.Math.abs(r5)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L65
            long r5 = r10.d
            r10.l = r5
            r2 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 * r14
            r10.e = r2
        L65:
            r10.j = r14
            long r5 = r10.h
            r14 = r11
            dlc r14 = (defpackage.dlc) r14
            r0.d = r14
            r0.f = r12
            r14 = r13
            bgx r14 = (defpackage.bgx) r14
            r0.e = r14
            r0.c = r4
            java.lang.Object r14 = defpackage.ung.e(r5, r0)
            if (r14 == r1) goto Lb3
            goto L3c
        L7e:
            long r11 = r10.d
            long r13 = r10.l
            long r11 = r11 - r13
            long r13 = r10.i
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto Lb0
            float r11 = r10.e
            float r11 = java.lang.Math.abs(r11)
            float r12 = r10.k
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto Lb0
            ajd r11 = r10.a
            afs r12 = defpackage.afs.a
            dnn r4 = new dnn
            r9 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 0
            r0.d = r10
            r0.f = r10
            r0.e = r10
            r0.c = r3
            java.lang.Object r10 = r11.b(r12, r4, r0)
            if (r10 != r1) goto Lb0
            goto Lb3
        Lb0:
            ufg r10 = defpackage.ufg.a
            return r10
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dno.b(uif, androidx.wear.ambient.AmbientDelegate, uiq, uhb):java.lang.Object");
    }
}
