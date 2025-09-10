package defpackage;

import android.graphics.RectF;
import com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mwy extends ObjectInfo {
    private final int a;
    private final float b;
    private final RectF c;
    private final String d;
    private final String e;
    private final Float f;
    private final Float g;
    private final Float h;

    public mwy(int i, float f, RectF rectF, String str, String str2, Float f2, Float f3, Float f4) {
        this.a = i;
        this.b = f;
        this.c = rectF;
        this.d = str;
        this.e = str2;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public RectF bounds() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        RectF rectF;
        String str;
        String str2;
        Float f;
        Float f2;
        Float f3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ObjectInfo) {
            ObjectInfo objectInfo = (ObjectInfo) obj;
            if (this.a == objectInfo.id() && Float.floatToIntBits(this.b) == Float.floatToIntBits(objectInfo.score()) && ((rectF = this.c) != null ? rectF.equals(objectInfo.bounds()) : objectInfo.bounds() == null) && ((str = this.d) != null ? str.equals(objectInfo.label()) : objectInfo.label() == null) && ((str2 = this.e) != null ? str2.equals(objectInfo.libraryDisplayName()) : objectInfo.libraryDisplayName() == null) && ((f = this.f) != null ? f.equals(objectInfo.pan()) : objectInfo.pan() == null) && ((f2 = this.g) != null ? f2.equals(objectInfo.roll()) : objectInfo.roll() == null) && ((f3 = this.h) != null ? f3.equals(objectInfo.tilt()) : objectInfo.tilt() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        RectF rectF = this.c;
        int iHashCode = ((iFloatToIntBits * 1000003) ^ (rectF == null ? 0 : rectF.hashCode())) * 1000003;
        String str = this.d;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Float f = this.f;
        int iHashCode4 = (iHashCode3 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Float f2 = this.g;
        int iHashCode5 = (iHashCode4 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        Float f3 = this.h;
        return iHashCode5 ^ (f3 != null ? f3.hashCode() : 0);
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public int id() {
        return this.a;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public String label() {
        return this.d;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public String libraryDisplayName() {
        return this.e;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public Float pan() {
        return this.f;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public Float roll() {
        return this.g;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public float score() {
        return this.b;
    }

    @Override // com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo
    public Float tilt() {
        return this.h;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "}";
    }
}
