package defpackage;

import android.view.View;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqq implements nkm {
    private final uem a;
    private final uem b;
    private final uem c;
    private final uem d;
    private final uem e;
    private final owf f;
    private final fdq g;
    private final luj h;

    public lqq(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, fdq fdqVar, owf owfVar, luj lujVar) {
        this.b = uemVar2;
        this.d = uemVar4;
        this.e = uemVar5;
        this.a = uemVar;
        this.c = uemVar3;
        this.f = owfVar;
        this.g = fdqVar;
        this.h = lujVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        Object obj = ((mwq) this.a.a()).b;
        lqo lqoVar = (lqo) this.b.a();
        lqt lqtVar = (lqt) this.e.a();
        our ourVarJ = this.g.j();
        ReplaceableView replaceableView = (ReplaceableView) ((ocq) obj).c(R.id.fullscreen_selfie_flash);
        lrb lrbVar = (lrb) this.d.a();
        nll nllVar = (nll) this.c.a();
        luj lujVar = this.h;
        owq owqVarA = lujVar.a(luf.F);
        owq owqVarA2 = lujVar.a(luf.x);
        owq owqVarA3 = lujVar.a(luf.J);
        lqoVar.g = owqVarA;
        lqoVar.h = owqVarA2;
        lqoVar.i = owqVarA3;
        lqoVar.m = nllVar;
        lqoVar.k = lrbVar.h;
        lqoVar.f = new lqs(replaceableView.getContext());
        lqoVar.f.setId(View.generateViewId());
        lqoVar.f.setBackgroundColor(lqoVar.a);
        replaceableView.a(lqoVar.f);
        lqoVar.l = lqtVar;
        lqoVar.l.a();
        owf owfVar = lqoVar.g;
        lqn lqnVar = new lqn(lqoVar, 0);
        out outVar = lqoVar.b;
        ourVarJ.d(owfVar.dK(lqnVar, outVar));
        ourVarJ.d(owqVarA2.dK(new lqn(lqoVar, 2), outVar));
        ourVarJ.d(owqVarA3.dK(new lqn(lqoVar, 3), outVar));
        ourVarJ.d(lqoVar.e.dK(new lqn(lqoVar, 4), outVar));
        ourVarJ.d(lqoVar.c.dK(new lqn(lqoVar, 5), outVar));
        ourVarJ.d(this.f.dK(new lqn(lqoVar, 6), outVar));
        ourVarJ.d(lqoVar.d.dK(new lqn(lqoVar, 7), outVar));
    }
}
