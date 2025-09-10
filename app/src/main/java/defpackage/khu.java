package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientMode;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khu implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public khu(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return ((ggc) this.a).b().v ? qpt.ch(new pej(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1)) : qpt.cl();
            case 1:
                return ((ggc) this.a).b().w ? qpt.ch(new pej(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1)) : qpt.cl();
            case 2:
                return rwc.j((ldl) this.a.a());
            case 3:
                Set setP = jsv.p((rwc) this.a.a());
                setP.getClass();
                return setP;
            case 4:
                return rwc.j((ldl) this.a.a());
            case 5:
                Set setP2 = jsv.p((rwc) this.a.a());
                setP2.getClass();
                return setP2;
            case 6:
                return new kws((lcu) this.a.a());
            case 7:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.l));
            case 8:
                return rwc.j(((kyb) this.a).a());
            case 9:
                Set setA = ((tzz) this.a).a();
                setA.getClass();
                return new pek(3, ske.bN(setA));
            case 10:
                Set setA2 = ((tzz) this.a).a();
                setA2.getClass();
                return new pek(3, ske.bN(setA2));
            case 11:
                Set setA3 = ((tzz) this.a).a();
                setA3.getClass();
                return new pek(4, ske.bN(setA3));
            case 12:
                return rwc.j(new AmbientMode.AmbientController((owf) this.a.a(), null));
            case 13:
                gaw gawVarB = ((ggc) this.a).b();
                if (!gawVarB.L) {
                    i = 34;
                } else if (gawVarB.J) {
                    i = 54;
                }
                return Integer.valueOf(i);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                peq peqVar = (peq) this.a.a();
                peqVar.getClass();
                return peqVar;
            case 15:
                pet petVar = ((ggc) this.a).b().H ? pet.IMAGE_READER : pet.SURFACE_VIEW;
                petVar.getClass();
                return petVar;
            case 16:
                return Integer.valueOf(true == ((ggc) this.a).b().L ? 54 : 34);
            case 17:
                gaw gawVarB2 = ((ggc) this.a).b();
                ugw ugwVar = new ugw();
                if (!gawVarB2.s && !gawVarB2.r) {
                    ugwVar.add(new pej(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, gawVarB2.p));
                }
                Set setAU = ske.aU(ugwVar);
                setAU.getClass();
                return setAU;
            case 18:
                peq peqVar2 = (peq) this.a.a();
                peqVar2.getClass();
                return peqVar2;
            case 19:
                Optional optional = (Optional) this.a.a();
                optional.getClass();
                return ske.aX(optional.orElse(null));
            default:
                return Integer.valueOf(true == ((ggc) this.a).b().J ? 54 : 35);
        }
    }
}
