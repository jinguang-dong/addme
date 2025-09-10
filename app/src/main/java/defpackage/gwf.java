package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwf extends uhs implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwf(aqy aqyVar, ogk ogkVar, aqx aqxVar, uhb uhbVar, int i) {
        super(uhbVar);
        this.f = i;
        this.b = aqyVar;
        this.c = ogkVar;
        this.d = aqxVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gwf) c((bqk) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((gwf) c((bqk) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (defpackage.acv.n(r5, (defpackage.aqy) r1, (defpackage.ogk) r2, r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (defpackage.acv.m(r5, (defpackage.aqx) r1, r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        if (r11 != r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Type inference failed for: r11v16, types: [azr, java.lang.Object] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwf.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [azr, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f == 0) {
            gwf gwfVar = new gwf((azr) this.b, (gwv) this.c, (View) this.d, uhbVar, 0);
            gwfVar.e = obj;
            return gwfVar;
        }
        Object obj2 = this.b;
        aqy aqyVar = (aqy) obj2;
        gwf gwfVar2 = new gwf(aqyVar, (ogk) this.c, (aqx) this.d, uhbVar, 1);
        gwfVar2.e = obj;
        return gwfVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwf(azr azrVar, gwv gwvVar, View view, uhb uhbVar, int i) {
        super(uhbVar);
        this.f = i;
        this.b = azrVar;
        this.c = gwvVar;
        this.d = view;
    }
}
