package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.optionsbar.view.AutobahnViewPager;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelContent;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelCoordinator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krj implements mxl, ksc {
    public static final sgv a = sgv.g("krj");
    public final boolean A;
    public final krl B;
    public final owq D;
    public final owf E;
    public final owf F;
    public final ngw G;
    public final boolean H;
    public krs I;
    public nfc J;
    public final our L;
    public final kqy M;
    public mte N;
    public int O;
    public final hbj P;
    public final mwq Q;
    private final fvu S;
    private final rww T;
    private Size V;
    private ObjectAnimator Y;
    private final imi Z;
    private final qqq aa;
    public final Context b;
    public final owf c;
    public final out d;
    public final pbn e;
    public boolean g;
    public pka h;
    public OptionsMenuContainer k;
    public OptionsPanelCoordinator l;
    public View m;
    public BottomSheetBehavior n;
    public OptionsPanelContent o;
    public TabLayout p;
    public AutobahnViewPager q;
    public OptionsMenuContainer r;
    public OptionsMenuContainer s;
    public OptionsMenuView t;
    public OptionsMenuView u;
    public final ksc v;
    public ktf w;
    public final scn z;
    public boolean f = true;
    public kru i = new kru() { // from class: kra
        @Override // defpackage.kru
        public final void a() {
        }
    };
    public krv j = new krv() { // from class: krb
        @Override // defpackage.krv
        public final void a() {
        }
    };
    private final AtomicBoolean R = new AtomicBoolean();
    public final AtomicBoolean x = new AtomicBoolean(true);
    public final Set y = ConcurrentHashMap.newKeySet();
    public final ArrayList C = new ArrayList();
    private mxm W = mxm.PORTRAIT;
    private mxj X = mxj.PHONE_LAYOUT;
    public nkw K = nkw.UNINITIALIZED;
    private final Set U = new HashSet();

    public krj(Context context, owf owfVar, out outVar, pbn pbnVar, our ourVar, mdy mdyVar, owq owqVar, kqy kqyVar, Set set, krl krlVar, hbj hbjVar, rww rwwVar, owf owfVar2, fvu fvuVar, qqq qqqVar, owf owfVar3, mwq mwqVar, ngw ngwVar, imi imiVar) {
        this.b = context;
        this.c = owfVar;
        this.d = outVar;
        this.e = pbnVar;
        this.L = ourVar;
        this.M = kqyVar;
        this.z = scn.F(set);
        this.B = krlVar;
        this.v = mdyVar;
        this.D = owqVar;
        this.A = hbjVar.o(hal.a);
        this.T = rwwVar;
        this.E = owfVar2;
        this.S = fvuVar;
        this.aa = qqqVar;
        this.P = hbjVar;
        this.F = owfVar3;
        this.Q = mwqVar;
        this.G = ngwVar;
        this.Z = imiVar;
        this.H = hbjVar.p(gzo.bw);
    }

    private final void A(View view, Context context) {
        view.setOnClickListener(new fvp(this, 9));
        view.setOnLongClickListener(new nym(context, 1));
    }

    private final void z() {
        OptionsMenuContainer optionsMenuContainer = this.r;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.i();
        } else {
            this.k.i();
        }
        this.M.i(q());
        rnt.s(r());
    }

    public final OptionsMenuView a(krz krzVar) {
        OptionsMenuView optionsMenuView;
        return (krzVar.dZ() == kry.PRO && this.A && (optionsMenuView = this.u) != null) ? optionsMenuView : this.t;
    }

    public final nkw d() {
        return (nkw) this.c.dL();
    }

    public final paq e() {
        return this.w.a();
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) throws Resources.NotFoundException {
        Object objFr = this.T.fr();
        objFr.getClass();
        boolean zT = t();
        Size size = ((mxu) objFr).a.b;
        if (zT && (this.X != mxjVar || (this.W == mxmVar && !Objects.equals(this.V, size)))) {
            OptionsPanelContent optionsPanelContent = this.o;
            boolean z = optionsPanelContent.e.b() || mxjVar.b();
            optionsPanelContent.e = mxjVar;
            optionsPanelContent.f = mxmVar;
            optionsPanelContent.d();
            optionsPanelContent.e();
            if (z) {
                optionsPanelContent.h = true;
            }
        }
        this.V = size;
        this.X = mxjVar;
        if (this.P.p(gzo.bw)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.getLayoutParams();
            Context context = this.b;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.options_button_freeway_left_margin);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.options_button_freeway_bottom_margin);
            if (((mxj) this.E.dL()).equals(mxj.TABLET_LAYOUT)) {
                layoutParams.leftMargin = dimensionPixelSize;
                layoutParams.bottomMargin = dimensionPixelSize2;
                layoutParams.gravity = 80;
            } else {
                layoutParams.gravity = 19;
                layoutParams.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.options_button_left_margin));
                layoutParams.bottomMargin = 0;
                layoutParams.setMarginEnd(0);
            }
            this.w.setLayoutParams(layoutParams);
        }
        mxm mxmVar2 = this.W;
        if (mxmVar2 != mxmVar) {
            this.W = mxmVar;
            this.l.j = mxmVar;
            if (!t() || mxjVar.a()) {
                return;
            }
            float fA = this.o.a();
            OptionsPanelContent optionsPanelContent2 = this.o;
            optionsPanelContent2.f = mxmVar;
            optionsPanelContent2.d();
            AnimatorSet animatorSet = optionsPanelContent2.g;
            if (animatorSet == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(optionsPanelContent2, "alpha", 0.0f);
                objectAnimatorOfFloat.setDuration(83L).setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new ktr(optionsPanelContent2));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(optionsPanelContent2, "alpha", 1.0f);
                objectAnimatorOfFloat2.setDuration(167L).setInterpolator(new LinearInterpolator());
                optionsPanelContent2.g = new AnimatorSet();
                optionsPanelContent2.g.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                optionsPanelContent2.g.addListener(new nlg(optionsPanelContent2));
            } else {
                animatorSet.cancel();
            }
            optionsPanelContent2.g.start();
            if (mxmVar2.d() != mxmVar.d()) {
                float fA2 = this.o.a();
                if (fA2 != fA) {
                    ViewGroup.LayoutParams layoutParams2 = this.m.getLayoutParams();
                    layoutParams2.getClass();
                    OptionsPanelContent optionsPanelContent3 = this.o;
                    layoutParams2.height = Math.max(optionsPanelContent3.b(mxm.PORTRAIT), optionsPanelContent3.b(mxm.LANDSCAPE));
                    this.m.setLayoutParams(layoutParams2);
                    if (this.m.getTranslationY() != 0.0f) {
                        fA = this.m.getTranslationY();
                    }
                    this.m.setTranslationY(fA);
                    ObjectAnimator objectAnimator = this.Y;
                    if (objectAnimator == null) {
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.m, "translationY", fA2);
                        this.Y = objectAnimatorOfFloat3;
                        objectAnimatorOfFloat3.setDuration(500L).setInterpolator(new cvl());
                        this.Y.addListener(new nlg(this.m));
                        this.Y.addListener(new kre(this));
                    } else {
                        objectAnimator.cancel();
                        this.Y.setFloatValues(fA2);
                    }
                    this.Y.start();
                }
            }
        }
    }

    public final void f(Stream stream) {
        stream.filter(new jjj(this, 7)).forEach(new ird(this, 16));
    }

    public final void g(ksf ksfVar) {
        OptionsMenuContainer optionsMenuContainer = this.r;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.f(ksfVar);
        } else {
            this.k.f(ksfVar);
        }
    }

    public final void h() {
        OptionsMenuContainer optionsMenuContainer = this.r;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.h();
        } else {
            this.k.h();
        }
        this.M.i(q());
        rnt.s(!r());
    }

    @Deprecated
    public final void i() {
        if (r()) {
            return;
        }
        z();
    }

    public final void j() throws Resources.NotFoundException {
        if (!this.k.m()) {
            this.k.b.c();
            nlr nlrVar = this.M.e;
            if (nlrVar != null) {
                nlrVar.c();
            }
            this.w.b();
        }
        z();
    }

    public final void k() throws Resources.NotFoundException {
        h();
        if (this.k.m()) {
            OptionsMenuContainer optionsMenuContainer = this.k;
            optionsMenuContainer.b.d();
            Iterable$EL.forEach(optionsMenuContainer.e, new irn(17));
            this.w.c();
        }
        nlr nlrVar = this.M.e;
        if (nlrVar != null) {
            nlrVar.d();
        }
    }

    public final void l(ksf ksfVar) {
        OptionsMenuContainer optionsMenuContainer = this.r;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.j(ksfVar);
        } else {
            this.k.j(ksfVar);
        }
    }

    public final void m(boolean z, krs krsVar) {
        boolean zT;
        int i = 0;
        if (z) {
            this.d.c(new kee(this, krsVar, 6));
            zT = false;
        } else {
            zT = t();
        }
        AtomicBoolean atomicBoolean = this.x;
        Set set = this.y;
        set.size();
        int i2 = 1;
        if (krsVar == null) {
            atomicBoolean.set(true);
        } else {
            set.add(krsVar);
        }
        if (zT) {
            p();
            this.d.c(new kdx(this, 20));
        } else if (!((nkw) this.c.dL()).d() || this.k.l()) {
            this.d.c(new krc(this, i));
        } else {
            this.d.c(new krc(this, i2));
        }
    }

    public final void n(boolean z) {
        paq fgpVar;
        int i = 11;
        if (!z) {
            Set set = this.U;
            Iterable$EL.forEach(set, new jgf(i));
            set.clear();
            return;
        }
        Set set2 = this.U;
        set2.add(this.S.a());
        set2.add(this.aa.i());
        kqy kqyVar = this.M;
        int importantForAccessibility = kqyVar.d.getImportantForAccessibility();
        kqyVar.d.setImportantForAccessibility(4);
        set2.add(new iti(kqyVar, importantForAccessibility, 2));
        set2.add(e());
        nfc nfcVar = this.J;
        nfcVar.getClass();
        set2.add(nfcVar.a());
        mte mteVar = this.N;
        mteVar.getClass();
        set2.add(mteVar.c());
        ((FrameLayout) this.G.d).setImportantForAccessibility(4);
        set2.add(new khc(this, 3));
        imi imiVar = this.Z;
        synchronized (imi.a) {
            imj imjVar = imiVar.q;
            fgpVar = imjVar == null ? new fgp(11) : imjVar.d();
        }
        set2.add(fgpVar);
    }

    public final void o(krz krzVar) {
        int i;
        krs krsVarH = krzVar.h();
        int i2 = 0;
        if (!a(krzVar).C(krsVarH)) {
            krzVar.ed(this.M, false);
            return;
        }
        boolean zO = krzVar.o(this);
        krzVar.ed(this.M, zO);
        if (!zO) {
            int iEI = krzVar.eI();
            String string = iEI > 0 ? this.b.getResources().getString(iEI) : null;
            OptionsMenuView optionsMenuViewA = a(krzVar);
            synchronized (optionsMenuViewA) {
                Collection.EL.stream(optionsMenuViewA.h).filter(new jjj(krsVarH, 16)).forEach(new ktp(string, 2));
            }
            return;
        }
        OptionsMenuView optionsMenuViewA2 = a(krzVar);
        synchronized (optionsMenuViewA2) {
            i = 19;
            Collection.EL.stream(optionsMenuViewA2.h).filter(new jjj(krsVarH, 13)).forEach(new irn(i));
        }
        sbp sbpVarL = krzVar.l();
        int size = sbpVarL.size();
        for (int i3 = 0; i3 < size; i3++) {
            ksa ksaVar = (ksa) sbpVarL.get(i3);
            if (krzVar.w(this.M, ksaVar)) {
                OptionsMenuView optionsMenuViewA3 = a(krzVar);
                krs krsVarH2 = krzVar.h();
                synchronized (optionsMenuViewA3) {
                    Collection.EL.stream(optionsMenuViewA3.h).filter(new glx(krsVarH2, 14)).forEach(new ird(ksaVar, i));
                }
            } else {
                OptionsMenuView optionsMenuViewA4 = a(krzVar);
                krs krsVarH3 = krzVar.h();
                synchronized (optionsMenuViewA4) {
                    Collection.EL.stream(optionsMenuViewA4.h).filter(new jjj(krsVarH3, 12)).forEach(new ktp(ksaVar, i2));
                }
            }
        }
    }

    public final void p() {
        AtomicBoolean atomicBoolean = this.x;
        atomicBoolean.get();
        Set set = this.y;
        set.size();
        out.d();
        if (atomicBoolean.get()) {
            this.d.c(new krc(this, 1));
        } else {
            if (set.isEmpty()) {
                return;
            }
            this.d.c(new krc(this, 3));
        }
    }

    public final boolean q() {
        if (!this.y.isEmpty() || this.x.get()) {
            return Collection.EL.stream(this.z).anyMatch(new jjj(this, 8));
        }
        OptionsMenuContainer optionsMenuContainer = this.r;
        return optionsMenuContainer != null ? optionsMenuContainer.e().x() > 0 : this.k.e().x() > 0;
    }

    public final boolean r() {
        OptionsMenuContainer optionsMenuContainer = this.r;
        return optionsMenuContainer != null ? optionsMenuContainer.isEnabled() : this.k.isEnabled();
    }

    public final /* synthetic */ boolean s() {
        return pka.FRONT.equals(this.h);
    }

    public final boolean t() {
        BottomSheetBehavior bottomSheetBehavior = this.n;
        return bottomSheetBehavior != null ? bottomSheetBehavior.x == 3 : this.k.a().getVisibility() == 0;
    }

    public final boolean u(PointF pointF) {
        return ojl.bk(pointF, this.m);
    }

    public final void v(int i) {
        boolean zBooleanValue = ((Boolean) this.D.dL()).booleanValue();
        nkw nkwVarD = d();
        if (zBooleanValue) {
            this.r.n();
            BottomSheetBehavior bottomSheetBehavior = this.n;
            if (bottomSheetBehavior != null) {
                this.O = i;
                bottomSheetBehavior.ar(5);
                this.w.d(false);
                return;
            }
            this.k.n();
            krl krlVar = this.B;
            pka pkaVar = this.h;
            pkaVar.getClass();
            krlVar.c = pkaVar;
            krlVar.b = nkwVarD;
            krlVar.b();
        }
    }

    @Override // defpackage.ksc
    public final void w(final ksa ksaVar, final krs krsVar, final int i) {
        scn scnVar = this.z;
        if (Collection.EL.stream(scnVar).noneMatch(new krd(krsVar, ksaVar, 0))) {
            return;
        }
        Collection.EL.stream(scnVar).filter(new krd(krsVar, ksaVar, 1)).forEach(new Consumer() { // from class: kqz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void d(Object obj) {
                owq owqVarJ = ((krz) obj).j();
                ksa ksaVar2 = ksaVar;
                owqVarJ.a(ksaVar2);
                this.a.v.w(ksaVar2, krsVar, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection.EL.stream(scnVar).filter(new jjj(krsVar, 6)).forEach(new gok(this, 18));
    }

    public final void x(int i) {
        y(i, null);
    }

    public final void y(int i, krs krsVar) {
        View viewD;
        ArrayList arrayList;
        int i2 = 8;
        if (this.R.compareAndSet(false, true)) {
            Context context = this.b;
            boolean z = this.H;
            if (z) {
                viewD = this.m.findViewById(R.id.options_menu_more_button);
            } else {
                this.m.findViewById(R.id.options_menu_more_button).setVisibility(8);
                OptionsMenuContainer optionsMenuContainer = this.r;
                if (optionsMenuContainer != null) {
                    viewD = optionsMenuContainer.d();
                    OptionsMenuContainer optionsMenuContainer2 = this.s;
                    if (optionsMenuContainer2 != null) {
                        View viewD2 = optionsMenuContainer2.d();
                        A(viewD2, context);
                        viewD2.setVisibility(0);
                    }
                } else {
                    viewD = this.k.d();
                }
            }
            viewD.setVisibility(0);
            A(viewD, context);
            yf yfVar = new yf();
            yf yfVar2 = new yf();
            scn scnVar = this.z;
            int i3 = 19;
            Iterable$EL.forEach(scnVar, new fxu(yfVar, yfVar2, i3));
            if (!yfVar2.isEmpty()) {
                ((sgt) a.c().M(3419)).s("wire: Some menu items have the same category:");
                Collection.EL.stream(scnVar).filter(new glx(yfVar2, i2)).forEach(new jgf(12));
            }
            Iterable$EL.forEach(scnVar, new gok(this, i3));
            Iterable$EL.forEach(scnVar, new gok(this, 20));
            if (this.A) {
                AutobahnViewPager autobahnViewPager = (AutobahnViewPager) this.m.findViewById(R.id.viewpager);
                this.q = autobahnViewPager;
                if (z) {
                    TabLayout tabLayout = (TabLayout) this.m.findViewById(R.id.tabLayout);
                    this.p = tabLayout;
                    tabLayout.n(ojl.aL(tabLayout), ojl.aJ(this.p));
                } else {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) autobahnViewPager.getLayoutParams();
                    this.m.findViewById(R.id.tabLayout).setVisibility(8);
                    TabLayout tabLayout2 = (TabLayout) this.m.findViewById(R.id.tabLayout_legacy);
                    this.p = tabLayout2;
                    tabLayout2.n(ojl.aM(tabLayout2), ojl.aJ(this.p));
                    this.p.setVisibility(0);
                    if (layoutParams != null) {
                        layoutParams.leftMargin = context.getResources().getDimensionPixelSize(R.dimen.bottom_panel_side_margin_options);
                        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.bottom_panel_side_margin_options);
                        layoutParams.bottomMargin = 0;
                        this.q.setLayoutParams(layoutParams);
                    }
                }
                this.C.add(this.r);
                kri kriVar = new kri(this);
                AutobahnViewPager autobahnViewPager2 = this.q;
                dia diaVar = autobahnViewPager2.d;
                if (diaVar != null) {
                    diaVar.c(null);
                    dia diaVar2 = autobahnViewPager2.d;
                    int i4 = 0;
                    while (true) {
                        arrayList = autobahnViewPager2.c;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        did didVar = (did) arrayList.get(i4);
                        dia diaVar3 = autobahnViewPager2.d;
                        int i5 = didVar.b;
                        diaVar3.d(didVar.a);
                        i4++;
                    }
                    dia diaVar4 = autobahnViewPager2.d;
                    arrayList.clear();
                    int i6 = 0;
                    while (i6 < autobahnViewPager2.getChildCount()) {
                        if (!((die) autobahnViewPager2.getChildAt(i6).getLayoutParams()).a) {
                            autobahnViewPager2.removeViewAt(i6);
                            i6--;
                        }
                        i6++;
                    }
                    autobahnViewPager2.e = 0;
                    autobahnViewPager2.scrollTo(0, 0);
                }
                dia diaVar5 = autobahnViewPager2.d;
                autobahnViewPager2.d = kriVar;
                autobahnViewPager2.b = 0;
                if (autobahnViewPager2.d != null) {
                    if (autobahnViewPager2.i == null) {
                        autobahnViewPager2.i = new dih(autobahnViewPager2);
                    }
                    autobahnViewPager2.d.c(autobahnViewPager2.i);
                    autobahnViewPager2.j = false;
                    boolean z2 = autobahnViewPager2.m;
                    autobahnViewPager2.m = true;
                    autobahnViewPager2.b = autobahnViewPager2.d.a();
                    int i7 = autobahnViewPager2.f;
                    if (i7 >= 0) {
                        dia diaVar6 = autobahnViewPager2.d;
                        Parcelable parcelable = autobahnViewPager2.g;
                        ClassLoader classLoader = autobahnViewPager2.h;
                        autobahnViewPager2.i(i7, false, true);
                        autobahnViewPager2.f = -1;
                        autobahnViewPager2.g = null;
                        autobahnViewPager2.h = null;
                    } else if (z2) {
                        autobahnViewPager2.requestLayout();
                    } else {
                        autobahnViewPager2.f();
                    }
                }
                List list = autobahnViewPager2.o;
                if (list != null && !list.isEmpty()) {
                    int size = autobahnViewPager2.o.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        rph rphVar = (rph) autobahnViewPager2.o.get(i8);
                        TabLayout tabLayout3 = rphVar.b;
                        if (tabLayout3.A == autobahnViewPager2) {
                            tabLayout3.l(kriVar, rphVar.a);
                        }
                    }
                }
                this.q.d(new krf(this));
                rpn rpnVarD = this.p.d();
                rpnVarD.c(R.string.options_bottom_tab_first);
                this.p.f(rpnVarD);
                rpn rpnVarD2 = this.p.d();
                rpnVarD2.c(R.string.options_bottom_tab_second_photo);
                this.p.f(rpnVarD2);
                for (int i9 = 0; i9 < this.p.b(); i9++) {
                    View childAt = ((ViewGroup) this.p.getChildAt(0)).getChildAt(i9);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginLayoutParams.getClass();
                    marginLayoutParams.setMargins(2, 0, 2, 0);
                    childAt.requestLayout();
                }
                this.p.e(new krg(this));
            }
        }
        boolean zT = t();
        this.I = krsVar;
        OptionsMenuContainer optionsMenuContainer3 = this.r;
        if (optionsMenuContainer3 == null || zT || !optionsMenuContainer3.isEnabled()) {
            return;
        }
        this.m.setVisibility(0);
        Context context2 = this.b;
        owf owfVar = this.c;
        Resources resources = context2.getResources();
        nkw nkwVar = (nkw) owfVar.dL();
        String string = resources.getString(R.string.options_bottom_title, nkt.a(nkwVar).c(resources));
        this.m.setContentDescription(string);
        ((TextView) this.m.findViewById(R.id.bottom_options_text)).setText(string);
        p();
        if (this.A) {
            if (Collection.EL.stream(this.z).anyMatch(new glx(this, 11))) {
                ArrayList arrayList2 = this.C;
                if (arrayList2.size() == 1) {
                    arrayList2.add(this.s);
                    dia diaVar7 = this.q.d;
                    diaVar7.getClass();
                    diaVar7.b();
                }
                if (this.p.b() == 2) {
                    this.p.c(1).d(!nkwVar.c() ? context2.getString(R.string.options_bottom_tab_second_photo) : context2.getString(R.string.options_bottom_tab_second_video));
                }
                TabLayout tabLayout4 = this.p;
                tabLayout4.getClass();
                tabLayout4.setVisibility(0);
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bottom_panel_tab_vertical_inset);
                for (int i10 = 0; i10 < this.p.b(); i10++) {
                    rpn rpnVarC = this.p.c(i10);
                    rpnVarC.getClass();
                    rpp rppVar = rpnVarC.h;
                    Drawable background = rppVar.getBackground();
                    if (!(background instanceof InsetDrawable)) {
                        rppVar.setBackground(new InsetDrawable(background, 0, dimensionPixelSize, 0, dimensionPixelSize));
                    }
                }
                this.q.p = true;
            } else {
                TabLayout tabLayout5 = this.p;
                tabLayout5.getClass();
                tabLayout5.setVisibility(8);
                this.q.p = false;
                ArrayList arrayList3 = this.C;
                if (arrayList3.size() == 2) {
                    arrayList3.remove(1);
                    dia diaVar8 = this.q.d;
                    diaVar8.getClass();
                    diaVar8.b();
                    TabLayout tabLayout6 = this.p;
                    tabLayout6.j(tabLayout6.c(0));
                }
            }
        }
        OptionsPanelContent optionsPanelContent = this.o;
        mxj mxjVar = this.X;
        mxm mxmVar = this.W;
        optionsPanelContent.e = mxjVar;
        optionsPanelContent.f = mxmVar;
        optionsPanelContent.d();
        if (optionsPanelContent.b == null) {
            optionsPanelContent.b = (ViewGroup) optionsPanelContent.getParent();
            optionsPanelContent.c = optionsPanelContent.b.getHeight();
            optionsPanelContent.setVisibility(0);
        }
        optionsPanelContent.e();
        OptionsMenuContainer optionsMenuContainer4 = this.r;
        if (optionsMenuContainer4.isEnabled() && optionsMenuContainer4.a() != null) {
            Iterable$EL.forEach(optionsMenuContainer4.e, new irn(18));
        }
        this.B.a(i);
        this.w.d(true);
        BottomSheetBehavior bottomSheetBehavior = this.n;
        rnt.x(bottomSheetBehavior);
        bottomSheetBehavior.ar(3);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
