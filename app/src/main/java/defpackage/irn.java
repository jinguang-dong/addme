package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class irn implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ irn(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                ((AmbientModeSupport.AmbientController) obj).b(true);
                break;
            case 1:
                iry iryVar = (iry) ((AmbientModeSupport.AmbientController) obj).a;
                iryVar.p.ifPresent(new irn(3));
                iryVar.i.ifPresent(new irn(4));
                break;
            case 2:
                sbp sbpVar = iry.a;
                ((iou) obj).a(1);
                break;
            case 3:
                ((iou) obj).a(2);
                break;
            case 4:
                ipk ipkVar = (ipk) ((AmbientModeSupport.AmbientController) obj).a;
                if (((Boolean) ipkVar.m.dL()).booleanValue()) {
                    ipkVar.f();
                    break;
                }
                break;
            case 5:
                jhh jhhVar = (jhh) obj;
                int i = jgt.f;
                if (jhhVar instanceof jfr) {
                    ((jfr) jhhVar).a();
                    break;
                }
                break;
            case 6:
                jhh jhhVar2 = (jhh) obj;
                int i2 = jgt.f;
                if (jhhVar2 instanceof jfq) {
                    ((jfq) jhhVar2).a();
                    break;
                }
                break;
            case 7:
                jhh jhhVar3 = (jhh) obj;
                int i3 = jgt.f;
                if (jhhVar3 instanceof kce) {
                    break;
                }
                break;
            case 8:
                jhh jhhVar4 = (jhh) obj;
                int i4 = jgt.f;
                if (jhhVar4 instanceof jfu) {
                    ((jfu) jhhVar4).a();
                    break;
                }
                break;
            case 9:
                jhh jhhVar5 = (jhh) obj;
                int i5 = jgt.f;
                if (jhhVar5 instanceof nca) {
                    ((nca) jhhVar5).e();
                    break;
                }
                break;
            case 10:
                jhh jhhVar6 = (jhh) obj;
                int i6 = jgt.f;
                if (jhhVar6 instanceof jfy) {
                    ((jfy) jhhVar6).a();
                    break;
                }
                break;
            case 11:
                jhh jhhVar7 = (jhh) obj;
                int i7 = jgt.f;
                if (jhhVar7 instanceof kce) {
                    break;
                }
                break;
            case 12:
                jhh jhhVar8 = (jhh) obj;
                int i8 = jgt.f;
                if (jhhVar8 instanceof jgz) {
                    ((jgz) jhhVar8).et();
                    break;
                }
                break;
            case 13:
                jhh jhhVar9 = (jhh) obj;
                int i9 = jgt.f;
                if (jhhVar9 instanceof jhc) {
                    ((jhc) jhhVar9).ea();
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                sgv sgvVar = jjn.a;
                ((jju) obj).e.d();
                break;
            case 15:
                sgv sgvVar2 = jjn.a;
                ((jju) obj).e.d();
                break;
            case 16:
                ((ksf) obj).a();
                break;
            case 17:
                ((ksf) obj).b();
                break;
            case 18:
                ((ksf) obj).c();
                break;
            case 19:
                kto ktoVar = (kto) obj;
                ktoVar.j();
                ktoVar.setEnabled(true);
                break;
            default:
                kto ktoVar2 = (kto) obj;
                Context context = ktoVar2.l;
                ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(ktoVar2, "backgroundColor", context.getColor(R.color.options_menu_background_not_selected), context.getColor(R.color.options_menu_background_selected), context.getColor(R.color.options_bottom_background_color));
                objectAnimatorOfArgb.setDuration(1000L);
                objectAnimatorOfArgb.setRepeatMode(2);
                objectAnimatorOfArgb.setRepeatCount(1);
                objectAnimatorOfArgb.start();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
