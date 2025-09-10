package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.Instrumentation;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbm implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public lbm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return ((ggc) this.b).b().b;
            case 1:
                Optional optional = (Optional) this.b.a();
                optional.getClass();
                return ske.aX(optional.orElse(null));
            case 2:
                return ske.aV(new pej(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ((ggc) this.b).b().o));
            case 3:
                pei peiVar = ((ggc) this.b).b().c.h() ? pei.NORMAL : pei.HIGH_SPEED;
                peiVar.getClass();
                return peiVar;
            case 4:
                return ske.aV(new pej(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ((ggc) this.b).b().o));
            case 5:
                return ske.aV(new pej(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ((ggc) this.b).b().p));
            case 6:
                Optional optional2 = ((jwh) this.b.a()).a;
                return optional2.isPresent() ? qpt.ci((CaptureRequest.Key) optional2.get(), mhf.b) : qpt.cl();
            case 7:
                return new mhy((Instrumentation) this.b.a());
            case 8:
                return new jsv();
            case 9:
                Object obj = ((qas) this.b).a;
                obj.getClass();
                return obj;
            case 10:
                Object obj2 = ((qas) this.b).b;
                obj2.getClass();
                return obj2;
            case 11:
                Object obj3 = ((qat) this.b).b;
                obj3.getClass();
                return obj3;
            case 12:
                return ((qat) this.b).a;
            case 13:
                Object obj4 = ((qav) this.b).e;
                obj4.getClass();
                return obj4;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((qav) this.b).d;
            case 15:
                return ((pzf) this.b).a();
            case 16:
                return ((qav) this.b).i;
            case 17:
                Object obj5 = ((qav) this.b).f;
                obj5.getClass();
                return obj5;
            case 18:
                Object obj6 = ((qav) this.b).c;
                obj6.getClass();
                return obj6;
            case 19:
                return ((pzi) this.b).a();
            default:
                return ((qav) this.b).g;
        }
    }
}
