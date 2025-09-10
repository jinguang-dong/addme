package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrs extends nsl {
    public static final sgv ag = sgv.g("nrs");
    public nrx ah;

    public final void B(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(198153039);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            jsv.x(bdq.k(-1916771539, new asu(this, 8), aycVarC), aycVarC, 6);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 16);
        }
    }

    public final void C(nrv nrvVar, String str) {
        if (getChildFragmentManager().e(str) == null) {
            nrvVar.d(getChildFragmentManager(), str);
        }
    }

    @Override // defpackage.bb, defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bp bpVarRequireActivity = requireActivity();
        cxb viewModelStore$ar$class_merging = bpVarRequireActivity.getViewModelStore$ar$class_merging();
        cxp defaultViewModelProviderFactory = bpVarRequireActivity.getDefaultViewModelProviderFactory();
        cxy cxyVarD = cqh.d(bpVarRequireActivity);
        defaultViewModelProviderFactory.getClass();
        cxyVarD.getClass();
        gno gnoVar = new gno(viewModelStore$ar$class_merging, defaultViewModelProviderFactory, cxyVarD);
        int i = ukb.a;
        nrx nrxVar = (nrx) cxs.b(new uji(nrx.class), gnoVar);
        this.ah = nrxVar;
        if (nrxVar == null) {
            ujp.c("viewModel");
            nrxVar = null;
        }
        bgz bgzVar = nrxVar.s;
        bgzVar.clear();
        bgzVar.add(new nry(R.string.mode_settings, (Integer) null, (Object) "key_setting_title", false, 0, (uif) null, nrn.a, (ltw) null, false, 890));
        int iE = nrxVar.e(nrxVar.l());
        Integer numValueOf = Integer.valueOf(R.string.modes);
        int iC = nrxVar.c(nrxVar.l());
        jkc jkcVar = new jkc(nrxVar, 13);
        nrn nrnVar = nrn.b;
        bgzVar.add(new nry(iE, numValueOf, (Object) "key_setting_mode", false, iC, (uif) jkcVar, nrnVar, (ltw) null, false, 840));
        azr azrVar = nrxVar.g;
        bgzVar.add(new nry(nrxVar.b((pka) azrVar.a()), Integer.valueOf(R.string.menu_camera_facing_summary), (Object) "key_setting_facing", false, nrxVar.a((pka) azrVar.a()), (uif) new jkc(nrxVar, 14), nrnVar, (ltw) null, false, 840));
        int iJ = nrxVar.j(nrxVar.k());
        int iF = nrxVar.f(nrxVar.k());
        ltw ltwVarK = nrxVar.k();
        bgzVar.add(new nry(iJ, Integer.valueOf(R.string.menu_timer_summary), (Object) "key_setting_timer", ((Boolean) nrxVar.f.a()).booleanValue(), iF, (uif) new jkc(nrxVar, 15), nrnVar, ltwVarK, false, 576));
    }

    @Override // defpackage.bm
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        nrx nrxVar = this.ah;
        if (nrxVar == null) {
            ujp.c("viewModel");
            nrxVar = null;
        }
        nrxVar.t.d(this, new nrq(new nrr(this, 0)));
        Context context = layoutInflater.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.e(new bfh(521421058, true, new asu(this, 9)));
        return composeView;
    }

    @Override // defpackage.bm
    public final void onPause() {
        nrx nrxVar = this.ah;
        if (nrxVar == null) {
            ujp.c("viewModel");
            nrxVar = null;
        }
        nsk nskVar = nsk.e;
        nskVar.getClass();
        nrxVar.p.h(nskVar);
        super.e(false, false);
        super.onPause();
    }
}
