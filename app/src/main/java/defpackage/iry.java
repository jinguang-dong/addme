package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jupiter.uranus.UranusAnimationView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iry implements isb {
    public static final sbp a = sbp.n(iri.BACKGROUND, iri.CHARACTER_MAIN, iri.c);
    public static final sbp b = sbp.n(iri.BACKGROUND, iri.c, iri.CHARACTER_MAIN);
    private static final iqz u = iqz.PEEKING_CHICKEN;
    private View A;
    private syu C;
    private final irt D;
    private final luj E;
    private final gga F;
    public final out c;
    public final ira d;
    public final iru e;
    public final ito g;
    public UranusAnimationView k;
    public irs l;
    public ProgressBar m;
    public irk n;
    public nan o;
    public final mbq r;
    public final luj s;
    public final hbj t;
    private final Context v;
    private final isa w;
    private final uem x;
    private final itl y;
    private View z;
    public final ovx f = new ovx(false);
    public Rect h = new Rect();
    public Optional i = Optional.empty();
    public mxm j = mxm.PORTRAIT;
    private mxj B = mxj.PHONE_LAYOUT;
    public Optional p = Optional.empty();
    public iqz q = u;

    public iry(Context context, fdq fdqVar, hbj hbjVar, out outVar, ira iraVar, iru iruVar, irt irtVar, isa isaVar, uem uemVar, mbq mbqVar, lvq lvqVar, imi imiVar, gga ggaVar, itl itlVar, luj lujVar, luj lujVar2) {
        this.v = context;
        this.t = hbjVar;
        this.c = outVar;
        this.d = iraVar;
        this.e = iruVar;
        this.D = irtVar;
        this.w = isaVar;
        this.x = uemVar;
        this.r = mbqVar;
        this.F = ggaVar;
        this.y = itlVar;
        this.E = lujVar;
        this.s = lujVar2;
        this.g = new irw(this, lvqVar, context, imiVar);
        fdqVar.j().d(new hty(this, itlVar, 11));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, uem] */
    @Override // defpackage.isb
    public final View a(Rect rect, boolean z) {
        syu syuVarM;
        this.f.a(true);
        iqz iqzVar = this.q;
        irt irtVar = this.D;
        Object obj = irtVar.a;
        AccessibilityManager accessibilityManagerA = ((imz) irtVar.b).a();
        Context contextB = ((imm) irtVar.c).b();
        Window windowA = ((imo) irtVar.d).a();
        Handler handler = (Handler) irtVar.e.a();
        handler.getClass();
        fvu fvuVar = (fvu) irtVar.f.a();
        fvuVar.getClass();
        hbj hbjVar = (hbj) irtVar.g.a();
        hbjVar.getClass();
        ira iraVarB = ((irb) irtVar.h).a();
        irv irvVar = (irv) irtVar.i.a();
        irvVar.getClass();
        ((isc) irtVar.j.a()).getClass();
        iqzVar.getClass();
        irs irsVar = new irs(accessibilityManagerA, contextB, windowA, handler, fvuVar, hbjVar, iraVarB, irvVar, iqzVar);
        irsVar.l = this.A;
        irsVar.i(this.B, this.j);
        uem uemVar = this.x;
        isg isgVar = (isg) uemVar.a();
        int i = 0;
        irsVar.setFocusable(false);
        irsVar.setOutsideTouchable(false);
        irsVar.setWidth(irsVar.e());
        Context context = irsVar.g;
        irsVar.setHeight(context.getResources().getDimensionPixelOffset(R.dimen.character_window_height));
        irsVar.t = View.inflate(context, R.layout.popup_character_menu, null);
        irsVar.n = (ConstraintLayout) irsVar.t.findViewById(R.id.expand_collapse_layout);
        irsVar.s = (ImageButton) irsVar.t.findViewById(R.id.expand_collapse_button);
        int i2 = 10;
        irsVar.s.setOnClickListener(new ipr(irsVar, i2));
        irsVar.s.setAccessibilityDelegate(new iro(irsVar));
        cog.l(irsVar.n, new gvx(irsVar, 4));
        View view = irsVar.t;
        gzg gzgVar = gza.a;
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{ojl.aJ(view), ojl.aL(view)});
        irsVar.r = (ImageButton) view.findViewById(R.id.sound_on);
        irsVar.q = (ImageButton) view.findViewById(R.id.sound_off);
        irsVar.r.setImageTintList(colorStateList);
        irsVar.q.setImageTintList(colorStateList);
        irsVar.r.setSelected(true);
        irsVar.q.setSelected(false);
        irsVar.r.setAccessibilityDelegate(new irp(irsVar));
        irsVar.q.setAccessibilityDelegate(new irq(irsVar));
        irsVar.r.setOnClickListener(new ipr(irsVar, 9));
        irsVar.q.setOnClickListener(new ipr(irsVar, 11));
        ((ImageView) irsVar.t.findViewById(R.id.close_button)).setOnClickListener(new ipr(irsVar, 12));
        View view2 = irsVar.t;
        irsVar.k = view2.findViewById(R.id.dispatch_touch_view);
        irsVar.k.setOnTouchListener(new irl(irsVar, view2, i));
        irsVar.p = (LinearLayout) irsVar.t.findViewById(R.id.character_list);
        ArrayList arrayList = new ArrayList();
        sbp sbpVar = irsVar.a;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= ((sex) sbpVar).c) {
                ojl.ck(ske.E(arrayList).a(new ire(i4), ojl.ce()), new fct(irsVar, isgVar, 7), ojl.ce());
                irsVar.setContentView(irsVar.t);
                irsVar.m = new fjt(irsVar, 5);
                irsVar.u = Optional.of(new AmbientModeSupport.AmbientController(this));
                this.l = irsVar;
                if (irsVar.l != null) {
                    mxj mxjVar = irsVar.o;
                    mxj mxjVar2 = mxj.TABLET_LAYOUT;
                    irsVar.showAsDropDown(mxjVar.equals(mxjVar2) ? irsVar.l : irsVar.h.getDecorView(), irsVar.a(), irsVar.b(), true == irsVar.o.equals(mxjVar2) ? 0 : 5);
                    irsVar.h.getDecorView().addOnLayoutChangeListener(irsVar.m);
                    irsVar.h();
                    irsVar.o();
                }
                if (rect.width() > rect.height()) {
                    this.h = new Rect(0, 0, rect.height(), rect.width());
                } else {
                    this.h = rect;
                }
                if (!this.t.p(gza.h) && !((Boolean) this.E.b(luf.bc)).booleanValue()) {
                    isg isgVar2 = (isg) uemVar.a();
                    isgVar2.getClass();
                    ojl.cj(swz.i(isgVar2.e.q(), new fym(isgVar2, i2), isgVar2.b), new fqz(this, 6));
                }
                b(this.q, z);
                return this.z;
            }
            iqz iqzVar2 = (iqz) sbpVar.get(i3);
            ira iraVar = irsVar.i;
            int iOrdinal = iqzVar2.ordinal();
            if (iOrdinal == 0) {
                syuVarM = ske.M(Optional.ofNullable(iraVar.c.getDrawable(R.drawable.character_chickens)));
            } else if (iOrdinal == 1) {
                syuVarM = ske.M(Optional.ofNullable(iraVar.c.getDrawable(R.drawable.character_puffpufffish)));
            } else if (iOrdinal == 2) {
                syuVarM = ske.M(Optional.ofNullable(iraVar.c.getDrawable(R.drawable.character_block_buddies)));
            } else if (iOrdinal == 3) {
                syuVarM = ske.M(Optional.ofNullable(iraVar.c.getDrawable(R.drawable.character_geometric)));
            } else {
                if (iOrdinal != 4) {
                    throw new RuntimeException(null, null);
                }
                isg isgVar3 = (isg) iraVar.g.a();
                isgVar3.getClass();
                syuVarM = swz.i(isgVar3.b(), new idb(4), ojl.ce());
            }
            arrayList.add(swz.i(syuVarM, new irm(irsVar, iqzVar2, isgVar, i), ojl.ce()));
            i3++;
        }
    }

    public final void b(iqz iqzVar, boolean z) {
        sqg sqgVar;
        irk irkVar = this.n;
        if (irkVar != null) {
            irkVar.l();
        }
        int i = 2;
        byte[] bArr = null;
        if (this.p.isEmpty()) {
            gga ggaVar = this.F;
            nkw nkwVar = nkw.PHOTO;
            iqh iqhVar = iqh.URANUS;
            int iE = ira.e(iqzVar);
            iqp iqpVar = iqp.IDLE;
            sbv sbvVar = iqr.a;
            int iOrdinal = iqpVar.ordinal();
            if (iOrdinal == 0) {
                sqgVar = sqg.IDLE;
            } else if (iOrdinal == 1) {
                sqgVar = sqg.HINT;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                sqgVar = sqg.SURPRISE;
            }
            this.p = Optional.of(ggaVar.h(nkwVar, iqhVar, iE, sqgVar, z, iqm.b(this.E)));
        } else {
            Object obj = this.p.get();
            int iE2 = ira.e(iqzVar);
            iou iouVar = (iou) obj;
            nkw nkwVar2 = iouVar.b;
            sqg sqgVar2 = sqg.IDLE;
            iouVar.b(nkwVar2, iE2, sqgVar2);
            iouVar.f = iE2;
            iouVar.c = sqgVar2;
        }
        syu syuVar = this.C;
        if (syuVar != null) {
            syuVar.cancel(false);
            this.C = null;
        }
        this.C = swz.i(this.d.b(iqzVar), new hve(this, iqzVar, i, bArr), ojl.ce());
    }

    @Override // defpackage.isb
    public final void c() {
        View viewInflate = View.inflate(this.v, R.layout.uranus_layout, null);
        this.z = viewInflate;
        this.k = (UranusAnimationView) viewInflate.findViewById(R.id.uranus_animation);
        this.m = (ProgressBar) this.z.findViewById(R.id.uranus_progress_bar);
        gzg gzgVar = gza.a;
        isa isaVar = this.w;
        isaVar.g = View.inflate(isaVar.a, R.layout.uranus_unsupported_direction_hint_layout, null);
        isaVar.setFocusable(true);
        isaVar.setOutsideTouchable(false);
        isaVar.setClippingEnabled(false);
        isaVar.setContentView(isaVar.g);
        isaVar.i.j().d(this.f.dK(new ijl(isaVar, 11), out.a));
        isaVar.d = new fjt(isaVar, 6);
        this.y.f(this.g);
    }

    @Override // defpackage.isb
    public final void d(mxj mxjVar, mxm mxmVar) {
        this.j = mxmVar;
        this.B = mxjVar;
        UranusAnimationView uranusAnimationView = this.k;
        if (uranusAnimationView != null) {
            uranusAnimationView.b = mxmVar;
        }
        irs irsVar = this.l;
        if (irsVar != null) {
            irsVar.i(mxjVar, mxmVar);
        }
        isa isaVar = this.w;
        isaVar.e = mxmVar;
        isaVar.a();
        if (isaVar.f != mxjVar && isaVar.isShowing()) {
            isaVar.dismiss();
            isaVar.showAtLocation(isaVar.b.getDecorView(), 0, 0, 0);
        }
        isaVar.f = mxjVar;
    }

    @Override // defpackage.isb
    public final void e(View view) {
        this.A = view;
    }

    @Override // defpackage.isb
    public final void f() {
        this.f.a(false);
        irs irsVar = this.l;
        if (irsVar != null && irsVar.l != null) {
            irsVar.h.getDecorView().removeOnLayoutChangeListener(irsVar.m);
            irsVar.y = false;
            syu syuVar = irsVar.z;
            if (syuVar != null) {
                syuVar.cancel(false);
                irsVar.z = null;
            }
            mle mleVar = irsVar.j.e;
            if (mleVar != null) {
                mleVar.i();
            }
            irsVar.dismiss();
        }
        irk irkVar = this.n;
        if (irkVar != null) {
            irkVar.l();
        }
        syu syuVar2 = this.C;
        if (syuVar2 != null) {
            syuVar2.cancel(false);
            this.C = null;
        }
        ira iraVar = this.d;
        syu syuVar3 = iraVar.h;
        if (syuVar3 != null) {
            syuVar3.cancel(false);
        }
        for (iqz iqzVar : iqz.values()) {
            ojl.cj(iraVar.b(iqzVar), new jig(1));
        }
        View view = this.z;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.z.getParent()).removeAllViews();
        }
        this.p.ifPresent(new irn(2));
        this.p = Optional.empty();
    }

    @Override // defpackage.isb
    public final void g(int i) {
        this.p.ifPresent(new iph(i, 2));
    }

    @Override // defpackage.isb
    public final void h(AmbientModeSupport.AmbientController ambientController) {
        this.i = Optional.of(ambientController);
    }
}
