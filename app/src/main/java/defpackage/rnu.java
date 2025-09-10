package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnu {
    public final /* synthetic */ Object a;

    public rnu() {
        throw null;
    }

    public final void A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.z(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void B(lg lgVar, km kmVar, km kmVar2) {
        lgVar.m(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.E.m(lgVar, kmVar, kmVar2)) {
            recyclerView.U();
        }
    }

    public final void C(lg lgVar, km kmVar, km kmVar2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.e.m(lgVar);
        recyclerView.r(lgVar);
        lgVar.m(false);
        if (recyclerView.E.o(lgVar, kmVar, kmVar2)) {
            recyclerView.U();
        }
    }

    public final void D(lg lgVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aQ(lgVar.a, recyclerView.e);
    }

    public final rnr a(rnr rnrVar) {
        return rnrVar instanceof rnz ? rnrVar : new rnp(-((rnx) this.a).b(), rnrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ogq] */
    public final void b(odj odjVar) {
        this.a.i(odjVar);
    }

    public final noy c(npp nppVar) {
        return new noy(this.a, nppVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, paq] */
    public final void d() {
        this.a.close();
    }

    public final void e(jjt jjtVar, boolean z, boolean z2) {
        Object obj = this.a;
        jjn jjnVar = (jjn) obj;
        owq owqVar = jjnVar.g;
        Optional optional = (Optional) owqVar.dL();
        int i = 4;
        int i2 = 3;
        int i3 = 15;
        int i4 = 2;
        if (optional.isPresent() && jjtVar == optional.get()) {
            Collection.EL.stream(jjnVar.d).filter(new jjj(jjtVar, i4)).forEach(new irn(i3));
            owqVar.a(Optional.empty());
            if (z) {
                jjnVar.h = Optional.empty();
            }
        } else {
            optional.ifPresent(new gok(obj, 8));
            int i5 = 6;
            Collection.EL.stream(jjnVar.d).filter(new glx(jjtVar, i5)).forEach(new jgf(i5));
            owqVar.a(Optional.of(jjtVar));
            if (z) {
                jjnVar.h = Optional.of(jjtVar);
            }
            mdy mdyVar = jjnVar.o;
            switch (jjtVar.ordinal()) {
                case 0:
                    i3 = 2;
                    break;
                case 1:
                    i3 = 3;
                    break;
                case 2:
                    i3 = 4;
                    break;
                case 3:
                    i3 = 5;
                    break;
                case 4:
                    i3 = 6;
                    break;
                case 5:
                    i3 = 7;
                    break;
                case 6:
                case 11:
                default:
                    i3 = 1;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 16;
                    break;
                case 9:
                    break;
                case 10:
                    i3 = 9;
                    break;
                case 12:
                    i3 = 10;
                    break;
                case 13:
                    i3 = 11;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i3 = 12;
                    break;
                case 15:
                    i3 = 13;
                    break;
                case 16:
                    i3 = 14;
                    break;
            }
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.MANUAL_FEATURE_OPENED_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = srs.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            srs srsVar = (srs) tpcVarM2.b;
            srsVar.c = i3 - 1;
            srsVar.b |= 1;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            srs srsVar2 = (srs) tpcVarM2.l();
            srsVar2.getClass();
            sodVar2.ax = srsVar2;
            sodVar2.d |= 16777216;
            mdyVar.I(tpcVarM);
        }
        jkq jkqVar = jjnVar.k;
        Optional optional2 = (Optional) owqVar.dL();
        synchronized (jkqVar) {
            if (jkqVar.e != null) {
                jjt jjtVar2 = (jjt) optional2.orElse(null);
                jkx jkxVar = jkqVar.e;
                jjt jjtVar3 = jkxVar.h;
                jkxVar.h = jjtVar2;
                jkxVar.q(jjtVar3).ifPresent(new jkr(jkxVar, i2));
                jkxVar.q(jkxVar.h).ifPresent(new jkr(jkxVar, i));
                jkqVar.a(z2);
            }
        }
        if (((Optional) jjnVar.g.dL()).isPresent()) {
            jjnVar.l = false;
            jjnVar.u(false);
        } else if (jjnVar.z()) {
            jjnVar.u(true);
        }
    }

    public final void f(int i, double d, double d2) {
        Object obj = this.a;
        synchronized (obj) {
            Iterator it = ((hdm) obj).a.iterator();
            while (it.hasNext()) {
                double d3 = d / d2;
                Map map = ((pmh) it.next()).e;
                Integer numValueOf = Integer.valueOf(i);
                hdl hdlVar = (hdl) map.get(numValueOf);
                if (hdlVar == null) {
                    hdlVar = new hdl();
                    map.put(numValueOf, hdlVar);
                }
                if (d3 < 1.5d) {
                    hdlVar.a++;
                } else if (d3 < 2.5d) {
                    hdlVar.b++;
                } else if (d3 < 5.0d) {
                    hdlVar.c++;
                } else {
                    hdlVar.d++;
                }
            }
        }
        if (i == 0) {
            String.format("abs Δ(result sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
            return;
        }
        if (i == 1) {
            String.format("rel Δ(result sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
            return;
        }
        if (i == 2) {
            String.format("result sensor delay = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
            return;
        }
        if (i == 3) {
            String.format("abs Δ(surface sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
            return;
        }
        if (i == 4) {
            String.format("rel Δ(surface sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
        } else if (i != 5) {
            String.format("rel pipeline latency = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
        } else {
            String.format("abs pipeline latency = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
        }
    }

    public final long g() {
        return ((bms) this.a).a();
    }

    public final void h(float f, float f2, long j) {
        bku bkuVarB = ((bms) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        bkuVarB.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        bkuVarB.g(f, f2);
        bkuVarB.h(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void i(float f, float f2) {
        ((bms) this.a).b().h(f, f2);
    }

    public final void j(float f, float f2) {
        bms bmsVar = (bms) this.a;
        bku bkuVarB = bmsVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g() >> 32)) - (f + 0.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g() & 4294967295L)) - (f2 + 0.0f);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            blb.a("Width and height must be greater than or equal to zero");
        }
        bmsVar.h(jFloatToRawIntBits);
        bkuVarB.h(0.0f, 0.0f);
    }

    public final void k(bkn bknVar) {
        ((bms) this.a).b().i(bknVar);
    }

    public final void l(float f, float f2) {
        ((bms) this.a).b().j(0.0f, 0.0f, f, f2);
    }

    public final void m() {
        Object obj = this.a;
        synchronized (bgr.b) {
            List list = bgr.f;
            list.getClass();
            ArrayList arrayList = new ArrayList(ske.bq(list, 10));
            boolean z = false;
            for (Object obj2 : list) {
                boolean z2 = true;
                if (!z && a.ao(obj2, obj)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj2);
                }
            }
            bgr.f = arrayList;
        }
    }

    public final long n(long j, int i) {
        aji ajiVar = (aji) this.a;
        ajiVar.h = i;
        afy afyVar = ajiVar.b;
        return (afyVar == null || !ajiVar.j()) ? ajiVar.c(ajiVar.i, j, i) : afyVar.a(j, ajiVar.h, ajiVar.j);
    }

    public final long o(long j) {
        aji ajiVar = (aji) this.a;
        return ajiVar.c(ajiVar.i, j, 1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uiq] */
    public final void p(float f) {
        Object obj = this.a;
        ((got) obj).c.a(Float.valueOf(f));
    }

    public final void q(sq sqVar) {
        if (sqVar.a) {
            return;
        }
        List list = ((wi) this.a).a;
        synchronized (list) {
            list.remove(sqVar);
        }
    }

    public final lg r(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.g.c();
        int i2 = 0;
        lg lgVar = null;
        while (true) {
            if (i2 >= iC) {
                break;
            }
            lg lgVarI = RecyclerView.i(recyclerView.g.f(i2));
            if (lgVarI != null && !lgVarI.u() && lgVarI.c == i) {
                if (!recyclerView.g.k(lgVarI.a)) {
                    lgVar = lgVarI;
                    break;
                }
                lgVar = lgVarI;
            }
            i2++;
        }
        if (lgVar == null || recyclerView.g.k(lgVar.a)) {
            return null;
        }
        return lgVar;
    }

    public final void s(hl hlVar) {
        int i = hlVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).m.w(hlVar.b, hlVar.d);
            return;
        }
        if (i == 2) {
            ((RecyclerView) this.a).m.y(hlVar.b, hlVar.d);
            return;
        }
        if (i != 4) {
            return;
        }
        kq kqVar = ((RecyclerView) this.a).m;
        int i2 = hlVar.b;
        int i3 = hlVar.d;
        Object obj = hlVar.c;
        kqVar.z(i2, i3);
    }

    public final void t(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.g.c();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iC) {
                break;
            }
            View viewF = recyclerView.g.f(i6);
            lg lgVarI = RecyclerView.i(viewF);
            if (lgVarI != null && !lgVarI.z() && (i5 = lgVarI.c) >= i && i5 < i3) {
                lgVarI.e(2);
                lgVarI.d(obj);
                ((kr) viewF.getLayoutParams()).e = true;
            }
            i6++;
        }
        kv kvVar = recyclerView.e;
        ArrayList arrayList = kvVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.Q = true;
                return;
            }
            lg lgVar = (lg) arrayList.get(size);
            if (lgVar != null && (i4 = lgVar.c) >= i && i4 < i3) {
                lgVar.e(2);
                kvVar.i(size);
            }
        }
    }

    public final void u(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.g.c();
        for (int i3 = 0; i3 < iC; i3++) {
            lg lgVarI = RecyclerView.i(recyclerView.g.f(i3));
            if (lgVarI != null && !lgVarI.z() && lgVarI.c >= i) {
                lgVarI.j(i2, false);
                recyclerView.O.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            lg lgVar = (lg) arrayList.get(i4);
            if (lgVar != null && lgVar.c >= i) {
                lgVar.j(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.P = true;
    }

    public final void v(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.P(i, i2, true);
        recyclerView.P = true;
        recyclerView.O.c += i2;
    }

    public final int w() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int x(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View y(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void z(View view) {
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI != null) {
            ((RecyclerView) this.a).au(lgVarI, lgVarI.o);
            lgVarI.o = 0;
        }
    }

    public rnu(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ rnu(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
