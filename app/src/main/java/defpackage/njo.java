package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njo implements nkm, jhh, jhe {
    public final owq a;
    public final nas b;
    public final hie c;
    public final hbj d;
    public final qrh e;
    private final out f;
    private final owf g;
    private final rwc h;
    private final uem i;
    private final owf j;
    private final fdq k;
    private final jgt l;
    private final gox m;
    private final mwq n;

    public njo(hie hieVar, uem uemVar, qrh qrhVar, gox goxVar, fdq fdqVar, out outVar, hbj hbjVar, owq owqVar, owq owqVar2, kpb kpbVar, rwc rwcVar, nas nasVar, owf owfVar, jgt jgtVar, luj lujVar, mwq mwqVar) {
        this.c = hieVar;
        this.i = uemVar;
        this.e = qrhVar;
        this.m = goxVar;
        this.k = fdqVar;
        this.f = outVar;
        this.d = hbjVar;
        this.a = owqVar;
        this.h = rwcVar;
        this.b = nasVar;
        this.l = jgtVar;
        this.g = owl.h(owl.a(kpbVar, owqVar2, owfVar), new kou(hbjVar, 11));
        this.j = lujVar.a(luf.aZ);
        this.n = mwqVar;
    }

    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, owq] */
    @Override // defpackage.nkm
    public final void a() {
        uem uemVar = this.i;
        EvCompView evCompView = (EvCompView) ((ocq) ((mwq) uemVar.a()).b).c(R.id.evcomp);
        evCompView.m = this.n;
        hie hieVar = this.c;
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(hieVar.a, android.R.animator.fade_in);
        objectAnimator.setTarget(evCompView);
        hieVar.l = objectAnimator;
        owq owqVar = this.a;
        hieVar.m = owqVar;
        hieVar.k = evCompView;
        nas nasVar = this.b;
        hieVar.n = nasVar;
        rwc rwcVar = this.h;
        hieVar.o = rwcVar;
        hieVar.p = evCompView.c;
        hieVar.q = evCompView.d;
        gzi gziVar = gzj.a;
        owf owfVar = this.j;
        hieVar.r = owfVar;
        hieVar.u = this.d;
        hieVar.s = hieVar.n(R.string.exposure_disable_string);
        hieVar.t = hieVar.n(R.string.brightness_disable_string);
        CheckBox checkBox = hieVar.p;
        rnt.x(checkBox);
        checkBox.setVisibility(8);
        hieVar.q.setOnClickListener(new fvp(hieVar, 8));
        fdq fdqVar = this.k;
        our ourVarJ = fdqVar.j();
        hib hibVar = new hib(hieVar, 1);
        owf owfVar2 = hieVar.e;
        out outVar = this.f;
        ourVarJ.d(owfVar2.dK(hibVar, outVar));
        iyd iydVar = new iyd(hieVar, 1);
        gox goxVar = this.m;
        owq owqVar2 = hieVar.g;
        owq owqVar3 = hieVar.d;
        qrh qrhVar = this.e;
        ?? r8 = qrhVar.c;
        hieVar.j = new hiy(iydVar, evCompView, qrhVar.f, qrhVar.e, r8, owqVar, goxVar, owqVar3, rwcVar, owfVar, owqVar2);
        CheckBox checkBox2 = hieVar.p;
        ObjectAnimator objectAnimator2 = hieVar.l;
        hiq hiqVar = hieVar.j;
        rnt.x(hiqVar);
        hiq hiqVar2 = hieVar.j;
        rnt.x(hiqVar2);
        hieVar.i = new hiu(evCompView, checkBox2, objectAnimator2, hiqVar, goxVar, hiqVar2);
        hieVar.i.a();
        hieVar.c.a(false);
        nasVar.k = false;
        hieVar.b.a(true);
        fdqVar.j().d(owb.a(owl.h(hieVar.f, new hia(0))).dK(new hib(hieVar, 0), outVar));
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((ocq) ((mwq) uemVar.a()).b).c(R.id.activity_root_view);
        mainActivityLayout.k(evCompView);
        mainActivityLayout.h(hieVar);
        our ourVarJ2 = fdqVar.j();
        ?? r3 = goxVar.c;
        mtd mtdVar = new mtd(this, 14);
        sxo sxoVar = sxo.a;
        ourVarJ2.d(r3.dK(mtdVar, sxoVar));
        fdqVar.j().d(qrhVar.b.dK(new mtd(this, 15), outVar));
        fdqVar.j().d(goxVar.a.dK(new mtd(this, 12), sxoVar));
        fdqVar.j().d(this.g.dK(new mtd(this, 13), outVar));
        fdqVar.j().d(owfVar.dK(new mtd(this, 16), outVar));
        this.l.k(this);
    }

    @Override // defpackage.jhe
    public final void eb() {
        ((lae) ((rwg) this.h).a).j(this.k, this.g);
    }
}
