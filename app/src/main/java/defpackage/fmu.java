package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fmu implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fmu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qin] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, java.util.function.BiFunction] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, krz] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return (fok) ezh.k(new foj(ezh.k(new foj(this.a.apply(this.b), (Object) r8.a, 10)), (Object) ((fmk) obj).b, 9));
        }
        if (i == 1) {
            tfo tfoVar = (tfo) this.a;
            Bitmap bitmap = tfoVar.b;
            obu obuVar = ((fkz) this.b).e;
            return new fky(qko.d(obuVar.b, bitmap, 33071), obuVar.r(new fkx(qhu.h, tfoVar), fkz.a));
        }
        if (i == 2) {
            gho ghoVar = (gho) obj;
            if (!((gtm) ((ree) this.b).c).p()) {
                return sui.NO_STABILIZATION;
            }
            if (this.a == pka.FRONT) {
                return sui.STEADY_FACE;
            }
            gho ghoVar2 = gho.OFF;
            oyu oyuVar = oyu.VIDEO_BUFFER_DELAY;
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = ghoVar.ordinal();
            if (iOrdinal == 1) {
                return sui.STANDARD;
            }
            if (iOrdinal == 2) {
                return sui.d;
            }
            if (iOrdinal == 3) {
                return sui.LOCKED;
            }
            if (iOrdinal == 4) {
                return sui.ACTIVE;
            }
            throw new IllegalArgumentException("Not a valid stabilization mode: ".concat(String.valueOf(String.valueOf(ghoVar))));
        }
        if (i == 3) {
            iqh iqhVar = (iqh) obj;
            nkw nkwVar2 = (nkw) this.a.get(0);
            ipk ipkVar = (ipk) ((htf) this.b).a;
            return Boolean.valueOf(ipkVar.i(nkwVar2, iqhVar) && (!iqhVar.equals(iqh.SATURN) || ((ovx) ipkVar.c.b).d == pka.BACK) && ipkVar.g(iqhVar));
        }
        if (i == 4) {
            return Boolean.valueOf(this.a.o((krj) this.b));
        }
        if (i == 5) {
            smt smtVar = (smt) this.b;
            return this.a.apply(smtVar.b.apply(obj), smtVar.c.apply(obj));
        }
        Image image = (Image) obj;
        float[] fArr = (float[]) this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        teo teoVar = (teo) this.b;
        float fA = teoVar.a(image, f, f2);
        foi foiVarB = teoVar.b(fArr, fA);
        tek tekVar = foiVarB == null ? null : new tek(2, foiVarB, fA);
        image.close();
        return tekVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ fmu(Function function, foy foyVar, int i) {
        this.c = i;
        this.a = function;
        this.b = foyVar;
    }
}
