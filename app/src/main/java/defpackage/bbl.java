package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbl extends uht implements uiu {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ uif g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbl(uif uifVar, uhb uhbVar) {
        super(2, uhbVar);
        this.g = uifVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbl) c((url) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        if (r4 != 8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0096, code lost:
    
        r3 = 2;
        r6 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x00af, B:46:0x010f], limit reached: 90 */
    /* JADX WARN: Path cross not found for [B:32:0x00d6, B:43:0x0103], limit reached: 90 */
    /* JADX WARN: Path cross not found for [B:46:0x010f, B:27:0x00af], limit reached: 90 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[Catch: all -> 0x0046, PHI: r2 r6 r7 r8 r9 r10 r11 r12
      0x00aa: PHI (r2v7 java.lang.Object) = (r2v10 java.lang.Object), (r2v13 java.lang.Object) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r6v1 int) = (r6v7 int), (r6v0 int) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r7v4 java.lang.Object) = (r7v5 java.lang.Object), (r7v8 java.lang.Object) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r8v2 uqm) = (r8v10 uqm), (r8v11 uqm) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r9v1 arc) = (r9v9 arc), (r9v10 arc) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r10v1 java.lang.Object) = (r10v2 java.lang.Object), (r10v5 java.lang.Object) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r11v2 url) = (r11v3 url), (r11v8 url) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r12v2 java.lang.Object) = (r12v7 java.lang.Object), (r12v8 java.lang.Object) binds: [B:24:0x00a8, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0046, blocks: (B:11:0x0042, B:23:0x0096, B:25:0x00aa, B:27:0x00af, B:30:0x00bf, B:32:0x00d6, B:33:0x00d9, B:35:0x00e4, B:37:0x00ee, B:40:0x00fa, B:44:0x0105, B:47:0x0110, B:50:0x011f, B:54:0x0136, B:56:0x013f, B:63:0x0161, B:64:0x0164, B:8:0x002d, B:16:0x006d, B:20:0x007e, B:72:0x0179, B:73:0x017c, B:51:0x012b, B:53:0x0133, B:60:0x015c, B:61:0x015f, B:52:0x012f, B:17:0x0073, B:19:0x007b, B:69:0x0174, B:70:0x0177), top: B:80:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: all -> 0x0046, TryCatch #2 {all -> 0x0046, blocks: (B:11:0x0042, B:23:0x0096, B:25:0x00aa, B:27:0x00af, B:30:0x00bf, B:32:0x00d6, B:33:0x00d9, B:35:0x00e4, B:37:0x00ee, B:40:0x00fa, B:44:0x0105, B:47:0x0110, B:50:0x011f, B:54:0x0136, B:56:0x013f, B:63:0x0161, B:64:0x0164, B:8:0x002d, B:16:0x006d, B:20:0x007e, B:72:0x0179, B:73:0x017c, B:51:0x012b, B:53:0x0133, B:60:0x015c, B:61:0x015f, B:52:0x012f, B:17:0x0073, B:19:0x007b, B:69:0x0174, B:70:0x0177), top: B:80:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:11:0x0042, B:23:0x0096, B:25:0x00aa, B:27:0x00af, B:30:0x00bf, B:32:0x00d6, B:33:0x00d9, B:35:0x00e4, B:37:0x00ee, B:40:0x00fa, B:44:0x0105, B:47:0x0110, B:50:0x011f, B:54:0x0136, B:56:0x013f, B:63:0x0161, B:64:0x0164, B:8:0x002d, B:16:0x006d, B:20:0x007e, B:72:0x0179, B:73:0x017c, B:51:0x012b, B:53:0x0133, B:60:0x015c, B:61:0x015f, B:52:0x012f, B:17:0x0073, B:19:0x007b, B:69:0x0174, B:70:0x0177), top: B:80:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c A[LOOP:0: B:26:0x00ad->B:66:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d A[EDGE_INSN: B:85:0x011d->B:49:0x011d BREAK  A[LOOP:0: B:26:0x00ad->B:66:0x016c], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0154 -> B:23:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        bbl bblVar = new bbl(this.g, uhbVar);
        bblVar.h = obj;
        return bblVar;
    }
}
