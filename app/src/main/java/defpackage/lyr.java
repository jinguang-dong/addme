package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.smarts.SmartsChipView;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyr implements imj {
    public final lzj a;
    public lzl b;
    public final owf c;
    public boolean d = false;
    public final ktx e;
    public final mdy f;
    public final gox g;
    public final oer h;
    public final mwq i;
    private final lzh j;
    private Date k;
    private final ocq l;

    public lyr(lzj lzjVar, lzh lzhVar, lzl lzlVar, mdy mdyVar, ocq ocqVar, ktx ktxVar, gox goxVar, mwq mwqVar, owf owfVar, oer oerVar) {
        this.a = lzjVar;
        this.b = lzlVar;
        this.f = mdyVar;
        this.l = ocqVar;
        this.j = lzhVar;
        this.e = ktxVar;
        this.g = goxVar;
        this.i = mwqVar;
        this.c = owfVar;
        this.h = oerVar;
    }

    public final boolean a() {
        lzl lzlVar = this.b;
        return (lzlVar.d == null && lzlVar.c == null) ? false : true;
    }

    @Override // defpackage.imj
    public final int b() {
        return (int) this.b.a;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.SMARTS;
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final Object e() {
        return this.j;
    }

    @Override // defpackage.imj
    public final Runnable f() {
        return this.b.k;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.k;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        Object obj = this.h.b;
        rnt.w(obj, "SmartsChipViewController is not yet initialized", new Object[0]);
        SmartsChipView smartsChipView = (SmartsChipView) obj;
        smartsChipView.e = runnable;
        if (smartsChipView.d()) {
            smartsChipView.d = true;
        } else {
            smartsChipView.b();
        }
        this.d = false;
    }

    @Override // defpackage.imj
    public final void i() {
        Object obj = this.h.b;
        rnt.w(obj, "SmartsChipViewController is not yet initialized", new Object[0]);
        ((SmartsChipView) obj).b();
        this.d = false;
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.k = date;
    }

    public final boolean l() {
        return this.l.Z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, owf] */
    @Override // defpackage.imj
    public final void m() throws Resources.NotFoundException {
        int i = this.b.n;
        oer oerVar = this.h;
        oerVar.b(i);
        Object obj = oerVar.b;
        rnt.w(obj, "SmartsChipViewController is not yet initialized", new Object[0]);
        SmartsChipView smartsChipView = (SmartsChipView) obj;
        int i2 = 1;
        if (!smartsChipView.d()) {
            smartsChipView.b.scrollTo(0, 0);
            View rootView = smartsChipView.b.getRootView();
            int[] iArr = con.a;
            if (rootView.getLayoutDirection() == 1) {
                smartsChipView.b.setGravity(8388661);
            } else {
                smartsChipView.b.setGravity(8388659);
            }
            if (smartsChipView.o.b()) {
                smartsChipView.o = new our();
            }
            gox goxVar = this.g;
            smartsChipView.e(goxVar.b, this);
            smartsChipView.e(goxVar.c, this);
            mwq mwqVar = this.i;
            smartsChipView.e(mwqVar.b, this);
            smartsChipView.e(mwqVar.a, this);
            smartsChipView.e(this.c, this);
            mzi mziVar = new mzi(smartsChipView, this, i2);
            ((ViewGroup) smartsChipView.getParent()).addOnLayoutChangeListener(mziVar);
            smartsChipView.o.d(new loe(obj, mziVar, 2));
            smartsChipView.f(this);
            if (a()) {
                if (l()) {
                    Object obj2 = oerVar.b;
                    rnt.w(obj2, "SmartsChipViewController is not yet initialized", new Object[0]);
                    syj.i((View) obj2);
                }
                smartsChipView.n = this.b.m;
                smartsChipView.a(0);
                Runnable runnable = this.b.i;
                if (runnable != null) {
                    runnable.run();
                }
                this.f.z(2, this.a.a);
            } else {
                smartsChipView.setVisibility(8);
            }
            smartsChipView.f = this.b.j;
        }
        this.d = true;
    }

    @Override // defpackage.imj
    public final void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) throws Resources.NotFoundException {
        int i = this.b.n;
        oer oerVar = this.h;
        oerVar.b(i);
        Object obj = oerVar.b;
        rnt.w(obj, "SmartsChipViewController is not yet initialized", new Object[0]);
        lxc lxcVarA = lxd.a(this);
        lxcVarA.b(z3);
        lxcVarA.f(z2);
        lxcVarA.d(z);
        lxcVarA.g(mxjVar);
        lxcVarA.h(optional);
        lxcVarA.e(z4);
        ((SmartsChipView) obj).c(lxcVarA.a());
    }

    @Override // defpackage.imj
    public final boolean o() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return this.b.l;
    }

    @Override // defpackage.imj
    public final boolean r() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return this.a.i;
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }
}
