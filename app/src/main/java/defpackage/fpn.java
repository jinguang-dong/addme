package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fpn implements UnaryOperator {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpn(fpo fpoVar, fon fonVar, int i) {
        this.c = i;
        this.a = fpoVar;
        this.b = fonVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, npj] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, npj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        fpa fpaVar;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                fkl fklVar = (fkl) obj;
                if (fklVar != null) {
                    fklVar.close();
                }
                return ((fkm) this.b).a.a(this.a.f());
            }
            ljb ljbVar = (ljb) obj;
            if (ljbVar != null) {
                ljbVar.close();
            }
            ?? r10 = this.a;
            Object obj2 = this.b;
            qin qinVarF = r10.f();
            ljd ljdVar = (ljd) obj2;
            noy noyVar = ljdVar.k;
            Object obj3 = noyVar.b;
            Context context = (Context) noyVar.a;
            ljb ljbVar2 = new ljb((hbj) obj3, context, qinVarF, new lje(context, qinVarF), new qkp(qinVarF));
            ljbVar2.e = ljdVar.e;
            ljbVar2.f(ljdVar.i);
            ljbVar2.f = 3.0f;
            ljbVar2.b = ljdVar.f;
            ljbVar2.c = ljdVar.g;
            ljbVar2.a = ljdVar.d;
            ljbVar2.d = ljdVar.h;
            ljbVar2.g(ljdVar.j);
            return ljbVar2;
        }
        fpo fpoVar = (fpo) this.a;
        fpr fprVar = fpoVar.c;
        fpa fpaVar2 = (fpa) obj;
        fon fonVar = (fon) this.b;
        fprVar.c(fonVar);
        fpr fprVar2 = fpoVar.d;
        fprVar2.c(fonVar);
        fnt fntVarDO = fonVar.f().dO();
        fnt fntVar = fnt.TRACKING;
        if (fntVarDO != fntVar) {
            fpoVar.i = fpoVar.e.a();
        }
        fpq fpqVarA = fprVar.a();
        swb swbVar = fpoVar.e;
        boolean zIsBefore = swbVar.a().isBefore(fpoVar.i.plus(fpo.a));
        if (fpqVarA == fpq.RELIABLE && zIsBefore) {
            fpqVarA = fprVar2.a();
        }
        fok fokVarF = fonVar.f();
        if (fokVarF.dO() == fntVar) {
            int iOrdinal = fpqVarA.ordinal();
            if (iOrdinal == 0) {
                fpaVar = fpa.TRACKING;
            } else if (iOrdinal == 1) {
                fpaVar = fpa.NOT_RELIABLE_TOO_FEW_LANDMARKS;
            } else if (iOrdinal == 2) {
                fpaVar = fpa.NOT_RELIABLE_LANDMARKS_TOO_FAR;
            } else {
                if (iOrdinal != 3) {
                    throw new RuntimeException(null, null);
                }
                fpaVar = fpa.NOT_RELIABLE_MISSING_MAP;
            }
        } else {
            int iOrdinal2 = ((fns) ezh.k(new fog(fokVarF, 7))).ordinal();
            if (iOrdinal2 == 0) {
                fpaVar = fpa.INITIALIZING;
            } else if (iOrdinal2 == 1) {
                fpaVar = fpa.UNKNOWN;
            } else if (iOrdinal2 == 2) {
                fpaVar = fpa.INSUFFICIENT_LIGHT;
            } else if (iOrdinal2 == 3) {
                fpaVar = fpa.EXCESSIVE_MOTION;
            } else if (iOrdinal2 != 4) {
                if (iOrdinal2 != 5) {
                    throw new RuntimeException(null, null);
                }
                fpaVar = fpa.UNKNOWN;
            } else {
                fpaVar = fpa.INSUFFICIENT_FEATURES;
            }
        }
        if (fpaVar != fpa.NOT_RELIABLE_TOO_FEW_LANDMARKS && fpaVar != fpa.NOT_RELIABLE_LANDMARKS_TOO_FAR && fpaVar != fpa.NOT_RELIABLE_MISSING_MAP) {
            return fpaVar;
        }
        fpa fpaVar3 = fpa.TRACKING;
        return fpaVar2 == fpaVar3 ? fpaVar3 : Duration.between(fpoVar.i, swbVar.a()).compareTo(fpoVar.g) > 0 ? fpa.PERSISTENT_NOT_RELIABLE : Duration.between(fpoVar.i, swbVar.a()).compareTo(fpoVar.f) <= 0 ? fpa.INITIALIZING : fpaVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ fpn(Object obj, npj npjVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = npjVar;
    }
}
