package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwm {
    public final CaptureRequest.Key a;
    public final CaptureRequest.Key b;
    public final CaptureRequest.Key c;
    public final Integer d;
    public final CaptureRequest.Key e;
    public final Integer f;

    public jwm(CaptureRequest.Key key, CaptureRequest.Key key2, CaptureRequest.Key key3, Integer num, CaptureRequest.Key key4, Integer num2) {
        this.a = key;
        this.b = key2;
        this.c = key3;
        this.d = num;
        this.e = key4;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwm)) {
            return false;
        }
        jwm jwmVar = (jwm) obj;
        return a.ao(this.a, jwmVar.a) && a.ao(this.b, jwmVar.b) && a.ao(this.c, jwmVar.c) && a.ao(this.d, jwmVar.d) && a.ao(this.e, jwmVar.e) && a.ao(this.f, jwmVar.f);
    }

    public final int hashCode() {
        CaptureRequest.Key key = this.a;
        int iHashCode = key == null ? 0 : key.hashCode();
        CaptureRequest.Key key2 = this.b;
        int iHashCode2 = key2 == null ? 0 : key2.hashCode();
        int i = iHashCode * 31;
        CaptureRequest.Key key3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (key3 == null ? 0 : key3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        CaptureRequest.Key key4 = this.e;
        int iHashCode5 = (iHashCode4 + (key4 == null ? 0 : key4.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "VideoBoostExperimentalKeys(videoBoostRequestKey=" + this.a + ", segmentationAwbEnabledRequestKey=" + this.b + ", disableHdrPlusRequestKey=" + this.c + ", disableHdrPlusTrueValueKey=" + this.d + ", controlHybridAeRequestKey=" + this.e + ", controlHybridAeOnValueKey=" + this.f + ")";
    }

    public jwm() {
        this(null, null, null, null, null, null);
    }
}
