package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class are extends bij implements bve, buu, bwx {
    public String a;
    public cdo b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public bkx g;
    public uiq h;
    public ard i;
    public qqq j;
    private Map k;
    private aqu l;

    public are(String str, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2, int i3, bkx bkxVar) {
        this.a = str;
        this.b = cdoVar;
        this.j = qqqVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = bkxVar;
    }

    private final aqu m(brv brvVar) {
        aqu aquVarQ = q();
        aquVarQ.d(brvVar);
        return aquVarQ;
    }

    private final aqu q() {
        aqu aquVar;
        ard ardVar = this.i;
        if (ardVar != null) {
            if (true != ardVar.b) {
                ardVar = null;
            }
            if (ardVar != null && (aquVar = ardVar.c) != null) {
                return aquVar;
            }
        }
        return h();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    @Override // defpackage.bve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bss a(defpackage.bst r18, defpackage.bsq r19, long r20) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.are.a(bst, bsq, long):bss");
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        return m(brvVar).a(i, brvVar.m());
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        if (!this.w) {
            return;
        }
        aqu aquVarQ = q();
        cch cchVar = aquVarQ.k;
        if (cchVar == null) {
            akg.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.l + ", textSubstitution=" + this.i + ')');
            throw new uer();
        }
        bku bkuVarB = bvoVar.o().b();
        boolean z = aquVarQ.f;
        if (z) {
            long j = aquVarQ.g;
            bkuVarB.f();
            bkuVarB.j(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
        }
        try {
            chd chdVarR = this.b.r();
            if (chdVarR == null) {
                chdVarR = chd.a;
            }
            chd chdVar = chdVarR;
            blo bloVarJ = this.b.j();
            if (bloVarJ == null) {
                bloVarJ = blo.a;
            }
            blo bloVar = bloVarJ;
            byi byiVarZ = this.b.z();
            if (byiVarZ == null) {
                byiVarZ = bmx.a;
            }
            byi byiVar = byiVarZ;
            this.b.y();
            bkx bkxVar = this.g;
            long jA = bkxVar != null ? bkxVar.a() : bkv.f;
            if (jA == 16) {
                jA = this.b.f() != 16 ? this.b.f() : bkv.a;
            }
            cchVar.k(bkuVarB, jA, bloVar, chdVar, byiVar);
            if (z) {
                bkuVarB.d();
            }
        } finally {
        }
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        return bay.X(m(brvVar).b(brvVar.m()).a());
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        return m(brvVar).a(i, brvVar.m());
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        return bay.X(m(brvVar).b(brvVar.m()).b());
    }

    public final aqu h() {
        if (this.l == null) {
            this.l = new aqu(this.a, this.b, this.j, this.c, this.d, this.e);
        }
        aqu aquVar = this.l;
        aquVar.getClass();
        return aquVar;
    }

    public final void k() {
        this.i = null;
    }

    public final void l() {
        bad.D(this);
        bko.u(this);
        bko.x(this);
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        uiq npVar = this.h;
        if (npVar == null) {
            npVar = new np(this, 19);
            this.h = npVar;
        }
        cbw.j(cbnVar, new ccm(this.a));
        ard ardVar = this.i;
        if (ardVar != null) {
            cbw.i(cbnVar, ardVar.b);
            cbw.k(cbnVar, new ccm(ardVar.a));
        }
        cbnVar.e(cbm.k, new cbc(null, new np(this, 20)));
        cbnVar.e(cbm.l, new cbc(null, new arc(this, 1)));
        cbnVar.e(cbm.m, new cbc(null, new apa(this, 4)));
        cbnVar.e(cbm.a, new cbc(null, npVar));
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
