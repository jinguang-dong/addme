package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jgf implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ jgf(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                jhh jhhVar = (jhh) obj;
                int i = jgt.f;
                if (jhhVar instanceof jga) {
                    ((jga) jhhVar).a();
                    break;
                }
                break;
            case 1:
                jhh jhhVar2 = (jhh) obj;
                int i2 = jgt.f;
                if (jhhVar2 instanceof lpy) {
                    ((lpy) jhhVar2).b();
                    break;
                }
                break;
            case 2:
                jhh jhhVar3 = (jhh) obj;
                int i3 = jgt.f;
                if (jhhVar3 instanceof jha) {
                    ((jha) jhhVar3).a();
                    break;
                }
                break;
            case 3:
                jhh jhhVar4 = (jhh) obj;
                int i4 = jgt.f;
                if (jhhVar4 instanceof jhg) {
                    ((jhg) jhhVar4).eu();
                    break;
                }
                break;
            case 4:
                jhh jhhVar5 = (jhh) obj;
                int i5 = jgt.f;
                if (jhhVar5 instanceof jgx) {
                    ((jgx) jhhVar5).a();
                    break;
                }
                break;
            case 5:
                ((jjv) obj).e();
                break;
            case 6:
                sgv sgvVar = jjn.a;
                ((jju) obj).e.g();
                break;
            case 7:
                sgv sgvVar2 = jjn.a;
                ((jju) obj).e.d();
                break;
            case 8:
                sgv sgvVar3 = jjn.a;
                ((jju) obj).e.d();
                break;
            case 9:
                paq paqVar = (paq) obj;
                if (paqVar != null) {
                    paqVar.close();
                    break;
                }
                break;
            case 10:
                ((jjv) obj).e();
                break;
            case 11:
                paq paqVar2 = (paq) obj;
                if (paqVar2 != null) {
                    paqVar2.close();
                    break;
                }
                break;
            case 12:
                ((sgt) krj.a.c().M(3414)).v("%s", (krz) obj);
                break;
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mwm mwmVar = (mwm) obj;
                Paint paint = mwmVar.b;
                sgv sgvVar4 = HotshotView.a;
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(6.0f);
                paint.setColor(Color.parseColor(mwmVar.a.q));
                break;
            default:
                ((ngn) obj).close();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
