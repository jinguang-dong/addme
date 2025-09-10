package defpackage;

import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.views.ToggleUi;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mdw implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws IOException {
        switch (this.b) {
            case 0:
                float fIntValue = ((Integer) obj).intValue();
                tpc tpcVar = (tpc) this.a;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                srt srtVar = (srt) tpcVar.b;
                srt srtVar2 = srt.a;
                srtVar.b |= 64;
                srtVar.i = fIntValue;
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                tpc tpcVar2 = (tpc) this.a;
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                srt srtVar3 = (srt) tpcVar2.b;
                srt srtVar4 = srt.a;
                srtVar3.b |= 32;
                srtVar3.h = fFloatValue;
                break;
            case 2:
                float fFloatValue2 = ((Float) obj).floatValue();
                tpc tpcVar3 = (tpc) this.a;
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                srt srtVar5 = (srt) tpcVar3.b;
                srt srtVar6 = srt.a;
                srtVar5.b |= 128;
                srtVar5.j = fFloatValue2;
                break;
            case 3:
                int i = mud.i;
                ((mtw) obj).d((String) this.a);
                break;
            case 4:
                int i2 = mud.i;
                ((mtw) obj).b((mtz) this.a);
                break;
            case 5:
                int i3 = mud.i;
                ((mtw) obj).d((String) this.a);
                break;
            case 6:
                ((mzk) this.a).g.values().remove((nkw) obj);
                break;
            case 7:
                ((naw) this.a).a((nav) obj);
                break;
            case 8:
                ((ndc) this.a).b.j(ncn.PHOTO_IDLE);
                break;
            case 9:
                ((nfe) this.a).a.p = ((Integer) obj).intValue();
                break;
            case 10:
                ((ViewfinderCover) ((View) obj)).o((nkw) ((AmbientMode.AmbientController) this.a).a.dL(), new ndk(6));
                break;
            case 11:
                Object obj2 = this.a;
                sgv sgvVar = ToggleUi.a;
                qpt.aQ((View) obj, (mxm) obj2);
                break;
            case 12:
                ((CompletableFuture) this.a).complete((Integer) obj);
                break;
            case 13:
                ((qpt) obj).fo((byte[]) this.a);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                OutputStream outputStream = (OutputStream) obj;
                Object obj3 = this.a;
                try {
                    outputStream.write((byte[]) obj3);
                    break;
                } catch (IOException e) {
                    ((sgt) ((sgt) rul.a.b().i(e)).M(5809)).t("Failed to write %d bytes of processed audio to the output stream.", ((byte[]) obj3).length);
                    return;
                }
            case 15:
                ((SpeechEnhancerJniWrapperRealtime) ((rtl) this.a).a).provideVideoFrame((rva) obj);
                break;
            case 16:
                this.a.add(obj);
                break;
            case 17:
                ((tdx) this.a).e = Optional.of((teq) obj);
                break;
            case 18:
                ((tfm) this.a).d = Optional.of((tfj) obj);
                break;
            default:
                ((sbk) this.a).h((tek) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
