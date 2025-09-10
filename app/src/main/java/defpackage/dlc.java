package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlc implements uif {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dlc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [ajd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r6v53, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v56, types: [azr, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                dlh dlhVar = (dlh) this.a;
                dle dleVar = (dle) dlhVar.d.a();
                if (dleVar != null && !AmbientMode.AmbientCallback.g(dlhVar.h()).isEmpty()) {
                    iN = ukc.n(dlhVar.h().a() - dleVar.e, 0);
                }
                return Integer.valueOf(iN);
            case 1:
                dlh dlhVar2 = (dlh) this.a;
                dle dleVar2 = (dle) dlhVar2.d.a();
                return Integer.valueOf(dleVar2 != null ? ukc.n(dlhVar2.h().c() - dleVar2.e, 0) : 0);
            case 2:
                return new ebn((uiq) this.a.a());
            case 3:
                return (dlm) ((uif) this.a.a()).a();
            case 4:
                ((dnj) this.a).a();
                return ufg.a;
            case 5:
                return Boolean.valueOf(((dnk) this.a).a.e(7));
            case 6:
                return new dnt(this.a);
            case 7:
                return Float.valueOf(((Number) this.a.a()).floatValue());
            case 8:
                return Float.valueOf(((Number) this.a.a()).floatValue());
            case 9:
                abr abrVar = (abr) this.a;
                if (abrVar.j() && ((Number) abrVar.d()).floatValue() <= 0.75f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                return Float.valueOf(true != ((Boolean) this.a.a()).booleanValue() ? 0.0f : 1.0f);
            case 11:
                return (dqq) ((tdy) this.a).a.a();
            case 12:
                this.a.b(Calendar.getInstance());
                return ufg.a;
            case 13:
                duk dukVar = (duk) this.a;
                return BigInteger.valueOf(dukVar.b).shiftLeft(32).or(BigInteger.valueOf(dukVar.c)).shiftLeft(32).or(BigInteger.valueOf(dukVar.d));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ecw.a((dxv) this.a);
                return ufg.a;
            case 15:
                dyj dyjVar = (dyj) this.a;
                Context context = dyjVar.b;
                int i = dzm.a;
                dzk.a(context).cancelAll();
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List listE = dzm.e(context, jobScheduler);
                if (listE != null && !listE.isEmpty()) {
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        dzm.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                eby ebyVarB = dyjVar.d.B();
                ecr ecrVar = (ecr) ebyVarB;
                dco dcoVar = ecrVar.a;
                dcoVar.k();
                dfq dfqVarD = ecrVar.h.d();
                try {
                    dcoVar.l();
                    try {
                        dfqVarD.a();
                        dcoVar.p();
                        ecrVar.h.f(dfqVarD);
                        dxn.a(dyjVar.c, dyjVar.d, dyjVar.e);
                        return ufg.a;
                    } finally {
                        ((ecr) ebyVarB).a.n();
                    }
                } catch (Throwable th) {
                    ecrVar.h.f(dfqVarD);
                    throw th;
                }
            case 16:
                gwv gwvVar = (gwv) this.a;
                azr azrVar = gwvVar.u;
                Object objA = azrVar.a();
                gxj gxjVar = gxj.a;
                if (objA == gxjVar) {
                    gwvVar.t.b(true);
                    gwvVar.l(null);
                    azrVar.b(gxj.b);
                } else {
                    gwvVar.t.b(false);
                    gwvVar.N.a();
                    azrVar.b(gxjVar);
                }
                return ufg.a;
            case 17:
                ((gwv) this.a).t.b(false);
                return ufg.a;
            case 18:
                return LayoutInflater.from(((hto) this.a).f).inflate(R.layout.serengeti_overlay, (ViewGroup) null);
            case 19:
                return (TextView) ((hto) this.a).a().findViewById(R.id.serengeti_overlay_text);
            default:
                Object obj = this.a;
                hto htoVar = (hto) obj;
                PopupWindow popupWindow = new PopupWindow(htoVar.a(), -1, -1, true);
                popupWindow.setClippingEnabled(false);
                popupWindow.setBackgroundDrawable(new ColorDrawable(htoVar.f.getColor(R.color.serengeti_overlay_background)));
                View viewA = htoVar.a();
                cny cnyVar = new cny() { // from class: htl
                    @Override // defpackage.cny
                    public final cpp a(View view, cpp cppVar) {
                        view.getClass();
                        cmh cmhVarF = cppVar.f(519);
                        view.setPadding(cmhVarF.b, cmhVarF.c, cmhVarF.d, cmhVarF.e);
                        return cpp.a;
                    }
                };
                int[] iArr = con.a;
                cog.i(viewA, cnyVar);
                popupWindow.setOnDismissListener(new htm(obj, iN));
                return popupWindow;
        }
    }
}
