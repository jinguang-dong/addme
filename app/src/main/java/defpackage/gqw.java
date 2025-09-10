package defpackage;

import android.speech.tts.TextToSpeech;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqw implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ gqw(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                ((our) obj).close();
                break;
            case 1:
                ((gso) obj).g.l();
                break;
            case 2:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 3:
                ((TextToSpeech) obj).stop();
                break;
            case 4:
                ((fqe) obj).b();
                break;
            case 5:
                ((fqe) obj).a();
                break;
            case 6:
                ((View) obj).setVisibility(0);
                break;
            case 7:
                ((InterleavedImageU8) obj).h();
                break;
            case 8:
                ((RawReadView) obj).a();
                break;
            case 9:
                ((GrayImageS16) obj).b();
                break;
            case 10:
                ((InterleavedImageU16) obj).c();
                break;
            case 11:
                int i = sbp.d;
                ((ibl) obj).f(null, null, sex.a, null);
                break;
            case 12:
                ((InterleavedImageU8) obj).h();
                break;
            case 13:
                ((RawReadView) obj).a();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((GrayImageS16) obj).b();
                break;
            case 15:
                ((isb) obj).f();
                break;
            case 16:
                iou iouVar = (iou) obj;
                if (!iouVar.e) {
                    iouVar.a(1);
                    break;
                }
                break;
            case 17:
                ((iou) obj).a(2);
                break;
            case 18:
                ((iou) obj).a(2);
                break;
            case 19:
                ((ngo) obj).getClass();
                break;
            default:
                ((AmbientModeSupport.AmbientController) obj).b(false);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
