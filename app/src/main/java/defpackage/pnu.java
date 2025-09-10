package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnu {
    public final int a;
    public final int b;
    public final Rect c;
    public final Point d;
    public final Point e;
    public final Point f;

    public pnu(int i, Rect rect, int i2, Point point, Point point2, Point point3) {
        this.c = rect;
        this.b = i2;
        this.d = point;
        this.e = point2;
        this.f = point3;
        this.a = i;
    }

    public static pnu a(Face face) {
        return new pnu(face.getId(), face.getBounds(), face.getScore(), face.getLeftEyePosition(), face.getRightEyePosition(), face.getMouthPosition());
    }
}
