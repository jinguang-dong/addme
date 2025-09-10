package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkx extends FaceToBeautify {
    private final Rect a;
    private final Integer b;
    private final Float c;
    private final Float d;
    private final Point e;
    private final Point f;
    private final Point g;
    private final Point h;
    private final Point i;
    private final Point j;
    private final float[] k;

    public hkx(Rect rect, Integer num, Float f, Float f2, Point point, Point point2, Point point3, Point point4, Point point5, Point point6, float[] fArr) {
        this.a = rect;
        this.b = num;
        this.c = f;
        this.d = f2;
        this.e = point;
        this.f = point2;
        this.g = point3;
        this.h = point4;
        this.i = point5;
        this.j = point6;
        this.k = fArr;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Rect bounds() {
        return this.a;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Float confidence() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Float f;
        Float f2;
        Point point;
        Point point2;
        Point point3;
        Point point4;
        Point point5;
        Point point6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FaceToBeautify) {
            FaceToBeautify faceToBeautify = (FaceToBeautify) obj;
            if (this.a.equals(faceToBeautify.bounds()) && ((num = this.b) != null ? num.equals(faceToBeautify.index()) : faceToBeautify.index() == null) && ((f = this.c) != null ? f.equals(faceToBeautify.confidence()) : faceToBeautify.confidence() == null) && ((f2 = this.d) != null ? f2.equals(faceToBeautify.panAngleDegrees()) : faceToBeautify.panAngleDegrees() == null) && ((point = this.e) != null ? point.equals(faceToBeautify.leftEye()) : faceToBeautify.leftEye() == null) && ((point2 = this.f) != null ? point2.equals(faceToBeautify.rightEye()) : faceToBeautify.rightEye() == null) && ((point3 = this.g) != null ? point3.equals(faceToBeautify.noseTip()) : faceToBeautify.noseTip() == null) && ((point4 = this.h) != null ? point4.equals(faceToBeautify.mouthCenter()) : faceToBeautify.mouthCenter() == null) && ((point5 = this.i) != null ? point5.equals(faceToBeautify.leftEarTragion()) : faceToBeautify.leftEarTragion() == null) && ((point6 = this.j) != null ? point6.equals(faceToBeautify.rightEarTragion()) : faceToBeautify.rightEarTragion() == null)) {
                if (Arrays.equals(this.k, faceToBeautify instanceof hkx ? ((hkx) faceToBeautify).k : faceToBeautify.faceAttributes())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public float[] faceAttributes() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Float f2 = this.d;
        int iHashCode4 = (iHashCode3 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        Point point = this.e;
        int iHashCode5 = (iHashCode4 ^ (point == null ? 0 : point.hashCode())) * 1000003;
        Point point2 = this.f;
        int iHashCode6 = (iHashCode5 ^ (point2 == null ? 0 : point2.hashCode())) * 1000003;
        Point point3 = this.g;
        int iHashCode7 = (iHashCode6 ^ (point3 == null ? 0 : point3.hashCode())) * 1000003;
        Point point4 = this.h;
        int iHashCode8 = (iHashCode7 ^ (point4 == null ? 0 : point4.hashCode())) * 1000003;
        Point point5 = this.i;
        int iHashCode9 = (iHashCode8 ^ (point5 == null ? 0 : point5.hashCode())) * 1000003;
        Point point6 = this.j;
        return Arrays.hashCode(this.k) ^ ((iHashCode9 ^ (point6 != null ? point6.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Integer index() {
        return this.b;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point leftEarTragion() {
        return this.i;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point leftEye() {
        return this.e;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point mouthCenter() {
        return this.h;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point noseTip() {
        return this.g;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Float panAngleDegrees() {
        return this.d;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point rightEarTragion() {
        return this.j;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point rightEye() {
        return this.f;
    }

    public final String toString() {
        float[] fArr = this.k;
        Point point = this.j;
        Point point2 = this.i;
        Point point3 = this.h;
        Point point4 = this.g;
        Point point5 = this.f;
        Point point6 = this.e;
        return "{" + this.a.toString() + ", " + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(point6) + ", " + String.valueOf(point5) + ", " + String.valueOf(point4) + ", " + String.valueOf(point3) + ", " + String.valueOf(point2) + ", " + String.valueOf(point) + ", " + Arrays.toString(fArr) + "}";
    }
}
