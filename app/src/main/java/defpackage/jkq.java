package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.manual.panel.ManualPanelLayoutManager;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.R;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkq {
    private final syj A;
    public final mua a;
    public final nfc b;
    public final owq c;
    public final owq d;
    public jkx e;
    public RecyclerView f;
    public final krj i;
    public final mte j;
    public final mdy k;
    public final qqq l;
    private final sbp m;
    private final out n;
    private final owf o;
    private final owf p;
    private final owf q;
    private final owf r;
    private final owf s;
    private final boolean u;
    private BottomSheetBehavior v;
    private View w;
    private final our x;
    private final MainActivityLayout y;
    private final ocq z;
    private final jkn t = new jkn();
    public long h = 0;
    public final Set g = new HashSet();

    public jkq(our ourVar, sbp sbpVar, MainActivityLayout mainActivityLayout, ocq ocqVar, mdy mdyVar, krj krjVar, mua muaVar, syj syjVar, out outVar, qqq qqqVar, nfc nfcVar, mte mteVar, owq owqVar, owq owqVar2, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, hbj hbjVar) {
        this.x = ourVar;
        this.m = sbpVar;
        this.y = mainActivityLayout;
        this.z = ocqVar;
        this.k = mdyVar;
        this.i = krjVar;
        this.a = muaVar;
        this.A = syjVar;
        this.n = outVar;
        this.l = qqqVar;
        this.b = nfcVar;
        this.j = mteVar;
        this.c = owqVar;
        this.d = owqVar2;
        this.o = owfVar;
        this.p = owfVar2;
        this.q = owfVar3;
        this.r = owfVar4;
        this.s = owfVar5;
        this.u = hbjVar.p(gzo.bw);
    }

    public final synchronized void a(boolean z) {
        int i;
        if (this.e != null && this.f != null) {
            int iOrElse = 0;
            if (z) {
                iOrElse = this.e.q((jjt) ((Optional) this.d.dL()).orElse(null)).orElse(0);
                i = 2;
            } else {
                i = 1;
            }
            jkz jkzVar = new jkz(this.f.getContext(), i);
            jkzVar.b = iOrElse;
            this.f.post(new img(this, jkzVar, 10));
        }
    }

    public final synchronized void b(boolean z) {
        if (z) {
            jkx jkxVar = this.e;
            if (jkxVar != null && this.f != null) {
                int iA = jkxVar.a() / 2;
                jkz jkzVar = new jkz(this.f.getContext(), 2);
                jkzVar.b = iA;
                this.f.post(new img(this, jkzVar, 11));
            }
        }
    }

    public final synchronized void c(mxj mxjVar) {
        if (this.f != null) {
            Object objC = this.z.c(R.id.manual_panel);
            if (mxjVar.equals(mxj.TABLET_LAYOUT)) {
                ((View) objC).setBackgroundResource(R.drawable.manual_control_panel_background_large_screen);
                this.f.aC(this.t);
                return;
            }
            ((View) objC).setBackgroundResource(R.drawable.manual_control_panel_background);
            for (int i = 0; i < this.f.d(); i++) {
                RecyclerView recyclerView = this.f;
                int iD = recyclerView.d();
                if (i >= iD) {
                    throw new IndexOutOfBoundsException(i + " is an invalid index for size " + iD);
                }
                if (!(((byi) recyclerView.o.get(i)) instanceof jkn)) {
                }
            }
            this.f.aB(this.t);
        }
    }

    public final synchronized void d(jjq jjqVar) {
        jkx jkxVar = this.e;
        if (jkxVar != null) {
            jjq jjqVar2 = jkxVar.i;
            jkxVar.i = jjqVar;
            DesugarArrays.stream(jjt.values()).filter(new jks(jjqVar2, jjqVar, 1)).forEach(new gok(jkxVar, 11));
            scn scnVar = (scn) DesugarArrays.stream(jjt.values()).filter(new jks(jjqVar2, jjqVar, 0)).collect(ryv.b);
            if (scnVar.size() == 1) {
                OptionalInt optionalIntQ = jkxVar.q((jjt) ujp.aS(scnVar));
                RecyclerView recyclerView = jkxVar.j;
                recyclerView.getClass();
                optionalIntQ.ifPresent(new jkr(recyclerView, 2));
            }
        }
    }

    public final synchronized void e() {
        if (this.v != null) {
            this.c.a(false);
            this.v.ar(5);
        }
    }

    public final synchronized void f(jjs jjsVar, boolean z) {
        jkx jkxVar = this.e;
        jkxVar.getClass();
        if (z) {
            Set set = jkxVar.e;
            if (!set.contains(jjsVar)) {
                jkxVar.j.K();
                set.add(jjsVar);
                Pair pairO = jkxVar.o(jjsVar);
                jkxVar.a.d(((Integer) pairO.first).intValue() + 1, ((Integer) pairO.second).intValue());
            }
        } else {
            Set set2 = jkxVar.e;
            if (set2.contains(jjsVar)) {
                Pair pairO2 = jkxVar.o(jjsVar);
                set2.remove(jjsVar);
                jkxVar.a.e(((Integer) pairO2.first).intValue() + 1, ((Integer) pairO2.second).intValue());
            }
        }
    }

    public final synchronized void g(jjt jjtVar, boolean z) {
        jkx jkxVar = this.e;
        jkxVar.getClass();
        if (z ? jkxVar.f.remove(jjtVar) : jkxVar.f.add(jjtVar)) {
            jkxVar.q(jjtVar).ifPresent(new jkr(jkxVar, 0));
        }
    }

    public final synchronized void h(Optional optional) {
        jkx jkxVar = this.e;
        jkxVar.getClass();
        optional.ifPresentOrElse(new gok(jkxVar, 12), new jcq(jkxVar, 17));
    }

    public final synchronized boolean i() {
        BottomSheetBehavior bottomSheetBehavior = this.v;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.x == 3) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean j() {
        BottomSheetBehavior bottomSheetBehavior;
        if (this.e != null && (bottomSheetBehavior = this.v) != null && this.w != null && bottomSheetBehavior.x != 3 && !((Boolean) this.q.dL()).booleanValue()) {
            if (((Boolean) this.r.dL()).booleanValue()) {
                this.i.v(8);
            }
            this.w.setVisibility(0);
            this.c.a(true);
            BottomSheetBehavior bottomSheetBehavior2 = this.v;
            bottomSheetBehavior2.getClass();
            bottomSheetBehavior2.ar(3);
            return true;
        }
        return false;
    }

    public final synchronized void k(rnu rnuVar, rnu rnuVar2) {
        out.a();
        ocq ocqVar = this.z;
        ViewStub viewStub = (ViewStub) ocqVar.c(R.id.autobahn_panel);
        viewStub.setLayoutResource(R.layout.manual_control_panel);
        View viewFindViewById = viewStub.inflate().findViewById(R.id.manual_panel);
        MainActivityLayout mainActivityLayout = this.y;
        Object objC = ocqVar.c(R.id.controls_slider_area);
        mxk mxkVar = mxk.TO_LEFT;
        mainActivityLayout.j((View) objC, mxkVar);
        mainActivityLayout.j((View) ocqVar.c(R.id.manual_panel_container), mxkVar);
        this.v = BottomSheetBehavior.c(viewFindViewById);
        this.f = (RecyclerView) viewFindViewById.findViewById(R.id.manual_control_panel_items);
        this.w = viewFindViewById;
        this.v.ak(new jkp(this, viewFindViewById));
        this.v.ap(true);
        BottomSheetBehavior bottomSheetBehavior = this.v;
        bottomSheetBehavior.v = true;
        bottomSheetBehavior.ar(5);
        syj syjVar = this.A;
        out outVar = this.n;
        owf owfVar = this.p;
        our ourVar = this.x;
        owf owfVar2 = this.o;
        this.e = new jkx(ourVar, this.m, rnuVar, rnuVar2, syjVar, outVar, owfVar, owfVar2, this.u);
        this.f.ac(null);
        this.f.ab(this.e);
        this.f.ad(new ManualPanelLayoutManager(new jko(this, 0)));
        ourVar.d(owb.a(owfVar2).dK(new jjl(this, 8), outVar));
        ourVar.d(owb.a(owfVar).dK(new jjl(this, 9), outVar));
        ourVar.d(this.s.dK(new jjl(this, 10), outVar));
        owq owqVar = this.c;
        ourVar.d(owb.a(owl.c(owqVar, owl.h(owfVar2, new hia(20)))).dK(new jjl(this, 11), outVar));
        ourVar.d(owb.a(owl.c(owqVar, owl.h(owfVar2, new jku(1)))).dK(new jjl(this, 7), outVar));
    }
}
