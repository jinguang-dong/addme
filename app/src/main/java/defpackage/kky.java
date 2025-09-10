package defpackage;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kky implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public kky(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new kkx(((kku) this.a).a(), 2);
            case 1:
                return new kkx(((kku) this.a).a(), 3);
            case 2:
                return ((kkp) this.a).a();
            case 3:
                return new hbp(((kld) this.a).a());
            case 4:
                our ourVar = (our) this.a.a();
                our ourVar2 = new our();
                our ourVarC = ourVar.c();
                ourVarC.d(new fro(new frn("DelLifetime", 2000), ourVar2));
                ourVar2.d(ourVarC);
                return ourVar2;
            case 5:
                our ourVar3 = (our) this.a.a();
                ourVar3.getClass();
                return new hwk(ourVar3, 4);
            case 6:
                return new kma((pau) this.a.a());
            case 7:
                return new kmc((pau) this.a.a());
            case 8:
                Set setP = jsv.p((rwc) this.a.a());
                setP.getClass();
                return setP;
            case 9:
                Object sfmVar = !((Map) this.a.a()).isEmpty() ? new sfm(new knq(0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 10:
                rwc rwcVar = (rwc) this.a.a();
                a.I(rwcVar.h());
                return (peo) rwcVar.c();
            case 11:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.DATA_STREAM));
            case 12:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.DEPTH));
            case 13:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.PD));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.PD_TELE));
            case 15:
                Map map = (Map) this.a.a();
                EnumMap enumMap = new EnumMap(lcz.class);
                sgj sgjVarListIterator = lcz.A.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    lcz lczVar = (lcz) sgjVarListIterator.next();
                    peo peoVar = (peo) map.get(lczVar);
                    if (peoVar != null) {
                        enumMap.put((EnumMap) lczVar, (lcz) peoVar);
                    }
                }
                return enumMap;
            case 16:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.a));
            case 17:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.YUV_ANALYSIS));
            case 18:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.YUV_LARGE));
            case 19:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.YUV_REPROCESSING));
            default:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.YUV_TELE_ZOOM));
        }
    }
}
