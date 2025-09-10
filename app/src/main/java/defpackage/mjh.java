package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.toast.ToastView;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mjh implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, mjn] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r15v59, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r15v62, types: [java.lang.Object, mlx] */
    @Override // java.lang.Runnable
    public final void run() {
        sbp sbpVarG;
        int i = 3;
        int i2 = 6;
        int i3 = 0;
        switch (this.b) {
            case 0:
                this.a.eU();
                break;
            case 1:
                ((mjl) this.a).e();
                break;
            case 2:
                mjl mjlVar = (mjl) this.a;
                moc mocVar = mjlVar.k;
                mocVar.l(6);
                mocVar.i(mjlVar.m.getResources().getString(R.string.video_accessibility_peek));
                break;
            case 3:
                ((mjl) this.a).d();
                break;
            case 4:
                ((nca) this.a).g();
                break;
            case 5:
                mjl mjlVar2 = (mjl) this.a;
                ovx ovxVar = mjlVar2.l;
                if (!((mii) ovxVar.d).equals(mii.STATE_RECORDING) && !((mii) ovxVar.d).equals(mii.STATE_PRE_RECORDING)) {
                    ovxVar.a(mii.STATE_IDLE);
                }
                mjlVar2.s.a(false);
                mjlVar2.E.a(juk.b);
                mjlVar2.B.a();
                break;
            case 6:
                mjl mjlVar3 = (mjl) this.a;
                mjlVar3.Q.c();
                mjlVar3.B.d();
                mjlVar3.P.h();
                break;
            case 7:
                ((mkr) this.a).i.b(false);
                break;
            case 8:
                sbk sbkVar = new sbk();
                mkr mkrVar = (mkr) this.a;
                if (mkrVar.I.n(mkrVar.g, mkrVar.f.a())) {
                    sbkVar.h(oxj.RES_1080P);
                    sbkVar.h(oxj.RES_2160P);
                    sbpVarG = sbkVar.g();
                } else {
                    sbkVar.h(oxj.RES_1080P);
                    sbpVarG = sbkVar.g();
                }
                mkrVar.n.a(Boolean.valueOf(((List) Collection.EL.stream(sbpVarG).map(new maf(i2)).filter(new mdn(i)).map(new maf(7)).collect(Collectors.toList())).size() > 1));
                break;
            case 9:
                this.a.g();
                break;
            case 10:
                ((mkr) this.a).F.k(mkr.class);
                break;
            case 11:
                ((ViewfinderCover) ((mkr) this.a).s.e).k();
                break;
            case 12:
                ((mkr) this.a).F.g(mkr.class);
                break;
            case 13:
                mkt mktVar = (mkt) this.a;
                mjj mjjVar = mktVar.k;
                if (mjjVar != null) {
                    mjl mjlVar4 = mjjVar.e;
                    mjlVar4.p.c(new mjh(mjlVar4, 5));
                }
                mik mikVar = mktVar.i;
                if (mikVar.k.H()) {
                    mikVar.r.e(mikVar.k.f(), mikVar.k.e(), mikVar.k.a());
                    owq owqVar = mikVar.i;
                    laj lajVar = laj.a;
                    lai laiVar = new lai();
                    laiVar.c(mikVar.k.f());
                    laiVar.b(mikVar.k.e());
                    owqVar.a(laiVar.a());
                }
                mikVar.u.f();
                mikVar.l.d(mikVar.c.a(mikVar, mikVar.k, mikVar.q.a, new owi(false), false, mikVar.e.h(), 3));
                mktVar.f.a(true);
                izs izsVar = mktVar.j;
                if (izsVar != null) {
                    izsVar.b().b.e(fsq.i);
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj = this.a;
                ToastView toastView = (ToastView) obj;
                toastView.b();
                try {
                    ((ToastView) obj).m.showAtLocation(((ToastView) obj).n, 0, 0, 0);
                } catch (RuntimeException e) {
                    ((sgt) ToastView.f.b().M(4922)).v("Cannot show the toast. Error = %s", e.getMessage());
                }
                toastView.postDelayed(toastView.i, toastView.h);
                break;
            case 15:
                ToastView toastView2 = (ToastView) this.a;
                toastView2.animate().alpha(0.0f).withEndAction(toastView2.k).setDuration(ToastView.e.toMillis()).translationYBy(toastView2.g).start();
                break;
            case 16:
                Object obj2 = this.a;
                mlg mlgVar = (mlg) obj2;
                luj lujVar = mlgVar.h;
                boolean zBooleanValue = ((Boolean) lujVar.b(luf.b)).booleanValue();
                int iIntValue = ((Integer) lujVar.b(luf.aO)).intValue();
                gzi gziVar = gzq.a;
                boolean z = iIntValue == 1;
                if (!zBooleanValue && !z) {
                    mlgVar.b.a(true);
                    break;
                } else if (mlgVar.c == null) {
                    krj krjVar = mlgVar.f;
                    ksf ksfVar = mlgVar.d;
                    krjVar.l(ksfVar);
                    out.a();
                    Activity activity = mlgVar.a;
                    rkc rkcVar = new rkc(activity, R.style.Theme_Camera_MaterialAlertDialog);
                    rkcVar.q(R.string.first_run_done, new fdf(obj2, 14));
                    rkcVar.s(R.string.first_run_title);
                    mll mllVar = new mll(activity);
                    iyu iyuVar = mlgVar.e;
                    fdy fdyVar = mlgVar.g;
                    kgn kgnVar = mlgVar.j;
                    if (!mllVar.a) {
                        out.a();
                        View.inflate(mllVar.getContext(), R.layout.first_run_education_view_layout, mllVar);
                        LinearLayout linearLayout = (LinearLayout) mllVar.findViewById(R.id.first_run_contents);
                        if (fdyVar.c.c() && zBooleanValue) {
                            ((TextView) mllVar.findViewById(R.id.settings_btn)).setOnClickListener(new mlk(iyuVar, i3));
                        } else {
                            linearLayout.removeView(mllVar.findViewById(R.id.location_entry));
                        }
                        if (z) {
                            ((TextView) mllVar.findViewById(R.id.options_btn)).setOnClickListener(new mlk(krjVar, 2));
                            mllVar.findViewById(R.id.motion_help).setOnClickListener(new mlk(kgnVar, i));
                        } else {
                            linearLayout.removeView(mllVar.findViewById(R.id.motion_entry));
                        }
                        mllVar.a = true;
                    }
                    rkcVar.u(mllVar);
                    krjVar.g(ksfVar);
                    mlgVar.c = rkcVar.b();
                    dv dvVar = mlgVar.c;
                    dvVar.getClass();
                    dvVar.setCanceledOnTouchOutside(false);
                    mlgVar.a();
                    break;
                } else {
                    mlgVar.a();
                    break;
                }
            case 17:
                this.a.close();
                break;
            case 18:
                ((mln) this.a).h();
                break;
            case 19:
                this.a.close();
                break;
            default:
                rjh rjhVar = ((mni) this.a).c;
                if (rjhVar != null) {
                    rjhVar.cancel();
                    View viewFindViewById = rjhVar.findViewById(R.id.bottomsheet_container);
                    viewFindViewById.getClass();
                    viewFindViewById.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
