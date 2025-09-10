package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hky {
    public Rect a;
    public Integer b;
    public Float c;
    public Float d;
    public Point e;
    public Point f;
    public Point g;
    public Point h;
    public Point i;
    public Point j;
    public float[] k;

    public final FaceToBeautify a() {
        Rect rect = this.a;
        if (rect != null) {
            return new hkx(rect, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new IllegalStateException();
    }
}
