package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import j$.util.Collection;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ipr implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ips ipsVar = (ips) this.a;
                ipsVar.d = true;
                ipsVar.b.h();
                break;
            case 1:
                ((ipp) this.a).a.h();
                break;
            case 2:
                ((ips) this.a).b.h();
                break;
            case 3:
                ((ips) this.a).a.startActivity(new Intent("android.settings.BATTERY_SAVER_SETTINGS"));
                break;
            case 4:
                ((ips) this.a).b.h();
                break;
            case 5:
                iqv iqvVar = (iqv) this.a;
                iqvVar.d = true;
                iqvVar.b.h();
                break;
            case 6:
                ((iqv) this.a).b.h();
                break;
            case 7:
                ((iqv) this.a).a.startActivity(new Intent("android.settings.BATTERY_SAVER_SETTINGS"));
                break;
            case 8:
                ((iqv) this.a).b.h();
                break;
            case 9:
                irs irsVar = (irs) this.a;
                irsVar.m((ImageButton) view, irsVar.q);
                irsVar.u.ifPresent(new irn(i));
                break;
            case 10:
                irs irsVar2 = (irs) this.a;
                if (!irsVar2.w) {
                    irsVar2.g();
                    break;
                } else {
                    irsVar2.h();
                    irsVar2.o();
                    break;
                }
            case 11:
                irs irsVar3 = (irs) this.a;
                irsVar3.m((ImageButton) view, irsVar3.r);
                irsVar3.u.ifPresent(new gqw(20));
                break;
            case 12:
                ((irs) this.a).u.ifPresent(new irn(i2));
                break;
            case 13:
                jbm jbmVar = (jbm) this.a;
                iwt iwtVar = (iwt) jbmVar.q.dL();
                rwc rwcVar = jbmVar.i;
                if (rwcVar.h()) {
                    ((iux) rwcVar.c()).a(iwtVar);
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                jde jdeVar = (jde) this.a;
                jdeVar.getActivity().startActivity(intent.setData(Uri.fromParts("package", jdeVar.getActivity().getPackageName(), null)).setFlags(268468224));
                break;
            case 15:
                jde jdeVar2 = (jde) this.a;
                if (jdeVar2.a.m.h()) {
                    ((mvk) jdeVar2.a.m.c()).b(jdeVar2.getContext(), 2);
                    break;
                }
                break;
            case 16:
                jde jdeVar3 = (jde) this.a;
                if (jdeVar3.a.i.h()) {
                    ((mgz) jdeVar3.a.i.c()).a();
                    break;
                }
                break;
            case 17:
                ((hrj) ((jde) this.a).a.l.c()).a(false);
                break;
            case 18:
                ((hrj) ((jde) this.a).a.l.c()).a(false);
                break;
            case 19:
                jde jdeVar4 = (jde) this.a;
                if (jdeVar4.a.m.h()) {
                    ((mvk) jdeVar4.a.m.c()).b(jdeVar4.getContext(), 2);
                    break;
                }
                break;
            default:
                jkx jkxVar = (jkx) this.a;
                Collection.EL.stream(jkxVar.d).map(new jkv(i2)).forEach(new jgf(10));
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.MANUAL_FEATURE_RESET_ALL_EVENT;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                rnu rnuVar = jkxVar.m;
                sod sodVar = (sod) tpcVarM.b;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                ((jjn) rnuVar.a).o.I(tpcVarM);
                jkxVar.k.e();
                break;
        }
    }
}
