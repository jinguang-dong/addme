package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niw extends uhs implements uiu {
    int a;
    final /* synthetic */ uif b;
    final /* synthetic */ uiq c;
    final /* synthetic */ uif d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niw(uif uifVar, uiq uiqVar, uif uifVar2, uhb uhbVar, int i) {
        super(uhbVar);
        this.f = i;
        this.b = uifVar;
        this.c = uiqVar;
        this.d = uifVar2;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((niw) c((bqk) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((niw) c((bqk) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (defpackage.a.bg(r4, r10.a, r2, r9) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        if (defpackage.a.bg(r4, r10.a, r2, r9) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.niw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f != 0) {
            niw niwVar = new niw(this.b, this.c, this.d, uhbVar, 1, null);
            niwVar.e = obj;
            return niwVar;
        }
        niw niwVar2 = new niw(this.b, this.c, this.d, uhbVar, 0);
        niwVar2.e = obj;
        return niwVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niw(uif uifVar, uiq uiqVar, uif uifVar2, uhb uhbVar, int i, byte[] bArr) {
        super(uhbVar);
        this.f = i;
        this.b = uifVar;
        this.c = uiqVar;
        this.d = uifVar2;
    }
}
