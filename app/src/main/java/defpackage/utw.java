package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class utw implements uuj {
    public final uhf a;
    public final int b;
    public final int c;

    public utw(uhf uhfVar, int i, int i2) {
        this.a = uhfVar;
        this.b = i;
        this.c = i2;
        boolean z = unf.a;
    }

    public static /* synthetic */ Object h(utw utwVar, url urlVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new utu(urlVar, utwVar, (uhb) null, 0), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    protected abstract Object b(uqx uqxVar, uhb uhbVar);

    protected abstract utw c(uhf uhfVar, int i, int i2);

    protected String d() {
        return null;
    }

    public uqz e(und undVar) throws Throwable {
        utv utvVar = new utv(this, (uhb) null, 0);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        uhf uhfVar = this.a;
        uqw uqwVar = new uqw(umy.b(undVar, uhfVar), ukc.P(i, i2, null, 4));
        ung.g(3, utvVar, uqwVar, uqwVar);
        return uqwVar;
    }

    public urk f() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r5
      0x0019: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0011, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.uuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.urk gb(defpackage.uhf r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = defpackage.unf.a
            uhf r0 = r2.a
            uhf r3 = r3.plus(r0)
            r1 = 1
            if (r5 != r1) goto L23
            int r5 = r2.b
            r1 = -3
            if (r5 != r1) goto L11
            goto L21
        L11:
            if (r4 != r1) goto L14
            goto L19
        L14:
            r1 = -2
            if (r5 == r1) goto L21
            if (r4 != r1) goto L1b
        L19:
            r4 = r5
            goto L21
        L1b:
            int r5 = r5 + r4
            if (r5 >= 0) goto L19
            r4 = 2147483647(0x7fffffff, float:NaN)
        L21:
            int r5 = r2.c
        L23:
            boolean r0 = defpackage.a.ao(r3, r0)
            if (r0 == 0) goto L32
            int r0 = r2.b
            if (r4 != r0) goto L32
            int r0 = r2.c
            if (r5 != r0) goto L32
            return r2
        L32:
            utw r2 = r2.c(r3, r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utw.gb(uhf, int, int):urk");
    }

    @Override // defpackage.urk
    public Object gc(url urlVar, uhb uhbVar) {
        return h(this, urlVar, uhbVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        uhf uhfVar = this.a;
        if (uhfVar != uhg.a) {
            Objects.toString(uhfVar);
            arrayList.add("context=".concat(String.valueOf(uhfVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.bv(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(ujp.N(i2));
            arrayList.add("onBufferOverflow=".concat(ujp.N(i2)));
        }
        return ung.a(this) + "[" + ske.ca(arrayList, ", ", null, null, null, 62) + "]";
    }
}
