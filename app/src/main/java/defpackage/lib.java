package defpackage;

import android.util.Range;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lib implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public lib(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 1:
                owf owfVarA2 = owb.a((owq) this.a.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 2:
                owq owqVar = (owq) this.a.a();
                Range range = lil.a;
                owf owfVarA3 = owb.a(owqVar);
                owfVarA3.getClass();
                return owfVarA3;
            case 3:
                return qpt.bS((ljd) this.a.a());
            case 4:
                return qpt.bS((ljd) this.a.a());
            case 5:
                owf owfVarA4 = owb.a((owq) this.a.a());
                owfVarA4.getClass();
                return owfVarA4;
            case 6:
                sbp sbpVarD = kqn.d(kqn.f(pka.BACK, ((pab) this.a).a()));
                sbpVarD.getClass();
                return sbpVarD;
            case 7:
                lat latVarA = ((lkh) this.a).a();
                return sbv.p(lkk.ULTRAWIDE, latVarA.a, lkk.WIDE, latVarA.c, lkk.TELE, latVarA.b);
            case 8:
                lkk lkkVar = (lkk) ((owf) this.a.a()).dL();
                lkkVar.getClass();
                return lkkVar;
            case 9:
                return new lkg((owq) this.a.a());
            case 10:
                owf owfVarA5 = owb.a((owq) this.a.a());
                owfVarA5.getClass();
                return owfVarA5;
            case 11:
                owf owfVarH = owl.h((owf) this.a.a(), new leb(8));
                owfVarH.getClass();
                return owfVarH;
            case 12:
                owf owfVarA6 = owb.a((owq) this.a.a());
                owfVarA6.getClass();
                return owfVarA6;
            case 13:
                owf owfVarH2 = owl.h(((luj) this.a.a()).a(llb.a), new leb(9));
                owfVarH2.getClass();
                return owfVarH2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVarA7 = owb.a((owq) this.a.a());
                owfVarA7.getClass();
                return owfVarA7;
            case 15:
                new lmx();
                gzi gziVar = gzo.a;
                return new lmx();
            case 16:
                return new lnz((lny) this.a.a(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
            case 17:
                return new ggg((jrg) this.a.a());
            case 18:
                return new mwq(((jag) this.a).a());
            case 19:
                ((lqi) this.a).a();
                return new ocq(new iob());
            default:
                return new mwq((out) this.a.a());
        }
    }
}
