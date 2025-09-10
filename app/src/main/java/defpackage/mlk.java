package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoView;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mlk implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mlk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, lst] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((iyu) this.a).n();
                break;
            case 1:
                ((mli) this.a).a();
                break;
            case 2:
                ((krj) this.a).x(11);
                break;
            case 3:
                ((kgn) this.a).b();
                break;
            case 4:
                mon monVar = ((moj) this.a).c;
                if (monVar != null) {
                    monVar.a();
                    break;
                }
                break;
            case 5:
                mon monVar2 = ((moj) this.a).c;
                if (monVar2 != null) {
                    monVar2.c();
                    break;
                }
                break;
            case 6:
                CompositeVideoView compositeVideoView = (CompositeVideoView) this.a;
                boolean zIsPlaying = compositeVideoView.d.isPlaying();
                mon monVar3 = compositeVideoView.c;
                if (monVar3 != null && zIsPlaying) {
                    monVar3.b();
                    break;
                }
                break;
            case 7:
                ((mtu) this.a).a.b(true);
                break;
            case 8:
                Object obj = this.a;
                mvk mvkVar = (mvk) obj;
                mvkVar.c.a(luf.q).a(true);
                mvkVar.a.h();
                break;
            case 9:
                ((mvk) this.a).a.h();
                break;
            case 10:
                ((mvk) this.a).a.h();
                break;
            case 11:
                rah rahVar = ((myl) this.a).j;
                ((mni) rahVar.c).m(9, -1, (View) rahVar.b);
                break;
            case 12:
                ((ManagedSwitchPreference) this.a).c.run();
                break;
            case 13:
                int i = ManagedSwitchPreference.j;
                ((Button) this.a).performClick();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                nfk nfkVar = (nfk) this.a;
                Runnable runnable = nfkVar.h;
                if (runnable != null) {
                    runnable.run();
                }
                Iterator it = nfkVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                break;
            case 15:
                ?? r8 = this.a;
                nmg nmgVar = (nmg) r8;
                nmgVar.b.i(r8);
                nmgVar.k.f(nmgVar.g);
                lut lutVar = luf.ax;
                long j = nmgVar.c;
                nmgVar.m.d(lutVar, Long.valueOf(j));
                nmgVar.n.B(9, nmgVar.h, j, 0, 0);
                tdy tdyVar = nmgVar.j.e;
                String packageName = ((Context) tdyVar.b).getPackageName();
                rqh rqhVar = (rqh) tdyVar.a;
                if (rqhVar.a != null) {
                    pfl pflVar = new pfl((byte[]) null, (byte[]) null);
                    rqhVar.a.e(new rqe(rqhVar, pflVar, pflVar, packageName), pflVar);
                    break;
                } else {
                    rqh.c();
                    break;
                }
            case 16:
                ((nox) this.a).a.f();
                break;
            case 17:
                nox noxVar = (nox) this.a;
                noxVar.a.c();
                noxVar.b.d();
                break;
            case 18:
                ((nox) this.a).b.e();
                break;
            case 19:
                ntr ntrVar = (ntr) this.a;
                ntrVar.d();
                ntrVar.n.c(false);
                break;
            default:
                AmbientModeSupport.AmbientController ambientController = ((nyn) this.a).e;
                if (ambientController != null) {
                    ambientController.h();
                    break;
                }
                break;
        }
    }
}
