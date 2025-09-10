package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ney implements uiu {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ und c;
    final /* synthetic */ aus d;
    final /* synthetic */ nkx e;
    final /* synthetic */ aby f;
    final /* synthetic */ uiu g;
    final /* synthetic */ View h;
    final /* synthetic */ mxm i;
    final /* synthetic */ adt j;
    final /* synthetic */ nku k;
    final /* synthetic */ long l;
    final /* synthetic */ long m;
    final /* synthetic */ int n;
    final /* synthetic */ long o;
    final /* synthetic */ int p;
    final /* synthetic */ long q;
    final /* synthetic */ bie r;

    public ney(boolean z, boolean z2, und undVar, aus ausVar, nkx nkxVar, aby abyVar, uiu uiuVar, View view, mxm mxmVar, adt adtVar, nku nkuVar, long j, long j2, int i, long j3, int i2, long j4, bie bieVar) {
        this.a = z;
        this.b = z2;
        this.c = undVar;
        this.d = ausVar;
        this.e = nkxVar;
        this.f = abyVar;
        this.g = uiuVar;
        this.h = view;
        this.i = mxmVar;
        this.j = adtVar;
        this.k = nkuVar;
        this.l = j;
        this.m = j2;
        this.n = i;
        this.o = j3;
        this.p = i2;
        this.q = j4;
        this.r = bieVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            boolean z = this.a;
            boolean z2 = this.b;
            aycVar.u(-1224400529);
            und undVar = this.c;
            boolean zD = aycVar.D(undVar);
            aus ausVar = this.d;
            boolean zB = zD | aycVar.B(ausVar);
            nkx nkxVar = this.e;
            boolean z3 = zB | aycVar.z(nkxVar.ordinal());
            aby abyVar = this.f;
            boolean zD2 = z3 | aycVar.D(abyVar);
            uiu uiuVar = this.g;
            boolean zB2 = zD2 | aycVar.B(uiuVar);
            View view = this.h;
            boolean zD3 = zB2 | aycVar.D(view);
            Object objF = aycVar.f();
            if (zD3 || objF == ayb.a) {
                objF = new nex(undVar, uiuVar, nkxVar, view, ausVar, abyVar, 0);
                aycVar.w(objF);
            }
            aycVar.n();
            qpt.aZ(z, z2, (uif) objF, this.i, this.j, clc.ae(this.k.d, aycVar), this.l, this.m, this.n, this.o, this.p, this.q, this.r, aycVar, 0, 0);
        }
        return ufg.a;
    }
}
