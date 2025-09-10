package defpackage;

import android.util.Range;
import j$.util.function.BiFunction$CC;
import java.util.AbstractMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jge implements BiFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ jge(int i) {
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
                jhh jhhVar = (jhh) obj;
                Boolean bool = (Boolean) obj2;
                int i = jgt.f;
                if (!bool.booleanValue() && (jhhVar instanceof jfs) && ((jfs) jhhVar).r()) {
                    return true;
                }
                return bool;
            case 1:
                jhh jhhVar2 = (jhh) obj;
                Boolean bool2 = (Boolean) obj2;
                int i2 = jgt.f;
                if (!bool2.booleanValue() && (jhhVar2 instanceof jfo) && ((jfo) jhhVar2).a()) {
                    return true;
                }
                return bool2;
            case 2:
                jhh jhhVar3 = (jhh) obj;
                boolean z = jhhVar3 instanceof jgv;
                Boolean bool3 = (Boolean) obj2;
                int i3 = jgt.f;
                return z ? Boolean.valueOf(bool3.booleanValue() | ((jgv) jhhVar3).a()) : bool3;
            case 3:
                jhh jhhVar4 = (jhh) obj;
                Boolean bool4 = (Boolean) obj2;
                int i4 = jgt.f;
                if (!bool4.booleanValue() && (jhhVar4 instanceof jhb) && ((jhb) jhhVar4).a()) {
                    return true;
                }
                return bool4;
            case 4:
                jhh jhhVar5 = (jhh) obj;
                boolean z2 = jhhVar5 instanceof jgy;
                Boolean bool5 = (Boolean) obj2;
                int i5 = jgt.f;
                return z2 ? Boolean.valueOf(bool5.booleanValue() | ((jgy) jhhVar5).a()) : bool5;
            case 5:
                Integer num = (Integer) obj;
                sgv sgvVar = ldr.a;
                return num;
            case 6:
                return Range.create(Double.valueOf(((uen) obj).a), Double.valueOf(((uen) obj2).a));
            case 7:
                return new njh((Range) obj, (uen) obj2);
            case 8:
                uen uenVar = (uen) obj;
                uen uenVar2 = (uen) obj2;
                double d = uenVar2.b;
                double d2 = uenVar.b;
                double d3 = uenVar2.a;
                double d4 = uenVar.a;
                double d5 = (d - d2) / (d3 - d4);
                return new uen(d5, d2 - (d4 * d5));
            case 9:
                return prh.K((String) obj, (piz) obj2);
            case 10:
                return prh.K((String) obj, (pjk) obj2);
            case 11:
                smp smpVar = smp.a;
                obj.getClass();
                obj2.getClass();
                return new smo(obj, obj2);
            case 12:
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            default:
                return obj;
        }
    }
}
