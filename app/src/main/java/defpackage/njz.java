package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelContent;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelCoordinator;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njz implements nkm {
    private final hbj A;
    public final uem a;
    public final rwc b;
    public final owq c;
    public final tzj d;
    public final owq e;
    public final mmk f;
    public final luk g;
    public final owq h;
    public final owf i;
    public final tzj j;
    public final owq k;
    public final fdq l;
    public final krj m;
    public final luj n;
    public final mdy o;
    public final qpt p;
    private final out q;
    private final fvu s;
    private final tzj t;
    private final syu u;
    private final nfc v;
    private final njs w;
    private final our x;
    private final luj y;
    private final mte z;

    public njz(uem uemVar, fdq fdqVar, out outVar, owq owqVar, rwc rwcVar, fvu fvuVar, krj krjVar, tzj tzjVar, tzj tzjVar2, hbj hbjVar, luj lujVar, luj lujVar2, owq owqVar2, mmk mmkVar, luk lukVar, syu syuVar, owq owqVar3, owf owfVar, mdy mdyVar, tzj tzjVar3, owq owqVar4, nfc nfcVar, mte mteVar, njs njsVar) {
        this.a = uemVar;
        this.l = fdqVar;
        this.x = fdqVar.j();
        this.q = outVar;
        this.b = rwcVar;
        this.c = owqVar;
        this.s = fvuVar;
        this.m = krjVar;
        this.d = tzjVar;
        this.t = tzjVar2;
        this.A = hbjVar;
        this.n = lujVar;
        this.y = lujVar2;
        this.e = owqVar2;
        this.f = mmkVar;
        this.g = lukVar;
        this.u = syuVar;
        this.h = owqVar3;
        this.i = owfVar;
        this.o = mdyVar;
        this.j = tzjVar3;
        this.k = owqVar4;
        this.v = nfcVar;
        this.z = mteVar;
        this.w = njsVar;
        this.p = new njv(krjVar, uemVar);
    }

    @Override // defpackage.nkm
    public final void a() throws Resources.NotFoundException {
        rnt.L(out.d());
        this.w.a();
        ngx ngxVar = (ngx) this.a;
        Object obj = ngxVar.a().o;
        ViewStub viewStub = (ViewStub) ((ocq) ngxVar.a().j).c(R.id.options_menu_entry_stub);
        hbj hbjVar = this.A;
        if (hbjVar.p(gzo.bw)) {
            viewStub.setLayoutResource(R.layout.options_menu_entry2);
        } else {
            viewStub.setLayoutResource(R.layout.options_menu_entry);
        }
        krj krjVar = this.m;
        nfc nfcVar = this.v;
        mte mteVar = this.z;
        rnt.L(out.d());
        pbn pbnVar = krjVar.e;
        pbnVar.f("OptionsBarCtrl#wireAutobahn");
        ViewStub viewStub2 = (ViewStub) obj;
        rnt.s(viewStub2.getParent() != null);
        boolean z = krjVar.A;
        if (z) {
            viewStub2.setLayoutResource(R.layout.options_bottomsheet_tab);
        } else {
            viewStub2.setLayoutResource(R.layout.options_bottomsheet);
        }
        krjVar.w = (ktf) viewStub.inflate().findViewById(R.id.options_entry_button);
        krjVar.l = (OptionsPanelCoordinator) viewStub2.inflate().findViewById(R.id.pro_options_coord);
        krjVar.m = krjVar.l.findViewById(R.id.pro_options_panel);
        TextView textView = (TextView) krjVar.m.findViewById(R.id.bottom_options_text);
        int i = 2;
        if (krjVar.H) {
            textView.setTextAppearance(ojl.aU(textView.getContext(), R.attr.textAppearanceTitleLargeEmphasized));
        } else {
            FrameLayout frameLayout = (FrameLayout) krjVar.m.findViewById(R.id.options_menu_title_row);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams != null) {
                Context context = krjVar.b;
                layoutParams.leftMargin = context.getResources().getDimensionPixelSize(R.dimen.bottom_panel_title_horizontal_margin_legacy);
                layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.bottom_panel_title_horizontal_margin_legacy);
                layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.bottom_panel_top_tab_margin_legacy);
                frameLayout.setLayoutParams(layoutParams);
            }
            textView.setTextSize(2, 20.0f);
        }
        krjVar.n = BottomSheetBehavior.c(krjVar.m);
        krjVar.r = (OptionsMenuContainer) krjVar.m.findViewById(R.id.options_menu_container);
        krjVar.k = krjVar.r;
        if (z) {
            krjVar.s = (OptionsMenuContainer) krjVar.m.findViewById(R.id.options_menu_container_second);
        }
        krjVar.o = (OptionsPanelContent) krjVar.m.findViewById(R.id.options_panel_content);
        OptionsPanelContent optionsPanelContent = krjVar.o;
        our ourVar = krjVar.L;
        owf owfVar = krjVar.F;
        out outVar = krjVar.d;
        optionsPanelContent.d = owfVar;
        ourVar.d(owfVar.dK(new ksq(optionsPanelContent, 5), outVar));
        krjVar.t = krjVar.r.e();
        krjVar.t.setAlpha(1.0f);
        krjVar.r.a().setVisibility(0);
        OptionsMenuView optionsMenuView = krjVar.t;
        optionsMenuView.k = krjVar;
        optionsMenuView.y();
        OptionsMenuView optionsMenuView2 = krjVar.t;
        mwq mwqVar = krjVar.Q;
        optionsMenuView2.m = mwqVar;
        if (z) {
            krjVar.u = krjVar.s.e();
            krjVar.u.setAlpha(1.0f);
            krjVar.s.a().setVisibility(0);
            OptionsMenuView optionsMenuView3 = krjVar.u;
            optionsMenuView3.k = krjVar;
            optionsMenuView3.y();
            krjVar.u.m = mwqVar;
        }
        krjVar.r.f(new mlf(krjVar, 1));
        int i2 = 19;
        krjVar.w.e(new kdx(krjVar, 19), new krc(krjVar, i));
        ourVar.d(krjVar.c.dK(new juf(krjVar, 12), sxo.a));
        hbj hbjVar2 = krjVar.P;
        gzi gziVar = gzq.a;
        rnt.x(krjVar.n);
        krjVar.n.ap(true);
        BottomSheetBehavior bottomSheetBehavior = krjVar.n;
        bottomSheetBehavior.v = true;
        bottomSheetBehavior.ar(5);
        krjVar.n.ak(new krh(krjVar));
        krjVar.J = nfcVar;
        krjVar.N = mteVar;
        ourVar.d(owb.a(owl.c(krjVar.D, owl.h(krjVar.E, new idb(13)))).dK(new juf(krjVar, 13), outVar));
        int i3 = 17;
        Iterable$EL.forEach(krjVar.z, new ird(krjVar, i3));
        pbnVar.g();
        Object obj2 = ngxVar.a().c;
        OptionsPanelCoordinator optionsPanelCoordinator = krjVar.l;
        mxk mxkVar = mxk.TO_LEFT;
        ((MainActivityLayout) obj2).j(optionsPanelCoordinator, mxkVar);
        krjVar.g(new njx(this));
        krjVar.g(new mlf(this, 3));
        this.s.A(new njw(this));
        if (this.b.h()) {
            this.x.d(this.y.a(luf.aO).dK(new mtd(this, i3), this.q));
        }
        if (hbjVar.p(gyj.a)) {
            our ourVar2 = this.x;
            ourVar2.d(this.c.dK(new mix(this, i2), this.q));
            ourVar2.d(((ndj) this.t.a()).e(new njy(this)));
        }
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ngxVar.a().c;
        OptionsMenuContainer optionsMenuContainer = (OptionsMenuContainer) mainActivityLayout.findViewById(R.id.options_menu_container);
        mainActivityLayout.i(krjVar, mxkVar);
        mainActivityLayout.h(optionsMenuContainer);
        Object objC = ((ocq) ngxVar.a().j).c(R.id.uncovered_preview_layout);
        ((View) objC).setFocusable(true);
        krjVar.g(new mlf(objC, 2));
        if (hbjVar.p(gzy.j) && hbjVar.p(gzy.o) && ((Integer) hbjVar.a(gzy.c).get()).intValue() == -1) {
            this.x.d(this.y.a(luf.aF).dK(new mtd(this, 18), this.q));
        }
        ojl.ck(this.u, new iyn(this, 9), this.q);
    }
}
