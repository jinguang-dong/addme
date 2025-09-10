package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lig implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ lig(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                jjv jjvVar = (jjv) obj;
                ((lij) jjvVar).j(true);
                jjvVar.e();
                return;
            case 1:
                ((pdk) obj).close();
                return;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                ((mtw) obj).a();
                return;
            case 5:
                ((mtw) obj).f();
                return;
            case 6:
                mwm mwmVar = (mwm) obj;
                Paint paint = mwmVar.b;
                sgv sgvVar = HotshotView.a;
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                paint.setColor(Color.parseColor(mwmVar.a.q));
                return;
            case 7:
                int i = ((mxd) obj).c;
                return;
            case 8:
                ((owq) obj).a(true);
                return;
            case 9:
                ((cto) obj).c();
                return;
            case 10:
                nmg nmgVar = (nmg) obj;
                nmgVar.i = false;
                nmgVar.u();
                return;
            case 11:
                nmg nmgVar2 = (nmg) obj;
                nmgVar2.i = true;
                nmgVar2.u();
                return;
            case 12:
                rrr rrrVar = rsc.a;
                ((rsq) obj).a();
                return;
            case 13:
                ((rsq) obj).a();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ruq ruqVar = (ruq) obj;
                synchronized (ruqVar.a) {
                    int i2 = ruqVar.d;
                    boolean z = i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
                    String str = ruqVar.b;
                    String strA = rup.a(i2);
                    if (i2 == 0) {
                        throw null;
                    }
                    rnt.P(z, "Can't shut down: state of the audio stream parser '%s' is '%s'.", str, strA);
                    if (ruqVar.d != 5) {
                        ruqVar.d = 4;
                    }
                }
                return;
            case 15:
                ((ruq) obj).b();
                return;
            case 16:
                sgv sgvVar2 = rul.a;
                return;
            case 17:
                ((qpt) obj).fp();
                return;
            case 18:
                ((qpt) obj).fp();
                return;
            case 19:
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
