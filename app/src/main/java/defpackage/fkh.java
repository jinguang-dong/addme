package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkh implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public fkh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    public static rwc c(uem uemVar, jvb jvbVar, hbj hbjVar) {
        return (hbjVar.p(gze.n) && jvbVar.f.isPresent()) ? ((jaf) uemVar).b() : rvk.a;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
        }
        return b();
    }

    public final rwc b() {
        switch (this.d) {
            case 0:
                tzx tzxVar = this.c;
                tzx tzxVar2 = this.b;
                Set setA = ((tzz) this.a).a();
                rnu rnuVarA = ((noz) tzxVar2).a();
                hbj hbjVar = (hbj) tzxVar.a();
                sgv sgvVar = fkg.a;
                return (setA.isEmpty() || !hbjVar.o(gyi.h)) ? rvk.a : rwc.j(rnuVarA.c(npp.a(setA, false)));
            case 1:
                return (((kif) this.c).a().j() || !((fgn) this.a.a()).b) ? rvk.a : rwc.j((hls) this.b.a());
            case 2:
                owq owqVar = (owq) this.b.a();
                hbj hbjVar2 = (hbj) this.c.a();
                if (!((Boolean) owqVar.dL()).booleanValue()) {
                    gzi gziVar = gzb.a;
                } else if (hbjVar2.p(gzb.e)) {
                    return ((jaf) this.a).b();
                }
                return rvk.a;
            case 3:
                ((noz) this.a).a();
                npo npoVar = (npo) this.b.a();
                hbj hbjVar3 = (hbj) this.c.a();
                npoVar.getClass();
                hbjVar3.getClass();
                if (hbjVar3.o(hal.a) && hbjVar3.o(hal.b)) {
                    gzi gziVar2 = gzp.a;
                }
                gzi gziVar3 = han.a;
                return rvk.a;
            case 4:
                Set setA2 = ((tzz) this.a).a();
                rnu rnuVarA2 = ((noz) this.b).a();
                hbj hbjVar4 = (hbj) this.c.a();
                gzi gziVar4 = gzo.a;
                return setA2.isEmpty() ? rvk.a : rwc.j(rnuVarA2.c(npp.b(setA2, hbjVar4)));
            case 5:
                Set setA3 = ((tzz) this.a).a();
                rnu rnuVarA3 = ((noz) this.b).a();
                hbj hbjVar5 = (hbj) this.c.a();
                if (setA3.isEmpty()) {
                    return rvk.a;
                }
                gzi gziVar5 = gzo.a;
                return rwc.j(rnuVarA3.c(npp.b(setA3, hbjVar5)));
            case 6:
                return c(this.c, (jvb) this.a.a(), (hbj) this.b.a());
            default:
                rwc rwcVar = (rwc) ((tzu) this.c).a;
                rwc rwcVar2 = (rwc) ((tzu) this.b).a;
                if (!rwcVar.h() && !rwcVar2.h()) {
                    return rvk.a;
                }
                tzx tzxVar3 = this.a;
                tzxVar3.getClass();
                return rwc.j(new lck(tzxVar3, 3));
        }
    }

    public fkh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public fkh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public fkh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
