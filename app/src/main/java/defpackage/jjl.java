package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jjl implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jjl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((jjn) this.a).c(((Boolean) obj).booleanValue());
                break;
            case 1:
                ((jjn) this.a).f(((Boolean) obj).booleanValue());
                break;
            case 2:
                if (((nkw) obj).equals(nkw.AMBER)) {
                    ((jka) this.a).e();
                    break;
                }
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj2 = this.a;
                jkd jkdVar = (jkd) obj2;
                jkdVar.e.h(bool);
                nhz nhzVar = ((jjx) obj2).a;
                if (!zBooleanValue) {
                    if (nhzVar != null) {
                        nhzVar.g(0.5f, false, niz.a);
                    }
                    owq owqVar = jkdVar.k;
                    jjp jjpVar = (jjp) owqVar.dL();
                    jjpVar.b = Optional.empty();
                    owqVar.a(jjpVar);
                    break;
                }
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                Object obj3 = this.a;
                jkj jkjVar = (jkj) obj3;
                jkjVar.e.h(bool2);
                nhz nhzVar2 = ((jjx) obj3).a;
                if (nhzVar2 != null && !zBooleanValue2) {
                    nhzVar2.g(0.5f, false, niz.a);
                    owq owqVar2 = jkjVar.i;
                    jjp jjpVar2 = (jjp) owqVar2.dL();
                    jjpVar2.i = Optional.empty();
                    owqVar2.a(jjpVar2);
                    break;
                }
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    ((jkj) this.a).j.c();
                    break;
                }
                break;
            case 6:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                jkl jklVar = (jkl) this.a;
                jklVar.g.h(bool3);
                if (!zBooleanValue3) {
                    owq owqVar3 = jklVar.h;
                    if (((jjp) owqVar3.dL()).a().e.isPresent()) {
                        jklVar.i(true);
                    }
                    jjp jjpVar3 = (jjp) owqVar3.dL();
                    jjpVar3.e = Optional.empty();
                    owqVar3.a(jjpVar3);
                    break;
                }
                break;
            case 7:
                ((jkq) this.a).b(((Boolean) obj).booleanValue());
                break;
            case 8:
                ((jkq) this.a).c((mxj) obj);
                break;
            case 9:
                ((jkq) this.a).a(true);
                break;
            case 10:
                ((jkq) this.a).d((jjq) obj);
                break;
            case 11:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (!zBooleanValue4) {
                    Set set = ((jkq) obj4).g;
                    Iterable$EL.forEach(set, new jgf(9));
                    set.clear();
                    break;
                } else {
                    jkq jkqVar = (jkq) obj4;
                    Set set2 = jkqVar.g;
                    set2.add(jkqVar.a.a());
                    set2.add(jkqVar.l.i());
                    set2.add(jkqVar.i.e());
                    set2.add(jkqVar.b.a());
                    set2.add(jkqVar.j.c());
                    break;
                }
            case 12:
                Object obj5 = this.a;
                ((ki) obj5).a.b(0, ((jkx) obj5).a());
                break;
            case 13:
                ((jky) this.a).t.setImageResource(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jnp) this.a).a();
                break;
            case 15:
                ((jti) this.a).d();
                break;
            case 16:
                ((jti) this.a).d();
                break;
            case 17:
                this.a.a(false);
                break;
            case 18:
                kpa kpaVar = kov.a;
                if (((kpa) obj).equals(kpa.c)) {
                    ?? r4 = this.a;
                    if (((Boolean) r4.dL()).booleanValue()) {
                        r4.a(Boolean.FALSE);
                        break;
                    }
                }
                break;
            case 19:
                kpa kpaVar2 = kov.a;
                if (((Boolean) obj).booleanValue()) {
                    owx owxVar = (owx) this.a;
                    if (((kpa) owxVar.dL()).equals(kpa.c)) {
                        owxVar.a(kpa.AUTO);
                        break;
                    }
                }
                break;
            default:
                ((kqx) this.a).f(((goi) obj).a());
                break;
        }
    }
}
