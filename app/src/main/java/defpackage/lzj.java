package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzj {
    public final String a;
    public final scn b;
    public final scn c;
    public final boolean d;
    public final boolean e;
    public final owf f;
    public final rwc g;
    public final rwc h;
    public final int i;

    public lzj() {
        throw null;
    }

    public static lzi a() {
        lzi lziVar = new lzi(null);
        lziVar.a = "UnknownSmartsProcessor";
        lziVar.d(true);
        lziVar.e(true);
        lziVar.b = owp.a(true);
        lziVar.e = 4;
        rvk rvkVar = rvk.a;
        lziVar.c = rvkVar;
        lziVar.d = rvkVar;
        return lziVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzj) {
            lzj lzjVar = (lzj) obj;
            if (this.a.equals(lzjVar.a) && this.b.equals(lzjVar.b) && this.c.equals(lzjVar.c) && this.d == lzjVar.d && this.e == lzjVar.e && this.f.equals(lzjVar.f)) {
                int i = this.i;
                int i2 = lzjVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.g.equals(lzjVar.g) && this.h.equals(lzjVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
        int i = this.i;
        a.aF(i);
        return this.h.hashCode() ^ (((((iHashCode * 1000003) ^ i) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public lzj(String str, scn scnVar, scn scnVar2, boolean z, boolean z2, owf owfVar, int i, rwc rwcVar, rwc rwcVar2) {
        this.a = str;
        this.b = scnVar;
        this.c = scnVar2;
        this.d = z;
        this.e = z2;
        this.f = owfVar;
        this.i = i;
        this.g = rwcVar;
        this.h = rwcVar2;
    }

    public final String toString() {
        String str;
        int i = this.i;
        owf owfVar = this.f;
        scn scnVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(scnVar);
        String strValueOf3 = String.valueOf(owfVar);
        switch (i) {
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "STATUS_UPDATE_STICKY";
                break;
            case 3:
                str = "FRAMING_HINT";
                break;
            case 4:
                str = "SUGGESTION";
                break;
            case 5:
                str = CZAHo.mfUAwEjrXTSHSDB;
                break;
            case 6:
                str = pAAtrB.HhqfZ;
                break;
            case 7:
                str = "LENS_SUGGESTION";
                break;
            case 8:
                str = "STATUS_UPDATE_DEFAULT";
                break;
            case 9:
                str = "STATUS_UPDATE_FIRST_RUN";
                break;
            case 10:
                str = "STATUS_UPDATE_CAPTURE";
                break;
            case 11:
                str = "FUNCTIONALITY_HIGH";
                break;
            case 12:
                str = "STATUS_UPDATE_CRITICAL";
                break;
            default:
                str = "null";
                break;
        }
        boolean z = this.e;
        boolean z2 = this.d;
        String str2 = this.a;
        rwc rwcVar = this.g;
        rwc rwcVar2 = this.h;
        return "{" + str2 + ", " + strValueOf + ", " + strValueOf2 + ", " + z2 + ", " + z + ", " + strValueOf3 + ", " + str + ", " + String.valueOf(rwcVar) + ", " + String.valueOf(rwcVar2) + "}";
    }
}
