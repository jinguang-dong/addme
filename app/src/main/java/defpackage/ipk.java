package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.CameraSwitchButton;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.jupiter.JupiterButton;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipk implements iqj, jhf, jhg, jfz, dub, dtz {
    public ConstraintLayout A;
    public mxm C;
    public mxj D;
    public owf E;
    public owf F;
    public final fdq G;
    public final luj H;
    public final ipt I;
    public dtm J;
    public final hbj K;
    public final pez L;
    public final hkk M;
    public final gga N;
    private final Activity O;
    private final out P;
    private final owf Q;
    private final owq R;
    private final boolean S;
    private final jug T;
    private final ThumbnailView U;
    private final glf V;
    private final Optional W;
    private dua Y;
    private ElapsedTimerView Z;
    public final Context a;
    private mxm aa;
    private szh ab;
    private szh ac;
    private final luj ad;
    private final mgr ae;
    private final mwq af;
    private final mwq ag;
    private gsn ah;
    public final fvu b;
    public final gnt c;
    public final owf d;
    public final owf e;
    public final owf f;
    public final owf g;
    public final ipp h;
    public final ips i;
    public final Optional j;
    public final Optional k;
    public final owq l;
    public final owq m;
    public final owq n;
    public final owq o;
    public final owq p;
    public final owq q;
    public final nqp r;
    public final owf s;
    public JupiterButton v;
    public nbb w;
    public nbc x;
    public Integer y;
    public Integer z;
    public final ArrayList t = new ArrayList();
    public final AtomicBoolean u = new AtomicBoolean(false);
    private final AtomicBoolean X = new AtomicBoolean(false);
    public Optional B = Optional.empty();

    public ipk(Activity activity, Context context, fdq fdqVar, fvu fvuVar, gnt gntVar, out outVar, owf owfVar, owf owfVar2, owf owfVar3, owq owqVar, owq owqVar2, owf owfVar4, owf owfVar5, owq owqVar3, owq owqVar4, glf glfVar, owf owfVar6, owq owqVar5, hkk hkkVar, ipp ippVar, ips ipsVar, pez pezVar, ipt iptVar, Optional optional, Optional optional2, luj lujVar, luj lujVar2, nqp nqpVar, ThumbnailView thumbnailView, mgr mgrVar, hbj hbjVar, jug jugVar, mwq mwqVar, gga ggaVar, Optional optional3, mwq mwqVar2) {
        mxm mxmVar = mxm.PORTRAIT;
        this.aa = mxmVar;
        this.C = mxmVar;
        this.D = mxj.PHONE_LAYOUT;
        this.ab = new szh();
        this.ac = new szh();
        this.O = activity;
        this.a = context;
        this.G = fdqVar;
        this.b = fvuVar;
        this.c = gntVar;
        this.P = outVar;
        this.d = owfVar;
        this.e = owfVar2;
        this.Q = owfVar3;
        this.m = owqVar2;
        this.s = owfVar4;
        this.f = owfVar5;
        this.g = owfVar6;
        this.h = ippVar;
        this.M = hkkVar;
        this.q = owqVar5;
        this.V = glfVar;
        this.i = ipsVar;
        this.L = pezVar;
        this.l = owqVar;
        this.p = owqVar3;
        this.R = owqVar4;
        this.I = iptVar;
        this.k = optional;
        this.j = optional2;
        this.ad = lujVar;
        this.n = lujVar.a(luf.g);
        this.o = lujVar.a(luf.f);
        this.H = lujVar2;
        this.r = nqpVar;
        this.ae = mgrVar;
        this.S = hbjVar.p(gza.q);
        this.T = jugVar;
        this.K = hbjVar;
        this.af = mwqVar;
        this.U = thumbnailView;
        this.N = ggaVar;
        this.W = optional3;
        this.ag = mwqVar2;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [cwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.iqj
    public final void a() throws Resources.NotFoundException {
        if (this.v == null) {
            out.a();
            this.v = (JupiterButton) View.inflate(this.O, R.layout.jupiter_button, null);
        }
        Optional optional = this.k;
        optional.ifPresent(new hyq(this, 15));
        this.v.setAccessibilityDelegate(new ipj(this));
        fdq fdqVar = this.G;
        owq owqVar = this.l;
        our ourVarJ = fdqVar.j();
        ijl ijlVar = new ijl(this, 3);
        out outVar = this.P;
        ourVarJ.d(owqVar.dK(ijlVar, outVar));
        owf owfVar = this.d;
        fdqVar.j().d(owfVar.dK(new ijl(this, 4), outVar));
        gnt gntVar = this.c;
        fdqVar.j().d(gntVar.dK(new ijl(this, 5), outVar));
        owf owfVar2 = this.e;
        fdqVar.j().d(owfVar2.dK(new ijl(this, 6), outVar));
        ips ipsVar = this.i;
        our ourVarJ2 = fdqVar.j();
        iqu iquVar = new iqu(ipsVar, 1);
        ipsVar.b.f(iquVar);
        ourVarJ2.d(new hty(ipsVar, iquVar, 9));
        int i = 17;
        this.j.ifPresent(new hyq(this, 17));
        fdqVar.j().d(this.Q.dK(new ijl(this, 7), outVar));
        this.ah = new ipi(this);
        fvu fvuVar = this.b;
        JupiterButton jupiterButton = this.v;
        int i2 = 0;
        if (!fvuVar.e.h()) {
            fvuVar.e = rwc.j(jupiterButton);
            ((View) fvuVar.e.c()).setOnClickListener(new fvp(fvuVar, i2));
            BottomBar bottomBar = fvuVar.a;
            fvo fvoVar = fvo.RIGHT;
            Object objC = fvuVar.e.c();
            FrameLayout frameLayout = (FrameLayout) bottomBar.l.get(fvoVar);
            frameLayout.getClass();
            frameLayout.addView((View) objC);
        }
        hkk hkkVar = this.M;
        ipg ipgVar = new ipg(this, 2);
        ?? r14 = hkkVar.d;
        ukc.C(coj.d(r14), null, 0, new crq(hkkVar, ipgVar, (uhb) null, 9, (byte[]) null), 3);
        if (this.S) {
            JupiterButton jupiterButton2 = this.v;
            nbd nbdVarA = nbe.a();
            nbdVarA.j(iqh.JUPITER);
            Context context = this.a;
            nbdVarA.l(context.getString(R.string.jupiter_title));
            nbdVarA.e(ojl.aO(jupiterButton2));
            nbdVarA.d(context.getString(R.string.menu_item_unavailable));
            nbdVarA.h(R.drawable.ic_jupiter);
            nbdVarA.i(ojl.aO(jupiterButton2));
            nbdVarA.k(new fvr(this, i));
            nbdVarA.g(ojl.aO(jupiterButton2));
            nbdVarA.b(false);
            nbe nbeVarA = nbdVarA.a();
            ArrayList arrayList = this.t;
            arrayList.add(nbeVarA);
            nbd nbdVarA2 = nbe.a();
            nbdVarA2.j(iqh.SATURN);
            nbdVarA2.l(context.getString(R.string.saturn_title));
            nbdVarA2.e(ojl.aO(jupiterButton2));
            nbdVarA2.h(R.drawable.ic_saturn);
            nbdVarA2.i(ojl.aO(jupiterButton2));
            nbdVarA2.k(new fvr(this, 18));
            nbdVarA2.g(ojl.aO(jupiterButton2));
            nbdVarA2.d(context.getString(R.string.menu_item_unavailable));
            nbdVarA2.b(false);
            arrayList.add(nbdVarA2.a());
            if (optional.isPresent()) {
                nbd nbdVarA3 = nbe.a();
                nbdVarA3.j(iqh.URANUS);
                nbdVarA3.l(context.getString(R.string.uranus_title));
                nbdVarA3.e(ojl.aO(jupiterButton2));
                nbdVarA3.h(R.drawable.ic_uranus);
                nbdVarA3.i(ojl.aO(jupiterButton2));
                nbdVarA3.k(new fvr(this, 19));
                nbdVarA3.g(ojl.aO(jupiterButton2));
                nbdVarA3.d(context.getString(R.string.menu_item_unavailable));
                nbdVarA3.b(false);
                arrayList.add(nbdVarA3.a());
                ((isb) optional.get()).e(this.U);
            }
            nbc nbcVar = new nbc(arrayList);
            this.x = nbcVar;
            nbcVar.c = true;
            nbcVar.d = true;
            Activity activity = this.O;
            mgr mgrVar = this.ae;
            View view = (View) jupiterButton2.getParent().getParent();
            nbc nbcVar2 = this.x;
            nbcVar2.getClass();
            nbb nbbVar = new nbb(activity, mgrVar, view, nbcVar2, 5, this.ag);
            this.w = nbbVar;
            nbbVar.d();
            this.w.n = context.getResources().getDimensionPixelOffset(R.dimen.popup_menu_anchor_vertical_margin);
            this.w.o = context.getResources().getDimensionPixelOffset(R.dimen.popup_menu_anchor_horizontal_margin);
            this.w.e(R.color.camera_protection_background_opaque);
            this.w.f = new myj(this, 1);
            Optional optional2 = this.W;
            if (optional2.isPresent()) {
                ConstraintLayout constraintLayout = (ConstraintLayout) View.inflate(context, R.layout.saturn_elapsed_timer, null);
                this.A = constraintLayout;
                this.Z = (ElapsedTimerView) constraintLayout.findViewById(R.id.saturn_video_timer);
                ((mtw) optional2.get()).c(this.Z);
                ((mtw) optional2.get()).e(this.m);
            }
            ukc.C(coj.d(r14), null, 0, new crq(hkkVar, new ipg(this, 0), (uhb) null, 8), 3);
            fdqVar.j().d(this.m.dK(new fyo(this, 2), outVar));
            our ourVarJ3 = fdqVar.j();
            mwq mwqVar = this.af;
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this, null);
            mwqVar.a.add(ambientController);
            ourVarJ3.d(new loe(mwqVar, ambientController, 8));
            this.E = owb.a(owl.h(this.p, new idb(2)));
            this.F = owb.a(owl.h(this.R, new idb(3)));
            fdqVar.j().d(owl.a(owfVar, owfVar2, gntVar.b, this.s, this.f, this.E, this.F, this.V).dK(new htf(this, 2), outVar));
        }
    }

    @Override // defpackage.iqj
    public final void d(mxj mxjVar, mxm mxmVar) {
        this.D = mxjVar;
        this.C = mxmVar;
        nbb nbbVar = this.w;
        if (nbbVar != null) {
            nbbVar.h(mxmVar);
            this.w.j(true != this.D.equals(mxj.TABLET_LAYOUT) ? 5 : 17);
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        this.aa = mxmVar;
        r();
        this.k.ifPresent(new fxu(mxjVar, mxmVar, 10));
    }

    @Override // defpackage.dub
    public final void ei(dua duaVar) {
        this.Y = duaVar;
    }

    @Override // defpackage.jhf
    public final void ej() {
        this.b.A(this.ah);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [cwh, java.lang.Object] */
    @Override // defpackage.iqj
    public final void ek(final iqh iqhVar, final boolean z) {
        syu syuVarM;
        iqh iqhVar2 = iqh.JUPITER;
        int i = 1;
        if (!iqhVar.equals(iqhVar2)) {
            if (((muj) this.e.dL()).b != 2) {
                synchronized (this) {
                    owq owqVar = this.m;
                    syuVarM = !((Boolean) owqVar.dL()).booleanValue() ? ske.M(true) : (this.J == null && ((Boolean) owqVar.dL()).booleanValue()) ? ske.F(this.ab, this.ac).a(new ire(i), this.P) : ske.M(false);
                }
                ojl.cj(syuVarM, new paf() { // from class: ipf
                    /* JADX WARN: Type inference failed for: r11v2, types: [cwh, java.lang.Object] */
                    @Override // defpackage.paf
                    public final void a(Object obj) {
                        ipk ipkVar = this.a;
                        owq owqVar2 = ipkVar.q;
                        iqh iqhVar3 = iqhVar;
                        Boolean bool = (Boolean) obj;
                        owqVar2.a(iqhVar3);
                        iqh iqhVar4 = iqh.SATURN;
                        boolean zEquals = iqhVar3.equals(iqhVar4);
                        boolean z2 = z;
                        if (zEquals) {
                            ipkVar.B = Optional.of(ipkVar.N.h((nkw) ipkVar.d.dL(), iqhVar4, 1, sqg.UNKNOWN_ANIMATION_STAGE, z2, iqm.b(ipkVar.H)));
                        }
                        if (iqhVar3.equals(iqh.URANUS)) {
                            ipkVar.u.set(z2);
                        }
                        bool.getClass();
                        if (bool.booleanValue()) {
                            hkk hkkVar = ipkVar.M;
                            ukc.C(coj.d(hkkVar.d), null, 0, new crq(hkkVar, (dtz) ipkVar, (uhb) null, 10), 3);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (((Boolean) this.l.dL()).booleanValue()) {
            return;
        }
        luj lujVar = this.H;
        if (!((Boolean) lujVar.b(luf.aQ)).booleanValue() && !this.K.p(gzo.aO)) {
            this.h.a(new View.OnClickListener() { // from class: ipe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.ek(iqh.JUPITER, z);
                }
            });
            return;
        }
        this.ad.d(luf.aR, true);
        this.q.a(iqhVar2);
        this.B = Optional.of(this.N.h((nkw) this.d.dL(), iqhVar2, 1, sqg.UNKNOWN_ANIMATION_STAGE, z, iqm.b(lujVar)));
        hkk hkkVar = this.M;
        ukc.C(coj.d(hkkVar.d), null, 0, new crq(hkkVar, (dub) this, (uhb) null, 11), 3);
    }

    @Override // defpackage.dtz
    public final synchronized void el(dtm dtmVar) {
        Window window;
        if (h(iqh.SATURN)) {
            k();
            ipt iptVar = this.I;
            Context context = dtmVar.a;
            owf owfVar = this.d;
            SurfaceView surfaceViewA = iptVar.a(context);
            if (((nkw) owfVar.dL()).c()) {
                j(surfaceViewA);
                ConstraintLayout constraintLayout = this.A;
                constraintLayout.getClass();
                dtmVar.b(constraintLayout);
            } else {
                dtmVar.b(surfaceViewA);
            }
        } else if (h(iqh.URANUS) && (window = dtmVar.b) != null) {
            this.k.ifPresent(new glw(this, dtmVar, window, 5));
        }
        this.J = dtmVar;
        r();
    }

    @Override // defpackage.dub, defpackage.dtz
    public final synchronized void em() {
        this.Y = null;
        this.J = null;
        owq owqVar = this.m;
        if (((Boolean) owqVar.dL()).booleanValue()) {
            q(dtp.d);
        }
        owq owqVar2 = this.q;
        if (((iqh) owqVar2.dL()).equals(iqh.JUPITER) && !((Boolean) this.l.dL()).booleanValue()) {
            owqVar2.a(iqh.NONE);
        }
        if ((((iqh) owqVar2.dL()).equals(iqh.SATURN) || ((iqh) owqVar2.dL()).equals(iqh.URANUS)) && !((Boolean) owqVar.dL()).booleanValue()) {
            owqVar2.a(iqh.NONE);
        }
        if (!this.ac.isDone()) {
            this.ac.e(true);
        }
        this.B.ifPresent(new gqw(16));
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.b.B(this.ah);
    }

    @Override // defpackage.iqj
    public final synchronized void f() {
        dtm dtmVar;
        if (this.X.get() && (dtmVar = this.J) != null) {
            dtmVar.a();
            this.J = null;
            this.ab.cancel(false);
            this.ab = new szh();
            this.ac.cancel(false);
            this.ac = new szh();
            this.I.b = true;
            ske.F(this.ab, this.ac).c(new ild(this, 8), sxo.a);
        }
    }

    @Override // defpackage.iqj
    public final boolean g(iqh iqhVar) {
        owf owfVar;
        int iOrdinal = iqhVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            owf owfVar2 = this.E;
            return owfVar2 != null && ((Boolean) owfVar2.dL()).booleanValue();
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return (((muj) this.e.dL()).b != 4 || ((Boolean) this.s.dL()).booleanValue() || ((Boolean) this.f.dL()).booleanValue() || (owfVar = this.F) == null || !((Boolean) owfVar.dL()).booleanValue()) ? false : true;
        }
        throw new IllegalArgumentException("unsupported FoldableFeatureEntryOption: ".concat(String.valueOf(String.valueOf(iqhVar))));
    }

    @Override // defpackage.iqj
    public final boolean h(iqh iqhVar) {
        return ((iqh) this.q.dL()).equals(iqhVar);
    }

    @Override // defpackage.iqj
    public final boolean i(nkw nkwVar, iqh iqhVar) {
        int iOrdinal = iqhVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return !iqi.b.contains(nkwVar);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return nkwVar.equals(nkw.PHOTO);
            }
            throw new IllegalArgumentException("unsupported FoldableFeatureEntryOption: ".concat(String.valueOf(String.valueOf(iqhVar))));
        }
        if (nkwVar.equals(nkw.PHOTO)) {
            return true;
        }
        if (nkwVar.equals(nkw.PORTRAIT) && this.K.p(gza.r)) {
            return true;
        }
        if (nkwVar.equals(nkw.COTTAGE) && this.K.p(gyi.u)) {
            return true;
        }
        return nkwVar.equals(nkw.VIDEO) && this.K.p(gza.s) && ((ksa) this.V.dL()).equals(ksa.AMETHYST_OFF);
    }

    public final void j(SurfaceView surfaceView) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.Z == null || this.A == null) {
            return;
        }
        int iGenerateViewId = View.generateViewId();
        surfaceView.setId(iGenerateViewId);
        ConstraintLayout constraintLayout = this.A;
        constraintLayout.getClass();
        constraintLayout.addView(surfaceView);
        cku ckuVar = new cku();
        ConstraintLayout constraintLayout2 = this.A;
        constraintLayout2.getClass();
        ckuVar.g(constraintLayout2);
        ckuVar.i(iGenerateViewId, 3, 0, 3);
        ckuVar.i(iGenerateViewId, 4, 0, 4);
        ckuVar.i(iGenerateViewId, 6, 0, 6);
        ckuVar.i(iGenerateViewId, 7, 0, 7);
        ConstraintLayout constraintLayout3 = this.A;
        constraintLayout3.getClass();
        ckuVar.c(constraintLayout3);
        ElapsedTimerView elapsedTimerView = this.Z;
        elapsedTimerView.getClass();
        elapsedTimerView.bringToFront();
    }

    public final void k() {
        ConstraintLayout constraintLayout = this.A;
        if (constraintLayout == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) constraintLayout.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.A);
        }
        int i = -1;
        for (int i2 = 0; i2 < this.A.getChildCount(); i2++) {
            if (true == (this.A.getChildAt(i2) instanceof SurfaceView)) {
                i = i2;
            }
        }
        if (i != -1) {
            this.A.removeViewAt(i);
        }
    }

    @Override // defpackage.jfz
    public final void l(boolean z) {
        this.X.set(z);
    }

    public final void m() {
        if (this.K.p(gza.b)) {
            owf owfVar = this.d;
            if (((nkw) owfVar.dL()).c()) {
                owq owqVar = this.o;
                ovx ovxVar = (ovx) owqVar;
                if (qpt.bC(((Integer) ovxVar.d).intValue()) == 2) {
                    this.z = (Integer) ovxVar.d;
                    owqVar.a(Integer.valueOf(qpt.bB(1)));
                    return;
                }
            }
            if (((nkw) owfVar.dL()).c()) {
                return;
            }
            owq owqVar2 = this.n;
            ovx ovxVar2 = (ovx) owqVar2;
            if (qpt.bH(((Integer) ovxVar2.d).intValue()) == 3) {
                this.y = (Integer) ovxVar2.d;
                owqVar2.a(1);
            }
        }
    }

    public final void n(iqh iqhVar, iqg iqgVar) {
        nbb nbbVar = this.w;
        if (nbbVar != null) {
            nbbVar.dismiss();
        }
        Collection.EL.stream(this.t).filter(new fme(iqhVar, 15)).findFirst().ifPresent(new glw(this, iqgVar, iqhVar, 4, (byte[]) null));
    }

    public final void o() {
        dua duaVar = this.Y;
        if (duaVar != null) {
            duaVar.a();
            this.Y = null;
            return;
        }
        try {
            dua duaVar2 = (dua) ukc.B(new htc(this.M, (uhb) null, 4));
            if (duaVar2 != null) {
                duaVar2.a();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void p() {
        if (((Boolean) this.l.dL()).booleanValue()) {
            o();
        } else {
            ek(iqh.JUPITER, false);
        }
    }

    final void q(dtp dtpVar) {
        owq owqVar = this.R;
        if (!((dtp) owqVar.dL()).equals(dtpVar)) {
            owqVar.dL();
            owqVar.a(dtpVar);
        }
        boolean zEquals = Objects.equals(dtp.e, dtpVar);
        owq owqVar2 = this.m;
        if (zEquals != ((Boolean) owqVar2.dL()).booleanValue()) {
            owqVar2.a(Boolean.valueOf(zEquals));
            if (!zEquals) {
                if (h(iqh.SATURN)) {
                    this.I.c();
                    k();
                } else if (h(iqh.URANUS)) {
                    this.k.ifPresent(new gqw(15));
                    fvu fvuVar = this.b;
                    fvuVar.f(fvv.MENU_UI_SHOWED);
                    fvuVar.a.q(fvo.CENTER_RIGHT, rvk.a);
                }
                this.q.a(iqh.NONE);
            } else if (h(iqh.URANUS)) {
                fvu fvuVar2 = this.b;
                fvuVar2.e(fvv.MENU_UI_SHOWED);
                CameraSwitchButton cameraSwitchButton = fvuVar2.b;
                fvuVar2.a.q(fvo.CENTER_RIGHT, rwc.j(cameraSwitchButton));
            }
        }
        if (dtp.b.equals(dtpVar)) {
            this.b.e(fvv.WINDOW_AREA_STATUS_CHANGED);
        } else {
            this.b.f(fvv.WINDOW_AREA_STATUS_CHANGED);
        }
        if (Objects.equals(dtpVar, dtp.d) && !this.ab.isDone()) {
            this.ab.e(true);
        }
        owqVar2.dL();
    }

    public final synchronized void r() {
        Window window;
        int iB;
        int i;
        dtm dtmVar = this.J;
        if (dtmVar != null && (window = dtmVar.b) != null) {
            if (h(iqh.SATURN)) {
                iB = (int) (((nkw) this.d.dL()).c() ? this.T.d() + (-1) != 0 ? pae.c : pae.b : qpt.bI(this.T.e(pka.BACK))).k().b(1080.0f);
                i = true != this.aa.d() ? iB : 1080;
                if (true != this.aa.d()) {
                    iB = 1080;
                }
            } else if (h(iqh.URANUS)) {
                i = window.getWindowManager().getCurrentWindowMetrics().getBounds().right;
                iB = window.getWindowManager().getCurrentWindowMetrics().getBounds().bottom;
            } else {
                iB = 0;
                i = 0;
            }
            window.setLayout(i, iB);
            window.setGravity(17);
            window.addFlags(8);
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
