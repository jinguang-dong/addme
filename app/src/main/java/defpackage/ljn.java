package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljn implements BiFunction {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljn(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r5.i(r4, false) != false) goto L31;
     */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.b
            if (r0 == 0) goto L71
            r1 = 1
            if (r0 == r1) goto L2a
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Long r6 = (java.lang.Long) r6
            scn r0 = defpackage.lks.a
            int r5 = r5.intValue()
            double r0 = (double) r5
            int r4 = r4.a
            int r4 = r4 + (-1)
            double r4 = (double) r4
            double r0 = r0 / r4
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            long r5 = r6.longValue()
            double r5 = (double) r5
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            android.util.Pair r4 = android.util.Pair.create(r4, r5)
            return r4
        L2a:
            jhh r5 = (defpackage.jhh) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            int r0 = defpackage.jgt.f
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L70
            boolean r0 = r5 instanceof defpackage.itl
            if (r0 == 0) goto L70
            int r4 = r4.a
            itl r5 = (defpackage.itl) r5
            r0 = 22
            r2 = 0
            if (r4 != r0) goto L47
            r5.j(r2)
            goto L6b
        L47:
            hbj r0 = r5.i
            gzi r0 = defpackage.gzo.a
            int r0 = r5.h
            r3 = 3
            if (r0 != r3) goto L51
            goto L70
        L51:
            r3 = 2
            if (r0 == r3) goto L6b
            boolean r0 = r5.g
            if (r0 != 0) goto L6b
            r0 = 24
            if (r4 == r0) goto L65
            r0 = 25
            if (r4 == r0) goto L65
            r0 = 27
            if (r4 != r0) goto L70
            r4 = r0
        L65:
            boolean r4 = r5.i(r4, r2)
            if (r4 == 0) goto L70
        L6b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L70:
            return r6
        L71:
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            scn r0 = defpackage.ljo.a
            int r5 = r5.intValue()
            double r0 = (double) r5
            int r4 = r4.a
            int r4 = r4 + (-1)
            double r4 = (double) r4
            double r0 = r0 / r4
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            int r5 = r6.intValue()
            double r5 = (double) r5
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            android.util.Pair r4 = android.util.Pair.create(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljn.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
