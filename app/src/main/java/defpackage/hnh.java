package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnh {
    private final float a;
    private final float b;
    private final PointF c;
    private final PointF d;
    private final float e;
    private final float f;

    public hnh(float f, float f2, PointF pointF, PointF pointF2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = pointF;
        this.d = pointF2;
        this.e = f3;
        this.f = f4;
    }

    public static final float d(float f) {
        return (-f) + 1.0f;
    }

    public final float a(float f) {
        float f2 = this.f;
        float f3 = this.e;
        return f3 + ((f2 - f3) * f);
    }

    public final float b(float f) {
        float f2 = this.b;
        float f3 = this.a;
        return f3 + ((f2 - f3) * f);
    }

    public final PointF c(float f) {
        PointF pointF = this.d;
        PointF pointF2 = this.c;
        return new PointF(pointF2.x + ((pointF.x - pointF2.x) * f), pointF2.y + ((pointF.y - pointF2.y) * f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(getClass().getName()).concat(" {"));
        sb.append(" scale: " + this.a + " -> " + this.b);
        PointF pointF = this.d;
        sb.append(", translation: " + this.c.toString() + " -> " + pointF.toString());
        sb.append(", radius: " + this.e + " -> " + this.f);
        sb.append(", bgAlpha: 1.0 -> 0.0}");
        return sb.toString();
    }
}
