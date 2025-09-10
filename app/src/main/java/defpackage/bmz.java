package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmz {
    public boolean f;
    public bmt g;
    public int h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public final bna n;
    public bkn o;
    public bkn p;
    public fnd r;
    private Outline t;
    private float v;
    private blh w;
    private RectF x;
    public chq a = bmu.a;
    public cib b = cib.a;
    public uiq c = aau.c;
    private final uiq s = new aal(this, 7);
    public boolean d = true;
    private long u = 0;
    public long e = 9205357640488583168L;
    public final gzh q = new gzh();

    static {
        int i = bnb.a;
    }

    public bmz(bna bnaVar) {
        this.n = bnaVar;
        bnaVar.c(false);
        this.j = 0L;
        this.k = 0L;
        this.l = 9205357640488583168L;
    }

    private final Outline m() {
        Outline outline = this.t;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.t = outline2;
        return outline2;
    }

    private final void n() {
        this.h--;
        e();
    }

    private final void o() {
        this.w = null;
        this.o = null;
        this.e = 9205357640488583168L;
        this.u = 0L;
        this.v = 0.0f;
        this.d = true;
        this.f = false;
    }

    public final float a() {
        return this.n.e;
    }

    public final float b() {
        return this.n.k;
    }

    public final blh c() {
        blh blfVar;
        blh blhVar = this.w;
        bkn bknVar = this.o;
        if (blhVar != null) {
            return blhVar;
        }
        if (bknVar != null) {
            ble bleVar = new ble(bknVar);
            this.w = bleVar;
            return bleVar;
        }
        long jG = chp.G(this.k);
        long j = this.u;
        long j2 = this.e;
        if (j2 != 9205357640488583168L) {
            jG = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jG & 4294967295L));
        if (this.v > 0.0f) {
            blfVar = new blg(bdq.s(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
        } else {
            blfVar = new blf(new bkg(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.w = blfVar;
        return blfVar;
    }

    public final void d() {
        if (this.d) {
            boolean z = this.m;
            if (z || b() > 0.0f) {
                bkn bknVar = this.o;
                if (bknVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    Path path = bknVar.a;
                    path.computeBounds(rectF, false);
                    Outline outlineM = m();
                    outlineM.setPath(path);
                    this.f = !outlineM.canClip();
                    this.o = bknVar;
                    outlineM.setAlpha(a());
                    bna bnaVar = this.n;
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    bnaVar.e(outlineM);
                    if (this.f && this.m) {
                        bnaVar.c(false);
                        bnaVar.b();
                    } else {
                        bnaVar.c(this.m);
                    }
                } else {
                    bna bnaVar2 = this.n;
                    bnaVar2.c(z);
                    Outline outlineM2 = m();
                    long jG = chp.G(this.k);
                    long j = this.u;
                    long j2 = this.e;
                    if (j2 != 9205357640488583168L) {
                        jG = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (jG >> 32);
                    int i4 = (int) (jG & 4294967295L);
                    outlineM2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat(i4)), this.v);
                    outlineM2.setAlpha(a());
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    bnaVar2.e(outlineM2);
                }
            } else {
                bna bnaVar3 = this.n;
                bnaVar3.c(false);
                bnaVar3.e(null);
            }
        }
        this.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.i
            if (r1 == 0) goto L6b
            int r1 = r0.h
            if (r1 != 0) goto L6b
            gzh r1 = r0.q
            java.lang.Object r2 = r1.b
            if (r2 == 0) goto L18
            bmz r2 = (defpackage.bmz) r2
            r2.n()
            r2 = 0
            r1.b = r2
        L18:
            java.lang.Object r1 = r1.e
            if (r1 == 0) goto L66
            zw r1 = (defpackage.zw) r1
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L63
            r5 = 0
            r6 = r5
        L29:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5e
            int r9 = r6 - r4
            r10 = r5
        L3c:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L58
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            bmz r11 = (defpackage.bmz) r11
            r11.n()
        L58:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3c
        L5c:
            if (r11 != r12) goto L63
        L5e:
            if (r6 == r4) goto L63
            int r6 = r6 + 1
            goto L29
        L63:
            r1.d()
        L66:
            bna r0 = r0.n
            r0.b()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmz.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.bmv r15) {
        /*
            r14 = this;
            gzh r0 = r14.q
            java.lang.Object r1 = r0.b
            r0.d = r1
            java.lang.Object r1 = r0.e
            if (r1 == 0) goto L28
            zw r1 = (defpackage.zw) r1
            boolean r2 = r1.c()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.c
            if (r2 != 0) goto L20
            int r2 = defpackage.zx.a
            zw r2 = new zw
            r3 = 0
            r2.<init>(r3)
            r0.c = r2
        L20:
            zw r2 = (defpackage.zw) r2
            r2.f(r1)
            r1.d()
        L28:
            r1 = 1
            r0.a = r1
            uiq r14 = r14.c
            r14.a(r15)
            r14 = 0
            r0.a = r14
            java.lang.Object r15 = r0.d
            if (r15 == 0) goto L3c
            bmz r15 = (defpackage.bmz) r15
            r15.n()
        L3c:
            java.lang.Object r15 = r0.c
            if (r15 == 0) goto L8f
            zw r15 = (defpackage.zw) r15
            boolean r0 = r15.c()
            if (r0 == 0) goto L8f
            java.lang.Object[] r0 = r15.b
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L8c
            r3 = r14
        L52:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L87
            int r6 = r3 - r2
            r7 = r14
        L65:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L85
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L81
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            bmz r8 = (defpackage.bmz) r8
            r8.n()
        L81:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L65
        L85:
            if (r8 != r9) goto L8c
        L87:
            if (r3 == r2) goto L8c
            int r3 = r3 + 1
            goto L52
        L8c:
            r15.d()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmz.f(bmv):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [bku, java.lang.Object] */
    public final void g() {
        uiq uiqVar = this.s;
        bna bnaVar = this.n;
        RenderNode renderNode = bnaVar.b;
        chq chqVar = this.a;
        cib cibVar = this.b;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        try {
            ?? r5 = bnaVar.q.a;
            Canvas canvas = ((bkj) r5).a;
            ((bkj) r5).a = recordingCanvasBeginRecording;
            bmt bmtVar = bnaVar.a;
            bms bmsVar = bmtVar.b;
            bmsVar.f(chqVar);
            bmsVar.g(cibVar);
            bmsVar.a = this;
            bmsVar.h(bnaVar.c);
            bmsVar.e(r5);
            uiqVar.a(bmtVar);
            ((bkj) r5).a = canvas;
        } finally {
            bnaVar.b.endRecording();
        }
    }

    public final void h(float f) {
        bna bnaVar = this.n;
        if (bnaVar.e == f) {
            return;
        }
        bnaVar.e = f;
        bnaVar.b.setAlpha(f);
    }

    public final void i(long j) {
        if (a.q(this.l, j)) {
            return;
        }
        this.l = j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.n.b;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    public final void j(long j, long j2) {
        bna bnaVar = this.n;
        RenderNode renderNode = bnaVar.b;
        int iA = chy.a(j);
        int iB = chy.b(j);
        renderNode.setPosition(iA, iB, ((int) (j2 >> 32)) + iA, ((int) (4294967295L & j2)) + iB);
        bnaVar.c = chp.G(j2);
    }

    public final void k(long j, long j2, float f) {
        if (a.q(this.u, j) && a.q(this.e, j2) && this.v == f && this.o == null) {
            return;
        }
        o();
        this.u = j;
        this.e = j2;
        this.v = f;
        d();
    }

    public final void l(bkn bknVar) {
        o();
        this.o = bknVar;
        d();
    }
}
