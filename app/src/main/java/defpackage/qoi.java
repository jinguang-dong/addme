package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qoi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qoi(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                uzx uzxVar = (uzx) obj;
                return new qoj(uzxVar, qok.d(uzxVar.c == 1 ? (uys) uzxVar.d : uys.a));
            case 1:
                return qok.c((vaa) obj);
            case 2:
                return ((qol) obj).b();
            case 3:
                uzx uzxVar2 = (uzx) obj;
                return new qoj(uzxVar2, qok.c(uzxVar2.c == 3 ? (vaa) uzxVar2.d : vaa.a));
            case 4:
                return 9;
            case 5:
                return ByteBuffer.wrap((byte[]) obj);
            case 6:
                return ((sbk) obj).g();
            case 7:
                return ((scl) obj).g();
            case 8:
                return ((sbr) obj).b();
            case 9:
                sdy sdyVar = (sdy) obj;
                if (sdyVar.b.isEmpty()) {
                    return Optional.ofNullable(sdyVar.a);
                }
                throw sdyVar.a(false);
            case 10:
                sdy sdyVar2 = (sdy) obj;
                Object obj2 = sdz.a;
                if (sdyVar2.a == null) {
                    throw new NoSuchElementException();
                }
                if (!sdyVar2.b.isEmpty()) {
                    throw sdyVar2.a(false);
                }
                Object obj3 = sdyVar2.a;
                if (obj3 == sdz.a) {
                    return null;
                }
                return obj3;
            case 11:
                smp smpVar = (smp) obj;
                smp smpVar2 = smp.a;
                smpVar.getClass();
                return smpVar;
            case 12:
                return ((Map.Entry) obj).getKey();
            case 13:
                return ((tae) obj).a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return rup.l((fnp) obj);
            case 15:
                tpc tpcVarB = ((tej) obj).a.b();
                tph tphVar = tpcVarB.b;
                if (!((szr) tphVar).c) {
                    return (szr) tpcVarB.l();
                }
                if (!tphVar.C()) {
                    tpcVarB.o();
                }
                szr szrVar = (szr) tpcVarB.b;
                szrVar.b |= 1;
                szrVar.c = true;
                return (szr) tpcVarB.l();
            case 16:
                teq teqVar = (teq) obj;
                foi foiVar = teqVar.c;
                if (foiVar.dO() != fnt.TRACKING) {
                    return Optional.empty();
                }
                return Optional.of(new tfj((float[]) tfk.a(foiVar).b.clone(), teqVar.a, teqVar.b));
            case 17:
                return Float.valueOf(((tek) obj).a);
            case 18:
                return ((tel) obj).e.dN();
            case 19:
                return Float.valueOf(1.5f);
            default:
                tel telVar = (tel) obj;
                return new tfo((float[]) tfk.a(telVar.e).b.clone(), telVar.a, telVar.b, telVar.c);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
