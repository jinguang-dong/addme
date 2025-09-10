package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.ComposeView;
import com.google.ar.core.R;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrv extends nsl {
    private static final sgv ak = sgv.g("nrv");
    public nsk ag = nsk.e;
    public Timer ah = new Timer();
    public final long ai = ujp.j(300, ulu.b);
    public nrx aj;

    public final void B(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(423981464);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            jsv.x(bdq.k(-728825866, new asu(this, 10), aycVarC), aycVarC, 6);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 17);
        }
    }

    public final void C(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1165043018) {
            if (iHashCode != 516404242) {
                if (iHashCode == 2129881737 && str.equals("key_setting_facing")) {
                    this.ag = nsk.c;
                    return;
                }
            } else if (str.equals("key_setting_mode")) {
                this.ag = nsk.b;
                return;
            }
        } else if (str.equals("key_setting_timer")) {
            this.ag = nsk.d;
            return;
        }
        ((sgt) ak.c().M(5509)).v("Not supported category %s", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        this.aj = (nrx) cxs.b(new uji(nrx.class), gnoVar);
        Context context = getContext();
        nrx nrxVar = null;
        Object systemService = context != null ? context.getSystemService("accessibility") : null;
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null) {
            if (this.aj == null) {
                ujp.c("viewModel");
            }
            accessibilityManager.isTouchExplorationEnabled();
        }
        nrx nrxVar2 = this.aj;
        if (nrxVar2 == null) {
            ujp.c("viewModel");
        } else {
            nrxVar = nrxVar2;
        }
        nsk nskVar = this.ag;
        nskVar.getClass();
        int iOrdinal = nskVar.ordinal();
        int i2 = 3;
        int i3 = -1;
        int i4 = 0;
        if (iOrdinal == 1) {
            bgz bgzVar = nrxVar.i;
            bgzVar.clear();
            bgzVar.add(new nry(R.string.modes, (Integer) null, (Object) "key_setting_category", false, 0, (uif) null, nrn.a, (ltw) null, false, 874));
            for (nsu nsuVar : nrxVar.e) {
                bgzVar.add(new nry(nrxVar.e(nsuVar), (Integer) null, nsuVar, nsuVar != nsu.ASTRO || nrxVar.s(), nrxVar.c(nsuVar), new nrw(nrxVar, (Enum) nsuVar, i2), nrn.b, (ltw) null, nrxVar.l() == nsuVar, 322));
            }
            cwq cwqVar = nrxVar.q;
            ugi ugiVar = new ugi(bgzVar, 0, 1);
            while (true) {
                if (!ugiVar.hasNext()) {
                    break;
                }
                if (((nry) ugiVar.next()).c == nrxVar.l()) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            cwqVar.h(Integer.valueOf(i3));
            return;
        }
        int i5 = 2;
        if (iOrdinal == 2) {
            bgz bgzVar2 = nrxVar.j;
            bgzVar2.clear();
            bgzVar2.add(new nry(R.string.menu_camera_facing_summary, (Integer) null, (Object) "key_setting_category", false, 0, (uif) null, nrn.a, (ltw) null, false, 872));
            for (pka pkaVar : nrx.a) {
                bgzVar2.add(new nry(nrxVar.b(pkaVar), (Integer) null, (Object) pkaVar, false, nrxVar.a(pkaVar), (uif) new nrw(nrxVar, (Enum) pkaVar, i4), nrn.b, (ltw) null, nrxVar.g.a() == pkaVar, 330));
            }
            cwq cwqVar2 = nrxVar.q;
            ugi ugiVar2 = new ugi(bgzVar2, 0, 1);
            while (true) {
                if (!ugiVar2.hasNext()) {
                    break;
                }
                if (((nry) ugiVar2.next()).c == nrxVar.g.a()) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            cwqVar2.h(Integer.valueOf(i3));
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        bgz bgzVar3 = nrxVar.k;
        bgzVar3.clear();
        bgzVar3.add(new nry(R.string.menu_timer_summary, (Integer) null, (Object) "key_setting_category", true, 0, (uif) null, nrn.a, (ltw) null, false, 866));
        for (ltw ltwVar : nrx.b) {
            bgzVar3.add(new nry(nrxVar.j(ltwVar), (Integer) null, ltwVar, ltwVar != ltw.FIVE, nrxVar.f(ltwVar), new nrw((Object) nrxVar, (Object) ltwVar, i5), nrn.b, ltwVar, nrxVar.k() == ltwVar, 66));
        }
        cwq cwqVar3 = nrxVar.q;
        ugi ugiVar3 = new ugi(bgzVar3, 0, 1);
        while (true) {
            if (!ugiVar3.hasNext()) {
                break;
            }
            if (((nry) ugiVar3.next()).c == nrxVar.k()) {
                i3 = i4;
                break;
            }
            i4++;
        }
        cwqVar3.h(Integer.valueOf(i3));
    }

    @Override // defpackage.bm
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        cwr cwrVar = new cwr() { // from class: nrt
            @Override // defpackage.cwr
            public final void b(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    nrv nrvVar = this.a;
                    nrvVar.ah.cancel();
                    nrvVar.ah = new Timer();
                    nrvVar.ah.schedule(new nru(nrvVar), uls.e(nrvVar.ai, ulu.c));
                }
            }
        };
        nrx nrxVar = this.aj;
        if (nrxVar == null) {
            ujp.c("viewModel");
            nrxVar = null;
        }
        nrxVar.v.d(this, cwrVar);
        Context context = layoutInflater.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.e(new bfh(2028800276, true, new asu(this, 11)));
        return composeView;
    }

    @Override // defpackage.bm
    public final void onPause() {
        nrx nrxVar = this.aj;
        if (nrxVar == null) {
            ujp.c("viewModel");
            nrxVar = null;
        }
        nrxVar.l.h(false);
        nrxVar.n.h(false);
        nrxVar.m.h(false);
        nrxVar.q.h(-1);
        nrxVar.r.h(false);
        super.onPause();
    }
}
