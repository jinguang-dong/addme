package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qkt {
    public final int c;
    public final qhi d;
    public final int e;

    protected qkt(int i, qhi qhiVar, int i2) {
        this.c = i;
        this.d = qhiVar;
        this.e = i2;
    }

    public static qkt b(float... fArr) {
        return d(fArr, 2);
    }

    public static qkt c(float... fArr) {
        return d(fArr, 4);
    }

    private static qkt d(float[] fArr, int i) {
        int length = fArr.length;
        a.I(length % i == 0);
        return new qks(length / i, qhu.h, i, i, fArr);
    }

    public abstract void a(int i, ByteBuffer byteBuffer);
}
