package defpackage;

import android.util.Range;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kqm implements BiFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ kqm(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return kqn.c((pjo) obj, (pjo) obj2, 1.0d);
            case 1:
                jhh jhhVar = (jhh) obj;
                boolean z = jhhVar instanceof jhd;
                Boolean bool = (Boolean) obj2;
                int i = jgt.f;
                return z ? Boolean.valueOf(bool.booleanValue() | ((jhd) jhhVar).a()) : bool;
            case 2:
                ndv ndvVar = (ndv) obj;
                ndvVar.y(((Integer) obj2).intValue());
                return ndvVar;
            case 3:
                ndv ndvVar2 = (ndv) obj;
                ndvVar2.m(((Integer) obj2).intValue());
                return ndvVar2;
            case 4:
                ndv ndvVar3 = (ndv) obj;
                ndvVar3.r(((Integer) obj2).intValue());
                return ndvVar3;
            case 5:
                ndv ndvVar4 = (ndv) obj;
                ndvVar4.q(((Integer) obj2).intValue());
                return ndvVar4;
            case 6:
                ndv ndvVar5 = (ndv) obj;
                ndvVar5.v(((Integer) obj2).intValue());
                return ndvVar5;
            case 7:
                ndv ndvVar6 = (ndv) obj;
                ndvVar6.D(((Integer) obj2).intValue());
                return ndvVar6;
            case 8:
                ndv ndvVar7 = (ndv) obj;
                ndvVar7.s(((Integer) obj2).intValue());
                return ndvVar7;
            case 9:
                ndv ndvVar8 = (ndv) obj;
                ndvVar8.w(((Integer) obj2).intValue());
                return ndvVar8;
            case 10:
                ndv ndvVar9 = (ndv) obj;
                ndvVar9.n(((Integer) obj2).intValue());
                return ndvVar9;
            case 11:
                ndv ndvVar10 = (ndv) obj;
                ndvVar10.t(((Integer) obj2).intValue());
                return ndvVar10;
            case 12:
                ndv ndvVar11 = (ndv) obj;
                ndvVar11.u(((Integer) obj2).intValue());
                return ndvVar11;
            case 13:
                ndv ndvVar12 = (ndv) obj;
                ndvVar12.x(((Integer) obj2).intValue());
                return ndvVar12;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ndv ndvVar13 = (ndv) obj;
                ndvVar13.p(((Integer) obj2).intValue());
                return ndvVar13;
            case 15:
                ndv ndvVar14 = (ndv) obj;
                ndvVar14.A(((Integer) obj2).intValue());
                return ndvVar14;
            case 16:
                ndv ndvVar15 = (ndv) obj;
                ndvVar15.B(((Integer) obj2).intValue());
                return ndvVar15;
            case 17:
                ndv ndvVar16 = (ndv) obj;
                ndvVar16.C(((Integer) obj2).intValue());
                return ndvVar16;
            case 18:
                ndv ndvVar17 = (ndv) obj;
                ndvVar17.z(((Integer) obj2).intValue());
                return ndvVar17;
            case 19:
                ndv ndvVar18 = (ndv) obj;
                ndvVar18.E(((Integer) obj2).intValue());
                return ndvVar18;
            default:
                return Range.create(Double.valueOf(((uen) obj).a), Double.valueOf(((uen) obj2).a));
        }
    }
}
