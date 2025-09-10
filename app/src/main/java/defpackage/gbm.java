package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gbm implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ gbm(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r7v27, types: [sgt, shi] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        tph tphVarQ;
        switch (this.a) {
            case 0:
                return ((npl) obj).c();
            case 1:
                return ((fzz) obj).b();
            case 2:
                return glu.m((ltt) obj);
            case 3:
                return (Long) ((Map.Entry) obj).getKey();
            case 4:
                return ((lno) obj).a;
            case 5:
                return Long.valueOf(((mdq) obj).a);
            case 6:
                hdz hdzVar = (hdz) obj;
                int i = heb.k;
                return new hej(hdzVar.b.f, ((Long) hdzVar.d.map(new gbm(5)).orElse(-1L)).longValue(), hdzVar.c);
            case 7:
                return pbw.b((pjs) obj);
            case 8:
                int i2 = hjb.z;
                return ((mwk) obj).a.a;
            case 9:
                int i3 = hjb.z;
                return ((mwk) obj).a.a;
            case 10:
                return Boolean.valueOf(((iea) obj).a() == idz.FOCUS_STACK);
            case 11:
                int iOrdinal = gzr.values()[((Integer) obj).intValue()].ordinal();
                return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
            case 12:
                return Float.valueOf(((float[]) obj)[2]);
            case 13:
                return "present";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "present";
            case 15:
                return ((idj) obj).a;
            case 16:
                byte[] bArr = (byte[]) obj;
                try {
                    tphVarQ = tph.q(rvf.a, bArr, 0, bArr.length, tow.a());
                    tph.D(tphVarQ);
                } catch (IOException e) {
                    ((sgt) ((sgt) idk.a.c().i(e)).M((char) 1889)).s("Error Parsing RESULT_AF_MULTI_DEPTH_FACE_DEBLUR.");
                }
                return ((rvf) tphVarQ).b;
            case 17:
                return ((Face) obj).getBounds();
            case 18:
                return ezh.Q((Rect) obj);
            case 19:
                switch (idz.values()[((Integer) obj).intValue()]) {
                    case NONE:
                        return "NONE";
                    case DEBLUR:
                        return "DEBLUR";
                    case ZOOM:
                        return "ZOOM";
                    case FOCUS_STACK:
                        return "CYCLOPS";
                    case e:
                        return "STEREO_PORTRAIT";
                    case MULTI_RESOLUTION:
                        return "MULTI_RESOLUTION";
                    case CENTAUR:
                        return "CENTAUR";
                    default:
                        return "UNKNOWN";
                }
            default:
                ieb iebVar = (ieb) obj;
                switch (iebVar.ordinal()) {
                    case 0:
                        return ths.DETECTION_SKIP_REASON_NONE;
                    case 1:
                        return ths.DETECTION_SKIP_REASON_DISABLED;
                    case 2:
                        return ths.DETECTION_SKIP_REASON_NOT_INITIALIZED;
                    case 3:
                        return ths.DETECTION_SKIP_REASON_NOT_PRIMARY;
                    case 4:
                        return ths.DETECTION_SKIP_REASON_WRONG_ZOOM;
                    case 5:
                        return ths.g;
                    case 6:
                        return ths.DETECTION_SKIP_REASON_INVALID_RESULT;
                    case 7:
                        return ths.DETECTION_SKIP_REASON_BAD_THERMALS;
                    case 8:
                        return ths.DETECTION_SKIP_REASON_MISSING_INFO;
                    case 9:
                        return ths.DETECTION_SKIP_REASON_BAD_REGION_SIZE;
                    case 10:
                        return ths.DETECTION_SKIP_REASON_GCAM_DECISION;
                    default:
                        ((sgt) idl.a.c().M(1891)).v("Unknown detection skip reason: %s", iebVar);
                        return ths.DETECTION_SKIP_REASON_UNKNOWN;
                }
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
