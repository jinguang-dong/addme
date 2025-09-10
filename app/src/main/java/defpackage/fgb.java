package defpackage;

import j$.util.Optional;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgb implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ fgb(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [sgt, shi] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((fhc) obj) == fhc.ACTIVE);
            case 1:
                return Boolean.valueOf(((Float) obj).floatValue() >= 15.0f);
            case 2:
                return Boolean.valueOf(((lkk) obj).equals(lkk.AUTO));
            case 3:
                return Boolean.valueOf(((fhc) obj) == fhc.ACTIVE);
            case 4:
                return Boolean.valueOf(((Float) obj).floatValue() >= 20.0f);
            case 5:
                return ((Optional) obj).map(new fik(5));
            case 6:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(!bool.booleanValue());
            case 7:
                sgv sgvVar = fml.a;
                return Boolean.valueOf(!((fne) obj).a());
            case 8:
                return rwc.i(obj);
            case 9:
                return (fsq) obj;
            case 10:
                return fsq.f;
            case 11:
                return fsq.d;
            case 12:
                Throwable th = (Throwable) obj;
                if (th instanceof CancellationException) {
                    ((sgt) fsp.a.c().M(367)).s("Readiness chain timed out. Falling back.");
                } else {
                    ((sgt) ((sgt) fsp.a.c().i(th)).M((char) 366)).s("Readiness chain failed. Falling back.");
                }
                return fsq.d;
            case 13:
                fug fugVar = fug.MAX;
                return fug.a(fugVar) == ((Integer) obj).intValue() ? fugVar : fug.AUTO;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(fug.a((fug) obj));
            case 15:
                return ((Boolean) obj).booleanValue() ? ksa.SAPPHIRE_ON : ksa.SAPPHIRE_OFF;
            case 16:
                return Boolean.valueOf(((nkw) obj).equals(nkw.SLOW_MOTION));
            case 17:
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(!bool2.booleanValue());
            case 18:
                return Boolean.valueOf(((nkw) obj).equals(nkw.TIME_LAPSE));
            case 19:
                mxj mxjVar = (mxj) obj;
                int i = gwv.Y;
                return Boolean.valueOf(mxjVar == mxj.TABLET_LAYOUT);
            default:
                return Boolean.valueOf(((fuu) obj) == fuu.CAPTURING);
        }
    }
}
