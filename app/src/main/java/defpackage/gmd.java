package defpackage;

import android.content.res.Resources;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gmd implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gmd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object, utj] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        lzm lzmVar;
        switch (this.b) {
            case 0:
                gme gmeVar = (gme) this.a;
                tzj tzjVar = gmeVar.a;
                ksa ksaVar = (ksa) obj;
                ksa ksaVarM = gmeVar.m();
                nqp nqpVar = (nqp) tzjVar.a();
                if (nqpVar != null) {
                    nqpVar.A(ksaVar.equals(ksa.RES_4320P));
                }
                if (!ksaVar.equals(ksaVarM)) {
                    if (ksaVar.equals(ksa.RES_4320P)) {
                        owq owqVar = gmeVar.b;
                        if (!((Boolean) owqVar.dL()).booleanValue()) {
                            gmeVar.c = true;
                            owqVar.a(true);
                        }
                    }
                    gmeVar.u().a(gme.q(ksaVar));
                    break;
                }
                break;
            case 1:
                ((gme) this.a).y();
                break;
            case 2:
                krj krjVar = (krj) this.a;
                if (krjVar.d().equals(nkw.TIME_LAPSE)) {
                    krjVar.m(false, krs.p);
                    break;
                }
                break;
            case 3:
                krj krjVar2 = (krj) this.a;
                if (krjVar2.d().equals(nkw.VIDEO)) {
                    krjVar2.m(false, krs.p);
                    break;
                }
                break;
            case 4:
                ((krj) this.a).m(false, krs.p);
                break;
            case 5:
                krj krjVar3 = (krj) this.a;
                if (krjVar3.d().equals(nkw.TIME_LAPSE)) {
                    krjVar3.m(false, krs.p);
                    break;
                }
                break;
            case 6:
                ((gme) this.a).y();
                break;
            case 7:
                ((gme) this.a).y();
                break;
            case 8:
                ((krj) this.a).m(false, krs.SAPPHIRE);
                break;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    ((gmn) this.a).a.a(ksa.SAPPHIRE_OFF);
                    break;
                }
                break;
            case 10:
                if (((pka) obj) != pka.BACK && (lzmVar = ((gmo) this.a).f) != null) {
                    lzmVar.a();
                    break;
                }
                break;
            case 11:
                ((gtx) this.a).d();
                break;
            case 12:
                ((gue) this.a).d();
                break;
            case 13:
                ((gue) this.a).d();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((gun) this.a).d();
                break;
            case 15:
                gwv.E((gwv) this.a, ((Boolean) obj).booleanValue() ? gwq.a : gwq.b, 2);
                break;
            case 16:
                ((gwv) this.a).v.b(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
            case 17:
                gwv.E((gwv) this.a, gwq.a, 2);
                break;
            case 18:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bool.booleanValue();
                ((gwv) this.a).z.b(bool);
                break;
            case 19:
                gwv gwvVar = (gwv) this.a;
                gwvVar.E = true;
                gwvVar.X.C();
                break;
            default:
                gwv gwvVar2 = (gwv) this.a;
                gyd gydVar = (gyd) gwvVar2.X.d.c();
                if (gydVar != null) {
                    gwvVar2.b.f(gydVar);
                    break;
                }
                break;
        }
    }
}
