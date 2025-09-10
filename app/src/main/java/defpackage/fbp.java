package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbp implements paq {
    private final rwc A;
    private final owf B;
    private final int C;
    private final jkh D;
    private final hie E;
    private final hbj F;
    private final syj G;
    private final mwq H;
    private final ocq I;
    public final mmk a;
    public final rwc b;
    public final rwc c;
    public final FocusIndicatorView d;
    private final our e;
    private final fcb f;
    private final nqa g;
    private final npy h;
    private final out i;
    private final Set j;
    private final Set k;
    private final msh l;
    private final gsj m;
    private final pjo n;
    private final owf o;
    private final owf p;
    private final boolean q;
    private final Handler r;
    private final owf s;
    private final owf t;
    private final owf u;
    private final owf v;
    private final owf w;
    private final owf x;
    private final owf y;
    private final owf z;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uem] */
    public fbp(gtm gtmVar, FocusIndicatorView focusIndicatorView, fcb fcbVar, nqa nqaVar, npy npyVar, out outVar, Set set, Set set2, msh mshVar, mmk mmkVar, hbj hbjVar, hie hieVar, rwc rwcVar, gsj gsjVar, Handler handler, syj syjVar, rwc rwcVar2, rwc rwcVar3, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, ocq ocqVar, owq owqVar, owq owqVar2, jkh jkhVar, rwc rwcVar4, owf owfVar7, mwq mwqVar, fbl fblVar, pjo pjoVar, owf owfVar8, owf owfVar9, boolean z, boolean z2, int i) {
        rwc rwcVar5;
        int i2;
        owf owfVar10;
        our ourVar;
        hbj hbjVar2;
        our ourVar2 = new our();
        this.e = ourVar2;
        this.k = set2;
        this.s = owfVar;
        this.t = owfVar2;
        this.I = ocqVar;
        a.I(pjoVar.F() || pjoVar.E());
        this.d = focusIndicatorView;
        this.f = fcbVar;
        this.g = nqaVar;
        this.h = npyVar;
        this.i = outVar;
        this.j = set;
        this.l = mshVar;
        this.m = gsjVar;
        this.a = mmkVar;
        this.E = hieVar;
        this.n = pjoVar;
        this.o = owfVar8;
        this.p = owfVar9;
        this.q = z;
        this.C = i;
        this.b = rwcVar;
        this.F = hbjVar;
        this.r = handler;
        this.G = syjVar;
        rwc rwcVar6 = i == 3 ? rwcVar3 : rwcVar2;
        this.c = rwcVar6;
        rwc rwcVar7 = rwcVar6;
        this.u = owfVar3;
        this.v = owfVar4;
        this.w = owfVar5;
        this.x = owfVar6;
        this.y = owqVar;
        this.z = owqVar2;
        this.D = jkhVar;
        this.A = rwcVar4;
        this.B = owfVar7;
        this.H = mwqVar;
        gzg gzgVar = gze.a;
        if (i != 3 && pjoVar.E()) {
            fcc fccVarA = fcbVar.a(owfVar8, pjoVar);
            if (rwcVar.h()) {
                ((mlw) rwcVar.c()).j(mlv.FACE_TRACKING, fccVarA);
                ourVar2.d(new ffy(this, 1));
            }
            ourVar2.d(fccVarA);
        }
        nle nleVarA = ((nlf) gtmVar.e).a();
        mye myeVar = (mye) gtmVar.a.a();
        myeVar.getClass();
        owf owfVar11 = (owf) gtmVar.f.a();
        owfVar11.getClass();
        owf owfVar12 = (owf) gtmVar.d.a();
        owfVar12.getClass();
        mdy mdyVar = (mdy) gtmVar.c.a();
        mdyVar.getClass();
        owf owfVar13 = (owf) gtmVar.b.a();
        owfVar13.getClass();
        hnw hnwVar = new hnw(nleVarA, myeVar, owfVar11, owfVar12, mdyVar, owfVar13, z2, fblVar);
        Set set3 = i == 3 ? set2 : set;
        pka pkaVarL = pjoVar.l();
        if (z) {
            i2 = 0;
            owfVar10 = owfVar9;
            fcv fcvVar = new fcv(jkhVar, ourVar2, hnwVar, focusIndicatorView, pkaVarL, set3, rwcVar, mshVar, mmkVar, hieVar, rwcVar7, gsjVar, owfVar, owfVar2, owfVar3, ocqVar, rwcVar4, hbjVar, owfVar7, mwqVar);
            ourVar = ourVar2;
            hnwVar = hnwVar;
            rwcVar5 = rwcVar7;
            nqaVar.a = fcvVar;
            hbjVar2 = hbjVar;
        } else {
            rwcVar5 = rwcVar7;
            i2 = 0;
            owfVar10 = owfVar9;
            fcp fcpVar = new fcp(ourVar2, hnwVar, focusIndicatorView, pkaVarL, set3, mshVar, rwcVar5, mmkVar, owfVar, owfVar2, hbjVar, mwqVar);
            ourVar = ourVar2;
            hbjVar2 = hbjVar;
            nqaVar.a = fcpVar;
        }
        if (pjoVar.F()) {
            npyVar.a = new fbv(mmkVar, mshVar, pjoVar.l(), hnwVar, focusIndicatorView, syjVar, handler, rwcVar5, ourVar, rwcVar, owfVar, owfVar4, pjoVar.l().equals(pka.BACK) ? owqVar : owqVar2, owfVar5, owfVar6, mwqVar, hbjVar2.p(gze.l));
        } else {
            npyVar.e();
        }
        ourVar.d(owfVar10.dK(new fbo(this, i2), outVar));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
        this.i.execute(new dzd(this, 14));
        this.g.c();
        this.h.e();
    }
}
