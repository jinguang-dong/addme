package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njs implements nkm {
    public final jmw a;
    public final hjy b;
    public final owf c;
    public final hyh d;
    public final out e;
    public final gnt f;
    public final owf g;
    public final owf h;
    public final owf i;
    public final kqy j;
    public final luj k;
    public final hbj l;
    private final jgt m;
    private final ngw n;
    private final pbn o;
    private final mug p;

    public njs(kqy kqyVar, jgt jgtVar, hjy hjyVar, owf owfVar, owq owqVar, mug mugVar, jmw jmwVar, hyh hyhVar, out outVar, hbj hbjVar, luj lujVar, gnt gntVar, ngw ngwVar, pbn pbnVar) {
        this.j = kqyVar;
        this.m = jgtVar;
        this.p = mugVar;
        this.a = jmwVar;
        this.b = hjyVar;
        this.c = owfVar;
        this.i = owqVar;
        this.d = hyhVar;
        this.e = outVar;
        this.l = hbjVar;
        this.k = lujVar;
        this.f = gntVar;
        this.n = ngwVar;
        this.g = lujVar.a(luf.v);
        this.h = lujVar.a(luf.x);
        this.o = pbnVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        pbn pbnVar = this.o;
        pbnVar.f("MinibarControllerWirer#wire");
        ngw ngwVar = this.n;
        ViewGroup viewGroup = (ViewGroup) ((ocq) ngwVar.j).c(R.id.new_minibar_container);
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        layoutInflater.getClass();
        layoutInflater.inflate(R.layout.new_minibar, viewGroup);
        kse kseVar = (kse) viewGroup.findViewById(R.id.new_minibar);
        kqy kqyVar = this.j;
        kqyVar.d = kseVar;
        kseVar.setOnTouchListener(new ktj(new AtomicReference(Float.valueOf(0.0f)), 1));
        if (kseVar instanceof View) {
            cog.l(viewGroup, new bft(kqyVar, viewGroup, kseVar, 3));
        }
        kqyVar.e = new nlr(viewGroup, true);
        ((MainActivityLayout) ngwVar.c).h(kqyVar);
        ins.g(this.e, this.m, kqyVar);
        mug mugVar = this.p;
        mvn mvnVar = new mvn(this, 8);
        mvn mvnVar2 = new mvn(this, 9);
        synchronized (mugVar.a) {
            mugVar.b = mvnVar;
            mugVar.c = mvnVar2;
        }
        pbnVar.g();
    }
}
