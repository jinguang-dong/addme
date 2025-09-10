package defpackage;

import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dor {
    public static final ayp a = new bbp(new agx(17));

    public static final long a(long j, float f) {
        return bko.k(bkv.d(j), bkv.c(j), bkv.b(j), bkv.a(j) * f, bkv.f(j));
    }

    public static final long b(doq doqVar, int i) {
        switch (i - 1) {
            case 4:
                return doqVar.x;
            case 5:
                return doqVar.B;
            case 6:
            default:
                return doqVar.C;
            case 7:
                return doqVar.d;
            case 8:
                return doqVar.e;
            case 9:
                return doqVar.i;
            case 10:
                return doqVar.j;
            case 11:
                return doqVar.s;
            case 12:
                return doqVar.t;
            case 13:
                return doqVar.n;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return doqVar.o;
            case 15:
                return doqVar.u;
            case 16:
                return doqVar.v;
            case 17:
                return doqVar.a;
            case 18:
                return doqVar.c;
            case 19:
                return doqVar.b;
            case 20:
                return doqVar.f;
            case 21:
                return doqVar.h;
            case ImageFormat.RGBA_FP16 /* 22 */:
                return doqVar.g;
            case 23:
                return doqVar.q;
        }
    }
}
