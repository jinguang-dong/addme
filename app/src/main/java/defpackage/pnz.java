package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class pnz implements poc {
    public final pnu a;
    private final PointF[] b;
    private final HashMap c = new HashMap();

    public pnz(pnu pnuVar, byte[] bArr, float[] fArr) {
        this.b = new PointF[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.c.put(Byte.valueOf(bArr[i]), Integer.valueOf(i));
            int i2 = i + i;
            this.b[i] = new PointF(fArr[i2], fArr[i2 + 1]);
        }
        this.a = pnuVar;
    }

    @Override // defpackage.poc
    public final float a() {
        throw null;
    }

    @Override // defpackage.poc
    public final float b() {
        throw null;
    }

    @Override // defpackage.poc
    public final float c() {
        throw null;
    }

    @Override // defpackage.poc
    public final int d() {
        throw null;
    }

    @Override // defpackage.poc
    public final int e() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF f() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF g() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF h() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF i() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF j() {
        throw null;
    }

    @Override // defpackage.poc
    public final PointF k() {
        throw null;
    }

    @Override // defpackage.poc
    public final Rect l() {
        throw null;
    }

    public final String toString() {
        pnu pnuVar = this.a;
        return String.format("{ bounds: %s, score: %s, id: %d }", pnuVar.c, Integer.valueOf(pnuVar.b), Integer.valueOf(pnuVar.a));
    }
}
