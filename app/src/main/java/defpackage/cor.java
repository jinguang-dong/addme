package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cor extends uhs implements uiu {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cor(aeq aeqVar, uhb uhbVar, int i) {
        super(uhbVar);
        this.d = i;
        this.b = aeqVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((cor) c((bqk) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((cor) c((ulk) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r14 == r0) goto L56;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cor.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.d != 0) {
            cor corVar = new cor((aeq) this.b, uhbVar, 1);
            corVar.c = obj;
            return corVar;
        }
        cor corVar2 = new cor((View) this.b, uhbVar, 0);
        corVar2.c = obj;
        return corVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cor(View view, uhb uhbVar, int i) {
        super(uhbVar);
        this.d = i;
        this.b = view;
    }
}
