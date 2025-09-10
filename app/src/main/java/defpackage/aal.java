package defpackage;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aal extends ujq implements uiq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aal(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r8v73, types: [java.lang.Object, uif] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        bms bmsVarO;
        long jA;
        boolean z = true;
        switch (this.b) {
            case 0:
                btd.q((btd) obj, (bte) this.a, 0, 0);
                return ufg.a;
            case 1:
                btd btdVar = (btd) obj;
                ?? r8 = this.a;
                int size = r8.size();
                for (int i = 0; i < size; i++) {
                    btd.q(btdVar, (bte) r8.get(i), 0, 0);
                }
                return ufg.a;
            case 2:
                ?? r82 = this.a;
                blm blmVar = (blm) obj;
                blmVar.l(r82 != 0 ? ((Number) r82.a()).floatValue() : 1.0f);
                blmVar.s(1.0f);
                blmVar.t(1.0f);
                blmVar.x(blt.a);
                return ufg.a;
            case 3:
                btd.s((btd) obj, (bte) this.a, 0, 0);
                return ufg.a;
            case 4:
                blm blmVar2 = (blm) obj;
                blq blqVar = (blq) this.a;
                blmVar2.s(blqVar.a);
                blmVar2.t(blqVar.b);
                blmVar2.l(blqVar.c);
                blmVar2.y(0.0f);
                blmVar2.z(0.0f);
                blmVar2.u(blqVar.d);
                blmVar2.r(blqVar.e);
                blmVar2.o(blqVar.f);
                blmVar2.x(blqVar.g);
                blmVar2.v(blqVar.h);
                blmVar2.p(blqVar.i);
                blmVar2.B();
                blmVar2.m(blqVar.j);
                blmVar2.w(blqVar.k);
                blmVar2.q(0);
                blmVar2.n(blqVar.l);
                blmVar2.A();
                return ufg.a;
            case 5:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(((bmn) this.a).n.a(ukc.j(dDoubleValue, r8.e, r8.f)));
            case 6:
                return Double.valueOf(ukc.j(((bmn) this.a).k.a(((Number) obj).doubleValue()), r8.e, r8.f));
            case 7:
                bmv bmvVar = (bmv) obj;
                Object obj2 = this.a;
                bmz bmzVar = (bmz) obj2;
                bkn bknVar = bmzVar.o;
                if (bmzVar.f && bmzVar.m && bknVar != null) {
                    bmsVarO = bmvVar.o();
                    jA = bmsVarO.a();
                    bmsVarO.b().f();
                    try {
                        bmsVarO.c.k(bknVar);
                        ((bmz) obj2).f(bmvVar);
                    } finally {
                    }
                } else {
                    bmzVar.f(bmvVar);
                }
                return ufg.a;
            case 8:
                bog bogVar = (bog) obj;
                bnh bnhVar = (bnh) this.a;
                bnhVar.d(bogVar);
                uiq uiqVar = bnhVar.e;
                if (uiqVar != null) {
                    uiqVar.a(bogVar);
                }
                return ufg.a;
            case 9:
                boh bohVar = (boh) this.a;
                bohVar.c = true;
                bohVar.d.a();
                return ufg.a;
            case 10:
                bmv bmvVar2 = (bmv) obj;
                boh bohVar2 = (boh) this.a;
                float f = bohVar2.g;
                float f2 = bohVar2.h;
                bmsVarO = bmvVar2.o();
                jA = bmsVarO.a();
                bmsVarO.b().f();
                bnh bnhVar2 = bohVar2.a;
                try {
                    bmsVarO.c.h(f, f2, 0L);
                    bnhVar2.b(bmvVar2);
                    bmsVarO.b().d();
                    bmsVarO.h(jA);
                    return ufg.a;
                } finally {
                }
            case 11:
                btd.t((btd) obj, (bte) this.a, 0, 0);
                return ufg.a;
            case 12:
                uif uifVar = (uif) obj;
                bxv bxvVar = (bxv) this.a;
                Handler handler = bxvVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    uifVar.a();
                } else {
                    Handler handler2 = bxvVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new mb(uifVar, 8));
                    }
                }
                return ufg.a;
            case 13:
                bxv bxvVar2 = ((byc) this.a).b;
                return Boolean.valueOf(bxvVar2.getParent().requestSendAccessibilityEvent(bxvVar2, (AccessibilityEvent) obj));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((byc) this.a).u((bzw) obj);
                return ufg.a;
            case 15:
                this.a.b(new Configuration((Configuration) obj));
                return ufg.a;
            case 16:
                return new aog(this.a, 4);
            case 17:
                if (bzp.b.compareAndSet(false, true)) {
                    this.a.j(ufg.a);
                }
                return ufg.a;
            case 18:
                bmv bmvVar3 = (bmv) obj;
                bku bkuVarB = bmvVar3.o().b();
                uiu uiuVar = ((bzq) this.a).a;
                if (uiuVar != null) {
                    uiuVar.a(bkuVarB, bmvVar3.o().a);
                }
                return ufg.a;
            default:
                List list = (List) obj;
                Float f3 = (Float) this.a.a();
                if (f3 == null) {
                    z = false;
                } else {
                    list.add(f3);
                }
                return Boolean.valueOf(z);
        }
    }
}
