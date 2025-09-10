package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvj {
    public final List a;
    public final long b;
    public final List c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[LOOP:0: B:11:0x0086->B:35:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a A[EDGE_INSN: B:51:0x009a->B:19:0x009a BREAK  A[LOOP:0: B:11:0x0086->B:35:0x00f0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cvj(java.util.List r18, long r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvj.<init>(java.util.List, long):void");
    }

    public final float a() {
        return Float.intBitsToFloat((int) (this.b >> 32));
    }

    public final float b() {
        return Float.intBitsToFloat((int) (this.b & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cvj) {
            return a.ao(this.a, ((cvj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + ske.ca(this.c, null, null, null, null, 63) + " || Features = " + ske.ca(this.a, null, null, null, null, 63) + " || Center = (" + a() + ", " + b() + ")]";
    }
}
