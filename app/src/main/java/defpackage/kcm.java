package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonBc25Impl;
import com.google.android.apps.camera.toast.ToastView;
import j$.util.Collection;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kcm implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kcm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kru] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((kcn) this.a).a();
                break;
            case 1:
                ((kgn) this.a).b();
                break;
            case 2:
                keb kebVar = (keb) this.a;
                kebVar.d(kebVar.a);
                break;
            case 3:
                keb kebVar2 = (keb) this.a;
                kebVar2.d(kebVar2.b);
                break;
            case 4:
                keb kebVar3 = (keb) this.a;
                kebVar3.d(kebVar3.c);
                break;
            case 5:
                ((keb) this.a).b();
                break;
            case 6:
                kqy kqyVar = (kqy) this.a;
                if (kqyVar.f) {
                    ((krj) kqyVar.c.a()).y(1, krs.MICROVIDEO);
                    break;
                }
                break;
            case 7:
                int i = OptionsEntryButtonBc25Impl.i;
                this.a.run();
                break;
            case 8:
                this.a.a();
                break;
            case 9:
                Collection.EL.stream(((lii) this.a).a.values()).flatMap(new kwj(10)).forEach(new lig(0));
                break;
            case 10:
                ((lka) this.a).i(lkk.TELE, true);
                break;
            case 11:
                ((lka) this.a).i(lkk.ULTRAWIDE, true);
                break;
            case 12:
                ((lka) this.a).i(lkk.WIDE, true);
                break;
            case 13:
                Object obj = this.a;
                ((lle) obj).e.x(jjt.FOCUS);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj2 = this.a;
                ((lle) obj2).e.x(jjt.DETAIL_NOISE);
                break;
            case 15:
                Object obj3 = this.a;
                ((lle) obj3).e.x(jjt.SHUTTER_SPEED);
                break;
            case 16:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Activity activity = (Activity) ((obu) this.a).b;
                Intent flags = intent.setData(Uri.fromParts("package", activity.getPackageName(), null)).setFlags(268468224);
                flags.getClass();
                activity.startActivity(flags);
                break;
            case 17:
                ((mck) this.a).b();
                break;
            case 18:
                mct mctVar = (mct) this.a;
                if (mctVar.b.q()) {
                    mctVar.b();
                    break;
                }
                break;
            case 19:
                ((mgz) this.a).a();
                break;
            default:
                ToastView toastView = (ToastView) this.a;
                toastView.l.run();
                toastView.j.run();
                toastView.k.run();
                break;
        }
    }
}
