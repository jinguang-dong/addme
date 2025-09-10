package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddc extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddc(bqc bqcVar, uiv uivVar, uiq uiqVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = bqcVar;
        this.d = uivVar;
        this.c = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((ddc) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((ddc) c((url) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r5.f(r7, r22) != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:43:0x0108, B:45:0x010e, B:47:0x0125), top: B:63:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce A[EXC_TOP_SPLITTER, PHI: r3 r16
      0x00ce: PHI (r3v7 url) = (r3v2 url), (r3v3 url), (r3v13 url) binds: [B:31:0x00a6, B:35:0x00cc, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r16v6 long) = (r16v0 long), (r16v2 long), (r16v10 long) binds: [B:31:0x00a6, B:35:0x00cc, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v16, types: [bqc, chq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddc.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bqc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f != 0) {
            ddc ddcVar = new ddc((bqc) this.b, (uiv) this.d, (uiq) this.c, uhbVar, 1);
            ddcVar.e = obj;
            return ddcVar;
        }
        Object obj2 = this.b;
        ddi ddiVar = (ddi) obj2;
        ddc ddcVar2 = new ddc(ddiVar, (int[]) this.c, (String[]) this.d, uhbVar, 0);
        ddcVar2.e = obj;
        return ddcVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddc(ddi ddiVar, int[] iArr, String[] strArr, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = ddiVar;
        this.c = iArr;
        this.d = strArr;
    }
}
