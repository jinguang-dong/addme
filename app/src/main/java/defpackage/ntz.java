package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.SeekBar;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntz implements nkm {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ntz(ocq ocqVar, kek kekVar, int i) {
        this.a = i;
        this.c = ocqVar;
        this.b = kekVar;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kek] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, owq] */
    @Override // defpackage.nkm
    public final void a() {
        if (this.a != 0) {
            ocq ocqVar = (ocq) this.c;
            ViewStub viewStub = (ViewStub) ocqVar.c(R.id.astro_stub);
            viewStub.setLayoutResource(R.layout.astro_viewfinder);
            viewStub.inflate();
            this.b.a((View) ocqVar.c(R.id.astro_viewfinder));
            return;
        }
        rwc rwcVar = (rwc) this.b;
        if (rwcVar.h()) {
            ngw ngwVarA = ((ngx) this.c).a();
            View viewInflate = ((ViewStub) ((ocq) ngwVarA.j).c(R.id.chameleon_ui_stub)).inflate();
            ntr ntrVar = (ntr) rwcVar.c();
            ntrVar.m = (ManualWhiteBalanceUi) viewInflate;
            ntrVar.l = ntrVar.m.a();
            ntrVar.l.setOnClickListener(new mlk(ntrVar, 19));
            SeekBar seekBarB = ntrVar.m.b();
            seekBarB.setMax(200);
            seekBarB.setOnSeekBarChangeListener(new ntp(ntrVar));
            ntrVar.n = new ntn(ntrVar.m, ntrVar.b, ntrVar.u);
            ntrVar.n.a();
            lzr lzrVar = (lzr) ntrVar.d;
            if (lzrVar.b().h()) {
                ((mac) lzrVar.b().c()).a(new ntq(ntrVar));
            }
            rwc rwcVar2 = ntrVar.c;
            if (rwcVar2.h()) {
                qqq qqqVar = (qqq) rwcVar2.c();
                fdq fdqVar = ntrVar.t;
                qqqVar.A(fdqVar);
                fdqVar.j().d(qqqVar.a.dK(new nta(ntrVar, 6), sxo.a));
            }
            fdq fdqVar2 = ntrVar.t;
            owq owqVar = ntrVar.e;
            our ourVarJ = fdqVar2.j();
            nta ntaVar = new nta(ntrVar, 7);
            sxo sxoVar = sxo.a;
            ourVarJ.d(owqVar.dK(ntaVar, sxoVar));
            fdqVar2.j().d(ntrVar.a.dK(new nta(ntrVar, 8), sxoVar));
            fdqVar2.j().d(ntrVar.h.dK(new nta(ntrVar, 9), sxoVar));
            fdqVar2.j().d(ntrVar.i.dK(new nta(ntrVar, 10), sxoVar));
            fdqVar2.j().d(owl.h(ntrVar.q, new mdv(6)).dK(new nta(ntrVar, 5), sxoVar));
            ntrVar.g.a(true);
            MainActivityLayout mainActivityLayout = (MainActivityLayout) ngwVarA.c;
            mainActivityLayout.k(viewInflate);
            mainActivityLayout.h((mxl) rwcVar.c());
        }
    }

    public ntz(rwc rwcVar, uem uemVar, int i) {
        this.a = i;
        this.c = uemVar;
        this.b = rwcVar;
    }
}
