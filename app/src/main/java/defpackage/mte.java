package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mte extends cxm {
    private final azr A;
    public final uem a;
    public final owf b;
    public final owf c;
    public final hyh d;
    public final owf e;
    public final owf f;
    public final Resources g;
    public final azr h;
    public final azr i;
    public final azr j;
    public final azr k;
    public final azr l;
    public final azr m;
    public final gln n;
    public final myt o;
    public int p;
    public final hbj q;
    private final fuf r;
    private final pnq s;
    private final mye t;
    private final azr u;
    private final azr v;
    private final azr w;
    private final azr x;
    private final azr y;
    private final azr z;

    public mte(Context context, out outVar, fdq fdqVar, hbj hbjVar, fuf fufVar, uem uemVar, owf owfVar, owf owfVar2, owf owfVar3, gln glnVar, myt mytVar, hyh hyhVar, owf owfVar4, owf owfVar5, owf owfVar6, owf owfVar7, owf owfVar8, owf owfVar9, pnq pnqVar, mye myeVar) {
        outVar.getClass();
        hbjVar.getClass();
        fufVar.getClass();
        uemVar.getClass();
        owfVar.getClass();
        owfVar2.getClass();
        owfVar3.getClass();
        glnVar.getClass();
        mytVar.getClass();
        hyhVar.getClass();
        owfVar4.getClass();
        owfVar5.getClass();
        owfVar6.getClass();
        owfVar7.getClass();
        owfVar8.getClass();
        owfVar9.getClass();
        pnqVar.getClass();
        myeVar.getClass();
        this.q = hbjVar;
        this.r = fufVar;
        this.a = uemVar;
        this.b = owfVar;
        this.c = owfVar3;
        this.n = glnVar;
        this.o = mytVar;
        this.d = hyhVar;
        this.e = owfVar4;
        this.f = owfVar5;
        this.s = pnqVar;
        this.t = myeVar;
        Resources resources = context.getResources();
        this.g = resources;
        this.p = 1;
        bap bapVar = bap.c;
        this.h = new azz(true, bapVar);
        this.i = new azz(false, bapVar);
        this.u = new azz(true, bapVar);
        this.v = new azz(false, bapVar);
        mxm mxmVar = mxm.PORTRAIT;
        this.j = new azz(mxmVar, bapVar);
        this.k = new azz(mxmVar, bapVar);
        this.l = new azz(mxj.PHONE_LAYOUT, bapVar);
        azz azzVar = new azz(false, bapVar);
        this.m = azzVar;
        this.w = new azz(null, bapVar);
        this.x = new azz(resources.getString(R.string.manual_controls_entrypoint_desc), bapVar);
        this.y = new azz(null, bapVar);
        this.z = new azz(Integer.valueOf(R.drawable.gs_tune_vd_theme_48), bapVar);
        this.A = new azz(new dus(this, 11), bapVar);
        our ourVarJ = fdqVar.j();
        ourVarJ.getClass();
        ourVarJ.d(owfVar.dK(new mix(this, 9), outVar));
        ourVarJ.d(owfVar2.dK(new mtd(this, 4), outVar));
        ourVarJ.d(owb.a(owfVar7).dK(new mtd(this, 5), outVar));
        ourVarJ.d(owb.a(owl.g(owfVar8, owfVar6)).dK(new mtd(this, 6), outVar));
        ourVarJ.d(owfVar3.dK(new mtd(this, 7), outVar));
        glr glrVar = new glr() { // from class: mtc
            @Override // defpackage.glr
            public final void a(int i) throws Resources.NotFoundException {
                mte mteVar = this.a;
                myt mytVar2 = mteVar.o;
                LinkedHashMap linkedHashMap = mytVar2.b;
                owf owfVar10 = mteVar.b;
                if (linkedHashMap.containsKey(owfVar10.dL())) {
                    String str = (String) mytVar2.a((nkw) owfVar10.dL()).b(Integer.valueOf(i)).get(0);
                    if (owfVar10.dL() == nkw.SLOW_MOTION) {
                        mteVar.s(str);
                        String string = mteVar.g.getString(R.string.slo_mo_entrypoint_desc);
                        string.getClass();
                        mteVar.o(string);
                        mteVar.p(null);
                        return;
                    }
                    if (owfVar10.dL() == nkw.TIME_LAPSE) {
                        mteVar.s(str);
                        String string2 = mteVar.g.getString(R.string.timelapse_entrypoint_desc);
                        string2.getClass();
                        mteVar.o(string2);
                        mteVar.p(null);
                    }
                }
            }
        };
        glnVar.a(glrVar);
        ourVarJ.d(new ktu(this, glrVar, 13, (byte[]) null));
        ourVarJ.d(hyhVar.d().dK(new mtd(this, 8), outVar));
        ourVarJ.d(owfVar4.dK(new mtd(this, 1), outVar));
        boolean z = false;
        ourVarJ.d(owfVar5.dK(new mtd(this, false ? 1 : 0), outVar));
        ourVarJ.d(hyhVar.e().dK(new mtd(this, 2), outVar));
        ourVarJ.d(owb.a(owfVar9).dK(new mtd(this, 3), outVar));
        if (hbjVar.p(gzo.bw) && ((pnqVar.k() || pnqVar.j()) && !myeVar.c())) {
            z = true;
        }
        azzVar.b(Boolean.valueOf(z));
    }

    public static final int A(Duration duration) {
        if (duration.isNegative() || duration.isZero()) {
            return 1;
        }
        return (int) Math.ceil(duration.toMillis() / 1000.0f);
    }

    public static final int B(mtp mtpVar) {
        return mtpVar == mtp.AUTO ? R.drawable.gs_night_sight_auto_vd_theme_24 : R.drawable.gs_night_sight_max_vd_theme_24;
    }

    public final mxm a() {
        return (mxm) this.k.a();
    }

    public final mxm b() {
        return (mxm) this.j.a();
    }

    public final paq c() {
        r(true);
        return new khc(this, 18);
    }

    public final Integer e() {
        return (Integer) this.z.a();
    }

    public final String f() {
        return (String) this.x.a();
    }

    public final String j() {
        return (String) this.y.a();
    }

    public final String k() {
        return (String) this.w.a();
    }

    public final uif l() {
        return (uif) this.A.a();
    }

    public final void m() throws Resources.NotFoundException {
        this.p = 1;
        s(null);
        String string = this.g.getString(R.string.manual_controls_entrypoint_desc);
        string.getClass();
        o(string);
        p(null);
        q(Integer.valueOf(R.drawable.gs_tune_vd_theme_48));
    }

    public final void n() throws Resources.NotFoundException {
        Optional optional = (Optional) this.e.dL();
        mtp mtpVar = (mtp) this.f.dL();
        this.p = 5;
        String lowerCase = mtpVar.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Resources resources = this.g;
        String string = resources.getString(R.string.night_sight_entrypoint_desc, lowerCase);
        string.getClass();
        o(string);
        if (optional.isPresent()) {
            int iA = A((Duration) optional.get());
            Integer numValueOf = Integer.valueOf(iA);
            s(resources.getString(R.string.time_remaining, numValueOf));
            p(resources.getQuantityString(R.plurals.capture_time_label_desc, iA, numValueOf));
        } else {
            s(null);
            p(null);
        }
        mtpVar.getClass();
        q(Integer.valueOf(B(mtpVar)));
    }

    public final void o(String str) {
        str.getClass();
        this.x.b(str);
    }

    public final void p(String str) {
        this.y.b(str);
    }

    public final void q(Integer num) {
        this.z.b(num);
    }

    public final void r(boolean z) {
        this.v.b(Boolean.valueOf(z));
    }

    public final void s(String str) {
        this.w.b(str);
    }

    public final void t(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void u(boolean z) {
        t(z);
        this.u.b(Boolean.valueOf(z));
    }

    public final void v(nkw nkwVar) {
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        if (iOrdinal != 3 && iOrdinal != 4) {
            if (iOrdinal == 17) {
                gzi gziVar = gzp.a;
                u(false);
                return;
            } else if (iOrdinal != 18) {
                u(true);
                return;
            }
        }
        u(false);
    }

    public final boolean w() {
        return ((Boolean) this.u.a()).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) this.v.a()).booleanValue();
    }

    public final boolean y() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final boolean z(nkw nkwVar) {
        if (!this.r.a(nkwVar)) {
            return false;
        }
        owf owfVar = this.b;
        return (owfVar.dL() == nkw.TIME_LAPSE || owfVar.dL() == nkw.SERENGETI) ? false : true;
    }
}
