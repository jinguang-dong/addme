package defpackage;

import com.google.android.apps.camera.ui.views.CountdownSnapSlider;
import j$.time.Instant;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nhh implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.function.BiPredicate] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant instantP;
        int i = this.b;
        if (i == 0) {
            return ((CountdownSnapSlider) this.a).b.get((Integer) obj) == mtq.ENABLED;
        }
        if (i == 1) {
            return ((nav) ((Map.Entry) obj).getKey()).ordinal() < ((nav) this.a).ordinal();
        }
        if (i == 2) {
            uzx uzxVar = (uzx) obj;
            int i2 = uzxVar.c;
            if (i2 == 1) {
                trn trnVar = ((uys) uzxVar.d).b;
                if (trnVar == null) {
                    trnVar = trn.a;
                }
                instantP = thu.p(trnVar);
            } else {
                trn trnVar2 = (i2 == 3 ? (vaa) uzxVar.d : vaa.a).c;
                if (trnVar2 == null) {
                    trnVar2 = trn.a;
                }
                instantP = thu.p(trnVar2);
            }
            return instantP.isAfter((Instant) this.a);
        }
        if (i == 3) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.test(entry.getKey(), entry.getValue());
        }
        fon fonVar = (fon) obj;
        fnr fnrVarC = fonVar.c();
        if (fnrVarC instanceof fnm) {
            if (((fnm) fnrVarC).g(fonVar.b())) {
                Object obj2 = this.a;
                fnp fnpVarB = fonVar.b();
                txn txnVarN = rup.n(((teo) obj2).b);
                float[] fArr = new float[3];
                fnpVarB.n(fArr);
                if (txn.a(txn.g(txnVarN, rup.n(fnpVarB)), rup.o(fArr)) <= 0.0f) {
                }
            }
        }
        if (!(fnrVarC instanceof fno) && !(fnrVarC instanceof fnl) && !(fnrVarC instanceof fnk)) {
            ((sgt) teo.a.c().M(5853)).s("Hit test with an unsupported hit type");
        }
        return ((fnrVarC instanceof fno) && ((fno) fnrVarC).a() == fnn.ESTIMATED_SURFACE_NORMAL) || (fnrVarC instanceof fnl) || (fnrVarC instanceof fnk);
    }
}
