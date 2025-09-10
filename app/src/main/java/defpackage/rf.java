package defpackage;

import com.google.ar.core.ImageFormat;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class rf {
    public final int a;

    public /* synthetic */ rf(int i) {
        this.a = i;
    }

    public static final String a(int i) {
        if (a.p(i, 0)) {
            return "UNKNOWN";
        }
        if (a.p(i, 34)) {
            return "PRIVATE";
        }
        if (a.p(i, ImageFormat.DEPTH16)) {
            return "DEPTH16";
        }
        if (a.p(i, 1768253795)) {
            return "DEPTH_JPEG";
        }
        if (a.p(i, 257)) {
            return TOnSyMaYeslEl.yleerkvg;
        }
        if (a.p(i, 41)) {
            return "FLEX_RGB_888";
        }
        if (a.p(i, 42)) {
            return "FLEX_RGBA_8888";
        }
        if (a.p(i, 1212500294)) {
            return "HEIC";
        }
        if (a.p(i, 256)) {
            return "JPEG";
        }
        if (a.p(i, 4101)) {
            return "JPEG_R";
        }
        if (a.p(i, 16)) {
            return "NV16";
        }
        if (a.p(i, 17)) {
            return "NV21";
        }
        if (a.p(i, 37)) {
            return "RAW10";
        }
        if (a.p(i, 38)) {
            return "RAW12";
        }
        if (a.p(i, 4098)) {
            return "RAW_DEPTH";
        }
        if (a.p(i, 36)) {
            return "RAW_PRIVATE";
        }
        if (a.p(i, 32)) {
            return "RAW_SENSOR";
        }
        if (a.p(i, 4)) {
            return "RGB_565";
        }
        if (a.p(i, 842094169)) {
            return "Y12";
        }
        if (a.p(i, 540422489)) {
            return "Y16";
        }
        if (a.p(i, ImageFormat.Y8)) {
            return "Y8";
        }
        if (a.p(i, 54)) {
            return "YCBCR_P010";
        }
        if (a.p(i, 35)) {
            return "YUV_420_888";
        }
        if (a.p(i, 39)) {
            return "YUV_422_888";
        }
        if (a.p(i, 40)) {
            return "YUV_444_888";
        }
        if (a.p(i, 20)) {
            return "YUY2";
        }
        if (a.p(i, 842094169)) {
            return "YV12";
        }
        StringBuilder sb = new StringBuilder("UNKNOWN(");
        String string = Integer.toString(i, 16);
        string.getClass();
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public static String b(int i) {
        return "StreamFormat(" + a(i) + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rf) && this.a == ((rf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return b(this.a);
    }
}
