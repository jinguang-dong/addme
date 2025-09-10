package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftp implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public ftp(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws NumberFormatException {
        boolean zP = false;
        switch (this.b) {
            case 0:
                return new fto(tzs.b(this.a));
            case 1:
                return new ixs(this.a, 1);
            case 2:
                return ((ftt) this.a).a();
            case 3:
                return new own(((luj) this.a.a()).a(luf.aI), new fgb(13), new fgb(14));
            case 4:
                return ((hbj) this.a.a()).p(hac.q) ? new ovx(Optional.of(Duration.ofSeconds(1L))) : new ovx(Optional.empty());
            case 5:
                return new fuy((pfl) this.a.a(), fsa.c());
            case 6:
                syx syxVarB = ske.B((ScheduledExecutorService) this.a.a());
                syxVarB.getClass();
                return syxVarB;
            case 7:
                gox goxVarB = ((izd) this.a).a();
                Object obj = goxVarB.b;
                Object obj2 = goxVarB.a;
                izm izmVar = (izm) goxVarB.c;
                tzx tzxVarC = tzs.c(new nmn(izmVar.we, 6));
                tzx tzxVarC2 = tzs.c(oxu.a);
                gar garVar = new gar(tzxVarC, tzxVarC2, izmVar.im);
                izh izhVar = (izh) obj;
                gef gefVar = new gef(izhVar.bF, tzxVarC, new oxz(tzxVarC2));
                tzx tzxVarC3 = tzs.c(fwq.a);
                tzx tzxVarC4 = tzs.c(new ftp(tzxVarC3, 6));
                gfk gfkVar = new gfk(izmVar.xS);
                tzx tzxVar = izhVar.gZ;
                tzx tzxVar2 = izmVar.k;
                gfh gfhVar = new gfh(izmVar.xU, tzxVar, tzxVar2);
                tzx tzxVar3 = izmVar.go;
                tzx tzxVar4 = izhVar.js;
                tzx tzxVar5 = izmVar.y;
                tzx tzxVar6 = izmVar.iJ;
                tzx tzxVar7 = izmVar.o;
                gfd gfdVar = new gfd(tzxVar3, tzxVar4, tzxVar5, tzxVar6, tzxVar7);
                tzx tzxVar8 = izhVar.nz;
                tzx tzxVar9 = izhVar.iT;
                tzx tzxVar10 = izmVar.kR;
                tzx tzxVar11 = izhVar.hB;
                tzx tzxVar12 = izhVar.iU;
                tzx tzxVar13 = ((izc) obj2).cR;
                tzx tzxVar14 = izmVar.yI;
                got gotVar = (got) tzs.c(new fus(garVar, gefVar, tzs.c(new gei(izmVar.yi, tzxVar8, izhVar.nH, izhVar.nL, tzxVar9, tzxVarC4, tzxVarC3, izhVar.bF, tzxVar2, gfkVar, tzxVar10, tzxVar11, tzxVar12, tzxVar14, tzxVar13, tzxVar7, gfhVar, gfdVar, 0)), 3)).a();
                gotVar.getClass();
                return gotVar;
            case 8:
                return new fxb(((izf) this.a).a());
            case 9:
                return new gdi((cxb) this.a.a());
            case 10:
                return new gfr((hbj) this.a.a(), 0);
            case 11:
                return new gfr((hbj) this.a.a(), 2);
            case 12:
                return new gfr((hbj) this.a.a(), 4);
            case 13:
                hbj hbjVar = (hbj) this.a.a();
                hbc hbcVarB = hmp.b();
                Optional optionalA = hbjVar.a(hax.a);
                if (optionalA.isEmpty() || hbcVarB.a(hbc.DOGFOOD)) {
                    zP = hbjVar.p(hax.c);
                } else if (((Integer) optionalA.get()).intValue() > 0) {
                    zP = true;
                }
                return Boolean.valueOf(zP);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 15:
                return new luw(((luj) this.a.a()).a(luf.aw));
            case 16:
                return new ggo(this.a);
            case 17:
                return new ggv((luv) this.a.a(), 1);
            case 18:
                return new ggv((luv) this.a.a(), 0);
            case 19:
                Object obj3 = ((gko) this.a.a()).f;
                obj3.getClass();
                return obj3;
            default:
                return new gks((owf) this.a.a());
        }
    }
}
