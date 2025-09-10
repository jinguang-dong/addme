package defpackage;

import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import j$.time.Duration;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iwh implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ iwh(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = iwj.c;
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                return;
            case 3:
                sgv sgvVar = jjn.a;
                return;
            case 4:
                sgv sgvVar2 = jnm.a;
                boolean z = jog.a;
                boolean z2 = jog.a;
                return;
            case 11:
                throw null;
            case 12:
                int i2 = EducationToastView.c;
                return;
            case 13:
                int i3 = EducationToastView.c;
                return;
            case 16:
                Duration duration = ToastView.d;
                return;
            case 17:
                Duration duration2 = ToastView.d;
                return;
            case 18:
                Duration duration3 = ToastView.d;
                return;
            case 19:
                Duration duration4 = ToastView.d;
                return;
            default:
                sbp sbpVar = mzk.b;
                return;
        }
    }
}
