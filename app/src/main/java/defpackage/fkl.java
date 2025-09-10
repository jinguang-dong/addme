package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fkl implements npl {
    public static final sgv a = sgv.g("fkl");
    public final qin b;
    private final owf d;
    private final owf e;
    private final owq f;
    private final sbp g;
    private final Consumer h;
    private final fja m;
    private final jod n;
    private final obu o;
    private int i = -1;
    private pas j = null;
    private final float[] k = new float[16];
    public final float[] c = new float[16];
    private final float[] l = new float[16];

    public fkl(qin qinVar, fja fjaVar, owf owfVar, owf owfVar2, jod jodVar, owq owqVar, fkw fkwVar, sbp sbpVar, Consumer consumer) {
        this.b = qinVar;
        this.m = fjaVar;
        this.d = owfVar;
        this.e = owfVar2;
        this.n = jodVar;
        this.f = owqVar;
        this.h = consumer;
        this.o = (obu) fkwVar.a(qinVar);
        Stream map = Collection.EL.stream(sbpVar).map(new fiy(qinVar, 2));
        int i = sbp.d;
        this.g = (sbp) map.collect(ryv.a);
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk a(poj pojVar, poj pojVar2) {
        return jsv.y(this, pojVar, pojVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[Catch: all -> 0x0411, qid -> 0x0414, SYNTHETIC, TRY_LEAVE, TryCatch #30 {qid -> 0x0414, all -> 0x0411, blocks: (B:194:0x0402, B:280:0x04b9, B:279:0x04b6, B:276:0x04b1), top: B:298:0x0006, inners: #8 }] */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, qin] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v23, types: [poj] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    @Override // defpackage.npl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.npk b(defpackage.pdk r21, defpackage.peo r22, defpackage.pdk r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkl.b(pdk, peo, pdk):npk");
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.COTTAGE;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Iterable$EL.forEach(this.g, new fkj(0));
    }

    @Override // defpackage.npl
    public final qin d() {
        return this.b;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    @Override // defpackage.npl
    public final boolean q() {
        return true;
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk s(qjn qjnVar, qim qimVar) {
        return jsv.B();
    }
}
