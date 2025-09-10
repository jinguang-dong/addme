package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crh extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crh(cru cruVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = cruVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((crh) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((crh) c((url) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016b, code lost:
    
        if (r13 != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0081, code lost:
    
        if (r9.d(r13) == r0) goto L22;
     */
    /* JADX WARN: Path cross not found for [B:12:0x002b, B:25:0x008f], limit reached: 71 */
    /* JADX WARN: Path cross not found for [B:25:0x008f, B:12:0x002b], limit reached: 71 */
    /* JADX WARN: Path cross not found for [B:27:0x0096, B:12:0x002b], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:14:0x0031, B:16:0x0058, B:17:0x0067, B:19:0x0075, B:20:0x007a), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, urk] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            crh crhVar = new crh((ut) this.c, uhbVar, 1);
            crhVar.d = obj;
            return crhVar;
        }
        crh crhVar2 = new crh((cru) this.c, uhbVar, 0);
        crhVar2.d = obj;
        return crhVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crh(ut utVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = utVar;
    }
}
