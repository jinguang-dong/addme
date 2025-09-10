package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.PopupWindow;
import com.google.android.apps.camera.aizoom.animation.AiZoomPreviewUserEducationView;
import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fem implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fem(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r8v8, types: [fex, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((fen) this.a).k();
                return;
            case 1:
                ((fen) this.a).k();
                return;
            case 2:
                ((fey) this.a).a.b();
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                ((ffq) this.a).g();
                return;
            case 5:
                ((ovx) this.a).a(true);
                return;
            case 6:
                ((ovx) this.a).a(false);
                return;
            case 7:
                ((AiZoomPreviewUserEducationView) ((hrj) this.a).b).a();
                return;
            case 8:
                AiZoomPreviewUserEducationView aiZoomPreviewUserEducationView = (AiZoomPreviewUserEducationView) ((hrj) this.a).b;
                aiZoomPreviewUserEducationView.setVisibility(0);
                shl shlVar = shx.a;
                owq owqVar = aiZoomPreviewUserEducationView.c;
                leo leoVar = new leo((fhi) owqVar.dL());
                leoVar.f(true);
                owqVar.a(leoVar.d());
                aiZoomPreviewUserEducationView.a.f(aiZoomPreviewUserEducationView.b);
                return;
            case 9:
                jod.i();
                fip fipVar = (fip) this.a;
                int i = fipVar.c;
                teg tegVar = fipVar.f;
                szw szwVar = szw.a;
                try {
                    tdx tdxVarA = tegVar.a(i);
                    ((tds) tdxVarA.b).b.ifPresent(new ldn(tdxVarA, szwVar, 7, null));
                    tdxVarA.close();
                } catch (IllegalArgumentException e) {
                    ((sgt) ((sgt) teg.a.c().i(e)).M(5834)).t("%d has already been removed.", i);
                }
                AllInNativeImpl allInNativeImpl = (AllInNativeImpl) tegVar.b;
                AllInNativeImpl.a(allInNativeImpl.endSessionImpl(allInNativeImpl.b, i));
                synchronized (tegVar) {
                    tegVar.i.remove(Integer.valueOf(i));
                }
                fipVar.g.close();
                return;
            case 10:
                this.a.close();
                return;
            case 11:
                ((fqf) this.a).eB();
                return;
            case 12:
                fiv fivVar = (fiv) this.a;
                fivVar.h.d();
                fivVar.a.c();
                jth jthVar = fivVar.s;
                if (jthVar != null) {
                    fivVar.k(((Boolean) jthVar.b().dL()).booleanValue() && !((Boolean) fivVar.j.dL()).booleanValue());
                    return;
                }
                return;
            case 13:
                ((fja) this.a).d.b();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fje fjeVar = (fje) this.a;
                fjeVar.k = true;
                fjeVar.o.ak("thumbnail_tooltip_shown");
                return;
            case 15:
                ((flg) this.a).e();
                return;
            case 16:
                fke fkeVar = (fke) this.a;
                PopupWindow popupWindow = fkeVar.g;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    return;
                }
                PopupWindow popupWindow2 = fkeVar.g;
                popupWindow2.getClass();
                popupWindow2.dismiss();
                return;
            case 17:
                ((fmd) this.a).a.b(nkw.COTTAGE);
                return;
            case 18:
                ((fnc) this.a).d.a(false);
                return;
            case 19:
                ((fnc) this.a).b.a(fne.a);
                return;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/apps/testing/com.google.ar.core"));
                ((Context) this.a).startActivity(intent);
                return;
        }
    }
}
