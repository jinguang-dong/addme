package defpackage;

import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum pao {
    CLOCKWISE_0(0),
    CLOCKWISE_90(90),
    c(180),
    CLOCKWISE_270(270);

    public final int e;

    pao(int i) {
        this.e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r0 <= 225) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.pao b(int r1) {
        /*
            r0 = -1
            if (r1 == r0) goto L3a
            if (r1 == 0) goto L3a
            r0 = 90
            if (r1 == r0) goto L37
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L34
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L31
            int r0 = r1 / 360
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 * 360
            int r0 = r0 + 360
            int r0 = r0 + r1
            int r0 = r0 % 360
            r1 = 315(0x13b, float:4.41E-43)
            if (r0 > r1) goto L3a
            r1 = 45
            if (r0 > r1) goto L27
            goto L3a
        L27:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r1) goto L2c
            goto L37
        L2c:
            r1 = 225(0xe1, float:3.15E-43)
            if (r0 > r1) goto L31
            goto L34
        L31:
            pao r1 = defpackage.pao.CLOCKWISE_270
            return r1
        L34:
            pao r1 = defpackage.pao.c
            return r1
        L37:
            pao r1 = defpackage.pao.CLOCKWISE_90
            return r1
        L3a:
            pao r1 = defpackage.pao.CLOCKWISE_0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pao.b(int):pao");
    }

    public static pao c(Display display) {
        return e(display.getRotation());
    }

    public static pao d(int i) {
        return b((360 - i) % 360);
    }

    public static pao e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? CLOCKWISE_0 : d(270) : d(180) : d(90) : d(0);
    }

    public final int a() {
        return (360 - this.e) % 360;
    }
}
