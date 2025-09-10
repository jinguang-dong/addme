package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.BurstSpec;
import j$.util.Optional;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jku implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ jku(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v35, types: [sgt, shi] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        ltq ltqVar;
        int i;
        byte b = 3;
        switch (this.a) {
            case 0:
                int i2 = jkx.n;
                return Boolean.valueOf(((mxj) obj).equals(mxj.TABLET_LAYOUT));
            case 1:
                return Boolean.valueOf(((mxj) obj) == mxj.JARVIS_LAYOUT);
            case 2:
                int iOrdinal = ltq.a(((Integer) obj).intValue()).ordinal();
                return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? ksa.AF_ON : ksa.AF_OFF_INFINITY : ksa.AF_OFF_FAR : ksa.AF_OFF_NEAR : ksa.AF_ON;
            case 3:
                switch (((ksa) obj).ordinal()) {
                    case 54:
                        ltqVar = ltq.ON_LOCKED;
                        i = ltqVar.f;
                        break;
                    case 55:
                        ltqVar = ltq.OFF_NEAR;
                        i = ltqVar.f;
                        break;
                    case 56:
                        ltqVar = ltq.OFF_FAR;
                        i = ltqVar.f;
                        break;
                    case 57:
                        ltqVar = ltq.OFF_INFINITY;
                        i = ltqVar.f;
                        break;
                    default:
                        i = ltq.ON.f;
                        break;
                }
                return Integer.valueOf(i);
            case 4:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                boolean zEquals = ((Serializable) list.get(2)).equals(kfe.RUNNING);
                if (!zBooleanValue) {
                    b = 0;
                } else if (zBooleanValue2) {
                    b = 2;
                } else if (!zEquals) {
                    b = 1;
                }
                return Byte.valueOf(b);
            case 5:
                return qpt.ch((pej) obj);
            case 6:
                return fsq.j;
            case 7:
                Throwable th = (Throwable) obj;
                if (th instanceof CancellationException) {
                    ((sgt) kll.a.c().M(3312)).s("OneCameraFrameProcessingReadiness - Cancellation in readiness chain. Maybe OneCamera is closed before becoming ready.");
                } else {
                    ((sgt) ((sgt) kll.a.c().i(th)).M((char) 3311)).s("OneCameraFrameProcessingReadiness - Error in readiness chain. Falling back.");
                }
                return fsq.j;
            case 8:
                Boolean bool = (Boolean) obj;
                kpa kpaVar = kov.a;
                return bool;
            case 9:
                return ltq.a(((Integer) obj).intValue());
            case 10:
                Boolean bool2 = (Boolean) obj;
                sgv sgvVar = ktb.a;
                return Boolean.valueOf(!bool2.booleanValue());
            case 11:
                jjq jjqVar = (jjq) obj;
                Optional optional = jjqVar.b;
                sgv sgvVar2 = ktb.a;
                return Boolean.valueOf(optional.isEmpty() && jjqVar.e.isEmpty());
            case 12:
                Boolean bool3 = (Boolean) obj;
                sgv sgvVar3 = ktb.a;
                return Boolean.valueOf(!bool3.booleanValue());
            case 13:
                return ((BurstSpec) obj).c();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Boolean) obj).booleanValue();
                return false;
            case 15:
                return Boolean.FALSE;
            case 16:
                return Boolean.valueOf(((jjq) obj).a.isPresent());
            case 17:
                jjq jjqVar2 = (jjq) obj;
                return Boolean.valueOf(jjqVar2.f.isPresent() && jjqVar2.g.isPresent());
            case 18:
                return Boolean.valueOf(((lej) obj).a);
            case 19:
                lel lelVar = (lel) obj;
                if (lelVar.a) {
                    return qpt.cl();
                }
                return qpt.ci(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(lelVar.b));
            default:
                return Boolean.valueOf(((lep) obj).a);
        }
    }
}
