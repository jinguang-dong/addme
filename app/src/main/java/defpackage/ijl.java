package defpackage;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.jupiter.JupiterButton;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;
import com.google.googlex.gcam.StaticMetadata;
import j$.util.Optional;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijl implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ijl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, owf] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        ipk ipkVar;
        nbb nbbVar;
        int i;
        switch (this.b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ijo ijoVar = (ijo) this.a;
                    cxb cxbVar = ijoVar.L;
                    if (fdo.q(cxbVar)) {
                        ijoVar.e();
                        if (cxbVar.g() != null) {
                            Intent intentG = cxbVar.g();
                            intentG.getClass();
                            fdo.e(intentG);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lcy lcyVar = (lcy) obj;
                Object obj2 = this.a;
                if (lcyVar == lcy.TELE || lcyVar == lcy.TELE_RM) {
                    htk htkVar = ((hup) obj2).I;
                    if (htkVar != null) {
                        htkVar.b();
                        return;
                    }
                    return;
                }
                htk htkVar2 = ((hup) obj2).I;
                if (htkVar2 != null) {
                    htkVar2.a();
                    return;
                }
                return;
            case 2:
                List list = (List) obj;
                Optional optionalOf = Optional.of((gxj) list.get(0));
                imi imiVar = (imi) this.a;
                imiVar.m = optionalOf;
                imiVar.n = ((Boolean) list.get(1)).booleanValue();
                imiVar.j();
                return;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue) {
                    ipk ipkVar2 = (ipk) obj3;
                    ipkVar2.v.post(new ild(obj3, 10));
                    ipkVar2.v.a = true;
                    ipkVar2.b.s();
                    ipkVar2.r.l();
                    return;
                }
                ipk ipkVar3 = (ipk) obj3;
                ipkVar3.v.post(new ild(obj3, 11));
                ipkVar3.v.a = false;
                ipkVar3.b.g();
                ipkVar3.r.u();
                return;
            case 4:
                nkw nkwVar = (nkw) obj;
                ipk ipkVar4 = (ipk) this.a;
                if (ipkVar4.h(iqh.JUPITER)) {
                    ipkVar4.B.ifPresent(new hyq(nkwVar, 14));
                    return;
                }
                return;
            case 5:
                boolean zC = ((goi) obj).c();
                Object obj4 = this.a;
                if (!zC) {
                    ((ipk) obj4).L.i();
                    return;
                }
                ipk ipkVar5 = (ipk) obj4;
                pez pezVar = ipkVar5.L;
                JupiterButton jupiterButton = ipkVar5.v;
                luj lujVar = (luj) pezVar.a;
                if (((Boolean) lujVar.b(luf.aR)).booleanValue()) {
                    return;
                }
                lus lusVar = luf.aP;
                int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
                if (iIntValue >= 3 || jupiterButton.getVisibility() != 0) {
                    return;
                }
                pezVar.i();
                nfh nfhVar = new nfh(jupiterButton.getResources().getString(R.string.jupiter_entry_hint));
                nfhVar.o(jupiterButton);
                nfhVar.h();
                nfhVar.j();
                nfhVar.f = true;
                nfhVar.c = 1000;
                nfhVar.l();
                nfhVar.k();
                nfhVar.e(new ild(pezVar, 12), sxo.a);
                nfhVar.l = (imi) pezVar.c;
                nfhVar.k = 4;
                nfhVar.e = true;
                pezVar.d = nfhVar.a();
                ((luj) pezVar.b).d(lusVar, Integer.valueOf(iIntValue + 1));
                return;
            case 6:
                ipk ipkVar6 = (ipk) this.a;
                if (ipkVar6.c.j()) {
                    ipkVar6.L.i();
                    return;
                }
                return;
            case 7:
                if (((Boolean) obj).booleanValue() && (nbbVar = (ipkVar = (ipk) this.a).w) != null && nbbVar.isShowing()) {
                    ipkVar.w.dismiss();
                    return;
                }
                return;
            case 8:
                nkw nkwVar2 = (nkw) obj;
                ipy ipyVar = (ipy) this.a;
                boolean zEquals = nkwVar2.equals(ipyVar.g);
                ipyVar.g = nkwVar2;
                if (zEquals) {
                    return;
                }
                if (ipyVar.i.h() && nkwVar2.equals(ipyVar.i.c())) {
                    ipyVar.d();
                }
                ipyVar.i = rvk.a;
                return;
            case 9:
                int i2 = ((muj) obj).b;
                ipy ipyVar2 = (ipy) this.a;
                if (i2 == ipyVar2.l) {
                    return;
                }
                ipyVar2.l = i2;
                ipyVar2.e();
                return;
            case 10:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                ipy ipyVar3 = (ipy) this.a;
                if (zBooleanValue2 == ipyVar3.j) {
                    return;
                }
                ipyVar3.j = bool.booleanValue();
                ipyVar3.e();
                return;
            case 11:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue3 = bool2.booleanValue();
                isa isaVar = (isa) this.a;
                isaVar.h = zBooleanValue3;
                if (bool2.booleanValue()) {
                    isaVar.a();
                    return;
                } else {
                    isaVar.b();
                    return;
                }
            case 12:
                ((ovx) this.a).a(false);
                return;
            case 13:
                this.a.dL();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ivo) this.a).n = (iwt) obj;
                return;
            case 15:
                List list2 = (List) obj;
                ltx ltxVar = (ltx) list2.get(0);
                String str = (String) list2.get(1);
                if (str.isEmpty()) {
                    ((sgt) ivu.a.c().M(2407)).v("Skipping updating options since empty camera id: %s", str);
                    return;
                }
                ivu ivuVar = (ivu) this.a;
                StaticMetadata staticMetadata = (StaticMetadata) ivuVar.i.get(str);
                int i3 = ltxVar.d;
                if (staticMetadata == null) {
                    staticMetadata = new StaticMetadata();
                }
                ivuVar.c.f(new glk(ivuVar, i3, str, staticMetadata, 2));
                return;
            case 16:
                Float f = (Float) obj;
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((iwj) obj5).b = f;
                }
                return;
            case 17:
                kgw kgwVar = ((goi) obj).a;
                pka pkaVarL = kgwVar.l();
                Object obj6 = this.a;
                if (pkaVarL == pka.BACK) {
                    ((iyu) obj6).b.j(false);
                } else {
                    ((iyu) obj6).b.j(true);
                }
                iyu iyuVar = (iyu) obj6;
                krj krjVar = iyuVar.L;
                pka pkaVar = krjVar.h;
                boolean z = krjVar.f;
                boolean z2 = krjVar.g;
                krjVar.h = kgwVar.l();
                krjVar.f = kgwVar.J();
                krjVar.g = kgwVar.F();
                if (!krjVar.h.equals(pkaVar) || krjVar.f != z || krjVar.g != z2) {
                    krjVar.m(true, null);
                }
                rwc rwcVar = iyuVar.G;
                if (rwcVar.h()) {
                    ftv ftvVar = (ftv) rwcVar.c();
                    ftvVar.o = kgwVar.l() == pka.FRONT;
                    ftvVar.p();
                    return;
                }
                return;
            case 18:
                iyu iyuVar2 = (iyu) this.a;
                muj mujVar = (muj) obj;
                if (iyuVar2.N.p(gza.f)) {
                    int i4 = mujVar.b;
                    if (i4 == 5 || ((i = iyuVar2.M) != 0 && i == 5)) {
                        Object obj7 = iyuVar2.j.c;
                        ((MainActivityLayout) obj7).invalidate();
                        ((ConstraintLayout) obj7).requestLayout();
                    }
                    iyuVar2.M = i4;
                    return;
                }
                return;
            case 19:
                ((fqf) this.a).eB();
                return;
            default:
                ((fqf) this.a).eB();
                return;
        }
    }
}
