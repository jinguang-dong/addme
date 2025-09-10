package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrr {
    public final RectF a;
    public final RectF b;
    public final long c;
    public final long d;
    public final Rect e;
    public final int f;
    public final int g;
    public final int h;

    public hrr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hrr)) {
            return false;
        }
        hrr hrrVar = (hrr) obj;
        int i = this.g;
        int i2 = hrrVar.g;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.a.equals(hrrVar.a) && this.b.equals(hrrVar.b)) {
            int i3 = this.h;
            int i4 = hrrVar.h;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4 && this.c == hrrVar.c && this.d == hrrVar.d && this.e.equals(hrrVar.e) && this.f == hrrVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        a.aF(i);
        int iHashCode = ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        int i2 = this.h;
        a.aF(i2);
        long j = this.d;
        Rect rect = this.e;
        long j2 = this.c;
        return this.f ^ (((((((((iHashCode * 1000003) ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ rect.hashCode()) * 1000003);
    }

    public hrr(int i, RectF rectF, RectF rectF2, int i2, long j, long j2, Rect rect, int i3) {
        this.g = i;
        this.a = rectF;
        this.b = rectF2;
        this.h = i2;
        this.c = j;
        this.d = j2;
        this.e = rect;
        this.f = i3;
    }

    public final String toString() {
        int i = this.g;
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "THUMBS_UP" : uCzt.CgFx : "STOP" : "NO_GESTURE";
        RectF rectF = this.a;
        RectF rectF2 = this.b;
        int i2 = this.h;
        String strValueOf = String.valueOf(rectF);
        String strValueOf2 = String.valueOf(rectF2);
        switch (i2) {
            case 1:
                str = "NOT_DETECTED";
                break;
            case 2:
                str = "NOT_SUPPORTED";
                break;
            case 3:
                str = "NEW_GESTURE";
                break;
            case 4:
                str = CGlJpiVWrCQOq.jFgjwbmogtzFAER;
                break;
            case 5:
                str = "GESTURE_CONTINUED";
                break;
            case 6:
                str = "CAPTURE_TRIGGERED";
                break;
            case 7:
                str = "DETECTION_COOLDOWN";
                break;
            case 8:
                str = "IGNORED";
                break;
            case 9:
                str = "PARTIAL_GESTURE";
                break;
        }
        long j = this.c;
        long j2 = this.d;
        Rect rect = this.e;
        int i3 = this.f;
        return "{" + str2 + ", " + strValueOf + ", " + strValueOf2 + ", " + str + ", " + j + ", " + j2 + ", " + String.valueOf(rect) + ", " + i3 + "}";
    }
}
