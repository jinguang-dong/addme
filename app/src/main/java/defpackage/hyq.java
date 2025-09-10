package defpackage;

import android.graphics.drawable.Drawable;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import com.google.googlex.gcam.ArkInfo;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.HalAfMetadata;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotParams;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hyq implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hyq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((Consumer) obj).accept(this.a);
                break;
            case 1:
                ((BuildPayloadBurstSpecOptions) this.a).b(((Float) obj).floatValue());
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                ArkInfo arkInfo = (ArkInfo) this.a;
                GcamModuleJNI.ArkInfo_white_balance_factor_set(arkInfo.a, arkInfo, fFloatValue);
                break;
            case 3:
                float fFloatValue2 = ((Float) obj).floatValue();
                ArkInfo arkInfo2 = (ArkInfo) this.a;
                GcamModuleJNI.ArkInfo_brightness_factor_set(arkInfo2.a, arkInfo2, fFloatValue2);
                break;
            case 4:
                float fFloatValue3 = ((Float) obj).floatValue();
                ArkInfo arkInfo3 = (ArkInfo) this.a;
                GcamModuleJNI.ArkInfo_shadow_factor_set(arkInfo3.a, arkInfo3, fFloatValue3);
                break;
            case 5:
                float fFloatValue4 = ((Float) obj).floatValue();
                ShotParams shotParams = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_shasta_factor_set(shotParams.a, shotParams, fFloatValue4);
                break;
            case 6:
                float fFloatValue5 = ((Float) obj).floatValue();
                ShotParams shotParams2 = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_psaf_max_exposure_time_ms_set(shotParams2.a, shotParams2, fFloatValue5);
                break;
            case 7:
                float fFloatValue6 = ((Float) obj).floatValue();
                ShotParams shotParams3 = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_psaf_log_scene_brightness_threshold_override_set(shotParams3.a, shotParams3, fFloatValue6);
                break;
            case 8:
                float fFloatValue7 = ((Float) obj).floatValue();
                ShotParams shotParams4 = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_big_cpu_freq_option_set(shotParams4.a, shotParams4, fFloatValue7);
                break;
            case 9:
                float fFloatValue8 = ((Float) obj).floatValue();
                ShotParams shotParams5 = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_mid_cpu_freq_option_set(shotParams5.a, shotParams5, fFloatValue8);
                break;
            case 10:
                float fFloatValue9 = ((Float) obj).floatValue();
                ArkInfo arkInfo4 = (ArkInfo) this.a;
                GcamModuleJNI.ArkInfo_focus_distance_set(arkInfo4.a, arkInfo4, fFloatValue9);
                arkInfo4.h(tca.c);
                break;
            case 11:
                Float f = (Float) obj;
                f.floatValue();
                ((idd) this.a).c = Optional.of(f);
                break;
            case 12:
                rnt.bi((byte[]) obj, (HalAfMetadata) this.a);
                break;
            case 13:
                String str = gzc.a;
                ((InterleavedImageU8) obj).h();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                iou iouVar = (iou) obj;
                int i = iouVar.f;
                sqg sqgVar = iouVar.c;
                nkw nkwVar = (nkw) this.a;
                iouVar.b(nkwVar, i, sqgVar);
                iouVar.b = nkwVar;
                break;
            case 15:
                isb isbVar = (isb) obj;
                isbVar.c();
                isbVar.h(new AmbientModeSupport.AmbientController(this.a, null));
                break;
            case 16:
                Object obj2 = this.a;
                ipk ipkVar = (ipk) obj2;
                ipkVar.n(iqh.URANUS, (iqv) obj);
                break;
            case 17:
                iqv iqvVar = (iqv) obj;
                our ourVarJ = ((ipk) this.a).G.j();
                iqu iquVar = new iqu(iqvVar, 0);
                iqvVar.b.f(iquVar);
                ourVarJ.d(new hty(iqvVar, iquVar, 10));
                break;
            case 18:
                ((nbc) this.a).c((nbe) obj);
                break;
            case 19:
                isj isjVar = (isj) obj;
                ira iraVar = (ira) this.a;
                iraVar.e.put(isjVar, false);
                iraVar.f.put(isjVar, false);
                break;
            default:
                ((UranusCharacterItem) this.a).i.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
