package defpackage;

import android.hardware.camera2.params.Face;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hci implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ hci(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws NumberFormatException {
        nkw nkwVar;
        int i = 0;
        switch (this.a) {
            case 0:
                fqb fqbVar = (fqb) obj;
                return fqbVar.a().g().toEpochMilli() != -1 ? fqbVar.a().g().truncatedTo(ChronoUnit.SECONDS) : fqbVar.a().h();
            case 1:
                return gox.b((pka) obj);
            case 2:
                return Long.valueOf(((fqb) obj).a().b());
            case 3:
                int i2 = heb.k;
                return (Long) ((hdz) obj).d.map(new gbm(5)).orElse(-1L);
            case 4:
                return pnu.a((Face) obj);
            case 5:
                return gzr.values()[((Integer) obj).intValue()];
            case 6:
                return ((peo) obj).d().a;
            case 7:
                try {
                    int i3 = Integer.parseInt((String) obj);
                    nkw[] nkwVarArrValues = nkw.values();
                    int length = nkwVarArrValues.length;
                    while (true) {
                        if (i < length) {
                            nkwVar = nkwVarArrValues[i];
                            if (nkwVar.u != i3) {
                                i++;
                            }
                        } else {
                            nkwVar = null;
                        }
                    }
                    return Optional.ofNullable(nkwVar);
                } catch (NumberFormatException unused) {
                    return Optional.empty();
                }
            case 8:
                return (nkw) ((Optional) obj).get();
            case 9:
                return new goq((mcw) obj, 3);
            case 10:
                return ((jju) obj).e;
            case 11:
                int i4 = jkx.n;
                return Optional.empty();
            case 12:
                int i5 = jkx.n;
                return Optional.empty();
            case 13:
                return ((jjq) obj).b;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((jjq) obj).d;
            case 15:
                return ((jjq) obj).c;
            case 16:
                return ((jjq) obj).h;
            case 17:
                return ((jjq) obj).g;
            case 18:
                int i6 = jkx.n;
                return Optional.empty();
            case 19:
                int i7 = jkx.n;
                jjs jjsVarB = ((jju) obj).b();
                return Boolean.valueOf(jjsVarB.equals(jjs.PRO_FOCUS) || jjsVarB.equals(jjs.PRO_NONFOCUS));
            default:
                int i8 = jkx.n;
                return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
