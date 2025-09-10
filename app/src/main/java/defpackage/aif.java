package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aif extends uhs implements uiu {
    Object a;
    int b;
    final /* synthetic */ uif c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aif(uif uifVar, uhb uhbVar) {
        super(uhbVar);
        this.c = uifVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aif) c((ulk) obj, (uhb) obj2)).b(ufg.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r3.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r3.d
            ulk r2 = (defpackage.ulk) r2
            defpackage.rnt.aN(r4)
            goto L2f
        L10:
            defpackage.rnt.aN(r4)
            java.lang.Object r4 = r3.d
            ulk r4 = (defpackage.ulk) r4
            r2 = r4
        L18:
            uif r4 = r3.c
            java.lang.Object r1 = r4.a()
            if (r1 == 0) goto L2e
            r3.d = r2
            r3.a = r1
            r4 = 1
            r3.b = r4
            java.lang.Object r4 = r2.a(r1, r3)
            if (r4 != r0) goto L2f
            return r0
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            goto L18
        L32:
            ufg r3 = defpackage.ufg.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aif.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        aif aifVar = new aif(this.c, uhbVar);
        aifVar.d = obj;
        return aifVar;
    }
}
